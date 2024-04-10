package gljw.backward.compatibility;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import gljw.annotations.Nullable;
import gljw.exceptions.GLW4JException;
import gljw.glfw.GLFWimage;
import nw4j.helpers.Helpers;
import nw4j.helpers.NativeType;
import static gljw.glfw.GLFW.*;
import static nw4j.wrapper.c.allocators.MemoryAccessor.free;
import static nw4j.wrapper.c.allocators.MemoryAccessor.malloc;
import static nw4j.wrapper.c.pointers.VoidPointer.DOUBLE_SIZE;
import static nw4j.wrapper.c.allocators.MemoryAccessor.*;
import static nw4j.wrapper.c.pointers.VoidPointer.*;

public final class Mouse {
	static double 	x,y;
	static double 	dx, dy;
	static int 		wheelY;
	static boolean 	isGrabbed;
	static boolean 	isCreated;
	static boolean 	eventState;
	static int 		eventButton;
	static @Nullable @NativeType(" GLFWCursor* ") long cursorHandle; 
	
	private static List<Event> qEvent; 
	
	static class Event{
		int button;
		boolean eventState;
		Event(int button, boolean eventState) {
			this.button = button;
			this.eventState = eventState;
		}
		void apply(){
			Mouse.eventState 	= eventState;
			Mouse.eventButton 	= button;
		}
	} 
	
	static void addEvent(int button, boolean state) {
		qEvent.add(new Event(button, state));
	}
	
	public static boolean next() {
		if (qEvent.size() == 0) return false;
		qEvent.removeFirst().apply();;
		return true;
	}
	
	public static int getEventButton() {
		return eventButton;
	} 
	public static boolean getEventButtonState() {
		return eventState;
	}
	
	public static void create() throws GLW4JException {
		qEvent = new LinkedList<>();
		try {
			Buf.create();
		}catch (Throwable e) {
			throw new GLW4JException(e.getMessage());
		}
		isCreated = true;
	}

	public static void destroy() {
		Buf.destroy();
		qEvent = null;
		if(cursorHandle != NULL) {
			glfwDestroyCursor(cursorHandle);
			if (Display.getWindowHandle() != NULL) {
				glfwSetCursor(Display.getWindowHandle(), NULL);
			}
		}
		isCreated = false;
	}

	public static boolean isCreated() {
		return isCreated;
	}

	public static void setGrabbed(boolean isGrabbed) {
		Mouse.isGrabbed = isGrabbed;
		if (Display.windowHandle != NULL) {
			glfwSetInputMode(Display.getWindowHandle(), GLFW_CURSOR, Mouse.isGrabbed ? GLFW_CURSOR_DISABLED : GLFW_CURSOR_NORMAL);
			int newx = (Display.getWidth() / 2);
			int newy = (Display.getHeight() / 2);
			setCursorPosition(newx, newy);
		}
	}

	public static int getDWheel() {
		int tmp = wheelY;
		wheelY = 0;
		return tmp;
	} 
	
	public static boolean isGrabbed() {
		return isGrabbed;
	}

	public static double getX() {
		return x;
	}

	public static double getY() {
		return y;
	}

	public static double getDX() {
		return dx;
	}

	public static double getDY() {
		return dy;
	}
	
	static class Buf{
		static @NativeType(" double* ") long $xpos;
		static @NativeType(" double* ") long $ypos;
		static void create() throws Throwable {
			
			boolean succsess = true;
			Throwable t = null;
			
			try{
				$xpos = Helpers.addressNonNull(malloc(DOUBLE_SIZE));				
			}catch(Throwable exc) {
				t = exc;
				succsess = false;
			}
			
			try{
				$ypos = Helpers.addressNonNull(malloc(DOUBLE_SIZE));
			}catch(Throwable exc) {
				t = exc;
				succsess = false;
			}
			
			if (!succsess) {
				if ($xpos != NULL) free($xpos);
				if ($ypos != NULL) free($ypos);
				throw t;
			}
		}
		static void destroy() {
			if ($xpos != NULL) free($xpos); $xpos = 0;
			if ($ypos != NULL) free($ypos); $ypos = 0;
		}
	}

	static void update() {
		glfwGetCursorPos(Display.getWindowHandle(), Buf.$xpos, Buf.$ypos);
		double x = getDouble(Buf.$xpos);
		double y = getDouble(Buf.$ypos);
		double dx = x - Mouse.x;
		double dy = y - Mouse.y;

		if (Mouse.isGrabbed()) {
			glfwSetCursorPos(Display.getWindowHandle(), Display.getWidth() / 2, Display.getHeight() / 2);
			Mouse.x = Display.w / 2;
			Mouse.y = Display.h / 2;
		}else {
			Mouse.x = x;
			Mouse.y = y;
		}
		Mouse.dx = dx;
		Mouse.dy = dy;
	}

	public static void setCursorPosition(int newx, int newy) {
		x = newx;
		y = newy;
		if(Display.isCreated()) {
			glfwSetCursorPos(Display.getWindowHandle(), newx, newy);
		}
	}

	public static void setImageCursor(BufferedImage img) {
		if (!isCreated()) throw new RuntimeException("Mouse is not created!");
		if (cursorHandle != NULL) {
			glfwSetCursor(Display.getWindowHandle(), NULL);
			glfwDestroyCursor(cursorHandle);
			cursorHandle = NULL;			
		}
		if (img != null) {
			try(	GLFWimage cImage = new GLFWimage(img)	){
				cursorHandle = glfwCreateCursor(cImage, cImage.getWidth() / 2, cImage.getHeight() / 2);
				glfwSetCursor(Display.getWindowHandle(), cursorHandle);
			}
		}
	}
	
	public static boolean isButtonDown(int button) {
		return glfwGetMouseButton(Display.windowHandle, button) == GLFW_TRUE;
	}
}

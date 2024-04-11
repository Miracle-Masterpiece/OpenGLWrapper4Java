/*
 * Copyright (c) 2024, Miracle-Masterpiсe <mrmiraclemasterpiece@gmail.com or https://t.me/MiracleMasterpiece>. All rights reserved.
 * Use is subject to license terms.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
package gljw.backward.compatibility;

import gljw.exceptions.GLW4JException;
import gljw.glfw.GLFWException;
import gljw.glfw.GLFWVidmode;
import gljw.opengl.OpenGL;
import nw4j.helpers.NativeType;
import nw4j.wrapper.c.pointers.IntPointer;
import nw4j.wrapper.c.pointers.VoidPointer;
import static nw4j.wrapper.c.pointers.VoidPointer.*;
import static gljw.glfw.GLFW.*;

public final class Display {
	private Display() {}

	static @NativeType("GLFWwindow") long windowHandle; 
	static DisplayMode mode = new DisplayMode(1280, 720);
	static DisplayMode desktopDisplayMode;
	static int w, h;
	static boolean resizable;
	static boolean isVisible;
	static boolean isFocused;
	static boolean isFullscreen;
	static boolean isCreated;
	static int xPos, yPos;

	static {
		int init = glfwInit();
		if (init != GLFW_TRUE) throw new RuntimeException(new GLFWException(getErrorString(glfwGetError(VoidPointer.nullptr))));
		GLFWVidmode vMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		desktopDisplayMode = new DisplayMode(vMode.getWidth(), vMode.getHeight(), vMode.getRedBits(), vMode.getGreenBits(), vMode.getBlueBits(), vMode.getRefreshRate());
		resizable = true;
		isVisible = true;
	}


	static int lastKey;

	public static void create() throws GLFWException {
		if (mode == null) throw new RuntimeException("Display mode is null!");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_RED_BITS, 		desktopDisplayMode.redBits);
		glfwWindowHint(GLFW_GREEN_BITS, 	desktopDisplayMode.greenBits);
		glfwWindowHint(GLFW_BLUE_BITS, 		desktopDisplayMode.blueBits);
		glfwWindowHint(GLFW_REFRESH_RATE, 	desktopDisplayMode.refreshRate);
		glfwWindowHint(GLFW_RESIZABLE, 		resizable ? GLFW_TRUE : GLFW_FALSE);

		windowHandle = glfwCreateWindow(mode.w, mode.h, "Title", nullptr, nullptr);
		glfwSetInputMode(windowHandle, GLFW_CURSOR, Mouse.isGrabbed ? GLFW_CURSOR_DISABLED : GLFW_CURSOR_NORMAL);

		w = mode.w;
		h = mode.h;

		try(IntPointer $pos = IntPointer.alloc(2)){
			glfwGetWindowPos(windowHandle, $pos.addressIndex(0), $pos.addressIndex(1));
			xPos = $pos.get(0);
			yPos = $pos.get(1);
		}

		if (windowHandle == NULL) {
			throw new GLFWException(getErrorString(glfwGetError(nullptr)));
		}

		glfwSetWindowSizeCallback(windowHandle, (window, width, height) -> {
			w = width;
			h = height;
		});

		glfwSetWindowIconifyCallback(windowHandle, (window, iconified) -> {
			if (iconified == GLFW_TRUE) 
				isVisible = false;
			else
				isVisible = true;
		});

		glfwSetWindowFocusCallback(windowHandle, (window, focused) -> {
			if (focused == GLFW_TRUE) 
				isFocused = true;
			else
				isFocused = false;
		});

		glfwSetWindowPosCallback(windowHandle, (window, xpos, ypos) -> {
			xPos = xpos;
			yPos = ypos;
		});

		glfwSetScrollCallback(windowHandle, (window, xoffset, yoffset) -> {
			Mouse.wheelY += (int)yoffset;
		});

		glfwSetMouseButtonCallback(windowHandle, (window, button, action, mods) -> {
			Mouse.addEvent(button, action == GLFW_PRESS ? true : false);
		});

		glfwSetKeyCallback(windowHandle, (window, key, scancode, action, mods) -> {
			if (action == GLFW_REPEAT && !Keyboard.areRepeatEventsEnabled()) return;
			Keyboard.addKeyEvent(key, (action == GLFW_PRESS ? true : false) | (action == GLFW_REPEAT ? true : false));
		});

		glfwSetCharCallback(windowHandle, (window, codepoint) -> {
			Keyboard.addCharEvent((char)codepoint);
		});
		isCreated = true;
	}

	public static void makeCurrent() throws GLW4JException {
		if (windowHandle == NULL) throw new GLW4JException("Display is not created!");
		glfwMakeContextCurrent(windowHandle);
		OpenGL.initFuncPointers();
	}
	
	public static void setFullscreen(boolean isFullscreen) {
		if (Display.isFullscreen == isFullscreen) return;
		Display.isFullscreen = isFullscreen;
		long GLFWmonitor = glfwGetPrimaryMonitor();
		GLFWVidmode vidMode = glfwGetVideoMode(GLFWmonitor);
		if (isFullscreen) {
			glfwSetWindowMonitor(windowHandle, GLFWmonitor, 0, 0, vidMode.getWidth(), vidMode.getHeight(), vidMode.getRefreshRate());			
		}else {
			glfwSetWindowMonitor(windowHandle, nullptr, desktopDisplayMode.w / 2 - mode.w/2, desktopDisplayMode.h / 2 - mode.h/2, mode.w, mode.h, vidMode.getRefreshRate());
		}
	}

	public static boolean isFullscreen() {
		return isFullscreen;
	}

	public static void setTitle(CharSequence title) {
		glfwSetWindowTitle(windowHandle, title);
	}

	public static void setResizable(boolean isResizable) {
		resizable = isResizable;
		if (windowHandle != NULL) {
			glfwWindowHint(GLFW_RESIZABLE, isResizable ? GLFW_TRUE : GLFW_FALSE);
		}
	}

	public static int getX() {
		return xPos;
	}

	public static int getY() {
		return yPos;
	}

	public static boolean isResizable() {
		return resizable;
	}

	public static void setDisplayMode(DisplayMode displayMode) {
		mode = displayMode;
	}

	public static void sync(int fps) throws GLW4JException {
		if (fps < 0) throw new GLW4JException("fps < 0!"); 
		if (fps == 0) {
			glfwSwapInterval(0);
			return;
		}
		glfwSwapInterval(1000 / fps);
	}
	
	public static DisplayMode getDesktopDisplayMode() {
		return desktopDisplayMode;
	}

	public static boolean isVisible() {
		return isVisible;
	}

	public static int getWidth() {
		return w;
	}

	public static int getHeight() {
		return h;
	}

	static long getWindowHandle() {
		return windowHandle;
	}

	public static void destroy() {
		glfwDefaultWindowHints();
		glfwDestroyWindow(windowHandle);
		windowHandle = NULL;
		isCreated = false;
	}

	public static boolean isCloseRequested() {
		return glfwWindowShouldClose(windowHandle);
	}

	public static DisplayMode[] getAvailableDisplayModes() {
		try(IntPointer $count = IntPointer.alloc(1)){
			@NativeType("GLFWvidmode") long vidModes = glfwGetVideoModes(glfwGetPrimaryMonitor(), $count.address());
			DisplayMode[] modes = new DisplayMode[$count.get()];
			for (int i = 0; i < modes.length; ++i) {
				@SuppressWarnings("resource")
				GLFWVidmode vMode = new GLFWVidmode(vidModes + (GLFWVidmode.SIZEOF * i));
				modes[i] = new DisplayMode(vMode.getWidth(), vMode.getHeight(), vMode.getRedBits(), vMode.getGreenBits(), vMode.getBlueBits(), vMode.getRefreshRate());
			}
			return modes;
		}
	}

	public static void update() {
		if (!isCreated()) throw new RuntimeException("Display is not created!");
		glfwSwapBuffers(windowHandle);
		glfwPollEvents();
		if (Mouse.isCreated()) {
			Mouse.update();			
		}
		if (Keyboard.isCreated()) {
			Keyboard.update();
		}
	}

	public static boolean isFocused() {
		return isFocused;
	}

	public static boolean isCreated() {
		return isCreated;
	}	
}

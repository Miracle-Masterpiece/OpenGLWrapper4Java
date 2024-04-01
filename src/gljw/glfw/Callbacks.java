/*
 * Copyright (c) 2024 Miracle-Masterpiсe <mrmiraclemasterpiece@gmail.com or https://t.me/MiracleMasterpiece>. All rights reserved.
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
package gljw.glfw;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;

import java.awt.Window;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import nw4j.wrapper.c.pointers.BytePointer;
import nw4j.wrapper.c.pointers.PtrPointer;
import nw4j.wrapper.c.pointers.VoidPointer;
import gljw.annotations.Ctype;
import gljw.glfw.callbacks.ICharCallback;
import gljw.glfw.callbacks.ICharModsCallback;
import gljw.glfw.callbacks.ICursorEnterCallback;
import gljw.glfw.callbacks.ICursorPosCallback;
import gljw.glfw.callbacks.IDropCallback;
import gljw.glfw.callbacks.IFramebufferSizeCallback;
import gljw.glfw.callbacks.IJoystickCallback;
import gljw.glfw.callbacks.IKeyCallback;
import gljw.glfw.callbacks.IMouseButtonCallback;
import gljw.glfw.callbacks.IScrollCallback;
import gljw.glfw.callbacks.IWindowCloseCallback;
import gljw.glfw.callbacks.IWindowContentScaleCallback;
import gljw.glfw.callbacks.IWindowFocusCallback;
import gljw.glfw.callbacks.IWindowIconifyCallback;
import gljw.glfw.callbacks.IWindowMaximizeCallback;
import gljw.glfw.callbacks.IWindowPosCallback;
import gljw.glfw.callbacks.IWindowRefreshCallback;
import gljw.glfw.callbacks.IWindowSizeCallback;
import gljw.helpers.GLJWLinkedList;

@SuppressWarnings("unused")
class Callbacks {

	/**@see GLFW#glfwSetWindowPosCallback(long, IWindowPosCallback)*/
	static final long windowPosCallbackAddress = getUpCallAddress("glfwSetWindowPosCallback", MethodType.methodType(void.class, long.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
	private static void glfwSetWindowPosCallback(@Ctype("GLFWwindow*") long window, int xpos, int ypos) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowPosCallback callbackObject = glfwWindow.getWindowPosCallback();
		if (callbackObject != null) {
			callbackObject.windowPosCallback(window, xpos, ypos);
		}
	}

	/**@see GLFW#glfwSetWindowSizeCallback(long, IWindowPosCallback)*/
	static final long windowSizeCallbackAddress = getUpCallAddress("glfwSetWindowSizeCallback", MethodType.methodType(void.class, long.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
	private static void glfwSetWindowSizeCallback(@Ctype("GLFWwindow*") long window, int width, int height) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowSizeCallback callbackObject = glfwWindow.getWindowSizeCallback();
		if (callbackObject != null) {
			callbackObject.windowSizeCallback(window, width, height);
		}
	}

	/**@see GLFW#glfwSetWindowCloseCallback(long, IWindowCloseCallback)*/
	static final long windowCloseCallbackAddress = getUpCallAddress("glfwWindowCloseCallback", MethodType.methodType(void.class, long.class), FunctionDescriptor.ofVoid(JAVA_LONG));
	private static void glfwWindowCloseCallback(@Ctype("GLFWwindow*") long window) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowCloseCallback callbackObject= glfwWindow.getWindowCloseCallback();
		if (callbackObject != null) {
			callbackObject.windowCloseCallback(window);
		}
	}

	/**@see GLFW#glfwSetWindowRefreshCallback(long, IWindowRefreshCallback)*/
	static final long windowRefreshCallbackAddress = getUpCallAddress("glfwSetWindowRefreshCallback", MethodType.methodType(void.class, long.class), FunctionDescriptor.ofVoid(JAVA_LONG));
	private static void glfwSetWindowRefreshCallback(@Ctype("GLFWwindow*") long window) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowRefreshCallback callbackObject= glfwWindow.getWindowRefreshCallback();
		if (callbackObject != null) {
			callbackObject.windowRefreshCallback(window);
		}
	}

	/**@see GLFW#glfwSetWindowFocusCallback(long, IWindowFocusCallback)*/
	static final long windowFocusCallbackAddress = getUpCallAddress("glfwSetWindowFocusCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	public static void glfwSetWindowFocusCallback(@Ctype("GLFWwindow*") long window, int focused){
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowFocusCallback callbackObject= glfwWindow.getWindowFocusCallback();
		if (callbackObject != null) {
			callbackObject.windowFocusCallback(window, focused);
		}
	}

	/**@see GLFW#glfwSetWindowIconifyCallback(long, IWindowIconifyCallback)*/
	static final long windowIconifyCallbackAddress = getUpCallAddress("glfwWindowIconifyCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	private static void glfwWindowIconifyCallback(@Ctype("GLFWwindow*") long window, int iconified) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowIconifyCallback callbackObject= glfwWindow.getWindowIconifyCallback();
		if (callbackObject != null) {
			callbackObject.windowIconifyCallback(window, iconified);
		}
	}

	/**@see GLFW#glfwSetWindowMaximizeCallback(long, IWindowIconifyCallback)*/
	static final long windowMaximizeCallbackAddress = getUpCallAddress("glfwSetWindowMaximizeCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	public static void glfwSetWindowMaximizeCallback(@Ctype("GLFWwindow*") long window, int maximized) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowMaximizeCallback callbackObject= glfwWindow.getWindowMaximizeCallback();
		if (callbackObject != null) {
			callbackObject.windowMaximizeCallback(window, maximized);
		}
	}

	/**@see GLFW#glfwSetFramebufferSizeCallback(long, IFramebufferSizeCallback)*/
	static final long framebufferSizeCallbackAddress = getUpCallAddress("glfwSetFramebufferSizeCallback", MethodType.methodType(void.class, long.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
	private static void glfwSetFramebufferSizeCallback(@Ctype("GLFWwindow*") long window, int width, int height){
		GLFWwindow glfwWindow = getWindowObj(window);
		IFramebufferSizeCallback callbackObject= glfwWindow.getFramebufferSizeCallback();
		if (callbackObject != null) {
			callbackObject.frameBufferSizeCallback(window, width, height);
		}
	}

	/**@see GLFW#glfwSetWindowContentScaleCallback(long, IFramebufferSizeCallback)*/
	static final long windowContentScaleCallbackAddress = getUpCallAddress("glfwSetWindowContentScaleCallback", MethodType.methodType(void.class, long.class, float.class, float.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT));
	private static void glfwSetWindowContentScaleCallback(@Ctype("GLFWwindow*") long window, float xscale, float yscale) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IWindowContentScaleCallback callbackObject= glfwWindow.getWindowContentScaleCallback();
		if (callbackObject != null) {
			callbackObject.windowContentScaleCallback(window, xscale, yscale);
		}
	}

	/**@see {@link GLFW#glfwSetErrorCallback(IErrorCallback)}*/
	static final long errorCallbackAddress = getUpCallAddress("glfwSetErrorCallback", MethodType.methodType(void.class, int.class, long.class), FunctionDescriptor.ofVoid(JAVA_INT, JAVA_LONG));
	public static void glfwSetErrorCallback(int error_code, @Ctype("const char*") long description) {
		if (GLFW.errorCallbackImpl != null) {
			BytePointer string = BytePointer.asAddress(description);
			GLFW.errorCallbackImpl.errorCallback(error_code, string.toUTF8());	
		}
	}

	/**@see {@link GLFW#monitorCallbackImpl}*/
	static final long monitorCallbackAddress = getUpCallAddress("glfwSetErrorCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	private static void glfwSetErrorCallback(@Ctype("GLFWmonitor*") long monitor, int event) {
		if (GLFW.monitorCallbackImpl != null) {
			GLFW.monitorCallbackImpl.monitorCallback(monitor, event);
		}
	}

	/**@see {@link GLFW#glfwSetKeyCallback(long, IKeyCallback)}*/
	static final long keyCallback = getUpCallAddress("glfwSetKeyCallback", MethodType.methodType(void.class, long.class, int.class, int.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
	private static void glfwSetKeyCallback(@Ctype("GLFWwindow*") long window, int key, int scancode, int action, int mods) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IKeyCallback callbackObject= glfwWindow.getKeyCallback();
		if (callbackObject != null) {
			callbackObject.keyCallback(window, key, scancode, action, mods);
		}
	}

	/**@see {@link GLFW#glfwSetCharCallback(long, ICharCallback)}*/
	static final long charCallbackAddress = getUpCallAddress("glfwSetCharCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	private static void glfwSetCharCallback(@Ctype("GLFWwindow*") long window, @Ctype("unsigned int") int codepoint) {
		GLFWwindow glfwWindow = getWindowObj(window);
		ICharCallback callbackObject= glfwWindow.getCharCallback();
		if (callbackObject != null) {
			callbackObject.charCallback(window, codepoint);
		}
	}

	/**@see {@link GLFW#glfwSetCharModsCallback(long, ICharModsCallback)}*/
	@Deprecated(forRemoval = true) 
	static final long charModsCallbackAddress = getUpCallAddress("glfwSetCharModsCallback", MethodType.methodType(void.class, long.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
	@Deprecated(forRemoval = true) 
	private static void glfwSetCharModsCallback(@Ctype("GLFWwindow*") long window, @Ctype("unsigned int") int codepoint, int mods) {
		GLFWwindow glfwWindow = getWindowObj(window);
		ICharModsCallback callbackObject= glfwWindow.getCharModsCallback();
		if (callbackObject != null) {
			callbackObject.charModsCallback(window, codepoint, mods);
		}
	}

	/**@see {@link GLFW#glfwSetMouseButtonCallback(long, gljw.glfw.callbacks.IMouseButtonCallback)}*/
	static final long mouseButtonCallbackAddress = getUpCallAddress("glfwSetMouseButtonCallback", MethodType.methodType(void.class, long.class, int.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT));
	private static void glfwSetMouseButtonCallback(@Ctype("GLFWwindow*") long window, int button, int action, int mods) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IMouseButtonCallback callbackObject= glfwWindow.getMouseButtonCallback();
		if (callbackObject != null) {
			callbackObject.mouseButtonCallback(window, button, action, mods);
		}
	}

	/**@see {@link GLFW#glfwSetCursorPosCallback(long, gljw.glfw.callbacks.ICursorPosCallback)}*/
	static final long cursorPosCallbackAddress = getUpCallAddress("glfwSetCursorPosCallback", MethodType.methodType(void.class, long.class, double.class, double.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
	private static void glfwSetCursorPosCallback(@Ctype("GLFWwindow*") long window, double xpos, double ypos) {
		GLFWwindow glfwWindow = getWindowObj(window);
		ICursorPosCallback callbackObject = glfwWindow.getCursorPosCallback();
		if (callbackObject != null) {
			callbackObject.cursorPosCallback(window, xpos, ypos);
		}
	}

	/**@see {@link GLFW#glfwSetCursorEnterCallback(long, ICursorEnterCallback)}*/
	static final long cursorEnterCallbackAddress = getUpCallAddress("glfwSetCursorEnterCallback", MethodType.methodType(void.class, long.class, int.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
	private static void glfwSetCursorEnterCallback(@Ctype("GLFWwindow*") long  window, int entered) {
		GLFWwindow glfwWindow = getWindowObj(window);
		ICursorEnterCallback callbackObject = glfwWindow.getCursorEnterCallback();
		if (callbackObject != null) {
			callbackObject.cursorEnterCallback(window, entered);
		}
	}

	/**@see {@link GLFW#glfwSetScrollCallback(long, IScrollCallback)}*/
	static final long scrollCallbackAddress = getUpCallAddress("glfwSetScrollCallback", MethodType.methodType(void.class, long.class, double.class, double.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
	private static void glfwSetScrollCallback(@Ctype("GLFWwindow*") long window, double xoffset, double yoffset) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IScrollCallback callbackObject = glfwWindow.getScrollCallback();
		if (callbackObject != null) {
			callbackObject.scrollCallback(window, xoffset, yoffset);
		}
	}

	/**@see {@link GLFW#glfwSetScrollCallback(long, IScrollCallback)}*/
	static final long dropCallbackAddress = getUpCallAddress("glfwSetDropCallback", MethodType.methodType(void.class, long.class, int.class, long.class), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_LONG));
	private static void glfwSetDropCallback(@Ctype("GLFWwindow*") long window, int path_count, @Ctype("const char* paths[]") long paths) {
		GLFWwindow glfwWindow = getWindowObj(window);
		IDropCallback callbackObject = glfwWindow.getDropCallback();
		if (callbackObject != null) {
			final String[] jpaths = new String[path_count];
			@SuppressWarnings("unchecked")
			PtrPointer<BytePointer> bytePointerArray = PtrPointer.<BytePointer>asAddress(paths); 
			for (int i = 0; i < path_count; ++i) {
				BytePointer string = bytePointerArray.get(i, BytePointer::asAddress);
				jpaths[i] = string.toUTF8();
			}
			callbackObject.dropCallback(window, path_count, jpaths);
		}
	}

	/**@see {@link GLFW#glfwSetScrollCallback(long, IScrollCallback)}*/
	static final long joystickCallbackAddress = getUpCallAddress("glfwSetJoystickCallback", MethodType.methodType(void.class, int.class, int.class), FunctionDescriptor.ofVoid(JAVA_INT, JAVA_INT));
	private static void glfwSetJoystickCallback(int jid, int event) {
		if (GLFW.joystickCallbackImpl != null) {
			GLFW.joystickCallbackImpl.joystickCallback(jid, event);
		}
	}

















	/**
	 * @param window window pointer. 
	 * @return Returns a wrapper object that stores data for the window whose ID is passed to the method.
	 * */
	static final GLFWwindow getWindowObj(@Ctype("GLFWwindow*") long window) {
		for (GLJWLinkedList.Node<GLFWwindow> node = GLFW.WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			GLFWwindow windowObj = node.getValue();
			if (windowObj.pointer() == window) {
				return windowObj;
			}
		}
		return null;
	}

	static long getUpCallAddress(String name, MethodType type, FunctionDescriptor desc) {		
		Arena global = Arena.global();
		try{
			MethodHandle c = MethodHandles.lookup().findStatic(Callbacks.class, name, type);
			MemorySegment s = Linker.nativeLinker().upcallStub(c, desc, global);
			return s.address();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return VoidPointer.nullptr;
	}
}

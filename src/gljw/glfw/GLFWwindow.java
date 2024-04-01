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

import nw4j.wrapper.c.pointers.VoidPointer;
import gljw.annotations.Ctype;
import gljw.glfw.callbacks.ICharCallback;
import gljw.glfw.callbacks.ICharModsCallback;
import gljw.glfw.callbacks.ICursorEnterCallback;
import gljw.glfw.callbacks.ICursorPosCallback;
import gljw.glfw.callbacks.IDropCallback;
import gljw.glfw.callbacks.IFramebufferSizeCallback;
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

class GLFWwindow extends Struct{

	/**@see GLFW#glfwSetWindowPosCallback(long, IWindowPosCallback)*/
	private IWindowPosCallback windowPosCallbackImpl;
	
	/**@see GLFW#glfwSetWindowSizeCallback(long, IWindowSizeCallback)*/
	private IWindowSizeCallback windowSizeCallbackImpl;
	
	/**@see GLFW#glfwSetWindowCloseCallback(long, IWindowCloseCallback)*/
	private IWindowCloseCallback windowCloseCallbackImpl;
	
	/**@see GLFW#glfwSetWindowRefreshCallback(long, IWindowRefreshCallback)*/
	private IWindowRefreshCallback windowRefreshCallbackImpl;
	
	/**@see GLFW#glfwSetWindowFocusCallback(long, IWindowFocusCallback)*/
	private IWindowFocusCallback windowFocusCallbackImpl;
	
	/**@see GLFW#glfwSetWindowIconifyCallback(long, IWindowIconifyCallback )*/
	private IWindowIconifyCallback windowIconifyCallbackImpl;
	
	/**@see GLFW#glfwSetWindowMaximizeCallback(long, IWindowMaximizeCallback)*/
	private IWindowMaximizeCallback windowMaximizeCallbackImpl;
	
	/**@see GLFW#glfwSetFramebufferSizeCallback(long, IFramebufferSizeCallback)*/
	private IFramebufferSizeCallback framebufferSizeCallbackImpl;
	
	/**@see GLFW#glfwSetWindowContentScaleCallback(long, WindowContentScaleCallback)*/
	private IWindowContentScaleCallback windowContentScaleCallbackImpl; 
	
	/**@see GLFW#glfwSetKeyCallback(long, IKeyCallback)*/
	private IKeyCallback keyCallbackImpl;
	
	/**@see GLFW#glfwSetCharCallback(long, ICharCallback)*/
	private ICharCallback charCallbackImpl;
	
	/**@see GLFW#glfwSetCharModsCallback(long, ICharModsCallback)*/
	@Deprecated
	private ICharModsCallback charModsCallbackImpl;
	
	/**@see GLFW#glfwSetMouseButtonCallback(long, IMoseButtonCallback)*/
	private IMouseButtonCallback mouseButtonCallbackImpl;
	
	/**@see GLFW#glfwSetCursorPosCallback(long, ICursorPosCallback)*/
	private ICursorPosCallback cursorPosCallbackImpl;
	
	/**@see GLFW#glfwSetCursorEnterCallback(long, ICursorEnterCallback)*/
	private ICursorEnterCallback cursorEnterCallbackImpl;
	
	/**@see GLFW#glfwSetScrollCallback(long, IScrollCallback)*/
	private IScrollCallback scrollCallbackImpl;
	
	/**@see GLFW#glfwSetDropCallback(long, IDropCallback)*/
	private IDropCallback dropCallbackImpl;
	
	public GLFWwindow(@Ctype("GLFWwindow*") long window) {
		super(window);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		return o instanceof VoidPointer && ((VoidPointer)o).address() == address();
	}
	
	@Override
	public int hashCode() {
		return Long.hashCode(address());
	}
	
	public @Ctype("GLFWwindow*") long pointer() {
		return address();
	}

	public IWindowPosCallback setWindowPosCallback(IWindowPosCallback callback) {
		IWindowPosCallback tmp = windowPosCallbackImpl; 
		windowPosCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowPosCallback getWindowPosCallback() {
		return windowPosCallbackImpl;
	}
	
	public IWindowSizeCallback setWindowSizeCallback(IWindowSizeCallback callback) {
		IWindowSizeCallback tmp = windowSizeCallbackImpl; 
		windowSizeCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowSizeCallback getWindowSizeCallback() {
		return windowSizeCallbackImpl;
	}
	
	public IWindowCloseCallback setWindowCloseCallback(IWindowCloseCallback callback) {
		IWindowCloseCallback tmp = windowCloseCallbackImpl;
		windowCloseCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowCloseCallback getWindowCloseCallback() {
		return windowCloseCallbackImpl;
	}

	public IWindowRefreshCallback setWindowRefreshCallback(IWindowRefreshCallback callback) {
		IWindowRefreshCallback tmp = windowRefreshCallbackImpl;
		windowRefreshCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowRefreshCallback getWindowRefreshCallback() {
		return windowRefreshCallbackImpl;
	}
	
	public IWindowFocusCallback setWindowFocusCallback(IWindowFocusCallback callback) {
		IWindowFocusCallback tmp = windowFocusCallbackImpl;
		windowFocusCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowFocusCallback getWindowFocusCallback() {
		return windowFocusCallbackImpl;
	}
	
	public IWindowIconifyCallback setWindowIconifyCallback(IWindowIconifyCallback callback) {
		IWindowIconifyCallback tmp = windowIconifyCallbackImpl;
		windowIconifyCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowIconifyCallback getWindowIconifyCallback() {
		return windowIconifyCallbackImpl;
	}
	
	public IWindowMaximizeCallback setWindowMaximizeCallback(IWindowMaximizeCallback callback) {
		IWindowMaximizeCallback tmp = windowMaximizeCallbackImpl;
		windowMaximizeCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowMaximizeCallback getWindowMaximizeCallback() {
		return windowMaximizeCallbackImpl;
	}
	
	public IFramebufferSizeCallback setFramebufferSizeCallback(IFramebufferSizeCallback callback) {
		IFramebufferSizeCallback tmp = framebufferSizeCallbackImpl;
		framebufferSizeCallbackImpl = callback;
		return tmp;
	}
	
	public IFramebufferSizeCallback getFramebufferSizeCallback() {
		return framebufferSizeCallbackImpl;
	}
	
	public IWindowContentScaleCallback setWindowContentScaleCallback(IWindowContentScaleCallback callback) {
		IWindowContentScaleCallback tmp = windowContentScaleCallbackImpl;
		windowContentScaleCallbackImpl = callback;
		return tmp;
	}
	
	public IWindowContentScaleCallback getWindowContentScaleCallback() {
		return windowContentScaleCallbackImpl;
	}
	
	public IKeyCallback setKeyCallback(IKeyCallback callback) {
		IKeyCallback tmp = keyCallbackImpl;
		keyCallbackImpl = callback;
		return tmp;
	}
	
	public IKeyCallback getKeyCallback() {
		return keyCallbackImpl;
	}
	
	public ICharCallback setCharCallback(ICharCallback callback) {
		ICharCallback tmp = charCallbackImpl;
		charCallbackImpl = callback;
		return tmp;
	}
	
	public ICharCallback getCharCallback() {
		return charCallbackImpl;
	}
	
	@Deprecated(forRemoval = true)
	public ICharModsCallback setCharModsCallback(ICharModsCallback callback) {
		ICharModsCallback tmp = charModsCallbackImpl;
		charModsCallbackImpl = callback;
		return tmp;
	}
	
	@Deprecated(forRemoval = true)
	public ICharModsCallback getCharModsCallback() {
		return charModsCallbackImpl;
	}
	
	public IMouseButtonCallback setMouseButtonCallback(IMouseButtonCallback callback) {
		IMouseButtonCallback tmp = mouseButtonCallbackImpl;
		mouseButtonCallbackImpl = callback;
		return tmp;
	}
	
	public IMouseButtonCallback getMouseButtonCallback() {
		return mouseButtonCallbackImpl;
	}
	
	public ICursorPosCallback setCursorPosCallback(ICursorPosCallback callback) {
		ICursorPosCallback tmp = cursorPosCallbackImpl;
		cursorPosCallbackImpl = callback;
		return tmp;
	}
	
	public ICursorPosCallback getCursorPosCallback() {
		return cursorPosCallbackImpl;
	}
	
	public ICursorEnterCallback setCursorEnterCallback(ICursorEnterCallback callback) {
		ICursorEnterCallback tmp = cursorEnterCallbackImpl;
		cursorEnterCallbackImpl = callback;
		return tmp;
	}
	
	public ICursorEnterCallback getCursorEnterCallback() {
		return cursorEnterCallbackImpl;
	}
	
	public IScrollCallback setScrollCallback(IScrollCallback callback) {
		IScrollCallback tmp = scrollCallbackImpl;
		scrollCallbackImpl = callback;
		return tmp;
	}
	
	public IScrollCallback getScrollCallback() {
		return scrollCallbackImpl;
	}
	
	public IDropCallback setDropCallback(IDropCallback callback) {
		IDropCallback tmp = dropCallbackImpl;
		dropCallbackImpl = callback;
		return tmp;
	}
	
	public IDropCallback getDropCallback() {
		return dropCallbackImpl;
	}

	@Override
	public long sizeof() {
		return BYTE_SIZE;
	}

	@Override
	public VoidPointer clone() {
		return null;
	}
}

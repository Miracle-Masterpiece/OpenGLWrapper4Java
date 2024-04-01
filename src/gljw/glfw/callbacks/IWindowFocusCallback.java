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
package gljw.glfw.callbacks;

import gljw.annotations.Ctype;

@FunctionalInterface
public interface IWindowFocusCallback {
	void windowFocusCallback(@Ctype("GLFWwindow*") long window, int focused);
}

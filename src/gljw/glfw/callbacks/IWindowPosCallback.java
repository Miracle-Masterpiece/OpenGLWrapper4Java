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
public interface IWindowPosCallback {
	void windowPosCallback(@Ctype("GLFWwindow*") long window, int xpos, int ypos);
}

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
public interface IDropCallback {
	void dropCallback(@Ctype("GLFWwindow*") long window, int path_count, @Ctype("const char* paths[]") String[] paths);
}

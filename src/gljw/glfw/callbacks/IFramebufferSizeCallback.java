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
public interface IFramebufferSizeCallback {
	void frameBufferSizeCallback(@Ctype("GLFWwindow*") long window, int width, int height);
}

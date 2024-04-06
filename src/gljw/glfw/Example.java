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

import static gljw.glfw.GLFW.*;

import gljw.opengl.GL10;
import gljw.opengl.GLConstants;
import gljw.opengl.OpenGL;
import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.IntPointer;
import nw4j.wrapper.c.pointers.SmartPointer;
import nw4j.wrapper.c.pointers.VoidPointer;

class Example {
	
	public static void main(String[] args) {
		int init = glfwInit();
		if (init == 0) throw new RuntimeException("GLFW not init!");
		
		long window = glfwCreateWindow(1280, 720, "Привет, Россия!", VoidPointer.nullptr, VoidPointer.nullptr);
		glfwMakeContextCurrent(window);
		OpenGL.initFuncPointers();


		glfwSwapInterval(0);		
		GL10.glClearColor(0, 1, 0, 1);
		
		SmartPointer<IntPointer> windowSize = new SmartPointer<IntPointer>(IntPointer.alloc(2));
	
		while (!glfwWindowShouldClose(window)) {
			GL10.glClear(GLConstants.GL_COLOR_BUFFER_BIT | GLConstants.GL_DEPTH_BUFFER_BIT);

			IntPointer $windowSize = windowSize.pointer();
			glfwGetWindowSize(window, $windowSize.addressIndex(0), $windowSize.addressIndex(1));
			GL10.glViewport(0, 0, $windowSize.get(0), $windowSize.get(1));
			
			GL10.glBegin(GLConstants.GL_TRIANGLES);		
			GL10.glVertex2f(0, 0);
			GL10.glVertex2f(1, 0);
			GL10.glVertex2f(1, 1);
			GL10.glEnd();

			glfwSwapBuffers(window);
			glfwPollEvents();
		}
		windowSize = null;
		System.out.println(MemoryAccessor.getLog());
		
	}
}

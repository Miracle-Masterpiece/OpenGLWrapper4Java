package gljw.glfw;

import static gljw.glfw.GLFW.*;

import gljw.opengl.GL10;
import gljw.opengl.GLConstants;
import gljw.opengl.OpenGL;
import nw4j.wrapper.c.pointers.VoidPointer;

class Example {
	public static void main(String[] args) {
		int init = glfwInit();
		if (init == 0) throw new RuntimeException("GLFW not init!");
		
		long window = glfwCreateWindow(1280, 720, "Привет, Россия!", VoidPointer.nullptr, VoidPointer.nullptr);
		glfwMakeContextCurrent(window);
		OpenGL.initFuncPointers();


		glfwSwapInterval(0);


		System.out.println(GLFWGammaRamp.SIZE_OF);

		GL10.glClearColor(0, 1, 0, 1);
		while (!glfwWindowShouldClose(window)) {
			GL10.glClear(GLConstants.GL_COLOR_BUFFER_BIT | GLConstants.GL_DEPTH_BUFFER_BIT);

			GL10.glBegin(GLConstants.GL_TRIANGLES);		
			GL10.glVertex2f(0, 0);
			GL10.glVertex2f(1, 0);
			GL10.glVertex2f(1, 1);
			GL10.glEnd();

			glfwSwapBuffers(window);
			glfwPollEvents();
		}
	}
}

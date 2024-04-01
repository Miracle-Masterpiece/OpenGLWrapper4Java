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
package gljw.opengl;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
import gljw.glfw.NativeLoader;
import gljw.helpers.Helpers;

public class OpenGL {

	static {
		NativeLoader.loadNative();
	}
	
	public static void initFuncPointers() {
		try{
			gladLoadGL.invoke();
		}catch(Throwable th) {
			throw new RuntimeException(th);
		}
	} private static final MethodHandle gladLoadGL = Helpers.createCriticalMethodHandle("gladLoadGL", FunctionDescriptor.ofVoid());
}

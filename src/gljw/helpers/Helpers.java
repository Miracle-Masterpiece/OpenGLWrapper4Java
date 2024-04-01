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
package gljw.helpers;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.Linker.Option;
import java.lang.invoke.MethodHandle;

import gljw.glfw.NativeLoader;

public final class Helpers {

	private Helpers() {throw new SecurityException("An object of the current class should never be created.");}
	
	static{
		NativeLoader.loadNative();
	}
	
	public static MethodHandle createCriticalMethodHandle(String name, FunctionDescriptor desc) {
		final Linker nativeLinker 	= Linker.nativeLinker();
		final Option critical 		= Option.critical(false);
		MethodHandle handle = null; 
		try{
			handle = nativeLinker.downcallHandle(SymbolLookup.loaderLookup().find(name).orElseThrow(), desc, critical);
		}catch(Exception e) {
			System.out.println(name + " = " + e);
		}
		return handle;
	}
	
	public static MethodHandle createNoCriticalMethodHandle(String name, FunctionDescriptor desc) {
		final Linker nativeLinker 	= Linker.nativeLinker();
		MethodHandle handle = null; 
		try{
			handle = nativeLinker.downcallHandle(SymbolLookup.loaderLookup().find(name).orElseThrow(), desc);
		}catch(Exception e) {
			System.out.println(name + "" + e);
		}
		return handle;
	}
}

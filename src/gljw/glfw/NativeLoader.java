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

import nw4j.helpers.Platform;

public final class NativeLoader {

	private NativeLoader() {throw new SecurityException("An object of the current class should never be created.");}
	private static boolean loadedNative;

	public static void loadNative() {
		if (!loadedNative) {
			synchronized (NativeLoader.class) {
				if (!loadedNative) {
					try{
						String libPath = System.getProperty("java.library.path");
						Platform platform = Platform.getPlatform();
						System.load(libPath + "glfw3" 				+ platform.getNativeLibraryFileExtension());
						System.load(libPath + "funcsptrs_glad" 		+ platform.getNativeLibraryFileExtension());
						System.load(libPath + "openal" 				+ platform.getNativeLibraryFileExtension());
						loadedNative = true;
					}catch(Exception e) {
						throw e;
					}
				}
			}	
		}
	}
}

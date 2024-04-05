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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import gljw.helpers.Helpers;
import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.IntPointer;
import nw4j.wrapper.c.pointers.VoidPointer;

public class GLFWVidmode extends Struct {

	public static final int WIDTH_OFFSET;
	public static final int HEIGHT_OFFSET;
	public static final int RED_BITS_OFFSET;
	public static final int GREEN_BITS_OFFSET;
	public static final int BLUE_BITS_OFFSET;
	public static final int REFRASH_RATE_OFFSET;
	public static final int SIZEOF;
	
	static {
		NativeLoader.loadNative();
		MethodHandle method = Helpers.createCriticalMethodHandle("GLFWvidmode_dataOfStructure", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
		
		int width 			= 0;
	 	int height			= 0;
		int redBits			= 0;
	 	int greenBits		= 0;
		int blueBits		= 0;
		int refreshRate		= 0;
		int sizeof			= 0;
		
		try(IntPointer args = IntPointer.alloc(7)){
			try {
				method.invoke(args.addressIndex(0), args.addressIndex(1), args.addressIndex(2), args.addressIndex(3), args.addressIndex(4), args.addressIndex(5), args.addressIndex(6));
				width 		= args.get(0);
				height 		= args.get(1);
				redBits 	= args.get(2);
				greenBits 	= args.get(3);
				blueBits 	= args.get(4);
				refreshRate = args.get(5);
				sizeof 		= args.get(6);
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		}
		
		WIDTH_OFFSET 		= width;
		HEIGHT_OFFSET 		= height;
		RED_BITS_OFFSET 	= redBits;
		GREEN_BITS_OFFSET 	= greenBits;
		BLUE_BITS_OFFSET 	= blueBits;
		REFRASH_RATE_OFFSET = refreshRate;
		SIZEOF 				= sizeof;
	}
	
	public GLFWVidmode(long address) {
		super(address);
	}
	
	private final int getInt(int offset) {
		if (MemoryAccessor.NATIVE_SIZEOF_INT == 4) {
			return MemoryAccessor.getInt(address + offset);	
		}else {
			return MemoryAccessor.getShort(address + offset);
		}
	}
	
	public int getWidth() {
		return getInt(WIDTH_OFFSET);
	}
	
	public int getHeight() {
		return getInt(HEIGHT_OFFSET);
	}
	
	public int getRedBits() {
		return getInt(RED_BITS_OFFSET); 
	}
	
	public int getGreenBits() {
		return getInt(GREEN_BITS_OFFSET); 
	}
	
	public int getBlueBits() {
		return getInt(BLUE_BITS_OFFSET); 
	}
	
	public int getRefreshRate() {
		return getInt(REFRASH_RATE_OFFSET); 
	}
	
	@Override
	public long sizeof() {
		return SIZEOF;
	}

	@Override
	public VoidPointer clone() {
		GLFWVidmode _new = new GLFWVidmode(MemoryAccessor.malloc(SIZEOF));
		_new.copydata(this);
		return _new;
	}
	
	static class ConstGLFWVidmode extends GLFWVidmode {
		public ConstGLFWVidmode(long address) {
			super(address);
		}
		
		@Override
		public void close() {
			throw new IllegalStateException("Current obj is constant!");
		}
		
		@Override
		public void free() {
			throw new IllegalStateException("Current obj is constant!");
		}
	}
	
	@Override
	public final String toString() {
		return "[" + getWidth() + "x" + getHeight() + " @" + getRefreshRate() + "]";
	}
}

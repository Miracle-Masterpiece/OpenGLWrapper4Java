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
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.IntPointer;
import gljw.annotations.Ctype;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * This describes the gamma ramp for a monitor.
 * @see GLFW#glfwSetGammaRamp(long, long)
 * @see GLFW#glfwGetGammaRamp(long)
 * */
@Ctype("GLFWgammaramp*")
public final class GLFWGammaRamp extends Struct {

	/**
	 * Struct Data Fields
	 * unsigned short * 	red			//An array of value describing the response of the red channel.
	 * unsigned short * 	green		//An array of value describing the response of the green channel.
	 * unsigned short * 	blue		//An array of value describing the response of the blue channel.
	 * unsigned int 		size		//The number of elements in each array.
	 * 
	 * Constant struct field offsets
	 * */
	public static final byte 
	RED_OFFSET,
	GREEN_OFFSET, 
	BLUE_OFFSET, 
	SIZE_OFFSET, 
	SIZE_OF;
	
	static {
		NativeLoader.loadNative();
		Linker linker = Linker.nativeLinker();
		
		{
			int redOffset 	= 0, greenOffset = 0, blueOffset = 0 ,sizeOffset = 0, sizeof = 0;
			MethodHandle dataOfStructure = linker.downcallHandle(SymbolLookup.loaderLookup().find("GLFWgammaramp_dataOfStructure").orElseThrow(), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));

			try(IntPointer ints = IntPointer.alloc(5)){
				try{
					dataOfStructure.invoke(ints.addressIndex(0), ints.addressIndex(1), ints.addressIndex(2), ints.addressIndex(3), ints.addressIndex(4));
				}catch(Throwable t) {throw new RuntimeException(t);}
				redOffset 	= ints.get(0);
				greenOffset = ints.get(1);
				blueOffset 	= ints.get(2);
				sizeOffset 	= ints.get(3);
				sizeof		= ints.get(4);
			}			
			RED_OFFSET 		= (byte)redOffset;
			GREEN_OFFSET 	= (byte)greenOffset;
			BLUE_OFFSET 	= (byte)blueOffset;
			SIZE_OFFSET 	= (byte)sizeOffset;
			SIZE_OF 		= (byte)sizeof;
		}
	}
	
	public GLFWGammaRamp() {
		super((int)SIZE_OF);
	}
	
	public GLFWGammaRamp(@Ctype("GLFWgammaramp*") long address) {
		super(address);
	}
	
	public GLFWGammaRamp(
			@Ctype("unsigned short*") long red,
			@Ctype("unsigned short*") long green,
			@Ctype("unsigned short*") long blue,
			@Ctype("unsigned short*") int size
			) {
		super(SIZE_OF);
		setRed	(red);
		setGreen(green);
		setBlue	(blue);
		setSize	(size);
	}
	
	/**@return Returns the amount of memory occupied by a pure structure*/
	@Override
	public long sizeof() {
		return SIZE_OF;
	}
	
	/**
	 * @param red An array of value describing the response of the red channel.
	 * */
	public void setRed(@Ctype("unsigned short*") long red) {
		MemoryAccessor.setLong(address() + RED_OFFSET, red);
	}
	
	/**
	 * @param green An array of value describing the response of the green channel.
	 * */
	public void setGreen(@Ctype("unsigned short*") long green) {
		MemoryAccessor.setLong(address() + GREEN_OFFSET, green);
	}
	
	/**
	 * @param blue An array of value describing the response of the blue channel.
	 * */
	public void setBlue(@Ctype("unsigned short*") long blue) {
		MemoryAccessor.setLong(address() + BLUE_OFFSET, blue);
	}
	
	/**
	 * @param size The number of elements in each array.
	 * */
	public void setSize(int size) {
		MemoryAccessor.setInt(address() + SIZE_OFFSET, size);
	}
	
	/**
	 * @return pointer to an array of value describing the response of the red channel.
	 * */
	public @Ctype("unsigned short*") long getRed(){
		return MemoryAccessor.getLong(address() + RED_OFFSET);
	}
	
	/**
	 * @return pointer to an array of value describing the response of the green channel.
	 * */
	public @Ctype("unsigned short*") long getGreen(){
		return MemoryAccessor.getLong(address() + GREEN_OFFSET);
	}
	
	/**
	 * @return pointer to an array of value describing the response of the blue channel.
	 * */
	public @Ctype("unsigned short*") long getBlue(){
		return MemoryAccessor.getLong(address() + BLUE_OFFSET);
	}
	
	/**
	 * @return pointer to the number of elements in each array.
	 * */
	public int getSize(){
		return MemoryAccessor.getInt(address() + SIZE_OFFSET);
	}

	@Override
	public GLFWGammaRamp clone() {
		GLFWGammaRamp _new = new GLFWGammaRamp();
		_new.copydata(this);
		return _new;
	}
}

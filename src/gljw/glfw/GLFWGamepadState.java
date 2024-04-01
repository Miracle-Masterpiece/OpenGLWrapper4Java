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
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.IntPointer;
import nw4j.wrapper.c.pointers.VoidPointer;
import gljw.annotations.Ctype;
import gljw.helpers.Helpers;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * Data Fields
 * unsigned char 	buttons[15]		//The states of each gamepad button, {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
 * float 			axes[6]			//The states of each gamepad axis, in the range -1.0 to 1.0 inclusive.
 * 
 * Detailed Description
 * This describes the input state of a gamepad.
 * 
 * @see GLFW#glfwGetGamepadState(int, GLFWGamepadState)
 * */
@Ctype("GLFWgamepadstate")
public class GLFWGamepadState extends VoidPointer{

	public static final byte BUTTONS_OFFSET;
	public static final byte BUTTONS_ARRAY_LEN;
	public static final byte AXIS_OFFSET;
	public static final byte AXIS_ARRAY_LEN;
	public static final byte SIZE_OF;

	static {
		NativeLoader.loadNative();
		final MethodHandle mh = Helpers.createCriticalMethodHandle("GLFWgamepadstate_dataOfStructure", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));

		int buttons_offset 		= 0;
		int buttons_array_len	= 0;
		int axis_offset 		= 0;
		int axis_array_len		= 0;
		int sizeof 				= 0;

		try(IntPointer data = IntPointer.alloc(3)){
			try{
				mh.invoke(data.address(), data.addressIndex(1), data.addressIndex(2));
			}catch (Throwable e) {
				throw new RuntimeException(e);
			}
			buttons_offset 	= data.get();
			axis_offset 	= data.get(1);
			sizeof 			= data.get(2);
			buttons_array_len 	= (axis_offset - 1) / VoidPointer.BYTE_SIZE;
			axis_array_len 		= (sizeof - axis_offset) / VoidPointer.FLOAT_SIZE;
		}

		BUTTONS_OFFSET 		= (byte)buttons_offset;
		BUTTONS_ARRAY_LEN 	= (byte)buttons_array_len;
		AXIS_OFFSET 		= (byte)axis_offset;
		AXIS_ARRAY_LEN 		= (byte)axis_array_len;
		SIZE_OF				= (byte)sizeof;
	}


	public GLFWGamepadState() {
		super();
	}

	public GLFWGamepadState(long address) {
		super(address);
	}

	@Override
	public long sizeof() {
		return SIZE_OF;
	}

	@Override
	public GLFWGamepadState clone() {
		GLFWGamepadState _new = new GLFWGamepadState();
		_new.copydata(this);
		return _new;
	}

	public void setButton(int index, byte v) {
		Objects.checkIndex(index, BUTTONS_ARRAY_LEN);
		MemoryAccessor.setByte(address() + BUTTONS_OFFSET + (index * VoidPointer.BYTE_SIZE), v);
	}

	/**
	 * @param index Index in an array of values
	 * 
	 * @see GLFWGamepadState#BUTTONS_ARRAY_LEN
	 * 
	 * @return The states of each gamepad button, {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
	 * */
	public byte getButton(int index) {
		Objects.checkIndex(index, BUTTONS_ARRAY_LEN);
		return MemoryAccessor.getByte(address() + BUTTONS_OFFSET + (index * VoidPointer.BYTE_SIZE));
	}

	public void setAxis(int index, float v) {
		Objects.checkIndex(index, AXIS_ARRAY_LEN);
		MemoryAccessor.setFloat(address() + AXIS_OFFSET + (index * VoidPointer.FLOAT_SIZE), v);
	}

	/**
	 * @param index Index in an array of values
	 * 
	 * @see GLFWGamepadState#BUTTONS_ARRAY_LEN
	 * 
	 * @return The states of each gamepad axis, in the range -1.0 to 1.0 inclusive.
	 * */
	public float getAxis(int index) {
		Objects.checkIndex(index, AXIS_ARRAY_LEN);
		return MemoryAccessor.getFloat(address() + AXIS_OFFSET + (index * VoidPointer.FLOAT_SIZE));
	}
}

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
import nw4j.wrapper.c.pointers.VoidPointer;

public abstract class Struct extends VoidPointer {
	
	/**Allocates memory for a structure of size {@link Struct#sizeof()}.*/
	public Struct() {
		super();
	}

	/**
	 * Creates a structure wrapper over an address as if the address were a pointer to a structure.
	 * @param _address Native address to structure.
	 * */
	public Struct(long _address) {
		super(_address);
	}
}

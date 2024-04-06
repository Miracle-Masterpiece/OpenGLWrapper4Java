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

import java.awt.image.BufferedImage;
import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.BytePointer;
import gljw.annotations.Ctype;
import static nw4j.wrapper.c.allocators.MemoryAccessor.malloc;
import static nw4j.helpers.Helpers.addressNonNull;

/**
 * This describes a single 2D image. See the documentation for each related function what the expected pixel format is.
 * 
 * @see GLFW#glfwSetWindowIcon(long, GLFWimage)
 * 
 * @since Added in version 2.1. GLFW 3: Removed format and bytes-per-pixel members.
 * 
 * 
 * To release external resources, place object creation in "try-with-resources" or call the {@link GLFWimage#close()} method.
 * 
 * */
@Ctype("GLFWimage")
public class GLFWimage extends Struct{

	/**
	 * This flag is set to true if and only if the pixel pointer is initialized within this class.
	 * @see GLFWimage#GLFWimage(BufferedImage)
	 * 
	 * @see GLFWimage#autoFreePixels()
	 * */
	private final byte autoFreeClosePixelData;
	
	private static final byte 
	WIDTH_OFFSET, 
	HEIGHT_OFFSET, 
	PIXELS_OFFSET, 
	SIZEOF;
	
	static {
		WIDTH_OFFSET 	= 0;
		HEIGHT_OFFSET 	= 4;
		PIXELS_OFFSET 	= 8;
		SIZEOF 			= 16;
	}
	
	/**
	 * Initializes an object using a BufferedImage
	 * */
	public GLFWimage(BufferedImage bufImage) {	
		super();
		final int w = bufImage.getWidth();
		final int h = bufImage.getHeight();
		addressNonNull(address());
		
		autoFreeClosePixelData = GLFW.GLFW_TRUE;
		
		@Ctype("const char*") 
		long pixels = malloc((w * h) << 2); 
		addressNonNull(pixels);
		
		final int[] data = bufImage.getRGB(0, 0, w, h, null, 0, w);
		for (int i = 0; i < data.length; ++i) {
			int rawPixel = data[i];
			
			byte a = (byte) ((rawPixel >> 24) 	& 255);
			byte r = (byte)((rawPixel >> 16) 	& 255);
			byte g = (byte)((rawPixel >> 8) 	& 255);
			byte b = (byte)((rawPixel) 			& 255);
			
			MemoryAccessor.setByte(pixels + (i << 2) + 0, r);
			MemoryAccessor.setByte(pixels + (i << 2) + 1, g);
			MemoryAccessor.setByte(pixels + (i << 2) + 2, b);
			MemoryAccessor.setByte(pixels + (i << 2) + 3, a);
		}
		
		setWidth(w);
		setHeight(h);
		setPixels(pixels);		
	}
	
	/**
	 * @param w Width image
	 * @param h Height image
	 * @param pixels Pointer to pixels image
	 * */
	public GLFWimage(int w, int h, @Ctype("const char*") BytePointer pixels) {
		this(w, h, pixels.address());
		addressNonNull(address());
	}
	
	/**
	 * @param w Width image
	 * @param h Height image
	 * @param pixels Pointer to pixels image
	 * */
	public GLFWimage(int w, int h, @Ctype("const char*") long pixels) {
		super();
		addressNonNull(address());
		autoFreeClosePixelData = GLFW.GLFW_FALSE;
		
		setWidth(w);
		setHeight(h);
		setPixels(pixels);
	}
	
	/**
	 * When this variable is true, it means that there is no need to free the memory pointed to by pointer {@link GLFWimage#getPixels()} 
	 * and the current object itself will free it when calling the {@link GLFWimage#close()}
	 * */
	public boolean autoFreePixels() {
		return autoFreeClosePixelData == GLFW.GLFW_TRUE;
	}
	
	@Override
	public void close() {
		if (autoFreeClosePixelData == GLFW.GLFW_TRUE) MemoryAccessor.free(getPixels());
		super.close();
	}
	
	public GLFWimage() {
		super();
		addressNonNull(address());
		autoFreeClosePixelData = GLFW.GLFW_FALSE;
	}
	
	/**@return width*/
	public int getWidth() {
		return MemoryAccessor.getInt(address() + WIDTH_OFFSET);
	}
	
	/**@return height*/
	public int getHeight() {
		return MemoryAccessor.getInt(address() + HEIGHT_OFFSET);
	}
	
	/**@return pointer to pixels*/
	public @Ctype("char*") long getPixels() {
		return MemoryAccessor.getLong(address() + PIXELS_OFFSET);
	}
	
	/**The width, in pixels, of this image.*/
	public void setWidth(int width) {
		MemoryAccessor.setInt(address(), width);
	}
	
	/**The height, in pixels, of this image.*/
	public void setHeight(int height) {
		MemoryAccessor.setInt(address() + HEIGHT_OFFSET, height);
	}
	
	/**The pixel data of this image, arranged left-to-right, top-to-bottom.*/
	public void setPixels(@Ctype("char*") long pixels) {
		MemoryAccessor.setLong(address() + PIXELS_OFFSET, pixels);
	}
	
	/**The pixel data of this image, arranged left-to-right, top-to-bottom.*/
	public void setPixels(@Ctype("char*") BytePointer pixels) {
		MemoryAccessor.setLong(address() + PIXELS_OFFSET, pixels.address());
	}

	@Override
	public long sizeof() {
		return SIZEOF;
	}

	@Override
	public GLFWimage clone() {
		GLFWimage _new = new GLFWimage();
		_new.copydata(this);
		return _new;
	}
}

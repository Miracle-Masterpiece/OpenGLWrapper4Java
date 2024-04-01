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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import gljw.annotations.Ctype;
import static gljw.helpers.Helpers.createCriticalMethodHandle;

//AUTO GENERATION CODE!
public final class GL44{

	private GL44(){throw new IllegalAccessError();}

	public static void glBufferStorage(@Ctype("GLenum") int target, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data, @Ctype("GLbitfield") int flags){
		try{
			glBufferStorage.invoke(target, size, data, flags);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBufferStorage = createCriticalMethodHandle("c_glBufferStorage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glClearTexImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearTexImage.invoke(texture, level, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearTexImage = createCriticalMethodHandle("c_glClearTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearTexSubImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearTexSubImage.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearTexSubImage = createCriticalMethodHandle("c_glClearTexSubImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindBuffersBase(@Ctype("GLenum") int target, @Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long buffers){
		try{
			glBindBuffersBase.invoke(target, first, count, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindBuffersBase = createCriticalMethodHandle("c_glBindBuffersBase", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindBuffersRange(@Ctype("GLenum") int target, @Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long buffers, @Ctype("GLintptr*") long offsets, @Ctype("GLsizeiptr*") long sizes){
		try{
			glBindBuffersRange.invoke(target, first, count, buffers, offsets, sizes);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindBuffersRange = createCriticalMethodHandle("c_glBindBuffersRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glBindTextures(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long textures){
		try{
			glBindTextures.invoke(first, count, textures);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindTextures = createCriticalMethodHandle("c_glBindTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindSamplers(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long samplers){
		try{
			glBindSamplers.invoke(first, count, samplers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindSamplers = createCriticalMethodHandle("c_glBindSamplers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindImageTextures(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long textures){
		try{
			glBindImageTextures.invoke(first, count, textures);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindImageTextures = createCriticalMethodHandle("c_glBindImageTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindVertexBuffers(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long buffers, @Ctype("GLintptr*") long offsets, @Ctype("GLsizei*") long strides){
		try{
			glBindVertexBuffers.invoke(first, count, buffers, offsets, strides);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindVertexBuffers = createCriticalMethodHandle("c_glBindVertexBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

}
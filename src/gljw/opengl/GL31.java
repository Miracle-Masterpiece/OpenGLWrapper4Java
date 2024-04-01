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
public final class GL31{

	private GL31(){throw new IllegalAccessError();}

	public static void glDrawArraysInstanced(@Ctype("GLenum") int mode, @Ctype("GLint") int first, @Ctype("GLsizei") int count, @Ctype("GLsizei") int instancecount){
		try{
			glDrawArraysInstanced.invoke(mode, first, count, instancecount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawArraysInstanced = createCriticalMethodHandle("c_glDrawArraysInstanced", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawElementsInstanced(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLsizei") int instancecount){
		try{
			glDrawElementsInstanced.invoke(mode, count, type, indices, instancecount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsInstanced = createCriticalMethodHandle("c_glDrawElementsInstanced", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glTexBuffer(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLuint") int buffer){
		try{
			glTexBuffer.invoke(target, internalformat, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexBuffer = createCriticalMethodHandle("c_glTexBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glPrimitiveRestartIndex(@Ctype("GLuint") int index){
		try{
			glPrimitiveRestartIndex.invoke(index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPrimitiveRestartIndex = createCriticalMethodHandle("c_glPrimitiveRestartIndex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glCopyBufferSubData(@Ctype("GLenum") int readTarget, @Ctype("GLenum") int writeTarget, @Ctype("GLintptr") long readOffset, @Ctype("GLintptr") long writeOffset, @Ctype("GLsizeiptr") long size){
		try{
			glCopyBufferSubData.invoke(readTarget, writeTarget, readOffset, writeOffset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyBufferSubData = createCriticalMethodHandle("c_glCopyBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetUniformIndices(@Ctype("GLuint") int program, @Ctype("GLsizei") int uniformCount, @Ctype("GLchar**") long uniformNames, @Ctype("GLuint*") long uniformIndices){
		try{
			glGetUniformIndices.invoke(program, uniformCount, uniformNames, uniformIndices);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformIndices = createCriticalMethodHandle("c_glGetUniformIndices", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetActiveUniformsiv(@Ctype("GLuint") int program, @Ctype("GLsizei") int uniformCount, @Ctype("GLuint*") long uniformIndices, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetActiveUniformsiv.invoke(program, uniformCount, uniformIndices, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveUniformsiv = createCriticalMethodHandle("c_glGetActiveUniformsiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveUniformName(@Ctype("GLuint") int program, @Ctype("GLuint") int uniformIndex, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long uniformName){
		try{
			glGetActiveUniformName.invoke(program, uniformIndex, bufSize, length, uniformName);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveUniformName = createCriticalMethodHandle("c_glGetActiveUniformName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static @Ctype("GLuint") int glGetUniformBlockIndex(@Ctype("GLuint") int program, @Ctype("GLchar*") long uniformBlockName){
		try{
			return (int)glGetUniformBlockIndex.invoke(program, uniformBlockName);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformBlockIndex = createCriticalMethodHandle("c_glGetUniformBlockIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveUniformBlockiv(@Ctype("GLuint") int program, @Ctype("GLuint") int uniformBlockIndex, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetActiveUniformBlockiv.invoke(program, uniformBlockIndex, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveUniformBlockiv = createCriticalMethodHandle("c_glGetActiveUniformBlockiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveUniformBlockName(@Ctype("GLuint") int program, @Ctype("GLuint") int uniformBlockIndex, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long uniformBlockName){
		try{
			glGetActiveUniformBlockName.invoke(program, uniformBlockIndex, bufSize, length, uniformBlockName);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveUniformBlockName = createCriticalMethodHandle("c_glGetActiveUniformBlockName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glUniformBlockBinding(@Ctype("GLuint") int program, @Ctype("GLuint") int uniformBlockIndex, @Ctype("GLuint") int uniformBlockBinding){
		try{
			glUniformBlockBinding.invoke(program, uniformBlockIndex, uniformBlockBinding);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformBlockBinding = createCriticalMethodHandle("c_glUniformBlockBinding", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

}
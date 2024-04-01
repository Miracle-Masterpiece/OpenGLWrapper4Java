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
public final class GL42{

	private GL42(){throw new IllegalAccessError();}

	public static void glDrawArraysInstancedBaseInstance(@Ctype("GLenum") int mode, @Ctype("GLint") int first, @Ctype("GLsizei") int count, @Ctype("GLsizei") int instancecount, @Ctype("GLuint") int baseinstance){
		try{
			glDrawArraysInstancedBaseInstance.invoke(mode, first, count, instancecount, baseinstance);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawArraysInstancedBaseInstance = createCriticalMethodHandle("c_glDrawArraysInstancedBaseInstance", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawElementsInstancedBaseInstance(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLsizei") int instancecount, @Ctype("GLuint") int baseinstance){
		try{
			glDrawElementsInstancedBaseInstance.invoke(mode, count, type, indices, instancecount, baseinstance);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsInstancedBaseInstance = createCriticalMethodHandle("c_glDrawElementsInstancedBaseInstance", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawElementsInstancedBaseVertexBaseInstance(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLsizei") int instancecount, @Ctype("GLint") int basevertex, @Ctype("GLuint") int baseinstance){
		try{
			glDrawElementsInstancedBaseVertexBaseInstance.invoke(mode, count, type, indices, instancecount, basevertex, baseinstance);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsInstancedBaseVertexBaseInstance = createCriticalMethodHandle("c_glDrawElementsInstancedBaseVertexBaseInstance", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetInternalformativ(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLenum") int pname, @Ctype("GLsizei") int count, @Ctype("GLint*") long params){
		try{
			glGetInternalformativ.invoke(target, internalformat, pname, count, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetInternalformativ = createCriticalMethodHandle("c_glGetInternalformativ", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveAtomicCounterBufferiv(@Ctype("GLuint") int program, @Ctype("GLuint") int bufferIndex, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetActiveAtomicCounterBufferiv.invoke(program, bufferIndex, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveAtomicCounterBufferiv = createCriticalMethodHandle("c_glGetActiveAtomicCounterBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindImageTexture(@Ctype("GLuint") int unit, @Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLboolean") boolean layered, @Ctype("GLint") int layer, @Ctype("GLenum") int access, @Ctype("GLenum") int format){
		try{
			glBindImageTexture.invoke(unit, texture, level, layered, layer, access, format);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindImageTexture = createCriticalMethodHandle("c_glBindImageTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMemoryBarrier(@Ctype("GLbitfield") int barriers){
		try{
			glMemoryBarrier.invoke(barriers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMemoryBarrier = createCriticalMethodHandle("c_glMemoryBarrier", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glTexStorage1D(@Ctype("GLenum") int target, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width){
		try{
			glTexStorage1D.invoke(target, levels, internalformat, width);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexStorage1D = createCriticalMethodHandle("c_glTexStorage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexStorage2D(@Ctype("GLenum") int target, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glTexStorage2D.invoke(target, levels, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexStorage2D = createCriticalMethodHandle("c_glTexStorage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexStorage3D(@Ctype("GLenum") int target, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth){
		try{
			glTexStorage3D.invoke(target, levels, internalformat, width, height, depth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexStorage3D = createCriticalMethodHandle("c_glTexStorage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawTransformFeedbackInstanced(@Ctype("GLenum") int mode, @Ctype("GLuint") int id, @Ctype("GLsizei") int instancecount){
		try{
			glDrawTransformFeedbackInstanced.invoke(mode, id, instancecount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawTransformFeedbackInstanced = createCriticalMethodHandle("c_glDrawTransformFeedbackInstanced", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawTransformFeedbackStreamInstanced(@Ctype("GLenum") int mode, @Ctype("GLuint") int id, @Ctype("GLuint") int stream, @Ctype("GLsizei") int instancecount){
		try{
			glDrawTransformFeedbackStreamInstanced.invoke(mode, id, stream, instancecount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawTransformFeedbackStreamInstanced = createCriticalMethodHandle("c_glDrawTransformFeedbackStreamInstanced", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

}
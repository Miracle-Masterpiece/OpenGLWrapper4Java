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
public final class GL32{

	private GL32(){throw new IllegalAccessError();}

	public static void glDrawElementsBaseVertex(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLint") int basevertex){
		try{
			glDrawElementsBaseVertex.invoke(mode, count, type, indices, basevertex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsBaseVertex = createCriticalMethodHandle("c_glDrawElementsBaseVertex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glDrawRangeElementsBaseVertex(@Ctype("GLenum") int mode, @Ctype("GLuint") int start, @Ctype("GLuint") int end, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLint") int basevertex){
		try{
			glDrawRangeElementsBaseVertex.invoke(mode, start, end, count, type, indices, basevertex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawRangeElementsBaseVertex = createCriticalMethodHandle("c_glDrawRangeElementsBaseVertex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glDrawElementsInstancedBaseVertex(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices, @Ctype("GLsizei") int instancecount, @Ctype("GLint") int basevertex){
		try{
			glDrawElementsInstancedBaseVertex.invoke(mode, count, type, indices, instancecount, basevertex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsInstancedBaseVertex = createCriticalMethodHandle("c_glDrawElementsInstancedBaseVertex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiDrawElementsBaseVertex(@Ctype("GLenum") int mode, @Ctype("GLsizei*") long count, @Ctype("GLenum") int type, @Ctype("void**") long indices, @Ctype("GLsizei") int drawcount, @Ctype("GLint*") long basevertex){
		try{
			glMultiDrawElementsBaseVertex.invoke(mode, count, type, indices, drawcount, basevertex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawElementsBaseVertex = createCriticalMethodHandle("c_glMultiDrawElementsBaseVertex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProvokingVertex(@Ctype("GLenum") int mode){
		try{
			glProvokingVertex.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProvokingVertex = createCriticalMethodHandle("c_glProvokingVertex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static @Ctype("GLsync") long glFenceSync(@Ctype("GLenum") int condition, @Ctype("GLbitfield") int flags){
		try{
			return (long)glFenceSync.invoke(condition, flags);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFenceSync = createCriticalMethodHandle("c_glFenceSync", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glIsSync(@Ctype("GLsync") long sync){
		try{
			return (boolean)glIsSync.invoke(sync);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsSync = createCriticalMethodHandle("c_glIsSync", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glDeleteSync(@Ctype("GLsync") long sync){
		try{
			glDeleteSync.invoke(sync);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteSync = createCriticalMethodHandle("c_glDeleteSync", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static @Ctype("GLenum") int glClientWaitSync(@Ctype("GLsync") long sync, @Ctype("GLbitfield") int flags, @Ctype("GLuint64") long timeout){
		try{
			return (int)glClientWaitSync.invoke(sync, flags, timeout);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClientWaitSync = createCriticalMethodHandle("c_glClientWaitSync", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glWaitSync(@Ctype("GLsync") long sync, @Ctype("GLbitfield") int flags, @Ctype("GLuint64") long timeout){
		try{
			glWaitSync.invoke(sync, flags, timeout);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWaitSync = createCriticalMethodHandle("c_glWaitSync", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetInteger64v(@Ctype("GLenum") int pname, @Ctype("GLint64*") long data){
		try{
			glGetInteger64v.invoke(pname, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetInteger64v = createCriticalMethodHandle("c_glGetInteger64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetSynciv(@Ctype("GLsync") long sync, @Ctype("GLenum") int pname, @Ctype("GLsizei") int count, @Ctype("GLsizei*") long length, @Ctype("GLint*") long values){
		try{
			glGetSynciv.invoke(sync, pname, count, length, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSynciv = createCriticalMethodHandle("c_glGetSynciv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetInteger64i_v(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLint64*") long data){
		try{
			glGetInteger64i_v.invoke(target, index, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetInteger64i_v = createCriticalMethodHandle("c_glGetInteger64i_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetBufferParameteri64v(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint64*") long params){
		try{
			glGetBufferParameteri64v.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBufferParameteri64v = createCriticalMethodHandle("c_glGetBufferParameteri64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glFramebufferTexture(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLuint") int texture, @Ctype("GLint") int level){
		try{
			glFramebufferTexture.invoke(target, attachment, texture, level);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferTexture = createCriticalMethodHandle("c_glFramebufferTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexImage2DMultisample(@Ctype("GLenum") int target, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTexImage2DMultisample.invoke(target, samples, internalformat, width, height, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexImage2DMultisample = createCriticalMethodHandle("c_glTexImage2DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glTexImage3DMultisample(@Ctype("GLenum") int target, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTexImage3DMultisample.invoke(target, samples, internalformat, width, height, depth, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexImage3DMultisample = createCriticalMethodHandle("c_glTexImage3DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glGetMultisamplefv(@Ctype("GLenum") int pname, @Ctype("GLuint") int index, @Ctype("GLfloat*") long val){
		try{
			glGetMultisamplefv.invoke(pname, index, val);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMultisamplefv = createCriticalMethodHandle("c_glGetMultisamplefv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSampleMaski(@Ctype("GLuint") int maskNumber, @Ctype("GLbitfield") int mask){
		try{
			glSampleMaski.invoke(maskNumber, mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSampleMaski = createCriticalMethodHandle("c_glSampleMaski", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

}
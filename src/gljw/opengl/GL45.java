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
public final class GL45{

	private GL45(){throw new IllegalAccessError();}

	public static void glClipControl(@Ctype("GLenum") int origin, @Ctype("GLenum") int depth){
		try{
			glClipControl.invoke(origin, depth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClipControl = createCriticalMethodHandle("c_glClipControl", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCreateTransformFeedbacks(@Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glCreateTransformFeedbacks.invoke(n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateTransformFeedbacks = createCriticalMethodHandle("c_glCreateTransformFeedbacks", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTransformFeedbackBufferBase(@Ctype("GLuint") int xfb, @Ctype("GLuint") int index, @Ctype("GLuint") int buffer){
		try{
			glTransformFeedbackBufferBase.invoke(xfb, index, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTransformFeedbackBufferBase = createCriticalMethodHandle("c_glTransformFeedbackBufferBase", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTransformFeedbackBufferRange(@Ctype("GLuint") int xfb, @Ctype("GLuint") int index, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size){
		try{
			glTransformFeedbackBufferRange.invoke(xfb, index, buffer, offset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTransformFeedbackBufferRange = createCriticalMethodHandle("c_glTransformFeedbackBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetTransformFeedbackiv(@Ctype("GLuint") int xfb, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glGetTransformFeedbackiv.invoke(xfb, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTransformFeedbackiv = createCriticalMethodHandle("c_glGetTransformFeedbackiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTransformFeedbacki_v(@Ctype("GLuint") int xfb, @Ctype("GLenum") int pname, @Ctype("GLuint") int index, @Ctype("GLint*") long param){
		try{
			glGetTransformFeedbacki_v.invoke(xfb, pname, index, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTransformFeedbacki_v = createCriticalMethodHandle("c_glGetTransformFeedbacki_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTransformFeedbacki64_v(@Ctype("GLuint") int xfb, @Ctype("GLenum") int pname, @Ctype("GLuint") int index, @Ctype("GLint64*") long param){
		try{
			glGetTransformFeedbacki64_v.invoke(xfb, pname, index, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTransformFeedbacki64_v = createCriticalMethodHandle("c_glGetTransformFeedbacki64_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateBuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long buffers){
		try{
			glCreateBuffers.invoke(n, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateBuffers = createCriticalMethodHandle("c_glCreateBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNamedBufferStorage(@Ctype("GLuint") int buffer, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data, @Ctype("GLbitfield") int flags){
		try{
			glNamedBufferStorage.invoke(buffer, size, data, flags);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedBufferStorage = createCriticalMethodHandle("c_glNamedBufferStorage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glNamedBufferData(@Ctype("GLuint") int buffer, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data, @Ctype("GLenum") int usage){
		try{
			glNamedBufferData.invoke(buffer, size, data, usage);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedBufferData = createCriticalMethodHandle("c_glNamedBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glNamedBufferSubData(@Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data){
		try{
			glNamedBufferSubData.invoke(buffer, offset, size, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedBufferSubData = createCriticalMethodHandle("c_glNamedBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glCopyNamedBufferSubData(@Ctype("GLuint") int readBuffer, @Ctype("GLuint") int writeBuffer, @Ctype("GLintptr") long readOffset, @Ctype("GLintptr") long writeOffset, @Ctype("GLsizeiptr") long size){
		try{
			glCopyNamedBufferSubData.invoke(readBuffer, writeBuffer, readOffset, writeOffset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyNamedBufferSubData = createCriticalMethodHandle("c_glCopyNamedBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glClearNamedBufferData(@Ctype("GLuint") int buffer, @Ctype("GLenum") int internalformat, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearNamedBufferData.invoke(buffer, internalformat, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedBufferData = createCriticalMethodHandle("c_glClearNamedBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearNamedBufferSubData(@Ctype("GLuint") int buffer, @Ctype("GLenum") int internalformat, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearNamedBufferSubData.invoke(buffer, internalformat, offset, size, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedBufferSubData = createCriticalMethodHandle("c_glClearNamedBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("void*")long glMapNamedBuffer(@Ctype("GLuint") int buffer, @Ctype("GLenum") int access){
		try{
			return (long)glMapNamedBuffer.invoke(buffer, access);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapNamedBuffer = createCriticalMethodHandle("c_glMapNamedBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("void*")long glMapNamedBufferRange(@Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long length, @Ctype("GLbitfield") int access){
		try{
			return (long)glMapNamedBufferRange.invoke(buffer, offset, length, access);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapNamedBufferRange = createCriticalMethodHandle("c_glMapNamedBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glUnmapNamedBuffer(@Ctype("GLuint") int buffer){
		try{
			return (boolean)glUnmapNamedBuffer.invoke(buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUnmapNamedBuffer = createCriticalMethodHandle("c_glUnmapNamedBuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glFlushMappedNamedBufferRange(@Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long length){
		try{
			glFlushMappedNamedBufferRange.invoke(buffer, offset, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFlushMappedNamedBufferRange = createCriticalMethodHandle("c_glFlushMappedNamedBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetNamedBufferParameteriv(@Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetNamedBufferParameteriv.invoke(buffer, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedBufferParameteriv = createCriticalMethodHandle("c_glGetNamedBufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetNamedBufferParameteri64v(@Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLint64*") long params){
		try{
			glGetNamedBufferParameteri64v.invoke(buffer, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedBufferParameteri64v = createCriticalMethodHandle("c_glGetNamedBufferParameteri64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetNamedBufferPointerv(@Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("void**") long params){
		try{
			glGetNamedBufferPointerv.invoke(buffer, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedBufferPointerv = createCriticalMethodHandle("c_glGetNamedBufferPointerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetNamedBufferSubData(@Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data){
		try{
			glGetNamedBufferSubData.invoke(buffer, offset, size, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedBufferSubData = createCriticalMethodHandle("c_glGetNamedBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glCreateFramebuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long framebuffers){
		try{
			glCreateFramebuffers.invoke(n, framebuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateFramebuffers = createCriticalMethodHandle("c_glCreateFramebuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNamedFramebufferRenderbuffer(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int attachment, @Ctype("GLenum") int renderbuffertarget, @Ctype("GLuint") int renderbuffer){
		try{
			glNamedFramebufferRenderbuffer.invoke(framebuffer, attachment, renderbuffertarget, renderbuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferRenderbuffer = createCriticalMethodHandle("c_glNamedFramebufferRenderbuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedFramebufferParameteri(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glNamedFramebufferParameteri.invoke(framebuffer, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferParameteri = createCriticalMethodHandle("c_glNamedFramebufferParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedFramebufferTexture(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int attachment, @Ctype("GLuint") int texture, @Ctype("GLint") int level){
		try{
			glNamedFramebufferTexture.invoke(framebuffer, attachment, texture, level);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferTexture = createCriticalMethodHandle("c_glNamedFramebufferTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedFramebufferTextureLayer(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int attachment, @Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int layer){
		try{
			glNamedFramebufferTextureLayer.invoke(framebuffer, attachment, texture, level, layer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferTextureLayer = createCriticalMethodHandle("c_glNamedFramebufferTextureLayer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedFramebufferDrawBuffer(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int buf){
		try{
			glNamedFramebufferDrawBuffer.invoke(framebuffer, buf);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferDrawBuffer = createCriticalMethodHandle("c_glNamedFramebufferDrawBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedFramebufferDrawBuffers(@Ctype("GLuint") int framebuffer, @Ctype("GLsizei") int n, @Ctype("GLenum*") long bufs){
		try{
			glNamedFramebufferDrawBuffers.invoke(framebuffer, n, bufs);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferDrawBuffers = createCriticalMethodHandle("c_glNamedFramebufferDrawBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNamedFramebufferReadBuffer(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int src){
		try{
			glNamedFramebufferReadBuffer.invoke(framebuffer, src);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedFramebufferReadBuffer = createCriticalMethodHandle("c_glNamedFramebufferReadBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glInvalidateNamedFramebufferData(@Ctype("GLuint") int framebuffer, @Ctype("GLsizei") int numAttachments, @Ctype("GLenum*") long attachments){
		try{
			glInvalidateNamedFramebufferData.invoke(framebuffer, numAttachments, attachments);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateNamedFramebufferData = createCriticalMethodHandle("c_glInvalidateNamedFramebufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glInvalidateNamedFramebufferSubData(@Ctype("GLuint") int framebuffer, @Ctype("GLsizei") int numAttachments, @Ctype("GLenum*") long attachments, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glInvalidateNamedFramebufferSubData.invoke(framebuffer, numAttachments, attachments, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateNamedFramebufferSubData = createCriticalMethodHandle("c_glInvalidateNamedFramebufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glClearNamedFramebufferiv(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLint*") long value){
		try{
			glClearNamedFramebufferiv.invoke(framebuffer, buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedFramebufferiv = createCriticalMethodHandle("c_glClearNamedFramebufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearNamedFramebufferuiv(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLuint*") long value){
		try{
			glClearNamedFramebufferuiv.invoke(framebuffer, buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedFramebufferuiv = createCriticalMethodHandle("c_glClearNamedFramebufferuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearNamedFramebufferfv(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLfloat*") long value){
		try{
			glClearNamedFramebufferfv.invoke(framebuffer, buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedFramebufferfv = createCriticalMethodHandle("c_glClearNamedFramebufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearNamedFramebufferfi(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLfloat") float depth, @Ctype("GLint") int stencil){
		try{
			glClearNamedFramebufferfi.invoke(framebuffer, buffer, drawbuffer, depth, stencil);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearNamedFramebufferfi = createCriticalMethodHandle("c_glClearNamedFramebufferfi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));

	public static void glBlitNamedFramebuffer(@Ctype("GLuint") int readFramebuffer, @Ctype("GLuint") int drawFramebuffer, @Ctype("GLint") int srcX0, @Ctype("GLint") int srcY0, @Ctype("GLint") int srcX1, @Ctype("GLint") int srcY1, @Ctype("GLint") int dstX0, @Ctype("GLint") int dstY0, @Ctype("GLint") int dstX1, @Ctype("GLint") int dstY1, @Ctype("GLbitfield") int mask, @Ctype("GLenum") int filter){
		try{
			glBlitNamedFramebuffer.invoke(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlitNamedFramebuffer = createCriticalMethodHandle("c_glBlitNamedFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLenum") int glCheckNamedFramebufferStatus(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int target){
		try{
			return (int)glCheckNamedFramebufferStatus.invoke(framebuffer, target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCheckNamedFramebufferStatus = createCriticalMethodHandle("c_glCheckNamedFramebufferStatus", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetNamedFramebufferParameteriv(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glGetNamedFramebufferParameteriv.invoke(framebuffer, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedFramebufferParameteriv = createCriticalMethodHandle("c_glGetNamedFramebufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetNamedFramebufferAttachmentParameteriv(@Ctype("GLuint") int framebuffer, @Ctype("GLenum") int attachment, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetNamedFramebufferAttachmentParameteriv.invoke(framebuffer, attachment, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedFramebufferAttachmentParameteriv = createCriticalMethodHandle("c_glGetNamedFramebufferAttachmentParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateRenderbuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long renderbuffers){
		try{
			glCreateRenderbuffers.invoke(n, renderbuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateRenderbuffers = createCriticalMethodHandle("c_glCreateRenderbuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNamedRenderbufferStorage(@Ctype("GLuint") int renderbuffer, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glNamedRenderbufferStorage.invoke(renderbuffer, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedRenderbufferStorage = createCriticalMethodHandle("c_glNamedRenderbufferStorage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNamedRenderbufferStorageMultisample(@Ctype("GLuint") int renderbuffer, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glNamedRenderbufferStorageMultisample.invoke(renderbuffer, samples, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNamedRenderbufferStorageMultisample = createCriticalMethodHandle("c_glNamedRenderbufferStorageMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetNamedRenderbufferParameteriv(@Ctype("GLuint") int renderbuffer, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetNamedRenderbufferParameteriv.invoke(renderbuffer, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetNamedRenderbufferParameteriv = createCriticalMethodHandle("c_glGetNamedRenderbufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateTextures(@Ctype("GLenum") int target, @Ctype("GLsizei") int n, @Ctype("GLuint*") long textures){
		try{
			glCreateTextures.invoke(target, n, textures);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateTextures = createCriticalMethodHandle("c_glCreateTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureBuffer(@Ctype("GLuint") int texture, @Ctype("GLenum") int internalformat, @Ctype("GLuint") int buffer){
		try{
			glTextureBuffer.invoke(texture, internalformat, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureBuffer = createCriticalMethodHandle("c_glTextureBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureBufferRange(@Ctype("GLuint") int texture, @Ctype("GLenum") int internalformat, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size){
		try{
			glTextureBufferRange.invoke(texture, internalformat, buffer, offset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureBufferRange = createCriticalMethodHandle("c_glTextureBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glTextureStorage1D(@Ctype("GLuint") int texture, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width){
		try{
			glTextureStorage1D.invoke(texture, levels, internalformat, width);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureStorage1D = createCriticalMethodHandle("c_glTextureStorage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureStorage2D(@Ctype("GLuint") int texture, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glTextureStorage2D.invoke(texture, levels, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureStorage2D = createCriticalMethodHandle("c_glTextureStorage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureStorage3D(@Ctype("GLuint") int texture, @Ctype("GLsizei") int levels, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth){
		try{
			glTextureStorage3D.invoke(texture, levels, internalformat, width, height, depth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureStorage3D = createCriticalMethodHandle("c_glTextureStorage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureStorage2DMultisample(@Ctype("GLuint") int texture, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTextureStorage2DMultisample.invoke(texture, samples, internalformat, width, height, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureStorage2DMultisample = createCriticalMethodHandle("c_glTextureStorage2DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glTextureStorage3DMultisample(@Ctype("GLuint") int texture, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTextureStorage3DMultisample.invoke(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureStorage3DMultisample = createCriticalMethodHandle("c_glTextureStorage3DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glTextureSubImage1D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLsizei") int width, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTextureSubImage1D.invoke(texture, level, xoffset, width, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureSubImage1D = createCriticalMethodHandle("c_glTextureSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureSubImage2D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTextureSubImage2D.invoke(texture, level, xoffset, yoffset, width, height, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureSubImage2D = createCriticalMethodHandle("c_glTextureSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureSubImage3D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTextureSubImage3D.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureSubImage3D = createCriticalMethodHandle("c_glTextureSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTextureSubImage1D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLsizei") int width, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTextureSubImage1D.invoke(texture, level, xoffset, width, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTextureSubImage1D = createCriticalMethodHandle("c_glCompressedTextureSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTextureSubImage2D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTextureSubImage2D.invoke(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTextureSubImage2D = createCriticalMethodHandle("c_glCompressedTextureSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTextureSubImage3D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTextureSubImage3D.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTextureSubImage3D = createCriticalMethodHandle("c_glCompressedTextureSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCopyTextureSubImage1D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width){
		try{
			glCopyTextureSubImage1D.invoke(texture, level, xoffset, x, y, width);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTextureSubImage1D = createCriticalMethodHandle("c_glCopyTextureSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCopyTextureSubImage2D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glCopyTextureSubImage2D.invoke(texture, level, xoffset, yoffset, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTextureSubImage2D = createCriticalMethodHandle("c_glCopyTextureSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCopyTextureSubImage3D(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glCopyTextureSubImage3D.invoke(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTextureSubImage3D = createCriticalMethodHandle("c_glCopyTextureSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureParameterf(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glTextureParameterf.invoke(texture, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameterf = createCriticalMethodHandle("c_glTextureParameterf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glTextureParameterfv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long param){
		try{
			glTextureParameterfv.invoke(texture, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameterfv = createCriticalMethodHandle("c_glTextureParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureParameteri(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glTextureParameteri.invoke(texture, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameteri = createCriticalMethodHandle("c_glTextureParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTextureParameterIiv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glTextureParameterIiv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameterIiv = createCriticalMethodHandle("c_glTextureParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureParameterIuiv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glTextureParameterIuiv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameterIuiv = createCriticalMethodHandle("c_glTextureParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureParameteriv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glTextureParameteriv.invoke(texture, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureParameteriv = createCriticalMethodHandle("c_glTextureParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenerateTextureMipmap(@Ctype("GLuint") int texture){
		try{
			glGenerateTextureMipmap.invoke(texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenerateTextureMipmap = createCriticalMethodHandle("c_glGenerateTextureMipmap", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glBindTextureUnit(@Ctype("GLuint") int unit, @Ctype("GLuint") int texture){
		try{
			glBindTextureUnit.invoke(unit, texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindTextureUnit = createCriticalMethodHandle("c_glBindTextureUnit", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetTextureImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetTextureImage.invoke(texture, level, format, type, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureImage = createCriticalMethodHandle("c_glGetTextureImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetCompressedTextureImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetCompressedTextureImage.invoke(texture, level, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetCompressedTextureImage = createCriticalMethodHandle("c_glGetCompressedTextureImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureLevelParameterfv(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTextureLevelParameterfv.invoke(texture, level, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureLevelParameterfv = createCriticalMethodHandle("c_glGetTextureLevelParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureLevelParameteriv(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTextureLevelParameteriv.invoke(texture, level, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureLevelParameteriv = createCriticalMethodHandle("c_glGetTextureLevelParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureParameterfv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTextureParameterfv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureParameterfv = createCriticalMethodHandle("c_glGetTextureParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureParameterIiv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTextureParameterIiv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureParameterIiv = createCriticalMethodHandle("c_glGetTextureParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureParameterIuiv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glGetTextureParameterIuiv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureParameterIuiv = createCriticalMethodHandle("c_glGetTextureParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTextureParameteriv(@Ctype("GLuint") int texture, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTextureParameteriv.invoke(texture, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureParameteriv = createCriticalMethodHandle("c_glGetTextureParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateVertexArrays(@Ctype("GLsizei") int n, @Ctype("GLuint*") long arrays){
		try{
			glCreateVertexArrays.invoke(n, arrays);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateVertexArrays = createCriticalMethodHandle("c_glCreateVertexArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDisableVertexArrayAttrib(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int index){
		try{
			glDisableVertexArrayAttrib.invoke(vaobj, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDisableVertexArrayAttrib = createCriticalMethodHandle("c_glDisableVertexArrayAttrib", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEnableVertexArrayAttrib(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int index){
		try{
			glEnableVertexArrayAttrib.invoke(vaobj, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnableVertexArrayAttrib = createCriticalMethodHandle("c_glEnableVertexArrayAttrib", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexArrayElementBuffer(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int buffer){
		try{
			glVertexArrayElementBuffer.invoke(vaobj, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayElementBuffer = createCriticalMethodHandle("c_glVertexArrayElementBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexArrayVertexBuffer(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int bindingindex, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizei") int stride){
		try{
			glVertexArrayVertexBuffer.invoke(vaobj, bindingindex, buffer, offset, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayVertexBuffer = createCriticalMethodHandle("c_glVertexArrayVertexBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glVertexArrayVertexBuffers(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLuint*") long buffers, @Ctype("GLintptr*") long offsets, @Ctype("GLsizei*") long strides){
		try{
			glVertexArrayVertexBuffers.invoke(vaobj, first, count, buffers, offsets, strides);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayVertexBuffers = createCriticalMethodHandle("c_glVertexArrayVertexBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glVertexArrayAttribBinding(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int attribindex, @Ctype("GLuint") int bindingindex){
		try{
			glVertexArrayAttribBinding.invoke(vaobj, attribindex, bindingindex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayAttribBinding = createCriticalMethodHandle("c_glVertexArrayAttribBinding", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexArrayAttribFormat(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexArrayAttribFormat.invoke(vaobj, attribindex, size, type, normalized, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayAttribFormat = createCriticalMethodHandle("c_glVertexArrayAttribFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexArrayAttribIFormat(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexArrayAttribIFormat.invoke(vaobj, attribindex, size, type, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayAttribIFormat = createCriticalMethodHandle("c_glVertexArrayAttribIFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexArrayAttribLFormat(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexArrayAttribLFormat.invoke(vaobj, attribindex, size, type, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayAttribLFormat = createCriticalMethodHandle("c_glVertexArrayAttribLFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexArrayBindingDivisor(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int bindingindex, @Ctype("GLuint") int divisor){
		try{
			glVertexArrayBindingDivisor.invoke(vaobj, bindingindex, divisor);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexArrayBindingDivisor = createCriticalMethodHandle("c_glVertexArrayBindingDivisor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetVertexArrayiv(@Ctype("GLuint") int vaobj, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glGetVertexArrayiv.invoke(vaobj, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexArrayiv = createCriticalMethodHandle("c_glGetVertexArrayiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexArrayIndexediv(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glGetVertexArrayIndexediv.invoke(vaobj, index, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexArrayIndexediv = createCriticalMethodHandle("c_glGetVertexArrayIndexediv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexArrayIndexed64iv(@Ctype("GLuint") int vaobj, @Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint64*") long param){
		try{
			glGetVertexArrayIndexed64iv.invoke(vaobj, index, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexArrayIndexed64iv = createCriticalMethodHandle("c_glGetVertexArrayIndexed64iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateSamplers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long samplers){
		try{
			glCreateSamplers.invoke(n, samplers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateSamplers = createCriticalMethodHandle("c_glCreateSamplers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateProgramPipelines(@Ctype("GLsizei") int n, @Ctype("GLuint*") long pipelines){
		try{
			glCreateProgramPipelines.invoke(n, pipelines);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateProgramPipelines = createCriticalMethodHandle("c_glCreateProgramPipelines", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCreateQueries(@Ctype("GLenum") int target, @Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glCreateQueries.invoke(target, n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateQueries = createCriticalMethodHandle("c_glCreateQueries", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryBufferObjecti64v(@Ctype("GLuint") int id, @Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLintptr") long offset){
		try{
			glGetQueryBufferObjecti64v.invoke(id, buffer, pname, offset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryBufferObjecti64v = createCriticalMethodHandle("c_glGetQueryBufferObjecti64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryBufferObjectiv(@Ctype("GLuint") int id, @Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLintptr") long offset){
		try{
			glGetQueryBufferObjectiv.invoke(id, buffer, pname, offset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryBufferObjectiv = createCriticalMethodHandle("c_glGetQueryBufferObjectiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryBufferObjectui64v(@Ctype("GLuint") int id, @Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLintptr") long offset){
		try{
			glGetQueryBufferObjectui64v.invoke(id, buffer, pname, offset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryBufferObjectui64v = createCriticalMethodHandle("c_glGetQueryBufferObjectui64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryBufferObjectuiv(@Ctype("GLuint") int id, @Ctype("GLuint") int buffer, @Ctype("GLenum") int pname, @Ctype("GLintptr") long offset){
		try{
			glGetQueryBufferObjectuiv.invoke(id, buffer, pname, offset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryBufferObjectuiv = createCriticalMethodHandle("c_glGetQueryBufferObjectuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMemoryBarrierByRegion(@Ctype("GLbitfield") int barriers){
		try{
			glMemoryBarrierByRegion.invoke(barriers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMemoryBarrierByRegion = createCriticalMethodHandle("c_glMemoryBarrierByRegion", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glGetTextureSubImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetTextureSubImage.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTextureSubImage = createCriticalMethodHandle("c_glGetTextureSubImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetCompressedTextureSubImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetCompressedTextureSubImage.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetCompressedTextureSubImage = createCriticalMethodHandle("c_glGetCompressedTextureSubImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLenum") int glGetGraphicsResetStatus(){
		try{
			return (int)glGetGraphicsResetStatus.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetGraphicsResetStatus = createCriticalMethodHandle("c_glGetGraphicsResetStatus", FunctionDescriptor.of(ValueLayout.JAVA_INT));

	public static void glGetnCompressedTexImage(@Ctype("GLenum") int target, @Ctype("GLint") int lod, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetnCompressedTexImage.invoke(target, lod, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnCompressedTexImage = createCriticalMethodHandle("c_glGetnCompressedTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnTexImage(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long pixels){
		try{
			glGetnTexImage.invoke(target, level, format, type, bufSize, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnTexImage = createCriticalMethodHandle("c_glGetnTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnUniformdv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int bufSize, @Ctype("GLdouble*") long params){
		try{
			glGetnUniformdv.invoke(program, location, bufSize, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnUniformdv = createCriticalMethodHandle("c_glGetnUniformdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnUniformfv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int bufSize, @Ctype("GLfloat*") long params){
		try{
			glGetnUniformfv.invoke(program, location, bufSize, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnUniformfv = createCriticalMethodHandle("c_glGetnUniformfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnUniformiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int bufSize, @Ctype("GLint*") long params){
		try{
			glGetnUniformiv.invoke(program, location, bufSize, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnUniformiv = createCriticalMethodHandle("c_glGetnUniformiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnUniformuiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int bufSize, @Ctype("GLuint*") long params){
		try{
			glGetnUniformuiv.invoke(program, location, bufSize, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnUniformuiv = createCriticalMethodHandle("c_glGetnUniformuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glReadnPixels(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long data){
		try{
			glReadnPixels.invoke(x, y, width, height, format, type, bufSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glReadnPixels = createCriticalMethodHandle("c_glReadnPixels", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnMapdv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLsizei") int bufSize, @Ctype("GLdouble*") long v){
		try{
			glGetnMapdv.invoke(target, query, bufSize, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnMapdv = createCriticalMethodHandle("c_glGetnMapdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnMapfv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLsizei") int bufSize, @Ctype("GLfloat*") long v){
		try{
			glGetnMapfv.invoke(target, query, bufSize, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnMapfv = createCriticalMethodHandle("c_glGetnMapfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnMapiv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLsizei") int bufSize, @Ctype("GLint*") long v){
		try{
			glGetnMapiv.invoke(target, query, bufSize, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnMapiv = createCriticalMethodHandle("c_glGetnMapiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnPixelMapfv(@Ctype("GLenum") int map, @Ctype("GLsizei") int bufSize, @Ctype("GLfloat*") long values){
		try{
			glGetnPixelMapfv.invoke(map, bufSize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnPixelMapfv = createCriticalMethodHandle("c_glGetnPixelMapfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnPixelMapuiv(@Ctype("GLenum") int map, @Ctype("GLsizei") int bufSize, @Ctype("GLuint*") long values){
		try{
			glGetnPixelMapuiv.invoke(map, bufSize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnPixelMapuiv = createCriticalMethodHandle("c_glGetnPixelMapuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnPixelMapusv(@Ctype("GLenum") int map, @Ctype("GLsizei") int bufSize, @Ctype("GLushort*") long values){
		try{
			glGetnPixelMapusv.invoke(map, bufSize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnPixelMapusv = createCriticalMethodHandle("c_glGetnPixelMapusv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnPolygonStipple(@Ctype("GLsizei") int bufSize, @Ctype("GLubyte*") long pattern){
		try{
			glGetnPolygonStipple.invoke(bufSize, pattern);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnPolygonStipple = createCriticalMethodHandle("c_glGetnPolygonStipple", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnColorTable(@Ctype("GLenum") int target, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long table){
		try{
			glGetnColorTable.invoke(target, format, type, bufSize, table);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnColorTable = createCriticalMethodHandle("c_glGetnColorTable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnConvolutionFilter(@Ctype("GLenum") int target, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long image){
		try{
			glGetnConvolutionFilter.invoke(target, format, type, bufSize, image);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnConvolutionFilter = createCriticalMethodHandle("c_glGetnConvolutionFilter", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnSeparableFilter(@Ctype("GLenum") int target, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int rowBufSize, @Ctype("void*") long row, @Ctype("GLsizei") int columnBufSize, @Ctype("void*") long column, @Ctype("void*") long span){
		try{
			glGetnSeparableFilter.invoke(target, format, type, rowBufSize, row, columnBufSize, column, span);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnSeparableFilter = createCriticalMethodHandle("c_glGetnSeparableFilter", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetnHistogram(@Ctype("GLenum") int target, @Ctype("GLboolean") boolean reset, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long values){
		try{
			glGetnHistogram.invoke(target, reset, format, type, bufSize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnHistogram = createCriticalMethodHandle("c_glGetnHistogram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetnMinmax(@Ctype("GLenum") int target, @Ctype("GLboolean") boolean reset, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("GLsizei") int bufSize, @Ctype("void*") long values){
		try{
			glGetnMinmax.invoke(target, reset, format, type, bufSize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetnMinmax = createCriticalMethodHandle("c_glGetnMinmax", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTextureBarrier(){
		try{
			glTextureBarrier.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureBarrier = createCriticalMethodHandle("c_glTextureBarrier", FunctionDescriptor.ofVoid());

}
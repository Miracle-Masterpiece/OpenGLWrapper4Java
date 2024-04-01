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
public final class GL43{

	private GL43(){throw new IllegalAccessError();}

	public static void glClearBufferData(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearBufferData.invoke(target, internalformat, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferData = createCriticalMethodHandle("c_glClearBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearBufferSubData(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long data){
		try{
			glClearBufferSubData.invoke(target, internalformat, offset, size, format, type, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferSubData = createCriticalMethodHandle("c_glClearBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDispatchCompute(@Ctype("GLuint") int num_groups_x, @Ctype("GLuint") int num_groups_y, @Ctype("GLuint") int num_groups_z){
		try{
			glDispatchCompute.invoke(num_groups_x, num_groups_y, num_groups_z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDispatchCompute = createCriticalMethodHandle("c_glDispatchCompute", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDispatchComputeIndirect(@Ctype("GLintptr") long indirect){
		try{
			glDispatchComputeIndirect.invoke(indirect);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDispatchComputeIndirect = createCriticalMethodHandle("c_glDispatchComputeIndirect", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glCopyImageSubData(@Ctype("GLuint") int srcName, @Ctype("GLenum") int srcTarget, @Ctype("GLint") int srcLevel, @Ctype("GLint") int srcX, @Ctype("GLint") int srcY, @Ctype("GLint") int srcZ, @Ctype("GLuint") int dstName, @Ctype("GLenum") int dstTarget, @Ctype("GLint") int dstLevel, @Ctype("GLint") int dstX, @Ctype("GLint") int dstY, @Ctype("GLint") int dstZ, @Ctype("GLsizei") int srcWidth, @Ctype("GLsizei") int srcHeight, @Ctype("GLsizei") int srcDepth){
		try{
			glCopyImageSubData.invoke(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyImageSubData = createCriticalMethodHandle("c_glCopyImageSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferParameteri(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glFramebufferParameteri.invoke(target, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferParameteri = createCriticalMethodHandle("c_glFramebufferParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetFramebufferParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetFramebufferParameteriv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFramebufferParameteriv = createCriticalMethodHandle("c_glGetFramebufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetInternalformati64v(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLenum") int pname, @Ctype("GLsizei") int count, @Ctype("GLint64*") long params){
		try{
			glGetInternalformati64v.invoke(target, internalformat, pname, count, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetInternalformati64v = createCriticalMethodHandle("c_glGetInternalformati64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glInvalidateTexSubImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth){
		try{
			glInvalidateTexSubImage.invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateTexSubImage = createCriticalMethodHandle("c_glInvalidateTexSubImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glInvalidateTexImage(@Ctype("GLuint") int texture, @Ctype("GLint") int level){
		try{
			glInvalidateTexImage.invoke(texture, level);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateTexImage = createCriticalMethodHandle("c_glInvalidateTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glInvalidateBufferSubData(@Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long length){
		try{
			glInvalidateBufferSubData.invoke(buffer, offset, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateBufferSubData = createCriticalMethodHandle("c_glInvalidateBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glInvalidateBufferData(@Ctype("GLuint") int buffer){
		try{
			glInvalidateBufferData.invoke(buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateBufferData = createCriticalMethodHandle("c_glInvalidateBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glInvalidateFramebuffer(@Ctype("GLenum") int target, @Ctype("GLsizei") int numAttachments, @Ctype("GLenum*") long attachments){
		try{
			glInvalidateFramebuffer.invoke(target, numAttachments, attachments);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateFramebuffer = createCriticalMethodHandle("c_glInvalidateFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glInvalidateSubFramebuffer(@Ctype("GLenum") int target, @Ctype("GLsizei") int numAttachments, @Ctype("GLenum*") long attachments, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glInvalidateSubFramebuffer.invoke(target, numAttachments, attachments, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInvalidateSubFramebuffer = createCriticalMethodHandle("c_glInvalidateSubFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiDrawArraysIndirect(@Ctype("GLenum") int mode, @Ctype("void*") long indirect, @Ctype("GLsizei") int drawcount, @Ctype("GLsizei") int stride){
		try{
			glMultiDrawArraysIndirect.invoke(mode, indirect, drawcount, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawArraysIndirect = createCriticalMethodHandle("c_glMultiDrawArraysIndirect", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiDrawElementsIndirect(@Ctype("GLenum") int mode, @Ctype("GLenum") int type, @Ctype("void*") long indirect, @Ctype("GLsizei") int drawcount, @Ctype("GLsizei") int stride){
		try{
			glMultiDrawElementsIndirect.invoke(mode, type, indirect, drawcount, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawElementsIndirect = createCriticalMethodHandle("c_glMultiDrawElementsIndirect", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetProgramInterfaceiv(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetProgramInterfaceiv.invoke(program, programInterface, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramInterfaceiv = createCriticalMethodHandle("c_glGetProgramInterfaceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLuint") int glGetProgramResourceIndex(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLchar*") long name){
		try{
			return (int)glGetProgramResourceIndex.invoke(program, programInterface, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramResourceIndex = createCriticalMethodHandle("c_glGetProgramResourceIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetProgramResourceName(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long name){
		try{
			glGetProgramResourceName.invoke(program, programInterface, index, bufSize, length, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramResourceName = createCriticalMethodHandle("c_glGetProgramResourceName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetProgramResourceiv(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLuint") int index, @Ctype("GLsizei") int propCount, @Ctype("GLenum*") long props, @Ctype("GLsizei") int count, @Ctype("GLsizei*") long length, @Ctype("GLint*") long params){
		try{
			glGetProgramResourceiv.invoke(program, programInterface, index, propCount, props, count, length, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramResourceiv = createCriticalMethodHandle("c_glGetProgramResourceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetProgramResourceLocation(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLchar*") long name){
		try{
			return (int)glGetProgramResourceLocation.invoke(program, programInterface, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramResourceLocation = createCriticalMethodHandle("c_glGetProgramResourceLocation", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetProgramResourceLocationIndex(@Ctype("GLuint") int program, @Ctype("GLenum") int programInterface, @Ctype("GLchar*") long name){
		try{
			return (int)glGetProgramResourceLocationIndex.invoke(program, programInterface, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramResourceLocationIndex = createCriticalMethodHandle("c_glGetProgramResourceLocationIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glShaderStorageBlockBinding(@Ctype("GLuint") int program, @Ctype("GLuint") int storageBlockIndex, @Ctype("GLuint") int storageBlockBinding){
		try{
			glShaderStorageBlockBinding.invoke(program, storageBlockIndex, storageBlockBinding);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glShaderStorageBlockBinding = createCriticalMethodHandle("c_glShaderStorageBlockBinding", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexBufferRange(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size){
		try{
			glTexBufferRange.invoke(target, internalformat, buffer, offset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexBufferRange = createCriticalMethodHandle("c_glTexBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glTexStorage2DMultisample(@Ctype("GLenum") int target, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTexStorage2DMultisample.invoke(target, samples, internalformat, width, height, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexStorage2DMultisample = createCriticalMethodHandle("c_glTexStorage2DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glTexStorage3DMultisample(@Ctype("GLenum") int target, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLboolean") boolean fixedsamplelocations){
		try{
			glTexStorage3DMultisample.invoke(target, samples, internalformat, width, height, depth, fixedsamplelocations);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexStorage3DMultisample = createCriticalMethodHandle("c_glTexStorage3DMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));

	public static void glTextureView(@Ctype("GLuint") int texture, @Ctype("GLenum") int target, @Ctype("GLuint") int origtexture, @Ctype("GLenum") int internalformat, @Ctype("GLuint") int minlevel, @Ctype("GLuint") int numlevels, @Ctype("GLuint") int minlayer, @Ctype("GLuint") int numlayers){
		try{
			glTextureView.invoke(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTextureView = createCriticalMethodHandle("c_glTextureView", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBindVertexBuffer(@Ctype("GLuint") int bindingindex, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizei") int stride){
		try{
			glBindVertexBuffer.invoke(bindingindex, buffer, offset, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindVertexBuffer = createCriticalMethodHandle("c_glBindVertexBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glVertexAttribFormat(@Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexAttribFormat.invoke(attribindex, size, type, normalized, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribFormat = createCriticalMethodHandle("c_glVertexAttribFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexAttribIFormat(@Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexAttribIFormat.invoke(attribindex, size, type, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribIFormat = createCriticalMethodHandle("c_glVertexAttribIFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribLFormat(@Ctype("GLuint") int attribindex, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLuint") int relativeoffset){
		try{
			glVertexAttribLFormat.invoke(attribindex, size, type, relativeoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribLFormat = createCriticalMethodHandle("c_glVertexAttribLFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribBinding(@Ctype("GLuint") int attribindex, @Ctype("GLuint") int bindingindex){
		try{
			glVertexAttribBinding.invoke(attribindex, bindingindex);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribBinding = createCriticalMethodHandle("c_glVertexAttribBinding", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexBindingDivisor(@Ctype("GLuint") int bindingindex, @Ctype("GLuint") int divisor){
		try{
			glVertexBindingDivisor.invoke(bindingindex, divisor);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexBindingDivisor = createCriticalMethodHandle("c_glVertexBindingDivisor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDebugMessageControl(@Ctype("GLenum") int source, @Ctype("GLenum") int type, @Ctype("GLenum") int severity, @Ctype("GLsizei") int count, @Ctype("GLuint*") long ids, @Ctype("GLboolean") boolean enabled){
		try{
			glDebugMessageControl.invoke(source, type, severity, count, ids, enabled);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDebugMessageControl = createCriticalMethodHandle("c_glDebugMessageControl", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN));

	public static void glDebugMessageInsert(@Ctype("GLenum") int source, @Ctype("GLenum") int type, @Ctype("GLuint") int id, @Ctype("GLenum") int severity, @Ctype("GLsizei") int length, @Ctype("GLchar*") long buf){
		try{
			glDebugMessageInsert.invoke(source, type, id, severity, length, buf);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDebugMessageInsert = createCriticalMethodHandle("c_glDebugMessageInsert", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDebugMessageCallback(@Ctype("void*") long userParam){
		try{
			glDebugMessageCallback.invoke(userParam);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDebugMessageCallback = createCriticalMethodHandle("c_glDebugMessageCallback", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static @Ctype("GLuint") int glGetDebugMessageLog(@Ctype("GLuint") int count, @Ctype("GLsizei") int bufSize, @Ctype("GLenum*") long sources, @Ctype("GLenum*") long types, @Ctype("GLuint*") long ids, @Ctype("GLenum*") long severities, @Ctype("GLsizei*") long lengths, @Ctype("GLchar*") long messageLog){
		try{
			return (int)glGetDebugMessageLog.invoke(count, bufSize, sources, types, ids, severities, lengths, messageLog);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetDebugMessageLog = createCriticalMethodHandle("c_glGetDebugMessageLog", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glPushDebugGroup(@Ctype("GLenum") int source, @Ctype("GLuint") int id, @Ctype("GLsizei") int length, @Ctype("GLchar*") long message){
		try{
			glPushDebugGroup.invoke(source, id, length, message);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPushDebugGroup = createCriticalMethodHandle("c_glPushDebugGroup", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPopDebugGroup(){
		try{
			glPopDebugGroup.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPopDebugGroup = createCriticalMethodHandle("c_glPopDebugGroup", FunctionDescriptor.ofVoid());

	public static void glObjectLabel(@Ctype("GLenum") int identifier, @Ctype("GLuint") int name, @Ctype("GLsizei") int length, @Ctype("GLchar*") long label){
		try{
			glObjectLabel.invoke(identifier, name, length, label);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glObjectLabel = createCriticalMethodHandle("c_glObjectLabel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetObjectLabel(@Ctype("GLenum") int identifier, @Ctype("GLuint") int name, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long label){
		try{
			glGetObjectLabel.invoke(identifier, name, bufSize, length, label);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetObjectLabel = createCriticalMethodHandle("c_glGetObjectLabel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glObjectPtrLabel(@Ctype("void*") long ptr, @Ctype("GLsizei") int length, @Ctype("GLchar*") long label){
		try{
			glObjectPtrLabel.invoke(ptr, length, label);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glObjectPtrLabel = createCriticalMethodHandle("c_glObjectPtrLabel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetObjectPtrLabel(@Ctype("void*") long ptr, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long label){
		try{
			glGetObjectPtrLabel.invoke(ptr, bufSize, length, label);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetObjectPtrLabel = createCriticalMethodHandle("c_glGetObjectPtrLabel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

}
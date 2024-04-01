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
public final class GL30{

	private GL30(){throw new IllegalAccessError();}

	public static void glColorMaski(@Ctype("GLuint") int index, @Ctype("GLboolean") boolean r, @Ctype("GLboolean") boolean g, @Ctype("GLboolean") boolean b, @Ctype("GLboolean") boolean a){
		try{
			glColorMaski.invoke(index, r, g, b, a);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorMaski = createCriticalMethodHandle("c_glColorMaski", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));

	public static void glGetBooleani_v(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLboolean*") long data){
		try{
			glGetBooleani_v.invoke(target, index, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBooleani_v = createCriticalMethodHandle("c_glGetBooleani_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetIntegeri_v(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLint*") long data){
		try{
			glGetIntegeri_v.invoke(target, index, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetIntegeri_v = createCriticalMethodHandle("c_glGetIntegeri_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glEnablei(@Ctype("GLenum") int target, @Ctype("GLuint") int index){
		try{
			glEnablei.invoke(target, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnablei = createCriticalMethodHandle("c_glEnablei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDisablei(@Ctype("GLenum") int target, @Ctype("GLuint") int index){
		try{
			glDisablei.invoke(target, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDisablei = createCriticalMethodHandle("c_glDisablei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glIsEnabledi(@Ctype("GLenum") int target, @Ctype("GLuint") int index){
		try{
			return (boolean)glIsEnabledi.invoke(target, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsEnabledi = createCriticalMethodHandle("c_glIsEnabledi", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBeginTransformFeedback(@Ctype("GLenum") int primitiveMode){
		try{
			glBeginTransformFeedback.invoke(primitiveMode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBeginTransformFeedback = createCriticalMethodHandle("c_glBeginTransformFeedback", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glEndTransformFeedback(){
		try{
			glEndTransformFeedback.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEndTransformFeedback = createCriticalMethodHandle("c_glEndTransformFeedback", FunctionDescriptor.ofVoid());

	public static void glBindBufferRange(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLuint") int buffer, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size){
		try{
			glBindBufferRange.invoke(target, index, buffer, offset, size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindBufferRange = createCriticalMethodHandle("c_glBindBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glBindBufferBase(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLuint") int buffer){
		try{
			glBindBufferBase.invoke(target, index, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindBufferBase = createCriticalMethodHandle("c_glBindBufferBase", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTransformFeedbackVaryings(@Ctype("GLuint") int program, @Ctype("GLsizei") int count, @Ctype("GLchar**") long varyings, @Ctype("GLenum") int bufferMode){
		try{
			glTransformFeedbackVaryings.invoke(program, count, varyings, bufferMode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTransformFeedbackVaryings = createCriticalMethodHandle("c_glTransformFeedbackVaryings", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glGetTransformFeedbackVarying(@Ctype("GLuint") int program, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLsizei*") long size, @Ctype("GLenum*") long type, @Ctype("GLchar*") long name){
		try{
			glGetTransformFeedbackVarying.invoke(program, index, bufSize, length, size, type, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTransformFeedbackVarying = createCriticalMethodHandle("c_glGetTransformFeedbackVarying", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glClampColor(@Ctype("GLenum") int target, @Ctype("GLenum") int clamp){
		try{
			glClampColor.invoke(target, clamp);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClampColor = createCriticalMethodHandle("c_glClampColor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBeginConditionalRender(@Ctype("GLuint") int id, @Ctype("GLenum") int mode){
		try{
			glBeginConditionalRender.invoke(id, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBeginConditionalRender = createCriticalMethodHandle("c_glBeginConditionalRender", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEndConditionalRender(){
		try{
			glEndConditionalRender.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEndConditionalRender = createCriticalMethodHandle("c_glEndConditionalRender", FunctionDescriptor.ofVoid());

	public static void glVertexAttribIPointer(@Ctype("GLuint") int index, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glVertexAttribIPointer.invoke(index, size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribIPointer = createCriticalMethodHandle("c_glVertexAttribIPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribIiv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetVertexAttribIiv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribIiv = createCriticalMethodHandle("c_glGetVertexAttribIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribIuiv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glGetVertexAttribIuiv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribIuiv = createCriticalMethodHandle("c_glGetVertexAttribIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI1i(@Ctype("GLuint") int index, @Ctype("GLint") int x){
		try{
			glVertexAttribI1i.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI1i = createCriticalMethodHandle("c_glVertexAttribI1i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI2i(@Ctype("GLuint") int index, @Ctype("GLint") int x, @Ctype("GLint") int y){
		try{
			glVertexAttribI2i.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI2i = createCriticalMethodHandle("c_glVertexAttribI2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI3i(@Ctype("GLuint") int index, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z){
		try{
			glVertexAttribI3i.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI3i = createCriticalMethodHandle("c_glVertexAttribI3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI4i(@Ctype("GLuint") int index, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z, @Ctype("GLint") int w){
		try{
			glVertexAttribI4i.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4i = createCriticalMethodHandle("c_glVertexAttribI4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI1ui(@Ctype("GLuint") int index, @Ctype("GLuint") int x){
		try{
			glVertexAttribI1ui.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI1ui = createCriticalMethodHandle("c_glVertexAttribI1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI2ui(@Ctype("GLuint") int index, @Ctype("GLuint") int x, @Ctype("GLuint") int y){
		try{
			glVertexAttribI2ui.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI2ui = createCriticalMethodHandle("c_glVertexAttribI2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI3ui(@Ctype("GLuint") int index, @Ctype("GLuint") int x, @Ctype("GLuint") int y, @Ctype("GLuint") int z){
		try{
			glVertexAttribI3ui.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI3ui = createCriticalMethodHandle("c_glVertexAttribI3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI4ui(@Ctype("GLuint") int index, @Ctype("GLuint") int x, @Ctype("GLuint") int y, @Ctype("GLuint") int z, @Ctype("GLuint") int w){
		try{
			glVertexAttribI4ui.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4ui = createCriticalMethodHandle("c_glVertexAttribI4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribI1iv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttribI1iv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI1iv = createCriticalMethodHandle("c_glVertexAttribI1iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI2iv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttribI2iv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI2iv = createCriticalMethodHandle("c_glVertexAttribI2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI3iv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttribI3iv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI3iv = createCriticalMethodHandle("c_glVertexAttribI3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4iv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttribI4iv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4iv = createCriticalMethodHandle("c_glVertexAttribI4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI1uiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttribI1uiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI1uiv = createCriticalMethodHandle("c_glVertexAttribI1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI2uiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttribI2uiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI2uiv = createCriticalMethodHandle("c_glVertexAttribI2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI3uiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttribI3uiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI3uiv = createCriticalMethodHandle("c_glVertexAttribI3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4uiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttribI4uiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4uiv = createCriticalMethodHandle("c_glVertexAttribI4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4bv(@Ctype("GLuint") int index, @Ctype("GLbyte*") long v){
		try{
			glVertexAttribI4bv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4bv = createCriticalMethodHandle("c_glVertexAttribI4bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4sv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttribI4sv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4sv = createCriticalMethodHandle("c_glVertexAttribI4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4ubv(@Ctype("GLuint") int index, @Ctype("GLubyte*") long v){
		try{
			glVertexAttribI4ubv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4ubv = createCriticalMethodHandle("c_glVertexAttribI4ubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribI4usv(@Ctype("GLuint") int index, @Ctype("GLushort*") long v){
		try{
			glVertexAttribI4usv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribI4usv = createCriticalMethodHandle("c_glVertexAttribI4usv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetUniformuiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLuint*") long params){
		try{
			glGetUniformuiv.invoke(program, location, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformuiv = createCriticalMethodHandle("c_glGetUniformuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindFragDataLocation(@Ctype("GLuint") int program, @Ctype("GLuint") int color, @Ctype("GLchar*") long name){
		try{
			glBindFragDataLocation.invoke(program, color, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindFragDataLocation = createCriticalMethodHandle("c_glBindFragDataLocation", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetFragDataLocation(@Ctype("GLuint") int program, @Ctype("GLchar*") long name){
		try{
			return (int)glGetFragDataLocation.invoke(program, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFragDataLocation = createCriticalMethodHandle("c_glGetFragDataLocation", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform1ui(@Ctype("GLint") int location, @Ctype("GLuint") int v0){
		try{
			glUniform1ui.invoke(location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1ui = createCriticalMethodHandle("c_glUniform1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform2ui(@Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1){
		try{
			glUniform2ui.invoke(location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2ui = createCriticalMethodHandle("c_glUniform2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform3ui(@Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1, @Ctype("GLuint") int v2){
		try{
			glUniform3ui.invoke(location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3ui = createCriticalMethodHandle("c_glUniform3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform4ui(@Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1, @Ctype("GLuint") int v2, @Ctype("GLuint") int v3){
		try{
			glUniform4ui.invoke(location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4ui = createCriticalMethodHandle("c_glUniform4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform1uiv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glUniform1uiv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1uiv = createCriticalMethodHandle("c_glUniform1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform2uiv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glUniform2uiv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2uiv = createCriticalMethodHandle("c_glUniform2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform3uiv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glUniform3uiv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3uiv = createCriticalMethodHandle("c_glUniform3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform4uiv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glUniform4uiv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4uiv = createCriticalMethodHandle("c_glUniform4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexParameterIiv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glTexParameterIiv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameterIiv = createCriticalMethodHandle("c_glTexParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexParameterIuiv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glTexParameterIuiv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameterIuiv = createCriticalMethodHandle("c_glTexParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexParameterIiv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTexParameterIiv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexParameterIiv = createCriticalMethodHandle("c_glGetTexParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexParameterIuiv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glGetTexParameterIuiv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexParameterIuiv = createCriticalMethodHandle("c_glGetTexParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearBufferiv(@Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLint*") long value){
		try{
			glClearBufferiv.invoke(buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferiv = createCriticalMethodHandle("c_glClearBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearBufferuiv(@Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLuint*") long value){
		try{
			glClearBufferuiv.invoke(buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferuiv = createCriticalMethodHandle("c_glClearBufferuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearBufferfv(@Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLfloat*") long value){
		try{
			glClearBufferfv.invoke(buffer, drawbuffer, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferfv = createCriticalMethodHandle("c_glClearBufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClearBufferfi(@Ctype("GLenum") int buffer, @Ctype("GLint") int drawbuffer, @Ctype("GLfloat") float depth, @Ctype("GLint") int stencil){
		try{
			glClearBufferfi.invoke(buffer, drawbuffer, depth, stencil);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearBufferfi = createCriticalMethodHandle("c_glClearBufferfi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));

	public static @Ctype("GLubyte*")long glGetStringi(@Ctype("GLenum") int name, @Ctype("GLuint") int index){
		try{
			return (long)glGetStringi.invoke(name, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetStringi = createCriticalMethodHandle("c_glGetStringi", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glIsRenderbuffer(@Ctype("GLuint") int renderbuffer){
		try{
			return (boolean)glIsRenderbuffer.invoke(renderbuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsRenderbuffer = createCriticalMethodHandle("c_glIsRenderbuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glBindRenderbuffer(@Ctype("GLenum") int target, @Ctype("GLuint") int renderbuffer){
		try{
			glBindRenderbuffer.invoke(target, renderbuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindRenderbuffer = createCriticalMethodHandle("c_glBindRenderbuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteRenderbuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long renderbuffers){
		try{
			glDeleteRenderbuffers.invoke(n, renderbuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteRenderbuffers = createCriticalMethodHandle("c_glDeleteRenderbuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenRenderbuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long renderbuffers){
		try{
			glGenRenderbuffers.invoke(n, renderbuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenRenderbuffers = createCriticalMethodHandle("c_glGenRenderbuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glRenderbufferStorage(@Ctype("GLenum") int target, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glRenderbufferStorage.invoke(target, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRenderbufferStorage = createCriticalMethodHandle("c_glRenderbufferStorage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetRenderbufferParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetRenderbufferParameteriv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetRenderbufferParameteriv = createCriticalMethodHandle("c_glGetRenderbufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsFramebuffer(@Ctype("GLuint") int framebuffer){
		try{
			return (boolean)glIsFramebuffer.invoke(framebuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsFramebuffer = createCriticalMethodHandle("c_glIsFramebuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glBindFramebuffer(@Ctype("GLenum") int target, @Ctype("GLuint") int framebuffer){
		try{
			glBindFramebuffer.invoke(target, framebuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindFramebuffer = createCriticalMethodHandle("c_glBindFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteFramebuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long framebuffers){
		try{
			glDeleteFramebuffers.invoke(n, framebuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteFramebuffers = createCriticalMethodHandle("c_glDeleteFramebuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenFramebuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long framebuffers){
		try{
			glGenFramebuffers.invoke(n, framebuffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenFramebuffers = createCriticalMethodHandle("c_glGenFramebuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLenum") int glCheckFramebufferStatus(@Ctype("GLenum") int target){
		try{
			return (int)glCheckFramebufferStatus.invoke(target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCheckFramebufferStatus = createCriticalMethodHandle("c_glCheckFramebufferStatus", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferTexture1D(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLenum") int textarget, @Ctype("GLuint") int texture, @Ctype("GLint") int level){
		try{
			glFramebufferTexture1D.invoke(target, attachment, textarget, texture, level);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferTexture1D = createCriticalMethodHandle("c_glFramebufferTexture1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferTexture2D(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLenum") int textarget, @Ctype("GLuint") int texture, @Ctype("GLint") int level){
		try{
			glFramebufferTexture2D.invoke(target, attachment, textarget, texture, level);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferTexture2D = createCriticalMethodHandle("c_glFramebufferTexture2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferTexture3D(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLenum") int textarget, @Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int zoffset){
		try{
			glFramebufferTexture3D.invoke(target, attachment, textarget, texture, level, zoffset);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferTexture3D = createCriticalMethodHandle("c_glFramebufferTexture3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferRenderbuffer(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLenum") int renderbuffertarget, @Ctype("GLuint") int renderbuffer){
		try{
			glFramebufferRenderbuffer.invoke(target, attachment, renderbuffertarget, renderbuffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferRenderbuffer = createCriticalMethodHandle("c_glFramebufferRenderbuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetFramebufferAttachmentParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetFramebufferAttachmentParameteriv.invoke(target, attachment, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFramebufferAttachmentParameteriv = createCriticalMethodHandle("c_glGetFramebufferAttachmentParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenerateMipmap(@Ctype("GLenum") int target){
		try{
			glGenerateMipmap.invoke(target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenerateMipmap = createCriticalMethodHandle("c_glGenerateMipmap", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glBlitFramebuffer(@Ctype("GLint") int srcX0, @Ctype("GLint") int srcY0, @Ctype("GLint") int srcX1, @Ctype("GLint") int srcY1, @Ctype("GLint") int dstX0, @Ctype("GLint") int dstY0, @Ctype("GLint") int dstX1, @Ctype("GLint") int dstY1, @Ctype("GLbitfield") int mask, @Ctype("GLenum") int filter){
		try{
			glBlitFramebuffer.invoke(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlitFramebuffer = createCriticalMethodHandle("c_glBlitFramebuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glRenderbufferStorageMultisample(@Ctype("GLenum") int target, @Ctype("GLsizei") int samples, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glRenderbufferStorageMultisample.invoke(target, samples, internalformat, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRenderbufferStorageMultisample = createCriticalMethodHandle("c_glRenderbufferStorageMultisample", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFramebufferTextureLayer(@Ctype("GLenum") int target, @Ctype("GLenum") int attachment, @Ctype("GLuint") int texture, @Ctype("GLint") int level, @Ctype("GLint") int layer){
		try{
			glFramebufferTextureLayer.invoke(target, attachment, texture, level, layer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFramebufferTextureLayer = createCriticalMethodHandle("c_glFramebufferTextureLayer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("void*")long glMapBufferRange(@Ctype("GLenum") int target, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long length, @Ctype("GLbitfield") int access){
		try{
			return (long)glMapBufferRange.invoke(target, offset, length, access);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapBufferRange = createCriticalMethodHandle("c_glMapBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glFlushMappedBufferRange(@Ctype("GLenum") int target, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long length){
		try{
			glFlushMappedBufferRange.invoke(target, offset, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFlushMappedBufferRange = createCriticalMethodHandle("c_glFlushMappedBufferRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glBindVertexArray(@Ctype("GLuint") int array){
		try{
			glBindVertexArray.invoke(array);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindVertexArray = createCriticalMethodHandle("c_glBindVertexArray", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glDeleteVertexArrays(@Ctype("GLsizei") int n, @Ctype("GLuint*") long arrays){
		try{
			glDeleteVertexArrays.invoke(n, arrays);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteVertexArrays = createCriticalMethodHandle("c_glDeleteVertexArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenVertexArrays(@Ctype("GLsizei") int n, @Ctype("GLuint*") long arrays){
		try{
			glGenVertexArrays.invoke(n, arrays);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenVertexArrays = createCriticalMethodHandle("c_glGenVertexArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsVertexArray(@Ctype("GLuint") int array){
		try{
			return (boolean)glIsVertexArray.invoke(array);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsVertexArray = createCriticalMethodHandle("c_glIsVertexArray", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

}
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
public final class GL20{

	private GL20(){throw new IllegalAccessError();}

	public static void glBlendEquationSeparate(@Ctype("GLenum") int modeRGB, @Ctype("GLenum") int modeAlpha){
		try{
			glBlendEquationSeparate.invoke(modeRGB, modeAlpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendEquationSeparate = createCriticalMethodHandle("c_glBlendEquationSeparate", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawBuffers(@Ctype("GLsizei") int n, @Ctype("GLenum*") long bufs){
		try{
			glDrawBuffers.invoke(n, bufs);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawBuffers = createCriticalMethodHandle("c_glDrawBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glStencilOpSeparate(@Ctype("GLenum") int face, @Ctype("GLenum") int sfail, @Ctype("GLenum") int dpfail, @Ctype("GLenum") int dppass){
		try{
			glStencilOpSeparate.invoke(face, sfail, dpfail, dppass);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilOpSeparate = createCriticalMethodHandle("c_glStencilOpSeparate", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glStencilFuncSeparate(@Ctype("GLenum") int face, @Ctype("GLenum") int func, @Ctype("GLint") int ref, @Ctype("GLuint") int mask){
		try{
			glStencilFuncSeparate.invoke(face, func, ref, mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilFuncSeparate = createCriticalMethodHandle("c_glStencilFuncSeparate", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glStencilMaskSeparate(@Ctype("GLenum") int face, @Ctype("GLuint") int mask){
		try{
			glStencilMaskSeparate.invoke(face, mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilMaskSeparate = createCriticalMethodHandle("c_glStencilMaskSeparate", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glAttachShader(@Ctype("GLuint") int program, @Ctype("GLuint") int shader){
		try{
			glAttachShader.invoke(program, shader);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glAttachShader = createCriticalMethodHandle("c_glAttachShader", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBindAttribLocation(@Ctype("GLuint") int program, @Ctype("GLuint") int index, @Ctype("GLchar*") long name){
		try{
			glBindAttribLocation.invoke(program, index, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindAttribLocation = createCriticalMethodHandle("c_glBindAttribLocation", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompileShader(@Ctype("GLuint") int shader){
		try{
			glCompileShader.invoke(shader);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompileShader = createCriticalMethodHandle("c_glCompileShader", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static @Ctype("GLuint") int glCreateProgram(){
		try{
			return (int)glCreateProgram.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateProgram = createCriticalMethodHandle("c_glCreateProgram", FunctionDescriptor.of(ValueLayout.JAVA_INT));

	public static @Ctype("GLuint") int glCreateShader(@Ctype("GLenum") int type){
		try{
			return (int)glCreateShader.invoke(type);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateShader = createCriticalMethodHandle("c_glCreateShader", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteProgram(@Ctype("GLuint") int program){
		try{
			glDeleteProgram.invoke(program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteProgram = createCriticalMethodHandle("c_glDeleteProgram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glDeleteShader(@Ctype("GLuint") int shader){
		try{
			glDeleteShader.invoke(shader);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteShader = createCriticalMethodHandle("c_glDeleteShader", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glDetachShader(@Ctype("GLuint") int program, @Ctype("GLuint") int shader){
		try{
			glDetachShader.invoke(program, shader);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDetachShader = createCriticalMethodHandle("c_glDetachShader", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDisableVertexAttribArray(@Ctype("GLuint") int index){
		try{
			glDisableVertexAttribArray.invoke(index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDisableVertexAttribArray = createCriticalMethodHandle("c_glDisableVertexAttribArray", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glEnableVertexAttribArray(@Ctype("GLuint") int index){
		try{
			glEnableVertexAttribArray.invoke(index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnableVertexAttribArray = createCriticalMethodHandle("c_glEnableVertexAttribArray", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glGetActiveAttrib(@Ctype("GLuint") int program, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLint*") long size, @Ctype("GLenum*") long type, @Ctype("GLchar*") long name){
		try{
			glGetActiveAttrib.invoke(program, index, bufSize, length, size, type, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveAttrib = createCriticalMethodHandle("c_glGetActiveAttrib", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetActiveUniform(@Ctype("GLuint") int program, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLint*") long size, @Ctype("GLenum*") long type, @Ctype("GLchar*") long name){
		try{
			glGetActiveUniform.invoke(program, index, bufSize, length, size, type, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveUniform = createCriticalMethodHandle("c_glGetActiveUniform", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetAttachedShaders(@Ctype("GLuint") int program, @Ctype("GLsizei") int maxCount, @Ctype("GLsizei*") long count, @Ctype("GLuint*") long shaders){
		try{
			glGetAttachedShaders.invoke(program, maxCount, count, shaders);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetAttachedShaders = createCriticalMethodHandle("c_glGetAttachedShaders", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetAttribLocation(@Ctype("GLuint") int program, @Ctype("GLchar*") long name){
		try{
			return (int)glGetAttribLocation.invoke(program, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetAttribLocation = createCriticalMethodHandle("c_glGetAttribLocation", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetProgramiv(@Ctype("GLuint") int program, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetProgramiv.invoke(program, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramiv = createCriticalMethodHandle("c_glGetProgramiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetProgramInfoLog(@Ctype("GLuint") int program, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long infoLog){
		try{
			glGetProgramInfoLog.invoke(program, bufSize, length, infoLog);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramInfoLog = createCriticalMethodHandle("c_glGetProgramInfoLog", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetShaderiv(@Ctype("GLuint") int shader, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetShaderiv.invoke(shader, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetShaderiv = createCriticalMethodHandle("c_glGetShaderiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetShaderInfoLog(@Ctype("GLuint") int shader, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long infoLog){
		try{
			glGetShaderInfoLog.invoke(shader, bufSize, length, infoLog);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetShaderInfoLog = createCriticalMethodHandle("c_glGetShaderInfoLog", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetShaderSource(@Ctype("GLuint") int shader, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long source){
		try{
			glGetShaderSource.invoke(shader, bufSize, length, source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetShaderSource = createCriticalMethodHandle("c_glGetShaderSource", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetUniformLocation(@Ctype("GLuint") int program, @Ctype("GLchar*") long name){
		try{
			return (int)glGetUniformLocation.invoke(program, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformLocation = createCriticalMethodHandle("c_glGetUniformLocation", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetUniformfv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLfloat*") long params){
		try{
			glGetUniformfv.invoke(program, location, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformfv = createCriticalMethodHandle("c_glGetUniformfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetUniformiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLint*") long params){
		try{
			glGetUniformiv.invoke(program, location, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformiv = createCriticalMethodHandle("c_glGetUniformiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribdv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLdouble*") long params){
		try{
			glGetVertexAttribdv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribdv = createCriticalMethodHandle("c_glGetVertexAttribdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribfv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetVertexAttribfv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribfv = createCriticalMethodHandle("c_glGetVertexAttribfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribiv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetVertexAttribiv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribiv = createCriticalMethodHandle("c_glGetVertexAttribiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribPointerv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("void**") long pointer){
		try{
			glGetVertexAttribPointerv.invoke(index, pname, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribPointerv = createCriticalMethodHandle("c_glGetVertexAttribPointerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsProgram(@Ctype("GLuint") int program){
		try{
			return (boolean)glIsProgram.invoke(program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsProgram = createCriticalMethodHandle("c_glIsProgram", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glIsShader(@Ctype("GLuint") int shader){
		try{
			return (boolean)glIsShader.invoke(shader);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsShader = createCriticalMethodHandle("c_glIsShader", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glLinkProgram(@Ctype("GLuint") int program){
		try{
			glLinkProgram.invoke(program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLinkProgram = createCriticalMethodHandle("c_glLinkProgram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glShaderSource(@Ctype("GLuint") int shader, @Ctype("GLsizei") int count, @Ctype("GLchar**") long string, @Ctype("GLint*") long length){
		try{
			glShaderSource.invoke(shader, count, string, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glShaderSource = createCriticalMethodHandle("c_glShaderSource", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glUseProgram(@Ctype("GLuint") int program){
		try{
			glUseProgram.invoke(program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUseProgram = createCriticalMethodHandle("c_glUseProgram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glUniform1f(@Ctype("GLint") int location, @Ctype("GLfloat") float v0){
		try{
			glUniform1f.invoke(location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1f = createCriticalMethodHandle("c_glUniform1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glUniform2f(@Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1){
		try{
			glUniform2f.invoke(location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2f = createCriticalMethodHandle("c_glUniform2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glUniform3f(@Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2){
		try{
			glUniform3f.invoke(location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3f = createCriticalMethodHandle("c_glUniform3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glUniform4f(@Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2, @Ctype("GLfloat") float v3){
		try{
			glUniform4f.invoke(location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4f = createCriticalMethodHandle("c_glUniform4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glUniform1i(@Ctype("GLint") int location, @Ctype("GLint") int v0){
		try{
			glUniform1i.invoke(location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1i = createCriticalMethodHandle("c_glUniform1i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform2i(@Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1){
		try{
			glUniform2i.invoke(location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2i = createCriticalMethodHandle("c_glUniform2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform3i(@Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1, @Ctype("GLint") int v2){
		try{
			glUniform3i.invoke(location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3i = createCriticalMethodHandle("c_glUniform3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform4i(@Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1, @Ctype("GLint") int v2, @Ctype("GLint") int v3){
		try{
			glUniform4i.invoke(location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4i = createCriticalMethodHandle("c_glUniform4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUniform1fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glUniform1fv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1fv = createCriticalMethodHandle("c_glUniform1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform2fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glUniform2fv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2fv = createCriticalMethodHandle("c_glUniform2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform3fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glUniform3fv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3fv = createCriticalMethodHandle("c_glUniform3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform4fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glUniform4fv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4fv = createCriticalMethodHandle("c_glUniform4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform1iv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glUniform1iv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1iv = createCriticalMethodHandle("c_glUniform1iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform2iv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glUniform2iv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2iv = createCriticalMethodHandle("c_glUniform2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform3iv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glUniform3iv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3iv = createCriticalMethodHandle("c_glUniform3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform4iv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glUniform4iv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4iv = createCriticalMethodHandle("c_glUniform4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix2fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix2fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2fv = createCriticalMethodHandle("c_glUniformMatrix2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix3fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3fv = createCriticalMethodHandle("c_glUniformMatrix3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix4fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4fv = createCriticalMethodHandle("c_glUniformMatrix4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glValidateProgram(@Ctype("GLuint") int program){
		try{
			glValidateProgram.invoke(program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glValidateProgram = createCriticalMethodHandle("c_glValidateProgram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glVertexAttrib1d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x){
		try{
			glVertexAttrib1d.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1d = createCriticalMethodHandle("c_glVertexAttrib1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttrib1dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttrib1dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1dv = createCriticalMethodHandle("c_glVertexAttrib1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib1f(@Ctype("GLuint") int index, @Ctype("GLfloat") float x){
		try{
			glVertexAttrib1f.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1f = createCriticalMethodHandle("c_glVertexAttrib1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glVertexAttrib1fv(@Ctype("GLuint") int index, @Ctype("GLfloat*") long v){
		try{
			glVertexAttrib1fv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1fv = createCriticalMethodHandle("c_glVertexAttrib1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib1s(@Ctype("GLuint") int index, @Ctype("GLshort") short x){
		try{
			glVertexAttrib1s.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1s = createCriticalMethodHandle("c_glVertexAttrib1s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));

	public static void glVertexAttrib1sv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttrib1sv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib1sv = createCriticalMethodHandle("c_glVertexAttrib1sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib2d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glVertexAttrib2d.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2d = createCriticalMethodHandle("c_glVertexAttrib2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttrib2dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttrib2dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2dv = createCriticalMethodHandle("c_glVertexAttrib2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib2f(@Ctype("GLuint") int index, @Ctype("GLfloat") float x, @Ctype("GLfloat") float y){
		try{
			glVertexAttrib2f.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2f = createCriticalMethodHandle("c_glVertexAttrib2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertexAttrib2fv(@Ctype("GLuint") int index, @Ctype("GLfloat*") long v){
		try{
			glVertexAttrib2fv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2fv = createCriticalMethodHandle("c_glVertexAttrib2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib2s(@Ctype("GLuint") int index, @Ctype("GLshort") short x, @Ctype("GLshort") short y){
		try{
			glVertexAttrib2s.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2s = createCriticalMethodHandle("c_glVertexAttrib2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertexAttrib2sv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttrib2sv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib2sv = createCriticalMethodHandle("c_glVertexAttrib2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib3d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glVertexAttrib3d.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3d = createCriticalMethodHandle("c_glVertexAttrib3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttrib3dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttrib3dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3dv = createCriticalMethodHandle("c_glVertexAttrib3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib3f(@Ctype("GLuint") int index, @Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glVertexAttrib3f.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3f = createCriticalMethodHandle("c_glVertexAttrib3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertexAttrib3fv(@Ctype("GLuint") int index, @Ctype("GLfloat*") long v){
		try{
			glVertexAttrib3fv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3fv = createCriticalMethodHandle("c_glVertexAttrib3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib3s(@Ctype("GLuint") int index, @Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z){
		try{
			glVertexAttrib3s.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3s = createCriticalMethodHandle("c_glVertexAttrib3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertexAttrib3sv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttrib3sv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib3sv = createCriticalMethodHandle("c_glVertexAttrib3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Nbv(@Ctype("GLuint") int index, @Ctype("GLbyte*") long v){
		try{
			glVertexAttrib4Nbv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nbv = createCriticalMethodHandle("c_glVertexAttrib4Nbv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Niv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttrib4Niv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Niv = createCriticalMethodHandle("c_glVertexAttrib4Niv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Nsv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttrib4Nsv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nsv = createCriticalMethodHandle("c_glVertexAttrib4Nsv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Nub(@Ctype("GLuint") int index, @Ctype("GLubyte") byte x, @Ctype("GLubyte") byte y, @Ctype("GLubyte") byte z, @Ctype("GLubyte") byte w){
		try{
			glVertexAttrib4Nub.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nub = createCriticalMethodHandle("c_glVertexAttrib4Nub", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glVertexAttrib4Nubv(@Ctype("GLuint") int index, @Ctype("GLubyte*") long v){
		try{
			glVertexAttrib4Nubv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nubv = createCriticalMethodHandle("c_glVertexAttrib4Nubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Nuiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttrib4Nuiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nuiv = createCriticalMethodHandle("c_glVertexAttrib4Nuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4Nusv(@Ctype("GLuint") int index, @Ctype("GLushort*") long v){
		try{
			glVertexAttrib4Nusv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4Nusv = createCriticalMethodHandle("c_glVertexAttrib4Nusv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4bv(@Ctype("GLuint") int index, @Ctype("GLbyte*") long v){
		try{
			glVertexAttrib4bv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4bv = createCriticalMethodHandle("c_glVertexAttrib4bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z, @Ctype("GLdouble") double w){
		try{
			glVertexAttrib4d.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4d = createCriticalMethodHandle("c_glVertexAttrib4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttrib4dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttrib4dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4dv = createCriticalMethodHandle("c_glVertexAttrib4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4f(@Ctype("GLuint") int index, @Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z, @Ctype("GLfloat") float w){
		try{
			glVertexAttrib4f.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4f = createCriticalMethodHandle("c_glVertexAttrib4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertexAttrib4fv(@Ctype("GLuint") int index, @Ctype("GLfloat*") long v){
		try{
			glVertexAttrib4fv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4fv = createCriticalMethodHandle("c_glVertexAttrib4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4iv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glVertexAttrib4iv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4iv = createCriticalMethodHandle("c_glVertexAttrib4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4s(@Ctype("GLuint") int index, @Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z, @Ctype("GLshort") short w){
		try{
			glVertexAttrib4s.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4s = createCriticalMethodHandle("c_glVertexAttrib4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertexAttrib4sv(@Ctype("GLuint") int index, @Ctype("GLshort*") long v){
		try{
			glVertexAttrib4sv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4sv = createCriticalMethodHandle("c_glVertexAttrib4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4ubv(@Ctype("GLuint") int index, @Ctype("GLubyte*") long v){
		try{
			glVertexAttrib4ubv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4ubv = createCriticalMethodHandle("c_glVertexAttrib4ubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4uiv(@Ctype("GLuint") int index, @Ctype("GLuint*") long v){
		try{
			glVertexAttrib4uiv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4uiv = createCriticalMethodHandle("c_glVertexAttrib4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttrib4usv(@Ctype("GLuint") int index, @Ctype("GLushort*") long v){
		try{
			glVertexAttrib4usv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttrib4usv = createCriticalMethodHandle("c_glVertexAttrib4usv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribPointer(@Ctype("GLuint") int index, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glVertexAttribPointer.invoke(index, size, type, normalized, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribPointer = createCriticalMethodHandle("c_glVertexAttribPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

}
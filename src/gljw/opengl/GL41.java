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
public final class GL41{

	private GL41(){throw new IllegalAccessError();}

	public static void glReleaseShaderCompiler(){
		try{
			glReleaseShaderCompiler.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glReleaseShaderCompiler = createCriticalMethodHandle("c_glReleaseShaderCompiler", FunctionDescriptor.ofVoid());

	public static void glShaderBinary(@Ctype("GLsizei") int count, @Ctype("GLuint*") long shaders, @Ctype("GLenum") int binaryFormat, @Ctype("void*") long binary, @Ctype("GLsizei") int length){
		try{
			glShaderBinary.invoke(count, shaders, binaryFormat, binary, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glShaderBinary = createCriticalMethodHandle("c_glShaderBinary", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glGetShaderPrecisionFormat(@Ctype("GLenum") int shadertype, @Ctype("GLenum") int precisiontype, @Ctype("GLint*") long range, @Ctype("GLint*") long precision){
		try{
			glGetShaderPrecisionFormat.invoke(shadertype, precisiontype, range, precision);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetShaderPrecisionFormat = createCriticalMethodHandle("c_glGetShaderPrecisionFormat", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glDepthRangef(@Ctype("GLfloat") float n, @Ctype("GLfloat") float f){
		try{
			glDepthRangef.invoke(n, f);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthRangef = createCriticalMethodHandle("c_glDepthRangef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glClearDepthf(@Ctype("GLfloat") float d){
		try{
			glClearDepthf.invoke(d);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearDepthf = createCriticalMethodHandle("c_glClearDepthf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glGetProgramBinary(@Ctype("GLuint") int program, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLenum*") long binaryFormat, @Ctype("void*") long binary){
		try{
			glGetProgramBinary.invoke(program, bufSize, length, binaryFormat, binary);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramBinary = createCriticalMethodHandle("c_glGetProgramBinary", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glProgramBinary(@Ctype("GLuint") int program, @Ctype("GLenum") int binaryFormat, @Ctype("void*") long binary, @Ctype("GLsizei") int length){
		try{
			glProgramBinary.invoke(program, binaryFormat, binary, length);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramBinary = createCriticalMethodHandle("c_glProgramBinary", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glProgramParameteri(@Ctype("GLuint") int program, @Ctype("GLenum") int pname, @Ctype("GLint") int value){
		try{
			glProgramParameteri.invoke(program, pname, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramParameteri = createCriticalMethodHandle("c_glProgramParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glUseProgramStages(@Ctype("GLuint") int pipeline, @Ctype("GLbitfield") int stages, @Ctype("GLuint") int program){
		try{
			glUseProgramStages.invoke(pipeline, stages, program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUseProgramStages = createCriticalMethodHandle("c_glUseProgramStages", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glActiveShaderProgram(@Ctype("GLuint") int pipeline, @Ctype("GLuint") int program){
		try{
			glActiveShaderProgram.invoke(pipeline, program);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glActiveShaderProgram = createCriticalMethodHandle("c_glActiveShaderProgram", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLuint") int glCreateShaderProgramv(@Ctype("GLenum") int type, @Ctype("GLsizei") int count, @Ctype("GLchar**") long strings){
		try{
			return (int)glCreateShaderProgramv.invoke(type, count, strings);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCreateShaderProgramv = createCriticalMethodHandle("c_glCreateShaderProgramv", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindProgramPipeline(@Ctype("GLuint") int pipeline){
		try{
			glBindProgramPipeline.invoke(pipeline);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindProgramPipeline = createCriticalMethodHandle("c_glBindProgramPipeline", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glDeleteProgramPipelines(@Ctype("GLsizei") int n, @Ctype("GLuint*") long pipelines){
		try{
			glDeleteProgramPipelines.invoke(n, pipelines);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteProgramPipelines = createCriticalMethodHandle("c_glDeleteProgramPipelines", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenProgramPipelines(@Ctype("GLsizei") int n, @Ctype("GLuint*") long pipelines){
		try{
			glGenProgramPipelines.invoke(n, pipelines);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenProgramPipelines = createCriticalMethodHandle("c_glGenProgramPipelines", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsProgramPipeline(@Ctype("GLuint") int pipeline){
		try{
			return (boolean)glIsProgramPipeline.invoke(pipeline);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsProgramPipeline = createCriticalMethodHandle("c_glIsProgramPipeline", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glGetProgramPipelineiv(@Ctype("GLuint") int pipeline, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetProgramPipelineiv.invoke(pipeline, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramPipelineiv = createCriticalMethodHandle("c_glGetProgramPipelineiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform1i(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLint") int v0){
		try{
			glProgramUniform1i.invoke(program, location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1i = createCriticalMethodHandle("c_glProgramUniform1i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform1iv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glProgramUniform1iv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1iv = createCriticalMethodHandle("c_glProgramUniform1iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform1f(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLfloat") float v0){
		try{
			glProgramUniform1f.invoke(program, location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1f = createCriticalMethodHandle("c_glProgramUniform1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glProgramUniform1fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glProgramUniform1fv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1fv = createCriticalMethodHandle("c_glProgramUniform1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform1d(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLdouble") double v0){
		try{
			glProgramUniform1d.invoke(program, location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1d = createCriticalMethodHandle("c_glProgramUniform1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glProgramUniform1dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glProgramUniform1dv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1dv = createCriticalMethodHandle("c_glProgramUniform1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform1ui(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLuint") int v0){
		try{
			glProgramUniform1ui.invoke(program, location, v0);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1ui = createCriticalMethodHandle("c_glProgramUniform1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform1uiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glProgramUniform1uiv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform1uiv = createCriticalMethodHandle("c_glProgramUniform1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform2i(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1){
		try{
			glProgramUniform2i.invoke(program, location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2i = createCriticalMethodHandle("c_glProgramUniform2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform2iv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glProgramUniform2iv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2iv = createCriticalMethodHandle("c_glProgramUniform2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform2f(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1){
		try{
			glProgramUniform2f.invoke(program, location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2f = createCriticalMethodHandle("c_glProgramUniform2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glProgramUniform2fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glProgramUniform2fv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2fv = createCriticalMethodHandle("c_glProgramUniform2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform2d(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLdouble") double v0, @Ctype("GLdouble") double v1){
		try{
			glProgramUniform2d.invoke(program, location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2d = createCriticalMethodHandle("c_glProgramUniform2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glProgramUniform2dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glProgramUniform2dv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2dv = createCriticalMethodHandle("c_glProgramUniform2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform2ui(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1){
		try{
			glProgramUniform2ui.invoke(program, location, v0, v1);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2ui = createCriticalMethodHandle("c_glProgramUniform2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform2uiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glProgramUniform2uiv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform2uiv = createCriticalMethodHandle("c_glProgramUniform2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform3i(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1, @Ctype("GLint") int v2){
		try{
			glProgramUniform3i.invoke(program, location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3i = createCriticalMethodHandle("c_glProgramUniform3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform3iv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glProgramUniform3iv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3iv = createCriticalMethodHandle("c_glProgramUniform3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform3f(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2){
		try{
			glProgramUniform3f.invoke(program, location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3f = createCriticalMethodHandle("c_glProgramUniform3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glProgramUniform3fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glProgramUniform3fv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3fv = createCriticalMethodHandle("c_glProgramUniform3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform3d(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLdouble") double v0, @Ctype("GLdouble") double v1, @Ctype("GLdouble") double v2){
		try{
			glProgramUniform3d.invoke(program, location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3d = createCriticalMethodHandle("c_glProgramUniform3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glProgramUniform3dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glProgramUniform3dv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3dv = createCriticalMethodHandle("c_glProgramUniform3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform3ui(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1, @Ctype("GLuint") int v2){
		try{
			glProgramUniform3ui.invoke(program, location, v0, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3ui = createCriticalMethodHandle("c_glProgramUniform3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform3uiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glProgramUniform3uiv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform3uiv = createCriticalMethodHandle("c_glProgramUniform3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform4i(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLint") int v0, @Ctype("GLint") int v1, @Ctype("GLint") int v2, @Ctype("GLint") int v3){
		try{
			glProgramUniform4i.invoke(program, location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4i = createCriticalMethodHandle("c_glProgramUniform4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform4iv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLint*") long value){
		try{
			glProgramUniform4iv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4iv = createCriticalMethodHandle("c_glProgramUniform4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform4f(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLfloat") float v0, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2, @Ctype("GLfloat") float v3){
		try{
			glProgramUniform4f.invoke(program, location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4f = createCriticalMethodHandle("c_glProgramUniform4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glProgramUniform4fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long value){
		try{
			glProgramUniform4fv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4fv = createCriticalMethodHandle("c_glProgramUniform4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform4d(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLdouble") double v0, @Ctype("GLdouble") double v1, @Ctype("GLdouble") double v2, @Ctype("GLdouble") double v3){
		try{
			glProgramUniform4d.invoke(program, location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4d = createCriticalMethodHandle("c_glProgramUniform4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glProgramUniform4dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glProgramUniform4dv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4dv = createCriticalMethodHandle("c_glProgramUniform4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniform4ui(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLuint") int v0, @Ctype("GLuint") int v1, @Ctype("GLuint") int v2, @Ctype("GLuint") int v3){
		try{
			glProgramUniform4ui.invoke(program, location, v0, v1, v2, v3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4ui = createCriticalMethodHandle("c_glProgramUniform4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glProgramUniform4uiv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLuint*") long value){
		try{
			glProgramUniform4uiv.invoke(program, location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniform4uiv = createCriticalMethodHandle("c_glProgramUniform4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix2fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2fv = createCriticalMethodHandle("c_glProgramUniformMatrix2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix3fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3fv = createCriticalMethodHandle("c_glProgramUniformMatrix3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix4fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4fv = createCriticalMethodHandle("c_glProgramUniformMatrix4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix2dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2dv = createCriticalMethodHandle("c_glProgramUniformMatrix2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix3dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3dv = createCriticalMethodHandle("c_glProgramUniformMatrix3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix4dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4dv = createCriticalMethodHandle("c_glProgramUniformMatrix4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2x3fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix2x3fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2x3fv = createCriticalMethodHandle("c_glProgramUniformMatrix2x3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3x2fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix3x2fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3x2fv = createCriticalMethodHandle("c_glProgramUniformMatrix3x2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2x4fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix2x4fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2x4fv = createCriticalMethodHandle("c_glProgramUniformMatrix2x4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4x2fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix4x2fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4x2fv = createCriticalMethodHandle("c_glProgramUniformMatrix4x2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3x4fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix3x4fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3x4fv = createCriticalMethodHandle("c_glProgramUniformMatrix3x4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4x3fv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glProgramUniformMatrix4x3fv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4x3fv = createCriticalMethodHandle("c_glProgramUniformMatrix4x3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2x3dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix2x3dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2x3dv = createCriticalMethodHandle("c_glProgramUniformMatrix2x3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3x2dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix3x2dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3x2dv = createCriticalMethodHandle("c_glProgramUniformMatrix3x2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix2x4dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix2x4dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix2x4dv = createCriticalMethodHandle("c_glProgramUniformMatrix2x4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4x2dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix4x2dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4x2dv = createCriticalMethodHandle("c_glProgramUniformMatrix4x2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix3x4dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix3x4dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix3x4dv = createCriticalMethodHandle("c_glProgramUniformMatrix3x4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glProgramUniformMatrix4x3dv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glProgramUniformMatrix4x3dv.invoke(program, location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glProgramUniformMatrix4x3dv = createCriticalMethodHandle("c_glProgramUniformMatrix4x3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glValidateProgramPipeline(@Ctype("GLuint") int pipeline){
		try{
			glValidateProgramPipeline.invoke(pipeline);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glValidateProgramPipeline = createCriticalMethodHandle("c_glValidateProgramPipeline", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glGetProgramPipelineInfoLog(@Ctype("GLuint") int pipeline, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long infoLog){
		try{
			glGetProgramPipelineInfoLog.invoke(pipeline, bufSize, length, infoLog);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramPipelineInfoLog = createCriticalMethodHandle("c_glGetProgramPipelineInfoLog", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glVertexAttribL1d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x){
		try{
			glVertexAttribL1d.invoke(index, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL1d = createCriticalMethodHandle("c_glVertexAttribL1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttribL2d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glVertexAttribL2d.invoke(index, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL2d = createCriticalMethodHandle("c_glVertexAttribL2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttribL3d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glVertexAttribL3d.invoke(index, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL3d = createCriticalMethodHandle("c_glVertexAttribL3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttribL4d(@Ctype("GLuint") int index, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z, @Ctype("GLdouble") double w){
		try{
			glVertexAttribL4d.invoke(index, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL4d = createCriticalMethodHandle("c_glVertexAttribL4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertexAttribL1dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttribL1dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL1dv = createCriticalMethodHandle("c_glVertexAttribL1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribL2dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttribL2dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL2dv = createCriticalMethodHandle("c_glVertexAttribL2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribL3dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttribL3dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL3dv = createCriticalMethodHandle("c_glVertexAttribL3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribL4dv(@Ctype("GLuint") int index, @Ctype("GLdouble*") long v){
		try{
			glVertexAttribL4dv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribL4dv = createCriticalMethodHandle("c_glVertexAttribL4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribLPointer(@Ctype("GLuint") int index, @Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glVertexAttribLPointer.invoke(index, size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribLPointer = createCriticalMethodHandle("c_glVertexAttribLPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetVertexAttribLdv(@Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLdouble*") long params){
		try{
			glGetVertexAttribLdv.invoke(index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetVertexAttribLdv = createCriticalMethodHandle("c_glGetVertexAttribLdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glViewportArrayv(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLfloat*") long v){
		try{
			glViewportArrayv.invoke(first, count, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glViewportArrayv = createCriticalMethodHandle("c_glViewportArrayv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glViewportIndexedf(@Ctype("GLuint") int index, @Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float w, @Ctype("GLfloat") float h){
		try{
			glViewportIndexedf.invoke(index, x, y, w, h);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glViewportIndexedf = createCriticalMethodHandle("c_glViewportIndexedf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glViewportIndexedfv(@Ctype("GLuint") int index, @Ctype("GLfloat*") long v){
		try{
			glViewportIndexedfv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glViewportIndexedfv = createCriticalMethodHandle("c_glViewportIndexedfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glScissorArrayv(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLint*") long v){
		try{
			glScissorArrayv.invoke(first, count, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScissorArrayv = createCriticalMethodHandle("c_glScissorArrayv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glScissorIndexed(@Ctype("GLuint") int index, @Ctype("GLint") int left, @Ctype("GLint") int bottom, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glScissorIndexed.invoke(index, left, bottom, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScissorIndexed = createCriticalMethodHandle("c_glScissorIndexed", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glScissorIndexedv(@Ctype("GLuint") int index, @Ctype("GLint*") long v){
		try{
			glScissorIndexedv.invoke(index, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScissorIndexedv = createCriticalMethodHandle("c_glScissorIndexedv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDepthRangeArrayv(@Ctype("GLuint") int first, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long v){
		try{
			glDepthRangeArrayv.invoke(first, count, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthRangeArrayv = createCriticalMethodHandle("c_glDepthRangeArrayv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDepthRangeIndexed(@Ctype("GLuint") int index, @Ctype("GLdouble") double n, @Ctype("GLdouble") double f){
		try{
			glDepthRangeIndexed.invoke(index, n, f);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthRangeIndexed = createCriticalMethodHandle("c_glDepthRangeIndexed", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glGetFloati_v(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLfloat*") long data){
		try{
			glGetFloati_v.invoke(target, index, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFloati_v = createCriticalMethodHandle("c_glGetFloati_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetDoublei_v(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLdouble*") long data){
		try{
			glGetDoublei_v.invoke(target, index, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetDoublei_v = createCriticalMethodHandle("c_glGetDoublei_v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

}
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
public final class GL40{

	private GL40(){throw new IllegalAccessError();}

	public static void glMinSampleShading(@Ctype("GLfloat") float value){
		try{
			glMinSampleShading.invoke(value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMinSampleShading = createCriticalMethodHandle("c_glMinSampleShading", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glBlendEquationi(@Ctype("GLuint") int buf, @Ctype("GLenum") int mode){
		try{
			glBlendEquationi.invoke(buf, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendEquationi = createCriticalMethodHandle("c_glBlendEquationi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBlendEquationSeparatei(@Ctype("GLuint") int buf, @Ctype("GLenum") int modeRGB, @Ctype("GLenum") int modeAlpha){
		try{
			glBlendEquationSeparatei.invoke(buf, modeRGB, modeAlpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendEquationSeparatei = createCriticalMethodHandle("c_glBlendEquationSeparatei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBlendFunci(@Ctype("GLuint") int buf, @Ctype("GLenum") int src, @Ctype("GLenum") int dst){
		try{
			glBlendFunci.invoke(buf, src, dst);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendFunci = createCriticalMethodHandle("c_glBlendFunci", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBlendFuncSeparatei(@Ctype("GLuint") int buf, @Ctype("GLenum") int srcRGB, @Ctype("GLenum") int dstRGB, @Ctype("GLenum") int srcAlpha, @Ctype("GLenum") int dstAlpha){
		try{
			glBlendFuncSeparatei.invoke(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendFuncSeparatei = createCriticalMethodHandle("c_glBlendFuncSeparatei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawArraysIndirect(@Ctype("GLenum") int mode, @Ctype("void*") long indirect){
		try{
			glDrawArraysIndirect.invoke(mode, indirect);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawArraysIndirect = createCriticalMethodHandle("c_glDrawArraysIndirect", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDrawElementsIndirect(@Ctype("GLenum") int mode, @Ctype("GLenum") int type, @Ctype("void*") long indirect){
		try{
			glDrawElementsIndirect.invoke(mode, type, indirect);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElementsIndirect = createCriticalMethodHandle("c_glDrawElementsIndirect", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform1d(@Ctype("GLint") int location, @Ctype("GLdouble") double x){
		try{
			glUniform1d.invoke(location, x);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1d = createCriticalMethodHandle("c_glUniform1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glUniform2d(@Ctype("GLint") int location, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glUniform2d.invoke(location, x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2d = createCriticalMethodHandle("c_glUniform2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glUniform3d(@Ctype("GLint") int location, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glUniform3d.invoke(location, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3d = createCriticalMethodHandle("c_glUniform3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glUniform4d(@Ctype("GLint") int location, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z, @Ctype("GLdouble") double w){
		try{
			glUniform4d.invoke(location, x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4d = createCriticalMethodHandle("c_glUniform4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glUniform1dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glUniform1dv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform1dv = createCriticalMethodHandle("c_glUniform1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform2dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glUniform2dv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform2dv = createCriticalMethodHandle("c_glUniform2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform3dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glUniform3dv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform3dv = createCriticalMethodHandle("c_glUniform3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniform4dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLdouble*") long value){
		try{
			glUniform4dv.invoke(location, count, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniform4dv = createCriticalMethodHandle("c_glUniform4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix2dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix2dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2dv = createCriticalMethodHandle("c_glUniformMatrix2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix3dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3dv = createCriticalMethodHandle("c_glUniformMatrix3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix4dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4dv = createCriticalMethodHandle("c_glUniformMatrix4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix2x3dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix2x3dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2x3dv = createCriticalMethodHandle("c_glUniformMatrix2x3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix2x4dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix2x4dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2x4dv = createCriticalMethodHandle("c_glUniformMatrix2x4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3x2dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix3x2dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3x2dv = createCriticalMethodHandle("c_glUniformMatrix3x2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3x4dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix3x4dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3x4dv = createCriticalMethodHandle("c_glUniformMatrix3x4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4x2dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix4x2dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4x2dv = createCriticalMethodHandle("c_glUniformMatrix4x2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4x3dv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLdouble*") long value){
		try{
			glUniformMatrix4x3dv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4x3dv = createCriticalMethodHandle("c_glUniformMatrix4x3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glGetUniformdv(@Ctype("GLuint") int program, @Ctype("GLint") int location, @Ctype("GLdouble*") long params){
		try{
			glGetUniformdv.invoke(program, location, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformdv = createCriticalMethodHandle("c_glGetUniformdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetSubroutineUniformLocation(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLchar*") long name){
		try{
			return (int)glGetSubroutineUniformLocation.invoke(program, shadertype, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSubroutineUniformLocation = createCriticalMethodHandle("c_glGetSubroutineUniformLocation", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLuint") int glGetSubroutineIndex(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLchar*") long name){
		try{
			return (int)glGetSubroutineIndex.invoke(program, shadertype, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSubroutineIndex = createCriticalMethodHandle("c_glGetSubroutineIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveSubroutineUniformiv(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint*") long values){
		try{
			glGetActiveSubroutineUniformiv.invoke(program, shadertype, index, pname, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveSubroutineUniformiv = createCriticalMethodHandle("c_glGetActiveSubroutineUniformiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetActiveSubroutineUniformName(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long name){
		try{
			glGetActiveSubroutineUniformName.invoke(program, shadertype, index, bufSize, length, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveSubroutineUniformName = createCriticalMethodHandle("c_glGetActiveSubroutineUniformName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetActiveSubroutineName(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLuint") int index, @Ctype("GLsizei") int bufSize, @Ctype("GLsizei*") long length, @Ctype("GLchar*") long name){
		try{
			glGetActiveSubroutineName.invoke(program, shadertype, index, bufSize, length, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetActiveSubroutineName = createCriticalMethodHandle("c_glGetActiveSubroutineName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glUniformSubroutinesuiv(@Ctype("GLenum") int shadertype, @Ctype("GLsizei") int count, @Ctype("GLuint*") long indices){
		try{
			glUniformSubroutinesuiv.invoke(shadertype, count, indices);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformSubroutinesuiv = createCriticalMethodHandle("c_glUniformSubroutinesuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetUniformSubroutineuiv(@Ctype("GLenum") int shadertype, @Ctype("GLint") int location, @Ctype("GLuint*") long params){
		try{
			glGetUniformSubroutineuiv.invoke(shadertype, location, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetUniformSubroutineuiv = createCriticalMethodHandle("c_glGetUniformSubroutineuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetProgramStageiv(@Ctype("GLuint") int program, @Ctype("GLenum") int shadertype, @Ctype("GLenum") int pname, @Ctype("GLint*") long values){
		try{
			glGetProgramStageiv.invoke(program, shadertype, pname, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetProgramStageiv = createCriticalMethodHandle("c_glGetProgramStageiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPatchParameteri(@Ctype("GLenum") int pname, @Ctype("GLint") int value){
		try{
			glPatchParameteri.invoke(pname, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPatchParameteri = createCriticalMethodHandle("c_glPatchParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glPatchParameterfv(@Ctype("GLenum") int pname, @Ctype("GLfloat*") long values){
		try{
			glPatchParameterfv.invoke(pname, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPatchParameterfv = createCriticalMethodHandle("c_glPatchParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindTransformFeedback(@Ctype("GLenum") int target, @Ctype("GLuint") int id){
		try{
			glBindTransformFeedback.invoke(target, id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindTransformFeedback = createCriticalMethodHandle("c_glBindTransformFeedback", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteTransformFeedbacks(@Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glDeleteTransformFeedbacks.invoke(n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteTransformFeedbacks = createCriticalMethodHandle("c_glDeleteTransformFeedbacks", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenTransformFeedbacks(@Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glGenTransformFeedbacks.invoke(n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenTransformFeedbacks = createCriticalMethodHandle("c_glGenTransformFeedbacks", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsTransformFeedback(@Ctype("GLuint") int id){
		try{
			return (boolean)glIsTransformFeedback.invoke(id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsTransformFeedback = createCriticalMethodHandle("c_glIsTransformFeedback", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glPauseTransformFeedback(){
		try{
			glPauseTransformFeedback.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPauseTransformFeedback = createCriticalMethodHandle("c_glPauseTransformFeedback", FunctionDescriptor.ofVoid());

	public static void glResumeTransformFeedback(){
		try{
			glResumeTransformFeedback.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glResumeTransformFeedback = createCriticalMethodHandle("c_glResumeTransformFeedback", FunctionDescriptor.ofVoid());

	public static void glDrawTransformFeedback(@Ctype("GLenum") int mode, @Ctype("GLuint") int id){
		try{
			glDrawTransformFeedback.invoke(mode, id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawTransformFeedback = createCriticalMethodHandle("c_glDrawTransformFeedback", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawTransformFeedbackStream(@Ctype("GLenum") int mode, @Ctype("GLuint") int id, @Ctype("GLuint") int stream){
		try{
			glDrawTransformFeedbackStream.invoke(mode, id, stream);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawTransformFeedbackStream = createCriticalMethodHandle("c_glDrawTransformFeedbackStream", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glBeginQueryIndexed(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLuint") int id){
		try{
			glBeginQueryIndexed.invoke(target, index, id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBeginQueryIndexed = createCriticalMethodHandle("c_glBeginQueryIndexed", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEndQueryIndexed(@Ctype("GLenum") int target, @Ctype("GLuint") int index){
		try{
			glEndQueryIndexed.invoke(target, index);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEndQueryIndexed = createCriticalMethodHandle("c_glEndQueryIndexed", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetQueryIndexediv(@Ctype("GLenum") int target, @Ctype("GLuint") int index, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetQueryIndexediv.invoke(target, index, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryIndexediv = createCriticalMethodHandle("c_glGetQueryIndexediv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

}
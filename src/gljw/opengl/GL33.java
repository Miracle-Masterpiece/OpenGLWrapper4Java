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
public final class GL33{

	private GL33(){throw new IllegalAccessError();}

	public static void glBindFragDataLocationIndexed(@Ctype("GLuint") int program, @Ctype("GLuint") int colorNumber, @Ctype("GLuint") int index, @Ctype("GLchar*") long name){
		try{
			glBindFragDataLocationIndexed.invoke(program, colorNumber, index, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindFragDataLocationIndexed = createCriticalMethodHandle("c_glBindFragDataLocationIndexed", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glGetFragDataIndex(@Ctype("GLuint") int program, @Ctype("GLchar*") long name){
		try{
			return (int)glGetFragDataIndex.invoke(program, name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFragDataIndex = createCriticalMethodHandle("c_glGetFragDataIndex", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenSamplers(@Ctype("GLsizei") int count, @Ctype("GLuint*") long samplers){
		try{
			glGenSamplers.invoke(count, samplers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenSamplers = createCriticalMethodHandle("c_glGenSamplers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDeleteSamplers(@Ctype("GLsizei") int count, @Ctype("GLuint*") long samplers){
		try{
			glDeleteSamplers.invoke(count, samplers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteSamplers = createCriticalMethodHandle("c_glDeleteSamplers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsSampler(@Ctype("GLuint") int sampler){
		try{
			return (boolean)glIsSampler.invoke(sampler);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsSampler = createCriticalMethodHandle("c_glIsSampler", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glBindSampler(@Ctype("GLuint") int unit, @Ctype("GLuint") int sampler){
		try{
			glBindSampler.invoke(unit, sampler);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindSampler = createCriticalMethodHandle("c_glBindSampler", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glSamplerParameteri(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glSamplerParameteri.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameteri = createCriticalMethodHandle("c_glSamplerParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glSamplerParameteriv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glSamplerParameteriv.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameteriv = createCriticalMethodHandle("c_glSamplerParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSamplerParameterf(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glSamplerParameterf.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameterf = createCriticalMethodHandle("c_glSamplerParameterf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glSamplerParameterfv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long param){
		try{
			glSamplerParameterfv.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameterfv = createCriticalMethodHandle("c_glSamplerParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSamplerParameterIiv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLint*") long param){
		try{
			glSamplerParameterIiv.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameterIiv = createCriticalMethodHandle("c_glSamplerParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSamplerParameterIuiv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLuint*") long param){
		try{
			glSamplerParameterIuiv.invoke(sampler, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSamplerParameterIuiv = createCriticalMethodHandle("c_glSamplerParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetSamplerParameteriv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetSamplerParameteriv.invoke(sampler, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSamplerParameteriv = createCriticalMethodHandle("c_glGetSamplerParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetSamplerParameterIiv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetSamplerParameterIiv.invoke(sampler, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSamplerParameterIiv = createCriticalMethodHandle("c_glGetSamplerParameterIiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetSamplerParameterfv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetSamplerParameterfv.invoke(sampler, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSamplerParameterfv = createCriticalMethodHandle("c_glGetSamplerParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetSamplerParameterIuiv(@Ctype("GLuint") int sampler, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glGetSamplerParameterIuiv.invoke(sampler, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetSamplerParameterIuiv = createCriticalMethodHandle("c_glGetSamplerParameterIuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glQueryCounter(@Ctype("GLuint") int id, @Ctype("GLenum") int target){
		try{
			glQueryCounter.invoke(id, target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glQueryCounter = createCriticalMethodHandle("c_glQueryCounter", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glGetQueryObjecti64v(@Ctype("GLuint") int id, @Ctype("GLenum") int pname, @Ctype("GLint64*") long params){
		try{
			glGetQueryObjecti64v.invoke(id, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryObjecti64v = createCriticalMethodHandle("c_glGetQueryObjecti64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryObjectui64v(@Ctype("GLuint") int id, @Ctype("GLenum") int pname, @Ctype("GLuint64*") long params){
		try{
			glGetQueryObjectui64v.invoke(id, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryObjectui64v = createCriticalMethodHandle("c_glGetQueryObjectui64v", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexAttribDivisor(@Ctype("GLuint") int index, @Ctype("GLuint") int divisor){
		try{
			glVertexAttribDivisor.invoke(index, divisor);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribDivisor = createCriticalMethodHandle("c_glVertexAttribDivisor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexAttribP1ui(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int value){
		try{
			glVertexAttribP1ui.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP1ui = createCriticalMethodHandle("c_glVertexAttribP1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexAttribP1uiv(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint*") long value){
		try{
			glVertexAttribP1uiv.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP1uiv = createCriticalMethodHandle("c_glVertexAttribP1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glVertexAttribP2ui(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int value){
		try{
			glVertexAttribP2ui.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP2ui = createCriticalMethodHandle("c_glVertexAttribP2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexAttribP2uiv(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint*") long value){
		try{
			glVertexAttribP2uiv.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP2uiv = createCriticalMethodHandle("c_glVertexAttribP2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glVertexAttribP3ui(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int value){
		try{
			glVertexAttribP3ui.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP3ui = createCriticalMethodHandle("c_glVertexAttribP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexAttribP3uiv(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint*") long value){
		try{
			glVertexAttribP3uiv.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP3uiv = createCriticalMethodHandle("c_glVertexAttribP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glVertexAttribP4ui(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint") int value){
		try{
			glVertexAttribP4ui.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP4ui = createCriticalMethodHandle("c_glVertexAttribP4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glVertexAttribP4uiv(@Ctype("GLuint") int index, @Ctype("GLenum") int type, @Ctype("GLboolean") boolean normalized, @Ctype("GLuint*") long value){
		try{
			glVertexAttribP4uiv.invoke(index, type, normalized, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexAttribP4uiv = createCriticalMethodHandle("c_glVertexAttribP4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glVertexP2ui(@Ctype("GLenum") int type, @Ctype("GLuint") int value){
		try{
			glVertexP2ui.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP2ui = createCriticalMethodHandle("c_glVertexP2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexP2uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long value){
		try{
			glVertexP2uiv.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP2uiv = createCriticalMethodHandle("c_glVertexP2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexP3ui(@Ctype("GLenum") int type, @Ctype("GLuint") int value){
		try{
			glVertexP3ui.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP3ui = createCriticalMethodHandle("c_glVertexP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexP3uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long value){
		try{
			glVertexP3uiv.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP3uiv = createCriticalMethodHandle("c_glVertexP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexP4ui(@Ctype("GLenum") int type, @Ctype("GLuint") int value){
		try{
			glVertexP4ui.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP4ui = createCriticalMethodHandle("c_glVertexP4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertexP4uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long value){
		try{
			glVertexP4uiv.invoke(type, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexP4uiv = createCriticalMethodHandle("c_glVertexP4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexCoordP1ui(@Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glTexCoordP1ui.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP1ui = createCriticalMethodHandle("c_glTexCoordP1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoordP1uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glTexCoordP1uiv.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP1uiv = createCriticalMethodHandle("c_glTexCoordP1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexCoordP2ui(@Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glTexCoordP2ui.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP2ui = createCriticalMethodHandle("c_glTexCoordP2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoordP2uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glTexCoordP2uiv.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP2uiv = createCriticalMethodHandle("c_glTexCoordP2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexCoordP3ui(@Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glTexCoordP3ui.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP3ui = createCriticalMethodHandle("c_glTexCoordP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoordP3uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glTexCoordP3uiv.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP3uiv = createCriticalMethodHandle("c_glTexCoordP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexCoordP4ui(@Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glTexCoordP4ui.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP4ui = createCriticalMethodHandle("c_glTexCoordP4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoordP4uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glTexCoordP4uiv.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordP4uiv = createCriticalMethodHandle("c_glTexCoordP4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoordP1ui(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glMultiTexCoordP1ui.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP1ui = createCriticalMethodHandle("c_glMultiTexCoordP1ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoordP1uiv(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glMultiTexCoordP1uiv.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP1uiv = createCriticalMethodHandle("c_glMultiTexCoordP1uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoordP2ui(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glMultiTexCoordP2ui.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP2ui = createCriticalMethodHandle("c_glMultiTexCoordP2ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoordP2uiv(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glMultiTexCoordP2uiv.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP2uiv = createCriticalMethodHandle("c_glMultiTexCoordP2uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoordP3ui(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glMultiTexCoordP3ui.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP3ui = createCriticalMethodHandle("c_glMultiTexCoordP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoordP3uiv(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glMultiTexCoordP3uiv.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP3uiv = createCriticalMethodHandle("c_glMultiTexCoordP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoordP4ui(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glMultiTexCoordP4ui.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP4ui = createCriticalMethodHandle("c_glMultiTexCoordP4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoordP4uiv(@Ctype("GLenum") int texture, @Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glMultiTexCoordP4uiv.invoke(texture, type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoordP4uiv = createCriticalMethodHandle("c_glMultiTexCoordP4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNormalP3ui(@Ctype("GLenum") int type, @Ctype("GLuint") int coords){
		try{
			glNormalP3ui.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormalP3ui = createCriticalMethodHandle("c_glNormalP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNormalP3uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long coords){
		try{
			glNormalP3uiv.invoke(type, coords);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormalP3uiv = createCriticalMethodHandle("c_glNormalP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glColorP3ui(@Ctype("GLenum") int type, @Ctype("GLuint") int color){
		try{
			glColorP3ui.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorP3ui = createCriticalMethodHandle("c_glColorP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColorP3uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long color){
		try{
			glColorP3uiv.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorP3uiv = createCriticalMethodHandle("c_glColorP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glColorP4ui(@Ctype("GLenum") int type, @Ctype("GLuint") int color){
		try{
			glColorP4ui.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorP4ui = createCriticalMethodHandle("c_glColorP4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColorP4uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long color){
		try{
			glColorP4uiv.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorP4uiv = createCriticalMethodHandle("c_glColorP4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSecondaryColorP3ui(@Ctype("GLenum") int type, @Ctype("GLuint") int color){
		try{
			glSecondaryColorP3ui.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColorP3ui = createCriticalMethodHandle("c_glSecondaryColorP3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glSecondaryColorP3uiv(@Ctype("GLenum") int type, @Ctype("GLuint*") long color){
		try{
			glSecondaryColorP3uiv.invoke(type, color);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColorP3uiv = createCriticalMethodHandle("c_glSecondaryColorP3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

}
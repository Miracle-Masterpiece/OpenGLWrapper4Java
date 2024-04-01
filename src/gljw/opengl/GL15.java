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
public final class GL15{

	private GL15(){throw new IllegalAccessError();}

	public static void glGenQueries(@Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glGenQueries.invoke(n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenQueries = createCriticalMethodHandle("c_glGenQueries", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDeleteQueries(@Ctype("GLsizei") int n, @Ctype("GLuint*") long ids){
		try{
			glDeleteQueries.invoke(n, ids);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteQueries = createCriticalMethodHandle("c_glDeleteQueries", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsQuery(@Ctype("GLuint") int id){
		try{
			return (boolean)glIsQuery.invoke(id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsQuery = createCriticalMethodHandle("c_glIsQuery", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glBeginQuery(@Ctype("GLenum") int target, @Ctype("GLuint") int id){
		try{
			glBeginQuery.invoke(target, id);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBeginQuery = createCriticalMethodHandle("c_glBeginQuery", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEndQuery(@Ctype("GLenum") int target){
		try{
			glEndQuery.invoke(target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEndQuery = createCriticalMethodHandle("c_glEndQuery", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glGetQueryiv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetQueryiv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryiv = createCriticalMethodHandle("c_glGetQueryiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryObjectiv(@Ctype("GLuint") int id, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetQueryObjectiv.invoke(id, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryObjectiv = createCriticalMethodHandle("c_glGetQueryObjectiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetQueryObjectuiv(@Ctype("GLuint") int id, @Ctype("GLenum") int pname, @Ctype("GLuint*") long params){
		try{
			glGetQueryObjectuiv.invoke(id, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetQueryObjectuiv = createCriticalMethodHandle("c_glGetQueryObjectuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindBuffer(@Ctype("GLenum") int target, @Ctype("GLuint") int buffer){
		try{
			glBindBuffer.invoke(target, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindBuffer = createCriticalMethodHandle("c_glBindBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteBuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long buffers){
		try{
			glDeleteBuffers.invoke(n, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteBuffers = createCriticalMethodHandle("c_glDeleteBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenBuffers(@Ctype("GLsizei") int n, @Ctype("GLuint*") long buffers){
		try{
			glGenBuffers.invoke(n, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenBuffers = createCriticalMethodHandle("c_glGenBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsBuffer(@Ctype("GLuint") int buffer){
		try{
			return (boolean)glIsBuffer.invoke(buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsBuffer = createCriticalMethodHandle("c_glIsBuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glBufferData(@Ctype("GLenum") int target, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data, @Ctype("GLenum") int usage){
		try{
			glBufferData.invoke(target, size, data, usage);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBufferData = createCriticalMethodHandle("c_glBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glBufferSubData(@Ctype("GLenum") int target, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data){
		try{
			glBufferSubData.invoke(target, offset, size, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBufferSubData = createCriticalMethodHandle("c_glBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glGetBufferSubData(@Ctype("GLenum") int target, @Ctype("GLintptr") long offset, @Ctype("GLsizeiptr") long size, @Ctype("void*") long data){
		try{
			glGetBufferSubData.invoke(target, offset, size, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBufferSubData = createCriticalMethodHandle("c_glGetBufferSubData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static @Ctype("void*")long glMapBuffer(@Ctype("GLenum") int target, @Ctype("GLenum") int access){
		try{
			return (long)glMapBuffer.invoke(target, access);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapBuffer = createCriticalMethodHandle("c_glMapBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLboolean") boolean glUnmapBuffer(@Ctype("GLenum") int target){
		try{
			return (boolean)glUnmapBuffer.invoke(target);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUnmapBuffer = createCriticalMethodHandle("c_glUnmapBuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glGetBufferParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetBufferParameteriv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBufferParameteriv = createCriticalMethodHandle("c_glGetBufferParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetBufferPointerv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("void**") long params){
		try{
			glGetBufferPointerv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBufferPointerv = createCriticalMethodHandle("c_glGetBufferPointerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

}
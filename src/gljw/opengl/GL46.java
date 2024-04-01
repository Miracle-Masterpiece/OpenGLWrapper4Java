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
public final class GL46{

	private GL46(){throw new IllegalAccessError();}

	public static void glSpecializeShader(@Ctype("GLuint") int shader, @Ctype("GLchar*") long pEntryPoint, @Ctype("GLuint") int numSpecializationConstants, @Ctype("GLuint*") long pConstantIndex, @Ctype("GLuint*") long pConstantValue){
		try{
			glSpecializeShader.invoke(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSpecializeShader = createCriticalMethodHandle("c_glSpecializeShader", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glMultiDrawArraysIndirectCount(@Ctype("GLenum") int mode, @Ctype("void*") long indirect, @Ctype("GLintptr") long drawcount, @Ctype("GLsizei") int maxdrawcount, @Ctype("GLsizei") int stride){
		try{
			glMultiDrawArraysIndirectCount.invoke(mode, indirect, drawcount, maxdrawcount, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawArraysIndirectCount = createCriticalMethodHandle("c_glMultiDrawArraysIndirectCount", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiDrawElementsIndirectCount(@Ctype("GLenum") int mode, @Ctype("GLenum") int type, @Ctype("void*") long indirect, @Ctype("GLintptr") long drawcount, @Ctype("GLsizei") int maxdrawcount, @Ctype("GLsizei") int stride){
		try{
			glMultiDrawElementsIndirectCount.invoke(mode, type, indirect, drawcount, maxdrawcount, stride);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawElementsIndirectCount = createCriticalMethodHandle("c_glMultiDrawElementsIndirectCount", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glPolygonOffsetClamp(@Ctype("GLfloat") float factor, @Ctype("GLfloat") float units, @Ctype("GLfloat") float clamp){
		try{
			glPolygonOffsetClamp.invoke(factor, units, clamp);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPolygonOffsetClamp = createCriticalMethodHandle("c_glPolygonOffsetClamp", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

}
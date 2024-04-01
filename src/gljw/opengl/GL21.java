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
public final class GL21{

	private GL21(){throw new IllegalAccessError();}

	public static void glUniformMatrix2x3fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix2x3fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2x3fv = createCriticalMethodHandle("c_glUniformMatrix2x3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3x2fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix3x2fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3x2fv = createCriticalMethodHandle("c_glUniformMatrix3x2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix2x4fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix2x4fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix2x4fv = createCriticalMethodHandle("c_glUniformMatrix2x4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4x2fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix4x2fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4x2fv = createCriticalMethodHandle("c_glUniformMatrix4x2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix3x4fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix3x4fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix3x4fv = createCriticalMethodHandle("c_glUniformMatrix3x4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static void glUniformMatrix4x3fv(@Ctype("GLint") int location, @Ctype("GLsizei") int count, @Ctype("GLboolean") boolean transpose, @Ctype("GLfloat*") long value){
		try{
			glUniformMatrix4x3fv.invoke(location, count, transpose, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glUniformMatrix4x3fv = createCriticalMethodHandle("c_glUniformMatrix4x3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

}
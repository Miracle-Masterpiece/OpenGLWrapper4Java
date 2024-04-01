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
public final class GL12{

	private GL12(){throw new IllegalAccessError();}

	public static void glDrawRangeElements(@Ctype("GLenum") int mode, @Ctype("GLuint") int start, @Ctype("GLuint") int end, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices){
		try{
			glDrawRangeElements.invoke(mode, start, end, count, type, indices);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawRangeElements = createCriticalMethodHandle("c_glDrawRangeElements", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexImage3D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLint") int border, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexImage3D.invoke(target, level, internalformat, width, height, depth, border, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexImage3D = createCriticalMethodHandle("c_glTexImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexSubImage3D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexSubImage3D.invoke(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexSubImage3D = createCriticalMethodHandle("c_glTexSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCopyTexSubImage3D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glCopyTexSubImage3D.invoke(target, level, xoffset, yoffset, zoffset, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTexSubImage3D = createCriticalMethodHandle("c_glCopyTexSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

}
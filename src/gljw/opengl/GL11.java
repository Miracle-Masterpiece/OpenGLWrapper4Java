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
public final class GL11{

	private GL11(){throw new IllegalAccessError();}

	public static void glDrawArrays(@Ctype("GLenum") int mode, @Ctype("GLint") int first, @Ctype("GLsizei") int count){
		try{
			glDrawArrays.invoke(mode, first, count);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawArrays = createCriticalMethodHandle("c_glDrawArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawElements(@Ctype("GLenum") int mode, @Ctype("GLsizei") int count, @Ctype("GLenum") int type, @Ctype("void*") long indices){
		try{
			glDrawElements.invoke(mode, count, type, indices);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawElements = createCriticalMethodHandle("c_glDrawElements", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetPointerv(@Ctype("GLenum") int pname, @Ctype("void**") long params){
		try{
			glGetPointerv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetPointerv = createCriticalMethodHandle("c_glGetPointerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPolygonOffset(@Ctype("GLfloat") float factor, @Ctype("GLfloat") float units){
		try{
			glPolygonOffset.invoke(factor, units);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPolygonOffset = createCriticalMethodHandle("c_glPolygonOffset", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glCopyTexImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int internalformat, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLint") int border){
		try{
			glCopyTexImage1D.invoke(target, level, internalformat, x, y, width, border);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTexImage1D = createCriticalMethodHandle("c_glCopyTexImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCopyTexImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int internalformat, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLint") int border){
		try{
			glCopyTexImage2D.invoke(target, level, internalformat, x, y, width, height, border);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTexImage2D = createCriticalMethodHandle("c_glCopyTexImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCopyTexSubImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width){
		try{
			glCopyTexSubImage1D.invoke(target, level, xoffset, x, y, width);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTexSubImage1D = createCriticalMethodHandle("c_glCopyTexSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glCopyTexSubImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glCopyTexSubImage2D.invoke(target, level, xoffset, yoffset, x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyTexSubImage2D = createCriticalMethodHandle("c_glCopyTexSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexSubImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLsizei") int width, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexSubImage1D.invoke(target, level, xoffset, width, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexSubImage1D = createCriticalMethodHandle("c_glTexSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexSubImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexSubImage2D.invoke(target, level, xoffset, yoffset, width, height, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexSubImage2D = createCriticalMethodHandle("c_glTexSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glBindTexture(@Ctype("GLenum") int target, @Ctype("GLuint") int texture){
		try{
			glBindTexture.invoke(target, texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBindTexture = createCriticalMethodHandle("c_glBindTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDeleteTextures(@Ctype("GLsizei") int n, @Ctype("GLuint*") long textures){
		try{
			glDeleteTextures.invoke(n, textures);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteTextures = createCriticalMethodHandle("c_glDeleteTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGenTextures(@Ctype("GLsizei") int n, @Ctype("GLuint*") long textures){
		try{
			glGenTextures.invoke(n, textures);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenTextures = createCriticalMethodHandle("c_glGenTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsTexture(@Ctype("GLuint") int texture){
		try{
			return (boolean)glIsTexture.invoke(texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsTexture = createCriticalMethodHandle("c_glIsTexture", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glArrayElement(@Ctype("GLint") int i){
		try{
			glArrayElement.invoke(i);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glArrayElement = createCriticalMethodHandle("c_glArrayElement", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glColorPointer(@Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glColorPointer.invoke(size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorPointer = createCriticalMethodHandle("c_glColorPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDisableClientState(@Ctype("GLenum") int array){
		try{
			glDisableClientState.invoke(array);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDisableClientState = createCriticalMethodHandle("c_glDisableClientState", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glEdgeFlagPointer(@Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glEdgeFlagPointer.invoke(stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEdgeFlagPointer = createCriticalMethodHandle("c_glEdgeFlagPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glEnableClientState(@Ctype("GLenum") int array){
		try{
			glEnableClientState.invoke(array);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnableClientState = createCriticalMethodHandle("c_glEnableClientState", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glIndexPointer(@Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glIndexPointer.invoke(type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexPointer = createCriticalMethodHandle("c_glIndexPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glInterleavedArrays(@Ctype("GLenum") int format, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glInterleavedArrays.invoke(format, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInterleavedArrays = createCriticalMethodHandle("c_glInterleavedArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glNormalPointer(@Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glNormalPointer.invoke(type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormalPointer = createCriticalMethodHandle("c_glNormalPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexCoordPointer(@Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glTexCoordPointer.invoke(size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoordPointer = createCriticalMethodHandle("c_glTexCoordPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glVertexPointer(@Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glVertexPointer.invoke(size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertexPointer = createCriticalMethodHandle("c_glVertexPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glAreTexturesResident(@Ctype("GLsizei") int n, @Ctype("GLuint*") long textures, @Ctype("GLboolean*") long residences){
		try{
			return (boolean)glAreTexturesResident.invoke(n, textures, residences);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glAreTexturesResident = createCriticalMethodHandle("c_glAreTexturesResident", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glPrioritizeTextures(@Ctype("GLsizei") int n, @Ctype("GLuint*") long textures, @Ctype("GLfloat*") long priorities){
		try{
			glPrioritizeTextures.invoke(n, textures, priorities);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPrioritizeTextures = createCriticalMethodHandle("c_glPrioritizeTextures", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glIndexub(@Ctype("GLubyte") byte c){
		try{
			glIndexub.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexub = createCriticalMethodHandle("c_glIndexub", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));

	public static void glIndexubv(@Ctype("GLubyte*") long c){
		try{
			glIndexubv.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexubv = createCriticalMethodHandle("c_glIndexubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glPopClientAttrib(){
		try{
			glPopClientAttrib.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPopClientAttrib = createCriticalMethodHandle("c_glPopClientAttrib", FunctionDescriptor.ofVoid());

	public static void glPushClientAttrib(@Ctype("GLbitfield") int mask){
		try{
			glPushClientAttrib.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPushClientAttrib = createCriticalMethodHandle("c_glPushClientAttrib", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

}
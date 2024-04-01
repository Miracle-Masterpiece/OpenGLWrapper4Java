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
public final class GL13{

	private GL13(){throw new IllegalAccessError();}

	public static void glActiveTexture(@Ctype("GLenum") int texture){
		try{
			glActiveTexture.invoke(texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glActiveTexture = createCriticalMethodHandle("c_glActiveTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glSampleCoverage(@Ctype("GLfloat") float value, @Ctype("GLboolean") boolean invert){
		try{
			glSampleCoverage.invoke(value, invert);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSampleCoverage = createCriticalMethodHandle("c_glSampleCoverage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BOOLEAN));

	public static void glCompressedTexImage3D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLint") int border, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexImage3D.invoke(target, level, internalformat, width, height, depth, border, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexImage3D = createCriticalMethodHandle("c_glCompressedTexImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTexImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLint") int border, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexImage2D.invoke(target, level, internalformat, width, height, border, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexImage2D = createCriticalMethodHandle("c_glCompressedTexImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTexImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLint") int border, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexImage1D.invoke(target, level, internalformat, width, border, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexImage1D = createCriticalMethodHandle("c_glCompressedTexImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTexSubImage3D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLint") int zoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLsizei") int depth, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexSubImage3D.invoke(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexSubImage3D = createCriticalMethodHandle("c_glCompressedTexSubImage3D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTexSubImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLint") int yoffset, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexSubImage2D.invoke(target, level, xoffset, yoffset, width, height, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexSubImage2D = createCriticalMethodHandle("c_glCompressedTexSubImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCompressedTexSubImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int xoffset, @Ctype("GLsizei") int width, @Ctype("GLenum") int format, @Ctype("GLsizei") int imageSize, @Ctype("void*") long data){
		try{
			glCompressedTexSubImage1D.invoke(target, level, xoffset, width, format, imageSize, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCompressedTexSubImage1D = createCriticalMethodHandle("c_glCompressedTexSubImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetCompressedTexImage(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("void*") long img){
		try{
			glGetCompressedTexImage.invoke(target, level, img);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetCompressedTexImage = createCriticalMethodHandle("c_glGetCompressedTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glClientActiveTexture(@Ctype("GLenum") int texture){
		try{
			glClientActiveTexture.invoke(texture);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClientActiveTexture = createCriticalMethodHandle("c_glClientActiveTexture", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glMultiTexCoord1d(@Ctype("GLenum") int target, @Ctype("GLdouble") double s){
		try{
			glMultiTexCoord1d.invoke(target, s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1d = createCriticalMethodHandle("c_glMultiTexCoord1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glMultiTexCoord1dv(@Ctype("GLenum") int target, @Ctype("GLdouble*") long v){
		try{
			glMultiTexCoord1dv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1dv = createCriticalMethodHandle("c_glMultiTexCoord1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord1f(@Ctype("GLenum") int target, @Ctype("GLfloat") float s){
		try{
			glMultiTexCoord1f.invoke(target, s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1f = createCriticalMethodHandle("c_glMultiTexCoord1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glMultiTexCoord1fv(@Ctype("GLenum") int target, @Ctype("GLfloat*") long v){
		try{
			glMultiTexCoord1fv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1fv = createCriticalMethodHandle("c_glMultiTexCoord1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord1i(@Ctype("GLenum") int target, @Ctype("GLint") int s){
		try{
			glMultiTexCoord1i.invoke(target, s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1i = createCriticalMethodHandle("c_glMultiTexCoord1i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoord1iv(@Ctype("GLenum") int target, @Ctype("GLint*") long v){
		try{
			glMultiTexCoord1iv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1iv = createCriticalMethodHandle("c_glMultiTexCoord1iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord1s(@Ctype("GLenum") int target, @Ctype("GLshort") short s){
		try{
			glMultiTexCoord1s.invoke(target, s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1s = createCriticalMethodHandle("c_glMultiTexCoord1s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));

	public static void glMultiTexCoord1sv(@Ctype("GLenum") int target, @Ctype("GLshort*") long v){
		try{
			glMultiTexCoord1sv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord1sv = createCriticalMethodHandle("c_glMultiTexCoord1sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord2d(@Ctype("GLenum") int target, @Ctype("GLdouble") double s, @Ctype("GLdouble") double t){
		try{
			glMultiTexCoord2d.invoke(target, s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2d = createCriticalMethodHandle("c_glMultiTexCoord2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glMultiTexCoord2dv(@Ctype("GLenum") int target, @Ctype("GLdouble*") long v){
		try{
			glMultiTexCoord2dv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2dv = createCriticalMethodHandle("c_glMultiTexCoord2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord2f(@Ctype("GLenum") int target, @Ctype("GLfloat") float s, @Ctype("GLfloat") float t){
		try{
			glMultiTexCoord2f.invoke(target, s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2f = createCriticalMethodHandle("c_glMultiTexCoord2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glMultiTexCoord2fv(@Ctype("GLenum") int target, @Ctype("GLfloat*") long v){
		try{
			glMultiTexCoord2fv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2fv = createCriticalMethodHandle("c_glMultiTexCoord2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord2i(@Ctype("GLenum") int target, @Ctype("GLint") int s, @Ctype("GLint") int t){
		try{
			glMultiTexCoord2i.invoke(target, s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2i = createCriticalMethodHandle("c_glMultiTexCoord2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoord2iv(@Ctype("GLenum") int target, @Ctype("GLint*") long v){
		try{
			glMultiTexCoord2iv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2iv = createCriticalMethodHandle("c_glMultiTexCoord2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord2s(@Ctype("GLenum") int target, @Ctype("GLshort") short s, @Ctype("GLshort") short t){
		try{
			glMultiTexCoord2s.invoke(target, s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2s = createCriticalMethodHandle("c_glMultiTexCoord2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glMultiTexCoord2sv(@Ctype("GLenum") int target, @Ctype("GLshort*") long v){
		try{
			glMultiTexCoord2sv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord2sv = createCriticalMethodHandle("c_glMultiTexCoord2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord3d(@Ctype("GLenum") int target, @Ctype("GLdouble") double s, @Ctype("GLdouble") double t, @Ctype("GLdouble") double r){
		try{
			glMultiTexCoord3d.invoke(target, s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3d = createCriticalMethodHandle("c_glMultiTexCoord3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glMultiTexCoord3dv(@Ctype("GLenum") int target, @Ctype("GLdouble*") long v){
		try{
			glMultiTexCoord3dv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3dv = createCriticalMethodHandle("c_glMultiTexCoord3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord3f(@Ctype("GLenum") int target, @Ctype("GLfloat") float s, @Ctype("GLfloat") float t, @Ctype("GLfloat") float r){
		try{
			glMultiTexCoord3f.invoke(target, s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3f = createCriticalMethodHandle("c_glMultiTexCoord3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glMultiTexCoord3fv(@Ctype("GLenum") int target, @Ctype("GLfloat*") long v){
		try{
			glMultiTexCoord3fv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3fv = createCriticalMethodHandle("c_glMultiTexCoord3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord3i(@Ctype("GLenum") int target, @Ctype("GLint") int s, @Ctype("GLint") int t, @Ctype("GLint") int r){
		try{
			glMultiTexCoord3i.invoke(target, s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3i = createCriticalMethodHandle("c_glMultiTexCoord3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoord3iv(@Ctype("GLenum") int target, @Ctype("GLint*") long v){
		try{
			glMultiTexCoord3iv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3iv = createCriticalMethodHandle("c_glMultiTexCoord3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord3s(@Ctype("GLenum") int target, @Ctype("GLshort") short s, @Ctype("GLshort") short t, @Ctype("GLshort") short r){
		try{
			glMultiTexCoord3s.invoke(target, s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3s = createCriticalMethodHandle("c_glMultiTexCoord3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glMultiTexCoord3sv(@Ctype("GLenum") int target, @Ctype("GLshort*") long v){
		try{
			glMultiTexCoord3sv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord3sv = createCriticalMethodHandle("c_glMultiTexCoord3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord4d(@Ctype("GLenum") int target, @Ctype("GLdouble") double s, @Ctype("GLdouble") double t, @Ctype("GLdouble") double r, @Ctype("GLdouble") double q){
		try{
			glMultiTexCoord4d.invoke(target, s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4d = createCriticalMethodHandle("c_glMultiTexCoord4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glMultiTexCoord4dv(@Ctype("GLenum") int target, @Ctype("GLdouble*") long v){
		try{
			glMultiTexCoord4dv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4dv = createCriticalMethodHandle("c_glMultiTexCoord4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord4f(@Ctype("GLenum") int target, @Ctype("GLfloat") float s, @Ctype("GLfloat") float t, @Ctype("GLfloat") float r, @Ctype("GLfloat") float q){
		try{
			glMultiTexCoord4f.invoke(target, s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4f = createCriticalMethodHandle("c_glMultiTexCoord4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glMultiTexCoord4fv(@Ctype("GLenum") int target, @Ctype("GLfloat*") long v){
		try{
			glMultiTexCoord4fv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4fv = createCriticalMethodHandle("c_glMultiTexCoord4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord4i(@Ctype("GLenum") int target, @Ctype("GLint") int s, @Ctype("GLint") int t, @Ctype("GLint") int r, @Ctype("GLint") int q){
		try{
			glMultiTexCoord4i.invoke(target, s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4i = createCriticalMethodHandle("c_glMultiTexCoord4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiTexCoord4iv(@Ctype("GLenum") int target, @Ctype("GLint*") long v){
		try{
			glMultiTexCoord4iv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4iv = createCriticalMethodHandle("c_glMultiTexCoord4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMultiTexCoord4s(@Ctype("GLenum") int target, @Ctype("GLshort") short s, @Ctype("GLshort") short t, @Ctype("GLshort") short r, @Ctype("GLshort") short q){
		try{
			glMultiTexCoord4s.invoke(target, s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4s = createCriticalMethodHandle("c_glMultiTexCoord4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glMultiTexCoord4sv(@Ctype("GLenum") int target, @Ctype("GLshort*") long v){
		try{
			glMultiTexCoord4sv.invoke(target, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiTexCoord4sv = createCriticalMethodHandle("c_glMultiTexCoord4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLoadTransposeMatrixf(@Ctype("GLfloat*") long m){
		try{
			glLoadTransposeMatrixf.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadTransposeMatrixf = createCriticalMethodHandle("c_glLoadTransposeMatrixf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glLoadTransposeMatrixd(@Ctype("GLdouble*") long m){
		try{
			glLoadTransposeMatrixd.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadTransposeMatrixd = createCriticalMethodHandle("c_glLoadTransposeMatrixd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glMultTransposeMatrixf(@Ctype("GLfloat*") long m){
		try{
			glMultTransposeMatrixf.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultTransposeMatrixf = createCriticalMethodHandle("c_glMultTransposeMatrixf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glMultTransposeMatrixd(@Ctype("GLdouble*") long m){
		try{
			glMultTransposeMatrixd.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultTransposeMatrixd = createCriticalMethodHandle("c_glMultTransposeMatrixd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

}
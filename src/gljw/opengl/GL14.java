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
public final class GL14{

	private GL14(){throw new IllegalAccessError();}

	public static void glBlendFuncSeparate(@Ctype("GLenum") int sfactorRGB, @Ctype("GLenum") int dfactorRGB, @Ctype("GLenum") int sfactorAlpha, @Ctype("GLenum") int dfactorAlpha){
		try{
			glBlendFuncSeparate.invoke(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendFuncSeparate = createCriticalMethodHandle("c_glBlendFuncSeparate", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMultiDrawArrays(@Ctype("GLenum") int mode, @Ctype("GLint*") long first, @Ctype("GLsizei*") long count, @Ctype("GLsizei") int drawcount){
		try{
			glMultiDrawArrays.invoke(mode, first, count, drawcount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawArrays = createCriticalMethodHandle("c_glMultiDrawArrays", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glMultiDrawElements(@Ctype("GLenum") int mode, @Ctype("GLsizei*") long count, @Ctype("GLenum") int type, @Ctype("void**") long indices, @Ctype("GLsizei") int drawcount){
		try{
			glMultiDrawElements.invoke(mode, count, type, indices, drawcount);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultiDrawElements = createCriticalMethodHandle("c_glMultiDrawElements", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glPointParameterf(@Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glPointParameterf.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPointParameterf = createCriticalMethodHandle("c_glPointParameterf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glPointParameterfv(@Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glPointParameterfv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPointParameterfv = createCriticalMethodHandle("c_glPointParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPointParameteri(@Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glPointParameteri.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPointParameteri = createCriticalMethodHandle("c_glPointParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glPointParameteriv(@Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glPointParameteriv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPointParameteriv = createCriticalMethodHandle("c_glPointParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glFogCoordf(@Ctype("GLfloat") float coord){
		try{
			glFogCoordf.invoke(coord);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogCoordf = createCriticalMethodHandle("c_glFogCoordf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glFogCoordfv(@Ctype("GLfloat*") long coord){
		try{
			glFogCoordfv.invoke(coord);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogCoordfv = createCriticalMethodHandle("c_glFogCoordfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glFogCoordd(@Ctype("GLdouble") double coord){
		try{
			glFogCoordd.invoke(coord);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogCoordd = createCriticalMethodHandle("c_glFogCoordd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));

	public static void glFogCoorddv(@Ctype("GLdouble*") long coord){
		try{
			glFogCoorddv.invoke(coord);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogCoorddv = createCriticalMethodHandle("c_glFogCoorddv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glFogCoordPointer(@Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glFogCoordPointer.invoke(type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogCoordPointer = createCriticalMethodHandle("c_glFogCoordPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3b(@Ctype("GLbyte") byte red, @Ctype("GLbyte") byte green, @Ctype("GLbyte") byte blue){
		try{
			glSecondaryColor3b.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3b = createCriticalMethodHandle("c_glSecondaryColor3b", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glSecondaryColor3bv(@Ctype("GLbyte*") long v){
		try{
			glSecondaryColor3bv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3bv = createCriticalMethodHandle("c_glSecondaryColor3bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3d(@Ctype("GLdouble") double red, @Ctype("GLdouble") double green, @Ctype("GLdouble") double blue){
		try{
			glSecondaryColor3d.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3d = createCriticalMethodHandle("c_glSecondaryColor3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glSecondaryColor3dv(@Ctype("GLdouble*") long v){
		try{
			glSecondaryColor3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3dv = createCriticalMethodHandle("c_glSecondaryColor3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3f(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue){
		try{
			glSecondaryColor3f.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3f = createCriticalMethodHandle("c_glSecondaryColor3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glSecondaryColor3fv(@Ctype("GLfloat*") long v){
		try{
			glSecondaryColor3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3fv = createCriticalMethodHandle("c_glSecondaryColor3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3i(@Ctype("GLint") int red, @Ctype("GLint") int green, @Ctype("GLint") int blue){
		try{
			glSecondaryColor3i.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3i = createCriticalMethodHandle("c_glSecondaryColor3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glSecondaryColor3iv(@Ctype("GLint*") long v){
		try{
			glSecondaryColor3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3iv = createCriticalMethodHandle("c_glSecondaryColor3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3s(@Ctype("GLshort") short red, @Ctype("GLshort") short green, @Ctype("GLshort") short blue){
		try{
			glSecondaryColor3s.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3s = createCriticalMethodHandle("c_glSecondaryColor3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glSecondaryColor3sv(@Ctype("GLshort*") long v){
		try{
			glSecondaryColor3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3sv = createCriticalMethodHandle("c_glSecondaryColor3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3ub(@Ctype("GLubyte") byte red, @Ctype("GLubyte") byte green, @Ctype("GLubyte") byte blue){
		try{
			glSecondaryColor3ub.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3ub = createCriticalMethodHandle("c_glSecondaryColor3ub", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glSecondaryColor3ubv(@Ctype("GLubyte*") long v){
		try{
			glSecondaryColor3ubv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3ubv = createCriticalMethodHandle("c_glSecondaryColor3ubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3ui(@Ctype("GLuint") int red, @Ctype("GLuint") int green, @Ctype("GLuint") int blue){
		try{
			glSecondaryColor3ui.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3ui = createCriticalMethodHandle("c_glSecondaryColor3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glSecondaryColor3uiv(@Ctype("GLuint*") long v){
		try{
			glSecondaryColor3uiv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3uiv = createCriticalMethodHandle("c_glSecondaryColor3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColor3us(@Ctype("GLushort") short red, @Ctype("GLushort") short green, @Ctype("GLushort") short blue){
		try{
			glSecondaryColor3us.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3us = createCriticalMethodHandle("c_glSecondaryColor3us", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glSecondaryColor3usv(@Ctype("GLushort*") long v){
		try{
			glSecondaryColor3usv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColor3usv = createCriticalMethodHandle("c_glSecondaryColor3usv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glSecondaryColorPointer(@Ctype("GLint") int size, @Ctype("GLenum") int type, @Ctype("GLsizei") int stride, @Ctype("void*") long pointer){
		try{
			glSecondaryColorPointer.invoke(size, type, stride, pointer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSecondaryColorPointer = createCriticalMethodHandle("c_glSecondaryColorPointer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glWindowPos2d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glWindowPos2d.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2d = createCriticalMethodHandle("c_glWindowPos2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glWindowPos2dv(@Ctype("GLdouble*") long v){
		try{
			glWindowPos2dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2dv = createCriticalMethodHandle("c_glWindowPos2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos2f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y){
		try{
			glWindowPos2f.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2f = createCriticalMethodHandle("c_glWindowPos2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glWindowPos2fv(@Ctype("GLfloat*") long v){
		try{
			glWindowPos2fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2fv = createCriticalMethodHandle("c_glWindowPos2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos2i(@Ctype("GLint") int x, @Ctype("GLint") int y){
		try{
			glWindowPos2i.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2i = createCriticalMethodHandle("c_glWindowPos2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glWindowPos2iv(@Ctype("GLint*") long v){
		try{
			glWindowPos2iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2iv = createCriticalMethodHandle("c_glWindowPos2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos2s(@Ctype("GLshort") short x, @Ctype("GLshort") short y){
		try{
			glWindowPos2s.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2s = createCriticalMethodHandle("c_glWindowPos2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glWindowPos2sv(@Ctype("GLshort*") long v){
		try{
			glWindowPos2sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos2sv = createCriticalMethodHandle("c_glWindowPos2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos3d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glWindowPos3d.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3d = createCriticalMethodHandle("c_glWindowPos3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glWindowPos3dv(@Ctype("GLdouble*") long v){
		try{
			glWindowPos3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3dv = createCriticalMethodHandle("c_glWindowPos3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos3f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glWindowPos3f.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3f = createCriticalMethodHandle("c_glWindowPos3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glWindowPos3fv(@Ctype("GLfloat*") long v){
		try{
			glWindowPos3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3fv = createCriticalMethodHandle("c_glWindowPos3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos3i(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z){
		try{
			glWindowPos3i.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3i = createCriticalMethodHandle("c_glWindowPos3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glWindowPos3iv(@Ctype("GLint*") long v){
		try{
			glWindowPos3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3iv = createCriticalMethodHandle("c_glWindowPos3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glWindowPos3s(@Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z){
		try{
			glWindowPos3s.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3s = createCriticalMethodHandle("c_glWindowPos3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glWindowPos3sv(@Ctype("GLshort*") long v){
		try{
			glWindowPos3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glWindowPos3sv = createCriticalMethodHandle("c_glWindowPos3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glBlendColor(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue, @Ctype("GLfloat") float alpha){
		try{
			glBlendColor.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendColor = createCriticalMethodHandle("c_glBlendColor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glBlendEquation(@Ctype("GLenum") int mode){
		try{
			glBlendEquation.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendEquation = createCriticalMethodHandle("c_glBlendEquation", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

}
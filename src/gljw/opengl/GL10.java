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
public final class GL10{

	private GL10(){throw new IllegalAccessError();}

	public static void glCullFace(@Ctype("GLenum") int mode){
		try{
			glCullFace.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCullFace = createCriticalMethodHandle("c_glCullFace", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glFrontFace(@Ctype("GLenum") int mode){
		try{
			glFrontFace.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFrontFace = createCriticalMethodHandle("c_glFrontFace", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glHint(@Ctype("GLenum") int target, @Ctype("GLenum") int mode){
		try{
			glHint.invoke(target, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glHint = createCriticalMethodHandle("c_glHint", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glLineWidth(@Ctype("GLfloat") float width){
		try{
			glLineWidth.invoke(width);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLineWidth = createCriticalMethodHandle("c_glLineWidth", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glPointSize(@Ctype("GLfloat") float size){
		try{
			glPointSize.invoke(size);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPointSize = createCriticalMethodHandle("c_glPointSize", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glPolygonMode(@Ctype("GLenum") int face, @Ctype("GLenum") int mode){
		try{
			glPolygonMode.invoke(face, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPolygonMode = createCriticalMethodHandle("c_glPolygonMode", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glScissor(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glScissor.invoke(x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScissor = createCriticalMethodHandle("c_glScissor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexParameterf(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glTexParameterf.invoke(target, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameterf = createCriticalMethodHandle("c_glTexParameterf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glTexParameterfv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glTexParameterfv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameterfv = createCriticalMethodHandle("c_glTexParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexParameteri(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glTexParameteri.invoke(target, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameteri = createCriticalMethodHandle("c_glTexParameteri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glTexParameteriv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexParameteriv = createCriticalMethodHandle("c_glTexParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexImage1D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLint") int border, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexImage1D.invoke(target, level, internalformat, width, border, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexImage1D = createCriticalMethodHandle("c_glTexImage1D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexImage2D(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLint") int internalformat, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLint") int border, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glTexImage2D.invoke(target, level, internalformat, width, height, border, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexImage2D = createCriticalMethodHandle("c_glTexImage2D", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDrawBuffer(@Ctype("GLenum") int buf){
		try{
			glDrawBuffer.invoke(buf);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawBuffer = createCriticalMethodHandle("c_glDrawBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glClear(@Ctype("GLbitfield") int mask){
		try{
			glClear.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClear = createCriticalMethodHandle("c_glClear", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glClearColor(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue, @Ctype("GLfloat") float alpha){
		try{
			glClearColor.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearColor = createCriticalMethodHandle("c_glClearColor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glClearStencil(@Ctype("GLint") int s){
		try{
			glClearStencil.invoke(s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearStencil = createCriticalMethodHandle("c_glClearStencil", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glClearDepth(@Ctype("GLdouble") double depth){
		try{
			glClearDepth.invoke(depth);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearDepth = createCriticalMethodHandle("c_glClearDepth", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));

	public static void glStencilMask(@Ctype("GLuint") int mask){
		try{
			glStencilMask.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilMask = createCriticalMethodHandle("c_glStencilMask", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glColorMask(@Ctype("GLboolean") boolean red, @Ctype("GLboolean") boolean green, @Ctype("GLboolean") boolean blue, @Ctype("GLboolean") boolean alpha){
		try{
			glColorMask.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorMask = createCriticalMethodHandle("c_glColorMask", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));

	public static void glDepthMask(@Ctype("GLboolean") boolean flag){
		try{
			glDepthMask.invoke(flag);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthMask = createCriticalMethodHandle("c_glDepthMask", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));

	public static void glDisable(@Ctype("GLenum") int cap){
		try{
			glDisable.invoke(cap);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDisable = createCriticalMethodHandle("c_glDisable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glEnable(@Ctype("GLenum") int cap){
		try{
			glEnable.invoke(cap);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnable = createCriticalMethodHandle("c_glEnable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glFinish(){
		try{
			glFinish.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFinish = createCriticalMethodHandle("c_glFinish", FunctionDescriptor.ofVoid());

	public static void glFlush(){
		try{
			glFlush.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFlush = createCriticalMethodHandle("c_glFlush", FunctionDescriptor.ofVoid());

	public static void glBlendFunc(@Ctype("GLenum") int sfactor, @Ctype("GLenum") int dfactor){
		try{
			glBlendFunc.invoke(sfactor, dfactor);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBlendFunc = createCriticalMethodHandle("c_glBlendFunc", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glLogicOp(@Ctype("GLenum") int opcode){
		try{
			glLogicOp.invoke(opcode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLogicOp = createCriticalMethodHandle("c_glLogicOp", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glStencilFunc(@Ctype("GLenum") int func, @Ctype("GLint") int ref, @Ctype("GLuint") int mask){
		try{
			glStencilFunc.invoke(func, ref, mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilFunc = createCriticalMethodHandle("c_glStencilFunc", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glStencilOp(@Ctype("GLenum") int fail, @Ctype("GLenum") int zfail, @Ctype("GLenum") int zpass){
		try{
			glStencilOp.invoke(fail, zfail, zpass);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glStencilOp = createCriticalMethodHandle("c_glStencilOp", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDepthFunc(@Ctype("GLenum") int func){
		try{
			glDepthFunc.invoke(func);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthFunc = createCriticalMethodHandle("c_glDepthFunc", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glPixelStoref(@Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glPixelStoref.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelStoref = createCriticalMethodHandle("c_glPixelStoref", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glPixelStorei(@Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glPixelStorei.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelStorei = createCriticalMethodHandle("c_glPixelStorei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glReadBuffer(@Ctype("GLenum") int src){
		try{
			glReadBuffer.invoke(src);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glReadBuffer = createCriticalMethodHandle("c_glReadBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glReadPixels(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glReadPixels.invoke(x, y, width, height, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glReadPixels = createCriticalMethodHandle("c_glReadPixels", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetBooleanv(@Ctype("GLenum") int pname, @Ctype("GLboolean*") long data){
		try{
			glGetBooleanv.invoke(pname, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetBooleanv = createCriticalMethodHandle("c_glGetBooleanv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetDoublev(@Ctype("GLenum") int pname, @Ctype("GLdouble*") long data){
		try{
			glGetDoublev.invoke(pname, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetDoublev = createCriticalMethodHandle("c_glGetDoublev", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLenum") int glGetError(){
		try{
			return (int)glGetError.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetError = createCriticalMethodHandle("c_glGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT));

	public static void glGetFloatv(@Ctype("GLenum") int pname, @Ctype("GLfloat*") long data){
		try{
			glGetFloatv.invoke(pname, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetFloatv = createCriticalMethodHandle("c_glGetFloatv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetIntegerv(@Ctype("GLenum") int pname, @Ctype("GLint*") long data){
		try{
			glGetIntegerv.invoke(pname, data);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetIntegerv = createCriticalMethodHandle("c_glGetIntegerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLubyte*")long glGetString(@Ctype("GLenum") int name){
		try{
			return (long)glGetString.invoke(name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetString = createCriticalMethodHandle("c_glGetString", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void glGetTexImage(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glGetTexImage.invoke(target, level, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexImage = createCriticalMethodHandle("c_glGetTexImage", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexParameterfv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTexParameterfv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexParameterfv = createCriticalMethodHandle("c_glGetTexParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexParameteriv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTexParameteriv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexParameteriv = createCriticalMethodHandle("c_glGetTexParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexLevelParameterfv(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTexLevelParameterfv.invoke(target, level, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexLevelParameterfv = createCriticalMethodHandle("c_glGetTexLevelParameterfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexLevelParameteriv(@Ctype("GLenum") int target, @Ctype("GLint") int level, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTexLevelParameteriv.invoke(target, level, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexLevelParameteriv = createCriticalMethodHandle("c_glGetTexLevelParameteriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsEnabled(@Ctype("GLenum") int cap){
		try{
			return (boolean)glIsEnabled.invoke(cap);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsEnabled = createCriticalMethodHandle("c_glIsEnabled", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glDepthRange(@Ctype("GLdouble") double n, @Ctype("GLdouble") double f){
		try{
			glDepthRange.invoke(n, f);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDepthRange = createCriticalMethodHandle("c_glDepthRange", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glViewport(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height){
		try{
			glViewport.invoke(x, y, width, height);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glViewport = createCriticalMethodHandle("c_glViewport", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNewList(@Ctype("GLuint") int list, @Ctype("GLenum") int mode){
		try{
			glNewList.invoke(list, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNewList = createCriticalMethodHandle("c_glNewList", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEndList(){
		try{
			glEndList.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEndList = createCriticalMethodHandle("c_glEndList", FunctionDescriptor.ofVoid());

	public static void glCallList(@Ctype("GLuint") int list){
		try{
			glCallList.invoke(list);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCallList = createCriticalMethodHandle("c_glCallList", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glCallLists(@Ctype("GLsizei") int n, @Ctype("GLenum") int type, @Ctype("void*") long lists){
		try{
			glCallLists.invoke(n, type, lists);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCallLists = createCriticalMethodHandle("c_glCallLists", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glDeleteLists(@Ctype("GLuint") int list, @Ctype("GLsizei") int range){
		try{
			glDeleteLists.invoke(list, range);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDeleteLists = createCriticalMethodHandle("c_glDeleteLists", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("GLuint") int glGenLists(@Ctype("GLsizei") int range){
		try{
			return (int)glGenLists.invoke(range);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGenLists = createCriticalMethodHandle("c_glGenLists", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glListBase(@Ctype("GLuint") int base){
		try{
			glListBase.invoke(base);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glListBase = createCriticalMethodHandle("c_glListBase", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glBegin(@Ctype("GLenum") int mode){
		try{
			glBegin.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBegin = createCriticalMethodHandle("c_glBegin", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glBitmap(@Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLfloat") float xorig, @Ctype("GLfloat") float yorig, @Ctype("GLfloat") float xmove, @Ctype("GLfloat") float ymove, @Ctype("GLubyte*") long bitmap){
		try{
			glBitmap.invoke(width, height, xorig, yorig, xmove, ymove, bitmap);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glBitmap = createCriticalMethodHandle("c_glBitmap", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_LONG));

	public static void glColor3b(@Ctype("GLbyte") byte red, @Ctype("GLbyte") byte green, @Ctype("GLbyte") byte blue){
		try{
			glColor3b.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3b = createCriticalMethodHandle("c_glColor3b", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glColor3bv(@Ctype("GLbyte*") long v){
		try{
			glColor3bv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3bv = createCriticalMethodHandle("c_glColor3bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3d(@Ctype("GLdouble") double red, @Ctype("GLdouble") double green, @Ctype("GLdouble") double blue){
		try{
			glColor3d.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3d = createCriticalMethodHandle("c_glColor3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glColor3dv(@Ctype("GLdouble*") long v){
		try{
			glColor3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3dv = createCriticalMethodHandle("c_glColor3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3f(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue){
		try{
			glColor3f.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3f = createCriticalMethodHandle("c_glColor3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glColor3fv(@Ctype("GLfloat*") long v){
		try{
			glColor3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3fv = createCriticalMethodHandle("c_glColor3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3i(@Ctype("GLint") int red, @Ctype("GLint") int green, @Ctype("GLint") int blue){
		try{
			glColor3i.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3i = createCriticalMethodHandle("c_glColor3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColor3iv(@Ctype("GLint*") long v){
		try{
			glColor3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3iv = createCriticalMethodHandle("c_glColor3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3s(@Ctype("GLshort") short red, @Ctype("GLshort") short green, @Ctype("GLshort") short blue){
		try{
			glColor3s.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3s = createCriticalMethodHandle("c_glColor3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glColor3sv(@Ctype("GLshort*") long v){
		try{
			glColor3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3sv = createCriticalMethodHandle("c_glColor3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3ub(@Ctype("GLubyte") byte red, @Ctype("GLubyte") byte green, @Ctype("GLubyte") byte blue){
		try{
			glColor3ub.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3ub = createCriticalMethodHandle("c_glColor3ub", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glColor3ubv(@Ctype("GLubyte*") long v){
		try{
			glColor3ubv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3ubv = createCriticalMethodHandle("c_glColor3ubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3ui(@Ctype("GLuint") int red, @Ctype("GLuint") int green, @Ctype("GLuint") int blue){
		try{
			glColor3ui.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3ui = createCriticalMethodHandle("c_glColor3ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColor3uiv(@Ctype("GLuint*") long v){
		try{
			glColor3uiv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3uiv = createCriticalMethodHandle("c_glColor3uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor3us(@Ctype("GLushort") short red, @Ctype("GLushort") short green, @Ctype("GLushort") short blue){
		try{
			glColor3us.invoke(red, green, blue);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3us = createCriticalMethodHandle("c_glColor3us", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glColor3usv(@Ctype("GLushort*") long v){
		try{
			glColor3usv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor3usv = createCriticalMethodHandle("c_glColor3usv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4b(@Ctype("GLbyte") byte red, @Ctype("GLbyte") byte green, @Ctype("GLbyte") byte blue, @Ctype("GLbyte") byte alpha){
		try{
			glColor4b.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4b = createCriticalMethodHandle("c_glColor4b", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glColor4bv(@Ctype("GLbyte*") long v){
		try{
			glColor4bv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4bv = createCriticalMethodHandle("c_glColor4bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4d(@Ctype("GLdouble") double red, @Ctype("GLdouble") double green, @Ctype("GLdouble") double blue, @Ctype("GLdouble") double alpha){
		try{
			glColor4d.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4d = createCriticalMethodHandle("c_glColor4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glColor4dv(@Ctype("GLdouble*") long v){
		try{
			glColor4dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4dv = createCriticalMethodHandle("c_glColor4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4f(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue, @Ctype("GLfloat") float alpha){
		try{
			glColor4f.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4f = createCriticalMethodHandle("c_glColor4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glColor4fv(@Ctype("GLfloat*") long v){
		try{
			glColor4fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4fv = createCriticalMethodHandle("c_glColor4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4i(@Ctype("GLint") int red, @Ctype("GLint") int green, @Ctype("GLint") int blue, @Ctype("GLint") int alpha){
		try{
			glColor4i.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4i = createCriticalMethodHandle("c_glColor4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColor4iv(@Ctype("GLint*") long v){
		try{
			glColor4iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4iv = createCriticalMethodHandle("c_glColor4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4s(@Ctype("GLshort") short red, @Ctype("GLshort") short green, @Ctype("GLshort") short blue, @Ctype("GLshort") short alpha){
		try{
			glColor4s.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4s = createCriticalMethodHandle("c_glColor4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glColor4sv(@Ctype("GLshort*") long v){
		try{
			glColor4sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4sv = createCriticalMethodHandle("c_glColor4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4ub(@Ctype("GLubyte") byte red, @Ctype("GLubyte") byte green, @Ctype("GLubyte") byte blue, @Ctype("GLubyte") byte alpha){
		try{
			glColor4ub.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4ub = createCriticalMethodHandle("c_glColor4ub", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glColor4ubv(@Ctype("GLubyte*") long v){
		try{
			glColor4ubv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4ubv = createCriticalMethodHandle("c_glColor4ubv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4ui(@Ctype("GLuint") int red, @Ctype("GLuint") int green, @Ctype("GLuint") int blue, @Ctype("GLuint") int alpha){
		try{
			glColor4ui.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4ui = createCriticalMethodHandle("c_glColor4ui", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glColor4uiv(@Ctype("GLuint*") long v){
		try{
			glColor4uiv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4uiv = createCriticalMethodHandle("c_glColor4uiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glColor4us(@Ctype("GLushort") short red, @Ctype("GLushort") short green, @Ctype("GLushort") short blue, @Ctype("GLushort") short alpha){
		try{
			glColor4us.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4us = createCriticalMethodHandle("c_glColor4us", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glColor4usv(@Ctype("GLushort*") long v){
		try{
			glColor4usv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColor4usv = createCriticalMethodHandle("c_glColor4usv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEdgeFlag(@Ctype("GLboolean") boolean flag){
		try{
			glEdgeFlag.invoke(flag);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEdgeFlag = createCriticalMethodHandle("c_glEdgeFlag", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN));

	public static void glEdgeFlagv(@Ctype("GLboolean*") long flag){
		try{
			glEdgeFlagv.invoke(flag);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEdgeFlagv = createCriticalMethodHandle("c_glEdgeFlagv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEnd(){
		try{
			glEnd.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEnd = createCriticalMethodHandle("c_glEnd", FunctionDescriptor.ofVoid());

	public static void glIndexd(@Ctype("GLdouble") double c){
		try{
			glIndexd.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexd = createCriticalMethodHandle("c_glIndexd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));

	public static void glIndexdv(@Ctype("GLdouble*") long c){
		try{
			glIndexdv.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexdv = createCriticalMethodHandle("c_glIndexdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glIndexf(@Ctype("GLfloat") float c){
		try{
			glIndexf.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexf = createCriticalMethodHandle("c_glIndexf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glIndexfv(@Ctype("GLfloat*") long c){
		try{
			glIndexfv.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexfv = createCriticalMethodHandle("c_glIndexfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glIndexi(@Ctype("GLint") int c){
		try{
			glIndexi.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexi = createCriticalMethodHandle("c_glIndexi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glIndexiv(@Ctype("GLint*") long c){
		try{
			glIndexiv.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexiv = createCriticalMethodHandle("c_glIndexiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glIndexs(@Ctype("GLshort") short c){
		try{
			glIndexs.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexs = createCriticalMethodHandle("c_glIndexs", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));

	public static void glIndexsv(@Ctype("GLshort*") long c){
		try{
			glIndexsv.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexsv = createCriticalMethodHandle("c_glIndexsv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glNormal3b(@Ctype("GLbyte") byte nx, @Ctype("GLbyte") byte ny, @Ctype("GLbyte") byte nz){
		try{
			glNormal3b.invoke(nx, ny, nz);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3b = createCriticalMethodHandle("c_glNormal3b", FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));

	public static void glNormal3bv(@Ctype("GLbyte*") long v){
		try{
			glNormal3bv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3bv = createCriticalMethodHandle("c_glNormal3bv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glNormal3d(@Ctype("GLdouble") double nx, @Ctype("GLdouble") double ny, @Ctype("GLdouble") double nz){
		try{
			glNormal3d.invoke(nx, ny, nz);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3d = createCriticalMethodHandle("c_glNormal3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glNormal3dv(@Ctype("GLdouble*") long v){
		try{
			glNormal3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3dv = createCriticalMethodHandle("c_glNormal3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glNormal3f(@Ctype("GLfloat") float nx, @Ctype("GLfloat") float ny, @Ctype("GLfloat") float nz){
		try{
			glNormal3f.invoke(nx, ny, nz);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3f = createCriticalMethodHandle("c_glNormal3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glNormal3fv(@Ctype("GLfloat*") long v){
		try{
			glNormal3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3fv = createCriticalMethodHandle("c_glNormal3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glNormal3i(@Ctype("GLint") int nx, @Ctype("GLint") int ny, @Ctype("GLint") int nz){
		try{
			glNormal3i.invoke(nx, ny, nz);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3i = createCriticalMethodHandle("c_glNormal3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glNormal3iv(@Ctype("GLint*") long v){
		try{
			glNormal3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3iv = createCriticalMethodHandle("c_glNormal3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glNormal3s(@Ctype("GLshort") short nx, @Ctype("GLshort") short ny, @Ctype("GLshort") short nz){
		try{
			glNormal3s.invoke(nx, ny, nz);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3s = createCriticalMethodHandle("c_glNormal3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glNormal3sv(@Ctype("GLshort*") long v){
		try{
			glNormal3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glNormal3sv = createCriticalMethodHandle("c_glNormal3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos2d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glRasterPos2d.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2d = createCriticalMethodHandle("c_glRasterPos2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glRasterPos2dv(@Ctype("GLdouble*") long v){
		try{
			glRasterPos2dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2dv = createCriticalMethodHandle("c_glRasterPos2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos2f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y){
		try{
			glRasterPos2f.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2f = createCriticalMethodHandle("c_glRasterPos2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glRasterPos2fv(@Ctype("GLfloat*") long v){
		try{
			glRasterPos2fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2fv = createCriticalMethodHandle("c_glRasterPos2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos2i(@Ctype("GLint") int x, @Ctype("GLint") int y){
		try{
			glRasterPos2i.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2i = createCriticalMethodHandle("c_glRasterPos2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glRasterPos2iv(@Ctype("GLint*") long v){
		try{
			glRasterPos2iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2iv = createCriticalMethodHandle("c_glRasterPos2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos2s(@Ctype("GLshort") short x, @Ctype("GLshort") short y){
		try{
			glRasterPos2s.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2s = createCriticalMethodHandle("c_glRasterPos2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glRasterPos2sv(@Ctype("GLshort*") long v){
		try{
			glRasterPos2sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos2sv = createCriticalMethodHandle("c_glRasterPos2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos3d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glRasterPos3d.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3d = createCriticalMethodHandle("c_glRasterPos3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glRasterPos3dv(@Ctype("GLdouble*") long v){
		try{
			glRasterPos3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3dv = createCriticalMethodHandle("c_glRasterPos3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos3f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glRasterPos3f.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3f = createCriticalMethodHandle("c_glRasterPos3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glRasterPos3fv(@Ctype("GLfloat*") long v){
		try{
			glRasterPos3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3fv = createCriticalMethodHandle("c_glRasterPos3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos3i(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z){
		try{
			glRasterPos3i.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3i = createCriticalMethodHandle("c_glRasterPos3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glRasterPos3iv(@Ctype("GLint*") long v){
		try{
			glRasterPos3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3iv = createCriticalMethodHandle("c_glRasterPos3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos3s(@Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z){
		try{
			glRasterPos3s.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3s = createCriticalMethodHandle("c_glRasterPos3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glRasterPos3sv(@Ctype("GLshort*") long v){
		try{
			glRasterPos3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos3sv = createCriticalMethodHandle("c_glRasterPos3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos4d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z, @Ctype("GLdouble") double w){
		try{
			glRasterPos4d.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4d = createCriticalMethodHandle("c_glRasterPos4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glRasterPos4dv(@Ctype("GLdouble*") long v){
		try{
			glRasterPos4dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4dv = createCriticalMethodHandle("c_glRasterPos4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos4f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z, @Ctype("GLfloat") float w){
		try{
			glRasterPos4f.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4f = createCriticalMethodHandle("c_glRasterPos4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glRasterPos4fv(@Ctype("GLfloat*") long v){
		try{
			glRasterPos4fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4fv = createCriticalMethodHandle("c_glRasterPos4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos4i(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z, @Ctype("GLint") int w){
		try{
			glRasterPos4i.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4i = createCriticalMethodHandle("c_glRasterPos4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glRasterPos4iv(@Ctype("GLint*") long v){
		try{
			glRasterPos4iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4iv = createCriticalMethodHandle("c_glRasterPos4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRasterPos4s(@Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z, @Ctype("GLshort") short w){
		try{
			glRasterPos4s.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4s = createCriticalMethodHandle("c_glRasterPos4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glRasterPos4sv(@Ctype("GLshort*") long v){
		try{
			glRasterPos4sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRasterPos4sv = createCriticalMethodHandle("c_glRasterPos4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glRectd(@Ctype("GLdouble") double x1, @Ctype("GLdouble") double y1, @Ctype("GLdouble") double x2, @Ctype("GLdouble") double y2){
		try{
			glRectd.invoke(x1, y1, x2, y2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectd = createCriticalMethodHandle("c_glRectd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glRectdv(@Ctype("GLdouble*") long v1, @Ctype("GLdouble*") long v2){
		try{
			glRectdv.invoke(v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectdv = createCriticalMethodHandle("c_glRectdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glRectf(@Ctype("GLfloat") float x1, @Ctype("GLfloat") float y1, @Ctype("GLfloat") float x2, @Ctype("GLfloat") float y2){
		try{
			glRectf.invoke(x1, y1, x2, y2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectf = createCriticalMethodHandle("c_glRectf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glRectfv(@Ctype("GLfloat*") long v1, @Ctype("GLfloat*") long v2){
		try{
			glRectfv.invoke(v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectfv = createCriticalMethodHandle("c_glRectfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glRecti(@Ctype("GLint") int x1, @Ctype("GLint") int y1, @Ctype("GLint") int x2, @Ctype("GLint") int y2){
		try{
			glRecti.invoke(x1, y1, x2, y2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRecti = createCriticalMethodHandle("c_glRecti", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glRectiv(@Ctype("GLint*") long v1, @Ctype("GLint*") long v2){
		try{
			glRectiv.invoke(v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectiv = createCriticalMethodHandle("c_glRectiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glRects(@Ctype("GLshort") short x1, @Ctype("GLshort") short y1, @Ctype("GLshort") short x2, @Ctype("GLshort") short y2){
		try{
			glRects.invoke(x1, y1, x2, y2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRects = createCriticalMethodHandle("c_glRects", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glRectsv(@Ctype("GLshort*") long v1, @Ctype("GLshort*") long v2){
		try{
			glRectsv.invoke(v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRectsv = createCriticalMethodHandle("c_glRectsv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void glTexCoord1d(@Ctype("GLdouble") double s){
		try{
			glTexCoord1d.invoke(s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1d = createCriticalMethodHandle("c_glTexCoord1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));

	public static void glTexCoord1dv(@Ctype("GLdouble*") long v){
		try{
			glTexCoord1dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1dv = createCriticalMethodHandle("c_glTexCoord1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord1f(@Ctype("GLfloat") float s){
		try{
			glTexCoord1f.invoke(s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1f = createCriticalMethodHandle("c_glTexCoord1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glTexCoord1fv(@Ctype("GLfloat*") long v){
		try{
			glTexCoord1fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1fv = createCriticalMethodHandle("c_glTexCoord1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord1i(@Ctype("GLint") int s){
		try{
			glTexCoord1i.invoke(s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1i = createCriticalMethodHandle("c_glTexCoord1i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glTexCoord1iv(@Ctype("GLint*") long v){
		try{
			glTexCoord1iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1iv = createCriticalMethodHandle("c_glTexCoord1iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord1s(@Ctype("GLshort") short s){
		try{
			glTexCoord1s.invoke(s);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1s = createCriticalMethodHandle("c_glTexCoord1s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));

	public static void glTexCoord1sv(@Ctype("GLshort*") long v){
		try{
			glTexCoord1sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord1sv = createCriticalMethodHandle("c_glTexCoord1sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord2d(@Ctype("GLdouble") double s, @Ctype("GLdouble") double t){
		try{
			glTexCoord2d.invoke(s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2d = createCriticalMethodHandle("c_glTexCoord2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glTexCoord2dv(@Ctype("GLdouble*") long v){
		try{
			glTexCoord2dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2dv = createCriticalMethodHandle("c_glTexCoord2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord2f(@Ctype("GLfloat") float s, @Ctype("GLfloat") float t){
		try{
			glTexCoord2f.invoke(s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2f = createCriticalMethodHandle("c_glTexCoord2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glTexCoord2fv(@Ctype("GLfloat*") long v){
		try{
			glTexCoord2fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2fv = createCriticalMethodHandle("c_glTexCoord2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord2i(@Ctype("GLint") int s, @Ctype("GLint") int t){
		try{
			glTexCoord2i.invoke(s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2i = createCriticalMethodHandle("c_glTexCoord2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoord2iv(@Ctype("GLint*") long v){
		try{
			glTexCoord2iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2iv = createCriticalMethodHandle("c_glTexCoord2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord2s(@Ctype("GLshort") short s, @Ctype("GLshort") short t){
		try{
			glTexCoord2s.invoke(s, t);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2s = createCriticalMethodHandle("c_glTexCoord2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glTexCoord2sv(@Ctype("GLshort*") long v){
		try{
			glTexCoord2sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord2sv = createCriticalMethodHandle("c_glTexCoord2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord3d(@Ctype("GLdouble") double s, @Ctype("GLdouble") double t, @Ctype("GLdouble") double r){
		try{
			glTexCoord3d.invoke(s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3d = createCriticalMethodHandle("c_glTexCoord3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glTexCoord3dv(@Ctype("GLdouble*") long v){
		try{
			glTexCoord3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3dv = createCriticalMethodHandle("c_glTexCoord3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord3f(@Ctype("GLfloat") float s, @Ctype("GLfloat") float t, @Ctype("GLfloat") float r){
		try{
			glTexCoord3f.invoke(s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3f = createCriticalMethodHandle("c_glTexCoord3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glTexCoord3fv(@Ctype("GLfloat*") long v){
		try{
			glTexCoord3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3fv = createCriticalMethodHandle("c_glTexCoord3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord3i(@Ctype("GLint") int s, @Ctype("GLint") int t, @Ctype("GLint") int r){
		try{
			glTexCoord3i.invoke(s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3i = createCriticalMethodHandle("c_glTexCoord3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoord3iv(@Ctype("GLint*") long v){
		try{
			glTexCoord3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3iv = createCriticalMethodHandle("c_glTexCoord3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord3s(@Ctype("GLshort") short s, @Ctype("GLshort") short t, @Ctype("GLshort") short r){
		try{
			glTexCoord3s.invoke(s, t, r);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3s = createCriticalMethodHandle("c_glTexCoord3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glTexCoord3sv(@Ctype("GLshort*") long v){
		try{
			glTexCoord3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord3sv = createCriticalMethodHandle("c_glTexCoord3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord4d(@Ctype("GLdouble") double s, @Ctype("GLdouble") double t, @Ctype("GLdouble") double r, @Ctype("GLdouble") double q){
		try{
			glTexCoord4d.invoke(s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4d = createCriticalMethodHandle("c_glTexCoord4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glTexCoord4dv(@Ctype("GLdouble*") long v){
		try{
			glTexCoord4dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4dv = createCriticalMethodHandle("c_glTexCoord4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord4f(@Ctype("GLfloat") float s, @Ctype("GLfloat") float t, @Ctype("GLfloat") float r, @Ctype("GLfloat") float q){
		try{
			glTexCoord4f.invoke(s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4f = createCriticalMethodHandle("c_glTexCoord4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glTexCoord4fv(@Ctype("GLfloat*") long v){
		try{
			glTexCoord4fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4fv = createCriticalMethodHandle("c_glTexCoord4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord4i(@Ctype("GLint") int s, @Ctype("GLint") int t, @Ctype("GLint") int r, @Ctype("GLint") int q){
		try{
			glTexCoord4i.invoke(s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4i = createCriticalMethodHandle("c_glTexCoord4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexCoord4iv(@Ctype("GLint*") long v){
		try{
			glTexCoord4iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4iv = createCriticalMethodHandle("c_glTexCoord4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glTexCoord4s(@Ctype("GLshort") short s, @Ctype("GLshort") short t, @Ctype("GLshort") short r, @Ctype("GLshort") short q){
		try{
			glTexCoord4s.invoke(s, t, r, q);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4s = createCriticalMethodHandle("c_glTexCoord4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glTexCoord4sv(@Ctype("GLshort*") long v){
		try{
			glTexCoord4sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexCoord4sv = createCriticalMethodHandle("c_glTexCoord4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex2d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y){
		try{
			glVertex2d.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2d = createCriticalMethodHandle("c_glVertex2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertex2dv(@Ctype("GLdouble*") long v){
		try{
			glVertex2dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2dv = createCriticalMethodHandle("c_glVertex2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex2f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y){
		try{
			glVertex2f.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2f = createCriticalMethodHandle("c_glVertex2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertex2fv(@Ctype("GLfloat*") long v){
		try{
			glVertex2fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2fv = createCriticalMethodHandle("c_glVertex2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex2i(@Ctype("GLint") int x, @Ctype("GLint") int y){
		try{
			glVertex2i.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2i = createCriticalMethodHandle("c_glVertex2i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertex2iv(@Ctype("GLint*") long v){
		try{
			glVertex2iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2iv = createCriticalMethodHandle("c_glVertex2iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex2s(@Ctype("GLshort") short x, @Ctype("GLshort") short y){
		try{
			glVertex2s.invoke(x, y);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2s = createCriticalMethodHandle("c_glVertex2s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertex2sv(@Ctype("GLshort*") long v){
		try{
			glVertex2sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex2sv = createCriticalMethodHandle("c_glVertex2sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex3d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glVertex3d.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3d = createCriticalMethodHandle("c_glVertex3d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertex3dv(@Ctype("GLdouble*") long v){
		try{
			glVertex3dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3dv = createCriticalMethodHandle("c_glVertex3dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex3f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glVertex3f.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3f = createCriticalMethodHandle("c_glVertex3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertex3fv(@Ctype("GLfloat*") long v){
		try{
			glVertex3fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3fv = createCriticalMethodHandle("c_glVertex3fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex3i(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z){
		try{
			glVertex3i.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3i = createCriticalMethodHandle("c_glVertex3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertex3iv(@Ctype("GLint*") long v){
		try{
			glVertex3iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3iv = createCriticalMethodHandle("c_glVertex3iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex3s(@Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z){
		try{
			glVertex3s.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3s = createCriticalMethodHandle("c_glVertex3s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertex3sv(@Ctype("GLshort*") long v){
		try{
			glVertex3sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex3sv = createCriticalMethodHandle("c_glVertex3sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex4d(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z, @Ctype("GLdouble") double w){
		try{
			glVertex4d.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4d = createCriticalMethodHandle("c_glVertex4d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glVertex4dv(@Ctype("GLdouble*") long v){
		try{
			glVertex4dv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4dv = createCriticalMethodHandle("c_glVertex4dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex4f(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z, @Ctype("GLfloat") float w){
		try{
			glVertex4f.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4f = createCriticalMethodHandle("c_glVertex4f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glVertex4fv(@Ctype("GLfloat*") long v){
		try{
			glVertex4fv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4fv = createCriticalMethodHandle("c_glVertex4fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex4i(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLint") int z, @Ctype("GLint") int w){
		try{
			glVertex4i.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4i = createCriticalMethodHandle("c_glVertex4i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glVertex4iv(@Ctype("GLint*") long v){
		try{
			glVertex4iv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4iv = createCriticalMethodHandle("c_glVertex4iv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glVertex4s(@Ctype("GLshort") short x, @Ctype("GLshort") short y, @Ctype("GLshort") short z, @Ctype("GLshort") short w){
		try{
			glVertex4s.invoke(x, y, z, w);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4s = createCriticalMethodHandle("c_glVertex4s", FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));

	public static void glVertex4sv(@Ctype("GLshort*") long v){
		try{
			glVertex4sv.invoke(v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glVertex4sv = createCriticalMethodHandle("c_glVertex4sv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glClipPlane(@Ctype("GLenum") int plane, @Ctype("GLdouble*") long equation){
		try{
			glClipPlane.invoke(plane, equation);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClipPlane = createCriticalMethodHandle("c_glClipPlane", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glColorMaterial(@Ctype("GLenum") int face, @Ctype("GLenum") int mode){
		try{
			glColorMaterial.invoke(face, mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glColorMaterial = createCriticalMethodHandle("c_glColorMaterial", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFogf(@Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glFogf.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogf = createCriticalMethodHandle("c_glFogf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glFogfv(@Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glFogfv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogfv = createCriticalMethodHandle("c_glFogfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glFogi(@Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glFogi.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogi = createCriticalMethodHandle("c_glFogi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glFogiv(@Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glFogiv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFogiv = createCriticalMethodHandle("c_glFogiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLightf(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glLightf.invoke(light, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightf = createCriticalMethodHandle("c_glLightf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glLightfv(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glLightfv.invoke(light, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightfv = createCriticalMethodHandle("c_glLightfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLighti(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glLighti.invoke(light, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLighti = createCriticalMethodHandle("c_glLighti", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glLightiv(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glLightiv.invoke(light, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightiv = createCriticalMethodHandle("c_glLightiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLightModelf(@Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glLightModelf.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightModelf = createCriticalMethodHandle("c_glLightModelf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glLightModelfv(@Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glLightModelfv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightModelfv = createCriticalMethodHandle("c_glLightModelfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLightModeli(@Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glLightModeli.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightModeli = createCriticalMethodHandle("c_glLightModeli", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glLightModeliv(@Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glLightModeliv.invoke(pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLightModeliv = createCriticalMethodHandle("c_glLightModeliv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glLineStipple(@Ctype("GLint") int factor, @Ctype("GLushort") short pattern){
		try{
			glLineStipple.invoke(factor, pattern);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLineStipple = createCriticalMethodHandle("c_glLineStipple", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));

	public static void glMaterialf(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glMaterialf.invoke(face, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMaterialf = createCriticalMethodHandle("c_glMaterialf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glMaterialfv(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glMaterialfv.invoke(face, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMaterialfv = createCriticalMethodHandle("c_glMaterialfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMateriali(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glMateriali.invoke(face, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMateriali = createCriticalMethodHandle("c_glMateriali", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glMaterialiv(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glMaterialiv.invoke(face, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMaterialiv = createCriticalMethodHandle("c_glMaterialiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPolygonStipple(@Ctype("GLubyte*") long mask){
		try{
			glPolygonStipple.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPolygonStipple = createCriticalMethodHandle("c_glPolygonStipple", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glShadeModel(@Ctype("GLenum") int mode){
		try{
			glShadeModel.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glShadeModel = createCriticalMethodHandle("c_glShadeModel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glTexEnvf(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glTexEnvf.invoke(target, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexEnvf = createCriticalMethodHandle("c_glTexEnvf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glTexEnvfv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glTexEnvfv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexEnvfv = createCriticalMethodHandle("c_glTexEnvfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexEnvi(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glTexEnvi.invoke(target, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexEnvi = createCriticalMethodHandle("c_glTexEnvi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexEnviv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glTexEnviv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexEnviv = createCriticalMethodHandle("c_glTexEnviv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexGend(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLdouble") double param){
		try{
			glTexGend.invoke(coord, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGend = createCriticalMethodHandle("c_glTexGend", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));

	public static void glTexGendv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLdouble*") long params){
		try{
			glTexGendv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGendv = createCriticalMethodHandle("c_glTexGendv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexGenf(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glTexGenf.invoke(coord, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGenf = createCriticalMethodHandle("c_glTexGenf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glTexGenfv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glTexGenfv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGenfv = createCriticalMethodHandle("c_glTexGenfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glTexGeni(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glTexGeni.invoke(coord, pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGeni = createCriticalMethodHandle("c_glTexGeni", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glTexGeniv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glTexGeniv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTexGeniv = createCriticalMethodHandle("c_glTexGeniv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glFeedbackBuffer(@Ctype("GLsizei") int size, @Ctype("GLenum") int type, @Ctype("GLfloat*") long buffer){
		try{
			glFeedbackBuffer.invoke(size, type, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFeedbackBuffer = createCriticalMethodHandle("c_glFeedbackBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glSelectBuffer(@Ctype("GLsizei") int size, @Ctype("GLuint*") long buffer){
		try{
			glSelectBuffer.invoke(size, buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glSelectBuffer = createCriticalMethodHandle("c_glSelectBuffer", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLint") int glRenderMode(@Ctype("GLenum") int mode){
		try{
			return (int)glRenderMode.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRenderMode = createCriticalMethodHandle("c_glRenderMode", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glInitNames(){
		try{
			glInitNames.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glInitNames = createCriticalMethodHandle("c_glInitNames", FunctionDescriptor.ofVoid());

	public static void glLoadName(@Ctype("GLuint") int name){
		try{
			glLoadName.invoke(name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadName = createCriticalMethodHandle("c_glLoadName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glPassThrough(@Ctype("GLfloat") float token){
		try{
			glPassThrough.invoke(token);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPassThrough = createCriticalMethodHandle("c_glPassThrough", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glPopName(){
		try{
			glPopName.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPopName = createCriticalMethodHandle("c_glPopName", FunctionDescriptor.ofVoid());

	public static void glPushName(@Ctype("GLuint") int name){
		try{
			glPushName.invoke(name);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPushName = createCriticalMethodHandle("c_glPushName", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glClearAccum(@Ctype("GLfloat") float red, @Ctype("GLfloat") float green, @Ctype("GLfloat") float blue, @Ctype("GLfloat") float alpha){
		try{
			glClearAccum.invoke(red, green, blue, alpha);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearAccum = createCriticalMethodHandle("c_glClearAccum", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glClearIndex(@Ctype("GLfloat") float c){
		try{
			glClearIndex.invoke(c);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glClearIndex = createCriticalMethodHandle("c_glClearIndex", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glIndexMask(@Ctype("GLuint") int mask){
		try{
			glIndexMask.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIndexMask = createCriticalMethodHandle("c_glIndexMask", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glAccum(@Ctype("GLenum") int op, @Ctype("GLfloat") float value){
		try{
			glAccum.invoke(op, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glAccum = createCriticalMethodHandle("c_glAccum", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glPopAttrib(){
		try{
			glPopAttrib.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPopAttrib = createCriticalMethodHandle("c_glPopAttrib", FunctionDescriptor.ofVoid());

	public static void glPushAttrib(@Ctype("GLbitfield") int mask){
		try{
			glPushAttrib.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPushAttrib = createCriticalMethodHandle("c_glPushAttrib", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glMap1d(@Ctype("GLenum") int target, @Ctype("GLdouble") double u1, @Ctype("GLdouble") double u2, @Ctype("GLint") int stride, @Ctype("GLint") int order, @Ctype("GLdouble*") long points){
		try{
			glMap1d.invoke(target, u1, u2, stride, order, points);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMap1d = createCriticalMethodHandle("c_glMap1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMap1f(@Ctype("GLenum") int target, @Ctype("GLfloat") float u1, @Ctype("GLfloat") float u2, @Ctype("GLint") int stride, @Ctype("GLint") int order, @Ctype("GLfloat*") long points){
		try{
			glMap1f.invoke(target, u1, u2, stride, order, points);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMap1f = createCriticalMethodHandle("c_glMap1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMap2d(@Ctype("GLenum") int target, @Ctype("GLdouble") double u1, @Ctype("GLdouble") double u2, @Ctype("GLint") int ustride, @Ctype("GLint") int uorder, @Ctype("GLdouble") double v1, @Ctype("GLdouble") double v2, @Ctype("GLint") int vstride, @Ctype("GLint") int vorder, @Ctype("GLdouble*") long points){
		try{
			glMap2d.invoke(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMap2d = createCriticalMethodHandle("c_glMap2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMap2f(@Ctype("GLenum") int target, @Ctype("GLfloat") float u1, @Ctype("GLfloat") float u2, @Ctype("GLint") int ustride, @Ctype("GLint") int uorder, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2, @Ctype("GLint") int vstride, @Ctype("GLint") int vorder, @Ctype("GLfloat*") long points){
		try{
			glMap2f.invoke(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMap2f = createCriticalMethodHandle("c_glMap2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glMapGrid1d(@Ctype("GLint") int un, @Ctype("GLdouble") double u1, @Ctype("GLdouble") double u2){
		try{
			glMapGrid1d.invoke(un, u1, u2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapGrid1d = createCriticalMethodHandle("c_glMapGrid1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glMapGrid1f(@Ctype("GLint") int un, @Ctype("GLfloat") float u1, @Ctype("GLfloat") float u2){
		try{
			glMapGrid1f.invoke(un, u1, u2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapGrid1f = createCriticalMethodHandle("c_glMapGrid1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glMapGrid2d(@Ctype("GLint") int un, @Ctype("GLdouble") double u1, @Ctype("GLdouble") double u2, @Ctype("GLint") int vn, @Ctype("GLdouble") double v1, @Ctype("GLdouble") double v2){
		try{
			glMapGrid2d.invoke(un, u1, u2, vn, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapGrid2d = createCriticalMethodHandle("c_glMapGrid2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glMapGrid2f(@Ctype("GLint") int un, @Ctype("GLfloat") float u1, @Ctype("GLfloat") float u2, @Ctype("GLint") int vn, @Ctype("GLfloat") float v1, @Ctype("GLfloat") float v2){
		try{
			glMapGrid2f.invoke(un, u1, u2, vn, v1, v2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMapGrid2f = createCriticalMethodHandle("c_glMapGrid2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glEvalCoord1d(@Ctype("GLdouble") double u){
		try{
			glEvalCoord1d.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord1d = createCriticalMethodHandle("c_glEvalCoord1d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));

	public static void glEvalCoord1dv(@Ctype("GLdouble*") long u){
		try{
			glEvalCoord1dv.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord1dv = createCriticalMethodHandle("c_glEvalCoord1dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEvalCoord1f(@Ctype("GLfloat") float u){
		try{
			glEvalCoord1f.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord1f = createCriticalMethodHandle("c_glEvalCoord1f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));

	public static void glEvalCoord1fv(@Ctype("GLfloat*") long u){
		try{
			glEvalCoord1fv.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord1fv = createCriticalMethodHandle("c_glEvalCoord1fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEvalCoord2d(@Ctype("GLdouble") double u, @Ctype("GLdouble") double v){
		try{
			glEvalCoord2d.invoke(u, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord2d = createCriticalMethodHandle("c_glEvalCoord2d", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glEvalCoord2dv(@Ctype("GLdouble*") long u){
		try{
			glEvalCoord2dv.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord2dv = createCriticalMethodHandle("c_glEvalCoord2dv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEvalCoord2f(@Ctype("GLfloat") float u, @Ctype("GLfloat") float v){
		try{
			glEvalCoord2f.invoke(u, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord2f = createCriticalMethodHandle("c_glEvalCoord2f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glEvalCoord2fv(@Ctype("GLfloat*") long u){
		try{
			glEvalCoord2fv.invoke(u);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalCoord2fv = createCriticalMethodHandle("c_glEvalCoord2fv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glEvalMesh1(@Ctype("GLenum") int mode, @Ctype("GLint") int i1, @Ctype("GLint") int i2){
		try{
			glEvalMesh1.invoke(mode, i1, i2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalMesh1 = createCriticalMethodHandle("c_glEvalMesh1", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEvalPoint1(@Ctype("GLint") int i){
		try{
			glEvalPoint1.invoke(i);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalPoint1 = createCriticalMethodHandle("c_glEvalPoint1", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glEvalMesh2(@Ctype("GLenum") int mode, @Ctype("GLint") int i1, @Ctype("GLint") int i2, @Ctype("GLint") int j1, @Ctype("GLint") int j2){
		try{
			glEvalMesh2.invoke(mode, i1, i2, j1, j2);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalMesh2 = createCriticalMethodHandle("c_glEvalMesh2", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glEvalPoint2(@Ctype("GLint") int i, @Ctype("GLint") int j){
		try{
			glEvalPoint2.invoke(i, j);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glEvalPoint2 = createCriticalMethodHandle("c_glEvalPoint2", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glAlphaFunc(@Ctype("GLenum") int func, @Ctype("GLfloat") float ref){
		try{
			glAlphaFunc.invoke(func, ref);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glAlphaFunc = createCriticalMethodHandle("c_glAlphaFunc", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glPixelZoom(@Ctype("GLfloat") float xfactor, @Ctype("GLfloat") float yfactor){
		try{
			glPixelZoom.invoke(xfactor, yfactor);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelZoom = createCriticalMethodHandle("c_glPixelZoom", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glPixelTransferf(@Ctype("GLenum") int pname, @Ctype("GLfloat") float param){
		try{
			glPixelTransferf.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelTransferf = createCriticalMethodHandle("c_glPixelTransferf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void glPixelTransferi(@Ctype("GLenum") int pname, @Ctype("GLint") int param){
		try{
			glPixelTransferi.invoke(pname, param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelTransferi = createCriticalMethodHandle("c_glPixelTransferi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glPixelMapfv(@Ctype("GLenum") int map, @Ctype("GLsizei") int mapsize, @Ctype("GLfloat*") long values){
		try{
			glPixelMapfv.invoke(map, mapsize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelMapfv = createCriticalMethodHandle("c_glPixelMapfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPixelMapuiv(@Ctype("GLenum") int map, @Ctype("GLsizei") int mapsize, @Ctype("GLuint*") long values){
		try{
			glPixelMapuiv.invoke(map, mapsize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelMapuiv = createCriticalMethodHandle("c_glPixelMapuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glPixelMapusv(@Ctype("GLenum") int map, @Ctype("GLsizei") int mapsize, @Ctype("GLushort*") long values){
		try{
			glPixelMapusv.invoke(map, mapsize, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPixelMapusv = createCriticalMethodHandle("c_glPixelMapusv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glCopyPixels(@Ctype("GLint") int x, @Ctype("GLint") int y, @Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int type){
		try{
			glCopyPixels.invoke(x, y, width, height, type);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glCopyPixels = createCriticalMethodHandle("c_glCopyPixels", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void glDrawPixels(@Ctype("GLsizei") int width, @Ctype("GLsizei") int height, @Ctype("GLenum") int format, @Ctype("GLenum") int type, @Ctype("void*") long pixels){
		try{
			glDrawPixels.invoke(width, height, format, type, pixels);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glDrawPixels = createCriticalMethodHandle("c_glDrawPixels", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetClipPlane(@Ctype("GLenum") int plane, @Ctype("GLdouble*") long equation){
		try{
			glGetClipPlane.invoke(plane, equation);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetClipPlane = createCriticalMethodHandle("c_glGetClipPlane", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetLightfv(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetLightfv.invoke(light, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetLightfv = createCriticalMethodHandle("c_glGetLightfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetLightiv(@Ctype("GLenum") int light, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetLightiv.invoke(light, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetLightiv = createCriticalMethodHandle("c_glGetLightiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetMapdv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLdouble*") long v){
		try{
			glGetMapdv.invoke(target, query, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMapdv = createCriticalMethodHandle("c_glGetMapdv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetMapfv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLfloat*") long v){
		try{
			glGetMapfv.invoke(target, query, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMapfv = createCriticalMethodHandle("c_glGetMapfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetMapiv(@Ctype("GLenum") int target, @Ctype("GLenum") int query, @Ctype("GLint*") long v){
		try{
			glGetMapiv.invoke(target, query, v);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMapiv = createCriticalMethodHandle("c_glGetMapiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetMaterialfv(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetMaterialfv.invoke(face, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMaterialfv = createCriticalMethodHandle("c_glGetMaterialfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetMaterialiv(@Ctype("GLenum") int face, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetMaterialiv.invoke(face, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetMaterialiv = createCriticalMethodHandle("c_glGetMaterialiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetPixelMapfv(@Ctype("GLenum") int map, @Ctype("GLfloat*") long values){
		try{
			glGetPixelMapfv.invoke(map, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetPixelMapfv = createCriticalMethodHandle("c_glGetPixelMapfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetPixelMapuiv(@Ctype("GLenum") int map, @Ctype("GLuint*") long values){
		try{
			glGetPixelMapuiv.invoke(map, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetPixelMapuiv = createCriticalMethodHandle("c_glGetPixelMapuiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetPixelMapusv(@Ctype("GLenum") int map, @Ctype("GLushort*") long values){
		try{
			glGetPixelMapusv.invoke(map, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetPixelMapusv = createCriticalMethodHandle("c_glGetPixelMapusv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetPolygonStipple(@Ctype("GLubyte*") long mask){
		try{
			glGetPolygonStipple.invoke(mask);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetPolygonStipple = createCriticalMethodHandle("c_glGetPolygonStipple", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glGetTexEnvfv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTexEnvfv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexEnvfv = createCriticalMethodHandle("c_glGetTexEnvfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexEnviv(@Ctype("GLenum") int target, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTexEnviv.invoke(target, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexEnviv = createCriticalMethodHandle("c_glGetTexEnviv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexGendv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLdouble*") long params){
		try{
			glGetTexGendv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexGendv = createCriticalMethodHandle("c_glGetTexGendv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexGenfv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLfloat*") long params){
		try{
			glGetTexGenfv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexGenfv = createCriticalMethodHandle("c_glGetTexGenfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void glGetTexGeniv(@Ctype("GLenum") int coord, @Ctype("GLenum") int pname, @Ctype("GLint*") long params){
		try{
			glGetTexGeniv.invoke(coord, pname, params);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glGetTexGeniv = createCriticalMethodHandle("c_glGetTexGeniv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("GLboolean") boolean glIsList(@Ctype("GLuint") int list){
		try{
			return (boolean)glIsList.invoke(list);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glIsList = createCriticalMethodHandle("c_glIsList", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static void glFrustum(@Ctype("GLdouble") double left, @Ctype("GLdouble") double right, @Ctype("GLdouble") double bottom, @Ctype("GLdouble") double top, @Ctype("GLdouble") double zNear, @Ctype("GLdouble") double zFar){
		try{
			glFrustum.invoke(left, right, bottom, top, zNear, zFar);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glFrustum = createCriticalMethodHandle("c_glFrustum", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glLoadIdentity(){
		try{
			glLoadIdentity.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadIdentity = createCriticalMethodHandle("c_glLoadIdentity", FunctionDescriptor.ofVoid());

	public static void glLoadMatrixf(@Ctype("GLfloat*") long m){
		try{
			glLoadMatrixf.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadMatrixf = createCriticalMethodHandle("c_glLoadMatrixf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glLoadMatrixd(@Ctype("GLdouble*") long m){
		try{
			glLoadMatrixd.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glLoadMatrixd = createCriticalMethodHandle("c_glLoadMatrixd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glMatrixMode(@Ctype("GLenum") int mode){
		try{
			glMatrixMode.invoke(mode);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMatrixMode = createCriticalMethodHandle("c_glMatrixMode", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void glMultMatrixf(@Ctype("GLfloat*") long m){
		try{
			glMultMatrixf.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultMatrixf = createCriticalMethodHandle("c_glMultMatrixf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glMultMatrixd(@Ctype("GLdouble*") long m){
		try{
			glMultMatrixd.invoke(m);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glMultMatrixd = createCriticalMethodHandle("c_glMultMatrixd", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static void glOrtho(@Ctype("GLdouble") double left, @Ctype("GLdouble") double right, @Ctype("GLdouble") double bottom, @Ctype("GLdouble") double top, @Ctype("GLdouble") double zNear, @Ctype("GLdouble") double zFar){
		try{
			glOrtho.invoke(left, right, bottom, top, zNear, zFar);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glOrtho = createCriticalMethodHandle("c_glOrtho", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glPopMatrix(){
		try{
			glPopMatrix.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPopMatrix = createCriticalMethodHandle("c_glPopMatrix", FunctionDescriptor.ofVoid());

	public static void glPushMatrix(){
		try{
			glPushMatrix.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glPushMatrix = createCriticalMethodHandle("c_glPushMatrix", FunctionDescriptor.ofVoid());

	public static void glRotated(@Ctype("GLdouble") double angle, @Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glRotated.invoke(angle, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRotated = createCriticalMethodHandle("c_glRotated", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glRotatef(@Ctype("GLfloat") float angle, @Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glRotatef.invoke(angle, x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glRotatef = createCriticalMethodHandle("c_glRotatef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glScaled(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glScaled.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScaled = createCriticalMethodHandle("c_glScaled", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glScalef(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glScalef.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glScalef = createCriticalMethodHandle("c_glScalef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void glTranslated(@Ctype("GLdouble") double x, @Ctype("GLdouble") double y, @Ctype("GLdouble") double z){
		try{
			glTranslated.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTranslated = createCriticalMethodHandle("c_glTranslated", FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));

	public static void glTranslatef(@Ctype("GLfloat") float x, @Ctype("GLfloat") float y, @Ctype("GLfloat") float z){
		try{
			glTranslatef.invoke(x, y, z);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle glTranslatef = createCriticalMethodHandle("c_glTranslatef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

}
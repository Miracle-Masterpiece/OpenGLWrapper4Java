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
#ifdef __cplusplus
extern "C"{
#endif

void c_glBlendFuncSeparate(GLenum sfactorRGB, GLenum dfactorRGB, GLenum sfactorAlpha, GLenum dfactorAlpha){
   glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); 
}

void c_glMultiDrawArrays(GLenum mode, GLint *first, GLsizei *count, GLsizei drawcount){
   glMultiDrawArrays(mode, first, count, drawcount); 
}

void c_glMultiDrawElements(GLenum mode, GLsizei *count, GLenum type, const void *const*indices, GLsizei drawcount){
   glMultiDrawElements(mode, count, type, indices, drawcount); 
}

void c_glPointParameterf(GLenum pname, GLfloat param){
   glPointParameterf(pname, param); 
}

void c_glPointParameterfv(GLenum pname, GLfloat *params){
   glPointParameterfv(pname, params); 
}

void c_glPointParameteri(GLenum pname, GLint param){
   glPointParameteri(pname, param); 
}

void c_glPointParameteriv(GLenum pname, GLint *params){
   glPointParameteriv(pname, params); 
}

void c_glFogCoordf(GLfloat coord){
   glFogCoordf(coord); 
}

void c_glFogCoordfv(GLfloat *coord){
   glFogCoordfv(coord); 
}

void c_glFogCoordd(GLdouble coord){
   glFogCoordd(coord); 
}

void c_glFogCoorddv(GLdouble *coord){
   glFogCoorddv(coord); 
}

void c_glFogCoordPointer(GLenum type, GLsizei stride, void *pointer){
   glFogCoordPointer(type, stride, pointer); 
}

void c_glSecondaryColor3b(GLbyte red, GLbyte green, GLbyte blue){
   glSecondaryColor3b(red, green, blue); 
}

void c_glSecondaryColor3bv(GLbyte *v){
   glSecondaryColor3bv(v); 
}

void c_glSecondaryColor3d(GLdouble red, GLdouble green, GLdouble blue){
   glSecondaryColor3d(red, green, blue); 
}

void c_glSecondaryColor3dv(GLdouble *v){
   glSecondaryColor3dv(v); 
}

void c_glSecondaryColor3f(GLfloat red, GLfloat green, GLfloat blue){
   glSecondaryColor3f(red, green, blue); 
}

void c_glSecondaryColor3fv(GLfloat *v){
   glSecondaryColor3fv(v); 
}

void c_glSecondaryColor3i(GLint red, GLint green, GLint blue){
   glSecondaryColor3i(red, green, blue); 
}

void c_glSecondaryColor3iv(GLint *v){
   glSecondaryColor3iv(v); 
}

void c_glSecondaryColor3s(GLshort red, GLshort green, GLshort blue){
   glSecondaryColor3s(red, green, blue); 
}

void c_glSecondaryColor3sv(GLshort *v){
   glSecondaryColor3sv(v); 
}

void c_glSecondaryColor3ub(GLubyte red, GLubyte green, GLubyte blue){
   glSecondaryColor3ub(red, green, blue); 
}

void c_glSecondaryColor3ubv(GLubyte *v){
   glSecondaryColor3ubv(v); 
}

void c_glSecondaryColor3ui(GLuint red, GLuint green, GLuint blue){
   glSecondaryColor3ui(red, green, blue); 
}

void c_glSecondaryColor3uiv(GLuint *v){
   glSecondaryColor3uiv(v); 
}

void c_glSecondaryColor3us(GLushort red, GLushort green, GLushort blue){
   glSecondaryColor3us(red, green, blue); 
}

void c_glSecondaryColor3usv(GLushort *v){
   glSecondaryColor3usv(v); 
}

void c_glSecondaryColorPointer(GLint size, GLenum type, GLsizei stride, void *pointer){
   glSecondaryColorPointer(size, type, stride, pointer); 
}

void c_glWindowPos2d(GLdouble x, GLdouble y){
   glWindowPos2d(x, y); 
}

void c_glWindowPos2dv(GLdouble *v){
   glWindowPos2dv(v); 
}

void c_glWindowPos2f(GLfloat x, GLfloat y){
   glWindowPos2f(x, y); 
}

void c_glWindowPos2fv(GLfloat *v){
   glWindowPos2fv(v); 
}

void c_glWindowPos2i(GLint x, GLint y){
   glWindowPos2i(x, y); 
}

void c_glWindowPos2iv(GLint *v){
   glWindowPos2iv(v); 
}

void c_glWindowPos2s(GLshort x, GLshort y){
   glWindowPos2s(x, y); 
}

void c_glWindowPos2sv(GLshort *v){
   glWindowPos2sv(v); 
}

void c_glWindowPos3d(GLdouble x, GLdouble y, GLdouble z){
   glWindowPos3d(x, y, z); 
}

void c_glWindowPos3dv(GLdouble *v){
   glWindowPos3dv(v); 
}

void c_glWindowPos3f(GLfloat x, GLfloat y, GLfloat z){
   glWindowPos3f(x, y, z); 
}

void c_glWindowPos3fv(GLfloat *v){
   glWindowPos3fv(v); 
}

void c_glWindowPos3i(GLint x, GLint y, GLint z){
   glWindowPos3i(x, y, z); 
}

void c_glWindowPos3iv(GLint *v){
   glWindowPos3iv(v); 
}

void c_glWindowPos3s(GLshort x, GLshort y, GLshort z){
   glWindowPos3s(x, y, z); 
}

void c_glWindowPos3sv(GLshort *v){
   glWindowPos3sv(v); 
}

void c_glBlendColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha){
   glBlendColor(red, green, blue, alpha); 
}

void c_glBlendEquation(GLenum mode){
   glBlendEquation(mode); 
}

#ifdef __cplusplus
}
#endif


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

void c_glActiveTexture(GLenum texture){
   glActiveTexture(texture); 
}

void c_glSampleCoverage(GLfloat value, GLboolean invert){
   glSampleCoverage(value, invert); 
}

void c_glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void *data){
   glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data); 
}

void c_glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void *data){
   glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data); 
}

void c_glCompressedTexImage1D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLint border, GLsizei imageSize, void *data){
   glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data); 
}

void c_glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void *data){
   glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); 
}

void c_glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void *data){
   glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data); 
}

void c_glCompressedTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void *data){
   glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data); 
}

void c_glGetCompressedTexImage(GLenum target, GLint level, void *img){
   glGetCompressedTexImage(target, level, img); 
}

void c_glClientActiveTexture(GLenum texture){
   glClientActiveTexture(texture); 
}

void c_glMultiTexCoord1d(GLenum target, GLdouble s){
   glMultiTexCoord1d(target, s); 
}

void c_glMultiTexCoord1dv(GLenum target, GLdouble *v){
   glMultiTexCoord1dv(target, v); 
}

void c_glMultiTexCoord1f(GLenum target, GLfloat s){
   glMultiTexCoord1f(target, s); 
}

void c_glMultiTexCoord1fv(GLenum target, GLfloat *v){
   glMultiTexCoord1fv(target, v); 
}

void c_glMultiTexCoord1i(GLenum target, GLint s){
   glMultiTexCoord1i(target, s); 
}

void c_glMultiTexCoord1iv(GLenum target, GLint *v){
   glMultiTexCoord1iv(target, v); 
}

void c_glMultiTexCoord1s(GLenum target, GLshort s){
   glMultiTexCoord1s(target, s); 
}

void c_glMultiTexCoord1sv(GLenum target, GLshort *v){
   glMultiTexCoord1sv(target, v); 
}

void c_glMultiTexCoord2d(GLenum target, GLdouble s, GLdouble t){
   glMultiTexCoord2d(target, s, t); 
}

void c_glMultiTexCoord2dv(GLenum target, GLdouble *v){
   glMultiTexCoord2dv(target, v); 
}

void c_glMultiTexCoord2f(GLenum target, GLfloat s, GLfloat t){
   glMultiTexCoord2f(target, s, t); 
}

void c_glMultiTexCoord2fv(GLenum target, GLfloat *v){
   glMultiTexCoord2fv(target, v); 
}

void c_glMultiTexCoord2i(GLenum target, GLint s, GLint t){
   glMultiTexCoord2i(target, s, t); 
}

void c_glMultiTexCoord2iv(GLenum target, GLint *v){
   glMultiTexCoord2iv(target, v); 
}

void c_glMultiTexCoord2s(GLenum target, GLshort s, GLshort t){
   glMultiTexCoord2s(target, s, t); 
}

void c_glMultiTexCoord2sv(GLenum target, GLshort *v){
   glMultiTexCoord2sv(target, v); 
}

void c_glMultiTexCoord3d(GLenum target, GLdouble s, GLdouble t, GLdouble r){
   glMultiTexCoord3d(target, s, t, r); 
}

void c_glMultiTexCoord3dv(GLenum target, GLdouble *v){
   glMultiTexCoord3dv(target, v); 
}

void c_glMultiTexCoord3f(GLenum target, GLfloat s, GLfloat t, GLfloat r){
   glMultiTexCoord3f(target, s, t, r); 
}

void c_glMultiTexCoord3fv(GLenum target, GLfloat *v){
   glMultiTexCoord3fv(target, v); 
}

void c_glMultiTexCoord3i(GLenum target, GLint s, GLint t, GLint r){
   glMultiTexCoord3i(target, s, t, r); 
}

void c_glMultiTexCoord3iv(GLenum target, GLint *v){
   glMultiTexCoord3iv(target, v); 
}

void c_glMultiTexCoord3s(GLenum target, GLshort s, GLshort t, GLshort r){
   glMultiTexCoord3s(target, s, t, r); 
}

void c_glMultiTexCoord3sv(GLenum target, GLshort *v){
   glMultiTexCoord3sv(target, v); 
}

void c_glMultiTexCoord4d(GLenum target, GLdouble s, GLdouble t, GLdouble r, GLdouble q){
   glMultiTexCoord4d(target, s, t, r, q); 
}

void c_glMultiTexCoord4dv(GLenum target, GLdouble *v){
   glMultiTexCoord4dv(target, v); 
}

void c_glMultiTexCoord4f(GLenum target, GLfloat s, GLfloat t, GLfloat r, GLfloat q){
   glMultiTexCoord4f(target, s, t, r, q); 
}

void c_glMultiTexCoord4fv(GLenum target, GLfloat *v){
   glMultiTexCoord4fv(target, v); 
}

void c_glMultiTexCoord4i(GLenum target, GLint s, GLint t, GLint r, GLint q){
   glMultiTexCoord4i(target, s, t, r, q); 
}

void c_glMultiTexCoord4iv(GLenum target, GLint *v){
   glMultiTexCoord4iv(target, v); 
}

void c_glMultiTexCoord4s(GLenum target, GLshort s, GLshort t, GLshort r, GLshort q){
   glMultiTexCoord4s(target, s, t, r, q); 
}

void c_glMultiTexCoord4sv(GLenum target, GLshort *v){
   glMultiTexCoord4sv(target, v); 
}

void c_glLoadTransposeMatrixf(GLfloat *m){
   glLoadTransposeMatrixf(m); 
}

void c_glLoadTransposeMatrixd(GLdouble *m){
   glLoadTransposeMatrixd(m); 
}

void c_glMultTransposeMatrixf(GLfloat *m){
   glMultTransposeMatrixf(m); 
}

void c_glMultTransposeMatrixd(GLdouble *m){
   glMultTransposeMatrixd(m); 
}
#ifdef __cplusplus
}
#endif


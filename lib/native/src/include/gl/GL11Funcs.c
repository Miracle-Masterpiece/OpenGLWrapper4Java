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

void c_glDrawArrays(GLenum mode, GLint first, GLsizei count){
   glDrawArrays(mode, first, count); 
}

void c_glDrawElements(GLenum mode, GLsizei count, GLenum type, void *indices){
   glDrawElements(mode, count, type, indices); 
}

void c_glGetPointerv(GLenum pname, void **params){
   glGetPointerv(pname, params); 
}

void c_glPolygonOffset(GLfloat factor, GLfloat units){
   glPolygonOffset(factor, units); 
}

void c_glCopyTexImage1D(GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLint border){
   glCopyTexImage1D(target, level, internalformat, x, y, width, border); 
}

void c_glCopyTexImage2D(GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border){
   glCopyTexImage2D(target, level, internalformat, x, y, width, height, border); 
}

void c_glCopyTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width){
   glCopyTexSubImage1D(target, level, xoffset, x, y, width); 
}

void c_glCopyTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height){
   glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height); 
}

void c_glTexSubImage1D(GLenum target, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void *pixels){
   glTexSubImage1D(target, level, xoffset, width, format, type, pixels); 
}

void c_glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void *pixels){
   glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels); 
}

void c_glBindTexture(GLenum target, GLuint texture){
   glBindTexture(target, texture); 
}

void c_glDeleteTextures(GLsizei n, GLuint *textures){
   glDeleteTextures(n, textures); 
}

void c_glGenTextures(GLsizei n, GLuint *textures){
   glGenTextures(n, textures); 
}

GLboolean c_glIsTexture(GLuint texture){
  return glIsTexture(texture); 
}

void c_glArrayElement(GLint i){
   glArrayElement(i); 
}

void c_glColorPointer(GLint size, GLenum type, GLsizei stride, void *pointer){
   glColorPointer(size, type, stride, pointer); 
}

void c_glDisableClientState(GLenum array){
   glDisableClientState(array); 
}

void c_glEdgeFlagPointer(GLsizei stride, void *pointer){
   glEdgeFlagPointer(stride, pointer); 
}

void c_glEnableClientState(GLenum array){
   glEnableClientState(array); 
}

void c_glIndexPointer(GLenum type, GLsizei stride, void *pointer){
   glIndexPointer(type, stride, pointer); 
}

void c_glInterleavedArrays(GLenum format, GLsizei stride, void *pointer){
   glInterleavedArrays(format, stride, pointer); 
}

void c_glNormalPointer(GLenum type, GLsizei stride, void *pointer){
   glNormalPointer(type, stride, pointer); 
}

void c_glTexCoordPointer(GLint size, GLenum type, GLsizei stride, void *pointer){
   glTexCoordPointer(size, type, stride, pointer); 
}

void c_glVertexPointer(GLint size, GLenum type, GLsizei stride, void *pointer){
   glVertexPointer(size, type, stride, pointer); 
}

GLboolean c_glAreTexturesResident(GLsizei n, GLuint *textures, GLboolean *residences){
  return glAreTexturesResident(n, textures, residences); 
}

void c_glPrioritizeTextures(GLsizei n, GLuint *textures, GLfloat *priorities){
   glPrioritizeTextures(n, textures, priorities); 
}

void c_glIndexub(GLubyte c){
   glIndexub(c); 
}

void c_glIndexubv(GLubyte *c){
   glIndexubv(c); 
}

void c_glPopClientAttrib(){
   glPopClientAttrib(); 
}

void c_glPushClientAttrib(GLbitfield mask){
   glPushClientAttrib(mask); 
}

#ifdef __cplusplus
}
#endif

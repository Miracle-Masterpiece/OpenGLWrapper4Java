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

void c_glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void *indices){
   glDrawRangeElements(mode, start, end, count, type, indices); 
}

void c_glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void *pixels){
   glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels); 
}

void c_glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void *pixels){
   glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); 
}

void c_glCopyTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height){
   glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height); 
}

#ifdef __cplusplus
}
#endif

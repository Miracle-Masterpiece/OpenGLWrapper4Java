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

void c_glBufferStorage(GLenum target, GLsizeiptr size, void *data, GLbitfield flags){
   glBufferStorage(target, size, data, flags); 
}

void c_glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void *data){
   glClearTexImage(texture, level, format, type, data); 
}

void c_glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void *data){
   glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data); 
}

void c_glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint *buffers){
   glBindBuffersBase(target, first, count, buffers); 
}

void c_glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint *buffers, GLintptr *offsets, GLsizeiptr *sizes){
   glBindBuffersRange(target, first, count, buffers, offsets, sizes); 
}

void c_glBindTextures(GLuint first, GLsizei count, GLuint *textures){
   glBindTextures(first, count, textures); 
}

void c_glBindSamplers(GLuint first, GLsizei count, GLuint *samplers){
   glBindSamplers(first, count, samplers); 
}

void c_glBindImageTextures(GLuint first, GLsizei count, GLuint *textures){
   glBindImageTextures(first, count, textures); 
}

void c_glBindVertexBuffers(GLuint first, GLsizei count, GLuint *buffers, GLintptr *offsets, GLsizei *strides){
   glBindVertexBuffers(first, count, buffers, offsets, strides); 
}

#ifdef __cplusplus
}
#endif

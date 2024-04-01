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

void c_glGenQueries(GLsizei n, GLuint *ids){
   glGenQueries(n, ids); 
}

void c_glDeleteQueries(GLsizei n, GLuint *ids){
   glDeleteQueries(n, ids); 
}

GLboolean c_glIsQuery(GLuint id){
  return glIsQuery(id); 
}

void c_glBeginQuery(GLenum target, GLuint id){
   glBeginQuery(target, id); 
}

void c_glEndQuery(GLenum target){
   glEndQuery(target); 
}

void c_glGetQueryiv(GLenum target, GLenum pname, GLint *params){
   glGetQueryiv(target, pname, params); 
}

void c_glGetQueryObjectiv(GLuint id, GLenum pname, GLint *params){
   glGetQueryObjectiv(id, pname, params); 
}

void c_glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint *params){
   glGetQueryObjectuiv(id, pname, params); 
}

void c_glBindBuffer(GLenum target, GLuint buffer){
   glBindBuffer(target, buffer); 
}

void c_glDeleteBuffers(GLsizei n, GLuint *buffers){
   glDeleteBuffers(n, buffers); 
}

void c_glGenBuffers(GLsizei n, GLuint *buffers){
   glGenBuffers(n, buffers); 
}

GLboolean c_glIsBuffer(GLuint buffer){
  return glIsBuffer(buffer); 
}

void c_glBufferData(GLenum target, GLsizeiptr size, void *data, GLenum usage){
   glBufferData(target, size, data, usage); 
}

void c_glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void *data){
   glBufferSubData(target, offset, size, data); 
}

void c_glGetBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void *data){
   glGetBufferSubData(target, offset, size, data); 
}

void* c_glMapBuffer(GLenum target, GLenum access){
  return glMapBuffer(target, access); 
}

GLboolean c_glUnmapBuffer(GLenum target){
  return glUnmapBuffer(target); 
}

void c_glGetBufferParameteriv(GLenum target, GLenum pname, GLint *params){
   glGetBufferParameteriv(target, pname, params); 
}

void c_glGetBufferPointerv(GLenum target, GLenum pname, void **params){
   glGetBufferPointerv(target, pname, params); 
}

#ifdef __cplusplus
}
#endif


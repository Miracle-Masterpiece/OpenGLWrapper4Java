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

void c_glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void *indices, GLint basevertex){
   glDrawElementsBaseVertex(mode, count, type, indices, basevertex); 
}

void c_glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void *indices, GLint basevertex){
   glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex); 
}

void c_glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void *indices, GLsizei instancecount, GLint basevertex){
   glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex); 
}

void c_glMultiDrawElementsBaseVertex(GLenum mode, GLsizei *count, GLenum type, void *const* indices, GLsizei drawcount, GLint *basevertex){
   glMultiDrawElementsBaseVertex(mode, count, type, indices, drawcount, basevertex); 
}

void c_glProvokingVertex(GLenum mode){
   glProvokingVertex(mode); 
}

GLsync c_glFenceSync(GLenum condition, GLbitfield flags){
  return glFenceSync(condition, flags); 
}

GLboolean c_glIsSync(GLsync sync){
  return glIsSync(sync); 
}

void c_glDeleteSync(GLsync sync){
   glDeleteSync(sync); 
}

GLenum c_glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout){
  return glClientWaitSync(sync, flags, timeout); 
}

void c_glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout){
   glWaitSync(sync, flags, timeout); 
}

void c_glGetInteger64v(GLenum pname, GLint64 *data){
   glGetInteger64v(pname, data); 
}

void c_glGetSynciv(GLsync sync, GLenum pname, GLsizei count, GLsizei *length, GLint *values){
   glGetSynciv(sync, pname, count, length, values); 
}

void c_glGetInteger64i_v(GLenum target, GLuint index, GLint64 *data){
   glGetInteger64i_v(target, index, data); 
}

void c_glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 *params){
   glGetBufferParameteri64v(target, pname, params); 
}

void c_glFramebufferTexture(GLenum target, GLenum attachment, GLuint texture, GLint level){
   glFramebufferTexture(target, attachment, texture, level); 
}

void c_glTexImage2DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations){
   glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations); 
}

void c_glTexImage3DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations){
   glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations); 
}

void c_glGetMultisamplefv(GLenum pname, GLuint index, GLfloat *val){
   glGetMultisamplefv(pname, index, val); 
}

void c_glSampleMaski(GLuint maskNumber, GLbitfield mask){
   glSampleMaski(maskNumber, mask); 
}

#ifdef __cplusplus
}
#endif

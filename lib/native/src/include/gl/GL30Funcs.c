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

void c_glColorMaski(GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a){
   glColorMaski(index, r, g, b, a); 
}

void c_glGetBooleani_v(GLenum target, GLuint index, GLboolean *data){
   glGetBooleani_v(target, index, data); 
}

void c_glGetIntegeri_v(GLenum target, GLuint index, GLint *data){
   glGetIntegeri_v(target, index, data); 
}

void c_glEnablei(GLenum target, GLuint index){
   glEnablei(target, index); 
}

void c_glDisablei(GLenum target, GLuint index){
   glDisablei(target, index); 
}

GLboolean c_glIsEnabledi(GLenum target, GLuint index){
  return glIsEnabledi(target, index); 
}

void c_glBeginTransformFeedback(GLenum primitiveMode){
   glBeginTransformFeedback(primitiveMode); 
}

void c_glEndTransformFeedback(){
   glEndTransformFeedback(); 
}

void c_glBindBufferRange(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size){
   glBindBufferRange(target, index, buffer, offset, size); 
}

void c_glBindBufferBase(GLenum target, GLuint index, GLuint buffer){
   glBindBufferBase(target, index, buffer); 
}

void c_glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar *const* varyings, GLenum bufferMode){
   glTransformFeedbackVaryings(program, count, varyings, bufferMode); 
}

void c_glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei *length, GLsizei *size, GLenum *type, GLchar *name){
   glGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name); 
}

void c_glClampColor(GLenum target, GLenum clamp){
   glClampColor(target, clamp); 
}

void c_glBeginConditionalRender(GLuint id, GLenum mode){
   glBeginConditionalRender(id, mode); 
}

void c_glEndConditionalRender(){
   glEndConditionalRender(); 
}

void c_glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void *pointer){
   glVertexAttribIPointer(index, size, type, stride, pointer); 
}

void c_glGetVertexAttribIiv(GLuint index, GLenum pname, GLint *params){
   glGetVertexAttribIiv(index, pname, params); 
}

void c_glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint *params){
   glGetVertexAttribIuiv(index, pname, params); 
}

void c_glVertexAttribI1i(GLuint index, GLint x){
   glVertexAttribI1i(index, x); 
}

void c_glVertexAttribI2i(GLuint index, GLint x, GLint y){
   glVertexAttribI2i(index, x, y); 
}

void c_glVertexAttribI3i(GLuint index, GLint x, GLint y, GLint z){
   glVertexAttribI3i(index, x, y, z); 
}

void c_glVertexAttribI4i(GLuint index, GLint x, GLint y, GLint z, GLint w){
   glVertexAttribI4i(index, x, y, z, w); 
}

void c_glVertexAttribI1ui(GLuint index, GLuint x){
   glVertexAttribI1ui(index, x); 
}

void c_glVertexAttribI2ui(GLuint index, GLuint x, GLuint y){
   glVertexAttribI2ui(index, x, y); 
}

void c_glVertexAttribI3ui(GLuint index, GLuint x, GLuint y, GLuint z){
   glVertexAttribI3ui(index, x, y, z); 
}

void c_glVertexAttribI4ui(GLuint index, GLuint x, GLuint y, GLuint z, GLuint w){
   glVertexAttribI4ui(index, x, y, z, w); 
}

void c_glVertexAttribI1iv(GLuint index, GLint *v){
   glVertexAttribI1iv(index, v); 
}

void c_glVertexAttribI2iv(GLuint index, GLint *v){
   glVertexAttribI2iv(index, v); 
}

void c_glVertexAttribI3iv(GLuint index, GLint *v){
   glVertexAttribI3iv(index, v); 
}

void c_glVertexAttribI4iv(GLuint index, GLint *v){
   glVertexAttribI4iv(index, v); 
}

void c_glVertexAttribI1uiv(GLuint index, GLuint *v){
   glVertexAttribI1uiv(index, v); 
}

void c_glVertexAttribI2uiv(GLuint index, GLuint *v){
   glVertexAttribI2uiv(index, v); 
}

void c_glVertexAttribI3uiv(GLuint index, GLuint *v){
   glVertexAttribI3uiv(index, v); 
}

void c_glVertexAttribI4uiv(GLuint index, GLuint *v){
   glVertexAttribI4uiv(index, v); 
}

void c_glVertexAttribI4bv(GLuint index, GLbyte *v){
   glVertexAttribI4bv(index, v); 
}

void c_glVertexAttribI4sv(GLuint index, GLshort *v){
   glVertexAttribI4sv(index, v); 
}

void c_glVertexAttribI4ubv(GLuint index, GLubyte *v){
   glVertexAttribI4ubv(index, v); 
}

void c_glVertexAttribI4usv(GLuint index, GLushort *v){
   glVertexAttribI4usv(index, v); 
}

void c_glGetUniformuiv(GLuint program, GLint location, GLuint *params){
   glGetUniformuiv(program, location, params); 
}

void c_glBindFragDataLocation(GLuint program, GLuint color, GLchar *name){
   glBindFragDataLocation(program, color, name); 
}

GLint c_glGetFragDataLocation(GLuint program, GLchar *name){
  return glGetFragDataLocation(program, name); 
}

void c_glUniform1ui(GLint location, GLuint v0){
   glUniform1ui(location, v0); 
}

void c_glUniform2ui(GLint location, GLuint v0, GLuint v1){
   glUniform2ui(location, v0, v1); 
}

void c_glUniform3ui(GLint location, GLuint v0, GLuint v1, GLuint v2){
   glUniform3ui(location, v0, v1, v2); 
}

void c_glUniform4ui(GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3){
   glUniform4ui(location, v0, v1, v2, v3); 
}

void c_glUniform1uiv(GLint location, GLsizei count, GLuint *value){
   glUniform1uiv(location, count, value); 
}

void c_glUniform2uiv(GLint location, GLsizei count, GLuint *value){
   glUniform2uiv(location, count, value); 
}

void c_glUniform3uiv(GLint location, GLsizei count, GLuint *value){
   glUniform3uiv(location, count, value); 
}

void c_glUniform4uiv(GLint location, GLsizei count, GLuint *value){
   glUniform4uiv(location, count, value); 
}

void c_glTexParameterIiv(GLenum target, GLenum pname, GLint *params){
   glTexParameterIiv(target, pname, params); 
}

void c_glTexParameterIuiv(GLenum target, GLenum pname, GLuint *params){
   glTexParameterIuiv(target, pname, params); 
}

void c_glGetTexParameterIiv(GLenum target, GLenum pname, GLint *params){
   glGetTexParameterIiv(target, pname, params); 
}

void c_glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint *params){
   glGetTexParameterIuiv(target, pname, params); 
}

void c_glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint *value){
   glClearBufferiv(buffer, drawbuffer, value); 
}

void c_glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLuint *value){
   glClearBufferuiv(buffer, drawbuffer, value); 
}

void c_glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat *value){
   glClearBufferfv(buffer, drawbuffer, value); 
}

void c_glClearBufferfi(GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil){
   glClearBufferfi(buffer, drawbuffer, depth, stencil); 
}

const GLubyte* c_glGetStringi(GLenum name, GLuint index){
  return glGetStringi(name, index); 
}

GLboolean c_glIsRenderbuffer(GLuint renderbuffer){
  return glIsRenderbuffer(renderbuffer); 
}

void c_glBindRenderbuffer(GLenum target, GLuint renderbuffer){
   glBindRenderbuffer(target, renderbuffer); 
}

void c_glDeleteRenderbuffers(GLsizei n, GLuint *renderbuffers){
   glDeleteRenderbuffers(n, renderbuffers); 
}

void c_glGenRenderbuffers(GLsizei n, GLuint *renderbuffers){
   glGenRenderbuffers(n, renderbuffers); 
}

void c_glRenderbufferStorage(GLenum target, GLenum internalformat, GLsizei width, GLsizei height){
   glRenderbufferStorage(target, internalformat, width, height); 
}

void c_glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint *params){
   glGetRenderbufferParameteriv(target, pname, params); 
}

GLboolean c_glIsFramebuffer(GLuint framebuffer){
  return glIsFramebuffer(framebuffer); 
}

void c_glBindFramebuffer(GLenum target, GLuint framebuffer){
   glBindFramebuffer(target, framebuffer); 
}

void c_glDeleteFramebuffers(GLsizei n, GLuint *framebuffers){
   glDeleteFramebuffers(n, framebuffers); 
}

void c_glGenFramebuffers(GLsizei n, GLuint *framebuffers){
   glGenFramebuffers(n, framebuffers); 
}

GLenum c_glCheckFramebufferStatus(GLenum target){
  return glCheckFramebufferStatus(target); 
}

void c_glFramebufferTexture1D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level){
   glFramebufferTexture1D(target, attachment, textarget, texture, level); 
}

void c_glFramebufferTexture2D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level){
   glFramebufferTexture2D(target, attachment, textarget, texture, level); 
}

void c_glFramebufferTexture3D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint zoffset){
   glFramebufferTexture3D(target, attachment, textarget, texture, level, zoffset); 
}

void c_glFramebufferRenderbuffer(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer){
   glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer); 
}

void c_glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint *params){
   glGetFramebufferAttachmentParameteriv(target, attachment, pname, params); 
}

void c_glGenerateMipmap(GLenum target){
   glGenerateMipmap(target); 
}

void c_glBlitFramebuffer(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter){
   glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); 
}

void c_glRenderbufferStorageMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height){
   glRenderbufferStorageMultisample(target, samples, internalformat, width, height); 
}

void c_glFramebufferTextureLayer(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer){
   glFramebufferTextureLayer(target, attachment, texture, level, layer); 
}

void* c_glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access){
  return glMapBufferRange(target, offset, length, access); 
}

void c_glFlushMappedBufferRange(GLenum target, GLintptr offset, GLsizeiptr length){
   glFlushMappedBufferRange(target, offset, length); 
}

void c_glBindVertexArray(GLuint array){
   glBindVertexArray(array); 
}

void c_glDeleteVertexArrays(GLsizei n, GLuint *arrays){
   glDeleteVertexArrays(n, arrays); 
}

void c_glGenVertexArrays(GLsizei n, GLuint *arrays){
   glGenVertexArrays(n, arrays); 
}

GLboolean c_glIsVertexArray(GLuint array){
  return glIsVertexArray(array); 
}

#ifdef __cplusplus
}
#endif


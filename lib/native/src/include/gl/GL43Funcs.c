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

void c_glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void *data){
   glClearBufferData(target, internalformat, format, type, data); 
}

void c_glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void *data){
   glClearBufferSubData(target, internalformat, offset, size, format, type, data); 
}

void c_glDispatchCompute(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z){
   glDispatchCompute(num_groups_x, num_groups_y, num_groups_z); 
}

void c_glDispatchComputeIndirect(GLintptr indirect){
   glDispatchComputeIndirect(indirect); 
}

void c_glCopyImageSubData(GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth){
   glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); 
}

void c_glFramebufferParameteri(GLenum target, GLenum pname, GLint param){
   glFramebufferParameteri(target, pname, param); 
}

void c_glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint *params){
   glGetFramebufferParameteriv(target, pname, params); 
}

void c_glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei count, GLint64 *params){
   glGetInternalformati64v(target, internalformat, pname, count, params); 
}

void c_glInvalidateTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth){
   glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth); 
}

void c_glInvalidateTexImage(GLuint texture, GLint level){
   glInvalidateTexImage(texture, level); 
}

void c_glInvalidateBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr length){
   glInvalidateBufferSubData(buffer, offset, length); 
}

void c_glInvalidateBufferData(GLuint buffer){
   glInvalidateBufferData(buffer); 
}

void c_glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum *attachments){
   glInvalidateFramebuffer(target, numAttachments, attachments); 
}

void c_glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum *attachments, GLint x, GLint y, GLsizei width, GLsizei height){
   glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height); 
}

void c_glMultiDrawArraysIndirect(GLenum mode, void *indirect, GLsizei drawcount, GLsizei stride){
   glMultiDrawArraysIndirect(mode, indirect, drawcount, stride); 
}

void c_glMultiDrawElementsIndirect(GLenum mode, GLenum type, void *indirect, GLsizei drawcount, GLsizei stride){
   glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride); 
}

void c_glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint *params){
   glGetProgramInterfaceiv(program, programInterface, pname, params); 
}

GLuint c_glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar *name){
  return glGetProgramResourceIndex(program, programInterface, name); 
}

void c_glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei *length, GLchar *name){
   glGetProgramResourceName(program, programInterface, index, bufSize, length, name); 
}

void c_glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum *props, GLsizei count, GLsizei *length, GLint *params){
   glGetProgramResourceiv(program, programInterface, index, propCount, props, count, length, params); 
}

GLint c_glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar *name){
  return glGetProgramResourceLocation(program, programInterface, name); 
}

GLint c_glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar *name){
  return glGetProgramResourceLocationIndex(program, programInterface, name); 
}

void c_glShaderStorageBlockBinding(GLuint program, GLuint storageBlockIndex, GLuint storageBlockBinding){
   glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding); 
}

void c_glTexBufferRange(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size){
   glTexBufferRange(target, internalformat, buffer, offset, size); 
}

void c_glTexStorage2DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations){
   glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations); 
}

void c_glTexStorage3DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations){
   glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations); 
}

void c_glTextureView(GLuint texture, GLenum target, GLuint origtexture, GLenum internalformat, GLuint minlevel, GLuint numlevels, GLuint minlayer, GLuint numlayers){
   glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); 
}

void c_glBindVertexBuffer(GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride){
   glBindVertexBuffer(bindingindex, buffer, offset, stride); 
}

void c_glVertexAttribFormat(GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset){
   glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset); 
}

void c_glVertexAttribIFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset){
   glVertexAttribIFormat(attribindex, size, type, relativeoffset); 
}

void c_glVertexAttribLFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset){
   glVertexAttribLFormat(attribindex, size, type, relativeoffset); 
}

void c_glVertexAttribBinding(GLuint attribindex, GLuint bindingindex){
   glVertexAttribBinding(attribindex, bindingindex); 
}

void c_glVertexBindingDivisor(GLuint bindingindex, GLuint divisor){
   glVertexBindingDivisor(bindingindex, divisor); 
}

void c_glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint *ids, GLboolean enabled){
   glDebugMessageControl(source, type, severity, count, ids, enabled); 
}

void c_glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar *buf){
   glDebugMessageInsert(source, type, id, severity, length, buf); 
}

void c_glDebugMessageCallback(GLDEBUGPROC callback, void *userParam){
   glDebugMessageCallback(callback, userParam); 
}

GLuint c_glGetDebugMessageLog(GLuint count, GLsizei bufSize, GLenum *sources, GLenum *types, GLuint *ids, GLenum *severities, GLsizei *lengths, GLchar *messageLog){
  return glGetDebugMessageLog(count, bufSize, sources, types, ids, severities, lengths, messageLog); 
}

void c_glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar *message){
   glPushDebugGroup(source, id, length, message); 
}

void c_glPopDebugGroup(){
   glPopDebugGroup(); 
}

void c_glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar *label){
   glObjectLabel(identifier, name, length, label); 
}

void c_glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei *length, GLchar *label){
   glGetObjectLabel(identifier, name, bufSize, length, label); 
}

void c_glObjectPtrLabel(void *ptr, GLsizei length, GLchar *label){
   glObjectPtrLabel(ptr, length, label); 
}

void c_glGetObjectPtrLabel(void *ptr, GLsizei bufSize, GLsizei *length, GLchar *label){
   glGetObjectPtrLabel(ptr, bufSize, length, label); 
}

#ifdef __cplusplus
}
#endif


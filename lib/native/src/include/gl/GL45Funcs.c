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

void c_glClipControl(GLenum origin, GLenum depth){
   glClipControl(origin, depth); 
}

void c_glCreateTransformFeedbacks(GLsizei n, GLuint *ids){
   glCreateTransformFeedbacks(n, ids); 
}

void c_glTransformFeedbackBufferBase(GLuint xfb, GLuint index, GLuint buffer){
   glTransformFeedbackBufferBase(xfb, index, buffer); 
}

void c_glTransformFeedbackBufferRange(GLuint xfb, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size){
   glTransformFeedbackBufferRange(xfb, index, buffer, offset, size); 
}

void c_glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint *param){
   glGetTransformFeedbackiv(xfb, pname, param); 
}

void c_glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint *param){
   glGetTransformFeedbacki_v(xfb, pname, index, param); 
}

void c_glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 *param){
   glGetTransformFeedbacki64_v(xfb, pname, index, param); 
}

void c_glCreateBuffers(GLsizei n, GLuint *buffers){
   glCreateBuffers(n, buffers); 
}

void c_glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void *data, GLbitfield flags){
   glNamedBufferStorage(buffer, size, data, flags); 
}

void c_glNamedBufferData(GLuint buffer, GLsizeiptr size, void *data, GLenum usage){
   glNamedBufferData(buffer, size, data, usage); 
}

void c_glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void *data){
   glNamedBufferSubData(buffer, offset, size, data); 
}

void c_glCopyNamedBufferSubData(GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size){
   glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size); 
}

void c_glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void *data){
   glClearNamedBufferData(buffer, internalformat, format, type, data); 
}

void c_glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void *data){
   glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data); 
}

void* c_glMapNamedBuffer(GLuint buffer, GLenum access){
  return glMapNamedBuffer(buffer, access); 
}

void* c_glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access){
  return glMapNamedBufferRange(buffer, offset, length, access); 
}

GLboolean c_glUnmapNamedBuffer(GLuint buffer){
  return glUnmapNamedBuffer(buffer); 
}

void c_glFlushMappedNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length){
   glFlushMappedNamedBufferRange(buffer, offset, length); 
}

void c_glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint *params){
   glGetNamedBufferParameteriv(buffer, pname, params); 
}

void c_glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 *params){
   glGetNamedBufferParameteri64v(buffer, pname, params); 
}

void c_glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void **params){
   glGetNamedBufferPointerv(buffer, pname, params); 
}

void c_glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void *data){
   glGetNamedBufferSubData(buffer, offset, size, data); 
}

void c_glCreateFramebuffers(GLsizei n, GLuint *framebuffers){
   glCreateFramebuffers(n, framebuffers); 
}

void c_glNamedFramebufferRenderbuffer(GLuint framebuffer, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer){
   glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer); 
}

void c_glNamedFramebufferParameteri(GLuint framebuffer, GLenum pname, GLint param){
   glNamedFramebufferParameteri(framebuffer, pname, param); 
}

void c_glNamedFramebufferTexture(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level){
   glNamedFramebufferTexture(framebuffer, attachment, texture, level); 
}

void c_glNamedFramebufferTextureLayer(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLint layer){
   glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer); 
}

void c_glNamedFramebufferDrawBuffer(GLuint framebuffer, GLenum buf){
   glNamedFramebufferDrawBuffer(framebuffer, buf); 
}

void c_glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum *bufs){
   glNamedFramebufferDrawBuffers(framebuffer, n, bufs); 
}

void c_glNamedFramebufferReadBuffer(GLuint framebuffer, GLenum src){
   glNamedFramebufferReadBuffer(framebuffer, src); 
}

void c_glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum *attachments){
   glInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments); 
}

void c_glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum *attachments, GLint x, GLint y, GLsizei width, GLsizei height){
   glInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height); 
}

void c_glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint *value){
   glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value); 
}

void c_glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLuint *value){
   glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value); 
}

void c_glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat *value){
   glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value); 
}

void c_glClearNamedFramebufferfi(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil){
   glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil); 
}

void c_glBlitNamedFramebuffer(GLuint readFramebuffer, GLuint drawFramebuffer, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter){
   glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); 
}

GLenum c_glCheckNamedFramebufferStatus(GLuint framebuffer, GLenum target){
  return glCheckNamedFramebufferStatus(framebuffer, target); 
}

void c_glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint *param){
   glGetNamedFramebufferParameteriv(framebuffer, pname, param); 
}

void c_glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint *params){
   glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params); 
}

void c_glCreateRenderbuffers(GLsizei n, GLuint *renderbuffers){
   glCreateRenderbuffers(n, renderbuffers); 
}

void c_glNamedRenderbufferStorage(GLuint renderbuffer, GLenum internalformat, GLsizei width, GLsizei height){
   glNamedRenderbufferStorage(renderbuffer, internalformat, width, height); 
}

void c_glNamedRenderbufferStorageMultisample(GLuint renderbuffer, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height){
   glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height); 
}

void c_glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint *params){
   glGetNamedRenderbufferParameteriv(renderbuffer, pname, params); 
}

void c_glCreateTextures(GLenum target, GLsizei n, GLuint *textures){
   glCreateTextures(target, n, textures); 
}

void c_glTextureBuffer(GLuint texture, GLenum internalformat, GLuint buffer){
   glTextureBuffer(texture, internalformat, buffer); 
}

void c_glTextureBufferRange(GLuint texture, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size){
   glTextureBufferRange(texture, internalformat, buffer, offset, size); 
}

void c_glTextureStorage1D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width){
   glTextureStorage1D(texture, levels, internalformat, width); 
}

void c_glTextureStorage2D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height){
   glTextureStorage2D(texture, levels, internalformat, width, height); 
}

void c_glTextureStorage3D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth){
   glTextureStorage3D(texture, levels, internalformat, width, height, depth); 
}

void c_glTextureStorage2DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations){
   glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations); 
}

void c_glTextureStorage3DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations){
   glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations); 
}

void c_glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void *pixels){
   glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels); 
}

void c_glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void *pixels){
   glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels); 
}

void c_glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void *pixels){
   glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); 
}

void c_glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void *data){
   glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data); 
}

void c_glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void *data){
   glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data); 
}

void c_glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void *data){
   glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); 
}

void c_glCopyTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width){
   glCopyTextureSubImage1D(texture, level, xoffset, x, y, width); 
}

void c_glCopyTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height){
   glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height); 
}

void c_glCopyTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height){
   glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height); 
}

void c_glTextureParameterf(GLuint texture, GLenum pname, GLfloat param){
   glTextureParameterf(texture, pname, param); 
}

void c_glTextureParameterfv(GLuint texture, GLenum pname, GLfloat *param){
   glTextureParameterfv(texture, pname, param); 
}

void c_glTextureParameteri(GLuint texture, GLenum pname, GLint param){
   glTextureParameteri(texture, pname, param); 
}

void c_glTextureParameterIiv(GLuint texture, GLenum pname, GLint *params){
   glTextureParameterIiv(texture, pname, params); 
}

void c_glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint *params){
   glTextureParameterIuiv(texture, pname, params); 
}

void c_glTextureParameteriv(GLuint texture, GLenum pname, GLint *param){
   glTextureParameteriv(texture, pname, param); 
}

void c_glGenerateTextureMipmap(GLuint texture){
   glGenerateTextureMipmap(texture); 
}

void c_glBindTextureUnit(GLuint unit, GLuint texture){
   glBindTextureUnit(unit, texture); 
}

void c_glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void *pixels){
   glGetTextureImage(texture, level, format, type, bufSize, pixels); 
}

void c_glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void *pixels){
   glGetCompressedTextureImage(texture, level, bufSize, pixels); 
}

void c_glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat *params){
   glGetTextureLevelParameterfv(texture, level, pname, params); 
}

void c_glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint *params){
   glGetTextureLevelParameteriv(texture, level, pname, params); 
}

void c_glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat *params){
   glGetTextureParameterfv(texture, pname, params); 
}

void c_glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint *params){
   glGetTextureParameterIiv(texture, pname, params); 
}

void c_glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint *params){
   glGetTextureParameterIuiv(texture, pname, params); 
}

void c_glGetTextureParameteriv(GLuint texture, GLenum pname, GLint *params){
   glGetTextureParameteriv(texture, pname, params); 
}

void c_glCreateVertexArrays(GLsizei n, GLuint *arrays){
   glCreateVertexArrays(n, arrays); 
}

void c_glDisableVertexArrayAttrib(GLuint vaobj, GLuint index){
   glDisableVertexArrayAttrib(vaobj, index); 
}

void c_glEnableVertexArrayAttrib(GLuint vaobj, GLuint index){
   glEnableVertexArrayAttrib(vaobj, index); 
}

void c_glVertexArrayElementBuffer(GLuint vaobj, GLuint buffer){
   glVertexArrayElementBuffer(vaobj, buffer); 
}

void c_glVertexArrayVertexBuffer(GLuint vaobj, GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride){
   glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride); 
}

void c_glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint *buffers, GLintptr *offsets, GLsizei *strides){
   glVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides); 
}

void c_glVertexArrayAttribBinding(GLuint vaobj, GLuint attribindex, GLuint bindingindex){
   glVertexArrayAttribBinding(vaobj, attribindex, bindingindex); 
}

void c_glVertexArrayAttribFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset){
   glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset); 
}

void c_glVertexArrayAttribIFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset){
   glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset); 
}

void c_glVertexArrayAttribLFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset){
   glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset); 
}

void c_glVertexArrayBindingDivisor(GLuint vaobj, GLuint bindingindex, GLuint divisor){
   glVertexArrayBindingDivisor(vaobj, bindingindex, divisor); 
}

void c_glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint *param){
   glGetVertexArrayiv(vaobj, pname, param); 
}

void c_glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint *param){
   glGetVertexArrayIndexediv(vaobj, index, pname, param); 
}

void c_glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 *param){
   glGetVertexArrayIndexed64iv(vaobj, index, pname, param); 
}

void c_glCreateSamplers(GLsizei n, GLuint *samplers){
   glCreateSamplers(n, samplers); 
}

void c_glCreateProgramPipelines(GLsizei n, GLuint *pipelines){
   glCreateProgramPipelines(n, pipelines); 
}

void c_glCreateQueries(GLenum target, GLsizei n, GLuint *ids){
   glCreateQueries(target, n, ids); 
}

void c_glGetQueryBufferObjecti64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset){
   glGetQueryBufferObjecti64v(id, buffer, pname, offset); 
}

void c_glGetQueryBufferObjectiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset){
   glGetQueryBufferObjectiv(id, buffer, pname, offset); 
}

void c_glGetQueryBufferObjectui64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset){
   glGetQueryBufferObjectui64v(id, buffer, pname, offset); 
}

void c_glGetQueryBufferObjectuiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset){
   glGetQueryBufferObjectuiv(id, buffer, pname, offset); 
}

void c_glMemoryBarrierByRegion(GLbitfield barriers){
   glMemoryBarrierByRegion(barriers); 
}

void c_glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void *pixels){
   glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels); 
}

void c_glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void *pixels){
   glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels); 
}

GLenum c_glGetGraphicsResetStatus(){
  return glGetGraphicsResetStatus(); 
}

void c_glGetnCompressedTexImage(GLenum target, GLint lod, GLsizei bufSize, void *pixels){
   glGetnCompressedTexImage(target, lod, bufSize, pixels); 
}

void c_glGetnTexImage(GLenum target, GLint level, GLenum format, GLenum type, GLsizei bufSize, void *pixels){
   glGetnTexImage(target, level, format, type, bufSize, pixels); 
}

void c_glGetnUniformdv(GLuint program, GLint location, GLsizei bufSize, GLdouble *params){
   glGetnUniformdv(program, location, bufSize, params); 
}

void c_glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat *params){
   glGetnUniformfv(program, location, bufSize, params); 
}

void c_glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint *params){
   glGetnUniformiv(program, location, bufSize, params); 
}

void c_glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint *params){
   glGetnUniformuiv(program, location, bufSize, params); 
}

void c_glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void *data){
   glReadnPixels(x, y, width, height, format, type, bufSize, data); 
}

void c_glGetnMapdv(GLenum target, GLenum query, GLsizei bufSize, GLdouble *v){
   glGetnMapdv(target, query, bufSize, v); 
}

void c_glGetnMapfv(GLenum target, GLenum query, GLsizei bufSize, GLfloat *v){
   glGetnMapfv(target, query, bufSize, v); 
}

void c_glGetnMapiv(GLenum target, GLenum query, GLsizei bufSize, GLint *v){
   glGetnMapiv(target, query, bufSize, v); 
}

void c_glGetnPixelMapfv(GLenum map, GLsizei bufSize, GLfloat *values){
   glGetnPixelMapfv(map, bufSize, values); 
}

void c_glGetnPixelMapuiv(GLenum map, GLsizei bufSize, GLuint *values){
   glGetnPixelMapuiv(map, bufSize, values); 
}

void c_glGetnPixelMapusv(GLenum map, GLsizei bufSize, GLushort *values){
   glGetnPixelMapusv(map, bufSize, values); 
}

void c_glGetnPolygonStipple(GLsizei bufSize, GLubyte *pattern){
   glGetnPolygonStipple(bufSize, pattern); 
}

void c_glGetnColorTable(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void *table){
   glGetnColorTable(target, format, type, bufSize, table); 
}

void c_glGetnConvolutionFilter(GLenum target, GLenum format, GLenum type, GLsizei bufSize, void *image){
   glGetnConvolutionFilter(target, format, type, bufSize, image); 
}

void c_glGetnSeparableFilter(GLenum target, GLenum format, GLenum type, GLsizei rowBufSize, void *row, GLsizei columnBufSize, void *column, void *span){
   glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span); 
}

void c_glGetnHistogram(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void *values){
   glGetnHistogram(target, reset, format, type, bufSize, values); 
}

void c_glGetnMinmax(GLenum target, GLboolean reset, GLenum format, GLenum type, GLsizei bufSize, void *values){
   glGetnMinmax(target, reset, format, type, bufSize, values); 
}

void c_glTextureBarrier(){
   glTextureBarrier(); 
}

#ifdef __cplusplus
}
#endif


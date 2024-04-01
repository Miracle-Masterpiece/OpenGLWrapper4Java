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

void c_glDrawArraysInstancedBaseInstance(GLenum mode, GLint first, GLsizei count, GLsizei instancecount, GLuint baseinstance){
   glDrawArraysInstancedBaseInstance(mode, first, count, instancecount, baseinstance); 
}

void c_glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void *indices, GLsizei instancecount, GLuint baseinstance){
   glDrawElementsInstancedBaseInstance(mode, count, type, indices, instancecount, baseinstance); 
}

void c_glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void *indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance){
   glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, instancecount, basevertex, baseinstance); 
}

void c_glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei count, GLint *params){
   glGetInternalformativ(target, internalformat, pname, count, params); 
}

void c_glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint *params){
   glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params); 
}

void c_glBindImageTexture(GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format){
   glBindImageTexture(unit, texture, level, layered, layer, access, format); 
}

void c_glMemoryBarrier(GLbitfield barriers){
   glMemoryBarrier(barriers); 
}

void c_glTexStorage1D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width){
   glTexStorage1D(target, levels, internalformat, width); 
}

void c_glTexStorage2D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height){
   glTexStorage2D(target, levels, internalformat, width, height); 
}

void c_glTexStorage3D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth){
   glTexStorage3D(target, levels, internalformat, width, height, depth); 
}

void c_glDrawTransformFeedbackInstanced(GLenum mode, GLuint id, GLsizei instancecount){
   glDrawTransformFeedbackInstanced(mode, id, instancecount); 
}

void c_glDrawTransformFeedbackStreamInstanced(GLenum mode, GLuint id, GLuint stream, GLsizei instancecount){
   glDrawTransformFeedbackStreamInstanced(mode, id, stream, instancecount); 
}

#ifdef __cplusplus
}
#endif


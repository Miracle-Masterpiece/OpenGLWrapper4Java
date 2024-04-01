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

void c_glDrawArraysInstanced(GLenum mode, GLint first, GLsizei count, GLsizei instancecount){
   glDrawArraysInstanced(mode, first, count, instancecount); 
}

void c_glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void *indices, GLsizei instancecount){
   glDrawElementsInstanced(mode, count, type, indices, instancecount); 
}

void c_glTexBuffer(GLenum target, GLenum internalformat, GLuint buffer){
   glTexBuffer(target, internalformat, buffer); 
}

void c_glPrimitiveRestartIndex(GLuint index){
   glPrimitiveRestartIndex(index); 
}

void c_glCopyBufferSubData(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size){
   glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size); 
}

void c_glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar *const* uniformNames, GLuint *uniformIndices){
   glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices); 
}

void c_glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint *uniformIndices, GLenum pname, GLint *params){
   glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params); 
}

void c_glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei *length, GLchar *uniformName){
   glGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName); 
}

GLuint c_glGetUniformBlockIndex(GLuint program, GLchar *uniformBlockName){
  return glGetUniformBlockIndex(program, uniformBlockName); 
}

void c_glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint *params){
   glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params); 
}

void c_glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei *length, GLchar *uniformBlockName){
   glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName); 
}

void c_glUniformBlockBinding(GLuint program, GLuint uniformBlockIndex, GLuint uniformBlockBinding){
   glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding); 
}

#ifdef __cplusplus
}
#endif


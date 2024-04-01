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

void c_glMinSampleShading(GLfloat value){
   glMinSampleShading(value); 
}

void c_glBlendEquationi(GLuint buf, GLenum mode){
   glBlendEquationi(buf, mode); 
}

void c_glBlendEquationSeparatei(GLuint buf, GLenum modeRGB, GLenum modeAlpha){
   glBlendEquationSeparatei(buf, modeRGB, modeAlpha); 
}

void c_glBlendFunci(GLuint buf, GLenum src, GLenum dst){
   glBlendFunci(buf, src, dst); 
}

void c_glBlendFuncSeparatei(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha){
   glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha); 
}

void c_glDrawArraysIndirect(GLenum mode, void *indirect){
   glDrawArraysIndirect(mode, indirect); 
}

void c_glDrawElementsIndirect(GLenum mode, GLenum type, void *indirect){
   glDrawElementsIndirect(mode, type, indirect); 
}

void c_glUniform1d(GLint location, GLdouble x){
   glUniform1d(location, x); 
}

void c_glUniform2d(GLint location, GLdouble x, GLdouble y){
   glUniform2d(location, x, y); 
}

void c_glUniform3d(GLint location, GLdouble x, GLdouble y, GLdouble z){
   glUniform3d(location, x, y, z); 
}

void c_glUniform4d(GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w){
   glUniform4d(location, x, y, z, w); 
}

void c_glUniform1dv(GLint location, GLsizei count, GLdouble *value){
   glUniform1dv(location, count, value); 
}

void c_glUniform2dv(GLint location, GLsizei count, GLdouble *value){
   glUniform2dv(location, count, value); 
}

void c_glUniform3dv(GLint location, GLsizei count, GLdouble *value){
   glUniform3dv(location, count, value); 
}

void c_glUniform4dv(GLint location, GLsizei count, GLdouble *value){
   glUniform4dv(location, count, value); 
}

void c_glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix2dv(location, count, transpose, value); 
}

void c_glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix3dv(location, count, transpose, value); 
}

void c_glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix4dv(location, count, transpose, value); 
}

void c_glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix2x3dv(location, count, transpose, value); 
}

void c_glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix2x4dv(location, count, transpose, value); 
}

void c_glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix3x2dv(location, count, transpose, value); 
}

void c_glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix3x4dv(location, count, transpose, value); 
}

void c_glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix4x2dv(location, count, transpose, value); 
}

void c_glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glUniformMatrix4x3dv(location, count, transpose, value); 
}

void c_glGetUniformdv(GLuint program, GLint location, GLdouble *params){
   glGetUniformdv(program, location, params); 
}

GLint c_glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar *name){
  return glGetSubroutineUniformLocation(program, shadertype, name); 
}

GLuint c_glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar *name){
  return glGetSubroutineIndex(program, shadertype, name); 
}

void c_glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint *values){
   glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values); 
}

void c_glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufSize, GLsizei *length, GLchar *name){
   glGetActiveSubroutineUniformName(program, shadertype, index, bufSize, length, name); 
}

void c_glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufSize, GLsizei *length, GLchar *name){
   glGetActiveSubroutineName(program, shadertype, index, bufSize, length, name); 
}

void c_glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint *indices){
   glUniformSubroutinesuiv(shadertype, count, indices); 
}

void c_glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint *params){
   glGetUniformSubroutineuiv(shadertype, location, params); 
}

void c_glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint *values){
   glGetProgramStageiv(program, shadertype, pname, values); 
}

void c_glPatchParameteri(GLenum pname, GLint value){
   glPatchParameteri(pname, value); 
}

void c_glPatchParameterfv(GLenum pname, GLfloat *values){
   glPatchParameterfv(pname, values); 
}

void c_glBindTransformFeedback(GLenum target, GLuint id){
   glBindTransformFeedback(target, id); 
}

void c_glDeleteTransformFeedbacks(GLsizei n, GLuint *ids){
   glDeleteTransformFeedbacks(n, ids); 
}

void c_glGenTransformFeedbacks(GLsizei n, GLuint *ids){
   glGenTransformFeedbacks(n, ids); 
}

GLboolean c_glIsTransformFeedback(GLuint id){
  return glIsTransformFeedback(id); 
}

void c_glPauseTransformFeedback(){
   glPauseTransformFeedback(); 
}

void c_glResumeTransformFeedback(){
   glResumeTransformFeedback(); 
}

void c_glDrawTransformFeedback(GLenum mode, GLuint id){
   glDrawTransformFeedback(mode, id); 
}

void c_glDrawTransformFeedbackStream(GLenum mode, GLuint id, GLuint stream){
   glDrawTransformFeedbackStream(mode, id, stream); 
}

void c_glBeginQueryIndexed(GLenum target, GLuint index, GLuint id){
   glBeginQueryIndexed(target, index, id); 
}

void c_glEndQueryIndexed(GLenum target, GLuint index){
   glEndQueryIndexed(target, index); 
}

void c_glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint *params){
   glGetQueryIndexediv(target, index, pname, params); 
}

#ifdef __cplusplus
}
#endif

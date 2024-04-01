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

void c_glBlendEquationSeparate(GLenum modeRGB, GLenum modeAlpha){
   glBlendEquationSeparate(modeRGB, modeAlpha); 
}

void c_glDrawBuffers(GLsizei n, GLenum *bufs){
   glDrawBuffers(n, bufs); 
}

void c_glStencilOpSeparate(GLenum face, GLenum sfail, GLenum dpfail, GLenum dppass){
   glStencilOpSeparate(face, sfail, dpfail, dppass); 
}

void c_glStencilFuncSeparate(GLenum face, GLenum func, GLint ref, GLuint mask){
   glStencilFuncSeparate(face, func, ref, mask); 
}

void c_glStencilMaskSeparate(GLenum face, GLuint mask){
   glStencilMaskSeparate(face, mask); 
}

void c_glAttachShader(GLuint program, GLuint shader){
   glAttachShader(program, shader); 
}

void c_glBindAttribLocation(GLuint program, GLuint index, GLchar *name){
   glBindAttribLocation(program, index, name); 
}

void c_glCompileShader(GLuint shader){
   glCompileShader(shader); 
}

GLuint c_glCreateProgram(){
  return glCreateProgram(); 
}

GLuint c_glCreateShader(GLenum type){
  return glCreateShader(type); 
}

void c_glDeleteProgram(GLuint program){
   glDeleteProgram(program); 
}

void c_glDeleteShader(GLuint shader){
   glDeleteShader(shader); 
}

void c_glDetachShader(GLuint program, GLuint shader){
   glDetachShader(program, shader); 
}

void c_glDisableVertexAttribArray(GLuint index){
   glDisableVertexAttribArray(index); 
}

void c_glEnableVertexAttribArray(GLuint index){
   glEnableVertexAttribArray(index); 
}

void c_glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei *length, GLint *size, GLenum *type, GLchar *name){
   glGetActiveAttrib(program, index, bufSize, length, size, type, name); 
}

void c_glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei *length, GLint *size, GLenum *type, GLchar *name){
   glGetActiveUniform(program, index, bufSize, length, size, type, name); 
}

void c_glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei *count, GLuint *shaders){
   glGetAttachedShaders(program, maxCount, count, shaders); 
}

GLint c_glGetAttribLocation(GLuint program, GLchar *name){
  return glGetAttribLocation(program, name); 
}

void c_glGetProgramiv(GLuint program, GLenum pname, GLint *params){
   glGetProgramiv(program, pname, params); 
}

void c_glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei *length, GLchar *infoLog){
   glGetProgramInfoLog(program, bufSize, length, infoLog); 
}

void c_glGetShaderiv(GLuint shader, GLenum pname, GLint *params){
   glGetShaderiv(shader, pname, params); 
}

void c_glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei *length, GLchar *infoLog){
   glGetShaderInfoLog(shader, bufSize, length, infoLog); 
}

void c_glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei *length, GLchar *source){
   glGetShaderSource(shader, bufSize, length, source); 
}

GLint c_glGetUniformLocation(GLuint program, GLchar *name){
  return glGetUniformLocation(program, name); 
}

void c_glGetUniformfv(GLuint program, GLint location, GLfloat *params){
   glGetUniformfv(program, location, params); 
}

void c_glGetUniformiv(GLuint program, GLint location, GLint *params){
   glGetUniformiv(program, location, params); 
}

void c_glGetVertexAttribdv(GLuint index, GLenum pname, GLdouble *params){
   glGetVertexAttribdv(index, pname, params); 
}

void c_glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat *params){
   glGetVertexAttribfv(index, pname, params); 
}

void c_glGetVertexAttribiv(GLuint index, GLenum pname, GLint *params){
   glGetVertexAttribiv(index, pname, params); 
}

void c_glGetVertexAttribPointerv(GLuint index, GLenum pname, void **pointer){
   glGetVertexAttribPointerv(index, pname, pointer); 
}

GLboolean c_glIsProgram(GLuint program){
  return glIsProgram(program); 
}

GLboolean c_glIsShader(GLuint shader){
  return glIsShader(shader); 
}

void c_glLinkProgram(GLuint program){
   glLinkProgram(program); 
}

void c_glShaderSource(GLuint shader, GLsizei count, GLchar *const * string, GLint *length){
   glShaderSource(shader, count,  string, length); 
}

void c_glUseProgram(GLuint program){
   glUseProgram(program); 
}

void c_glUniform1f(GLint location, GLfloat v0){
   glUniform1f(location, v0); 
}

void c_glUniform2f(GLint location, GLfloat v0, GLfloat v1){
   glUniform2f(location, v0, v1); 
}

void c_glUniform3f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2){
   glUniform3f(location, v0, v1, v2); 
}

void c_glUniform4f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3){
   glUniform4f(location, v0, v1, v2, v3); 
}

void c_glUniform1i(GLint location, GLint v0){
   glUniform1i(location, v0); 
}

void c_glUniform2i(GLint location, GLint v0, GLint v1){
   glUniform2i(location, v0, v1); 
}

void c_glUniform3i(GLint location, GLint v0, GLint v1, GLint v2){
   glUniform3i(location, v0, v1, v2); 
}

void c_glUniform4i(GLint location, GLint v0, GLint v1, GLint v2, GLint v3){
   glUniform4i(location, v0, v1, v2, v3); 
}

void c_glUniform1fv(GLint location, GLsizei count, GLfloat *value){
   glUniform1fv(location, count, value); 
}

void c_glUniform2fv(GLint location, GLsizei count, GLfloat *value){
   glUniform2fv(location, count, value); 
}

void c_glUniform3fv(GLint location, GLsizei count, GLfloat *value){
   glUniform3fv(location, count, value); 
}

void c_glUniform4fv(GLint location, GLsizei count, GLfloat *value){
   glUniform4fv(location, count, value); 
}

void c_glUniform1iv(GLint location, GLsizei count, GLint *value){
   glUniform1iv(location, count, value); 
}

void c_glUniform2iv(GLint location, GLsizei count, GLint *value){
   glUniform2iv(location, count, value); 
}

void c_glUniform3iv(GLint location, GLsizei count, GLint *value){
   glUniform3iv(location, count, value); 
}

void c_glUniform4iv(GLint location, GLsizei count, GLint *value){
   glUniform4iv(location, count, value); 
}

void c_glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix2fv(location, count, transpose, value); 
}

void c_glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix3fv(location, count, transpose, value); 
}

void c_glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix4fv(location, count, transpose, value); 
}

void c_glValidateProgram(GLuint program){
   glValidateProgram(program); 
}

void c_glVertexAttrib1d(GLuint index, GLdouble x){
   glVertexAttrib1d(index, x); 
}

void c_glVertexAttrib1dv(GLuint index, GLdouble *v){
   glVertexAttrib1dv(index, v); 
}

void c_glVertexAttrib1f(GLuint index, GLfloat x){
   glVertexAttrib1f(index, x); 
}

void c_glVertexAttrib1fv(GLuint index, GLfloat *v){
   glVertexAttrib1fv(index, v); 
}

void c_glVertexAttrib1s(GLuint index, GLshort x){
   glVertexAttrib1s(index, x); 
}

void c_glVertexAttrib1sv(GLuint index, GLshort *v){
   glVertexAttrib1sv(index, v); 
}

void c_glVertexAttrib2d(GLuint index, GLdouble x, GLdouble y){
   glVertexAttrib2d(index, x, y); 
}

void c_glVertexAttrib2dv(GLuint index, GLdouble *v){
   glVertexAttrib2dv(index, v); 
}

void c_glVertexAttrib2f(GLuint index, GLfloat x, GLfloat y){
   glVertexAttrib2f(index, x, y); 
}

void c_glVertexAttrib2fv(GLuint index, GLfloat *v){
   glVertexAttrib2fv(index, v); 
}

void c_glVertexAttrib2s(GLuint index, GLshort x, GLshort y){
   glVertexAttrib2s(index, x, y); 
}

void c_glVertexAttrib2sv(GLuint index, GLshort *v){
   glVertexAttrib2sv(index, v); 
}

void c_glVertexAttrib3d(GLuint index, GLdouble x, GLdouble y, GLdouble z){
   glVertexAttrib3d(index, x, y, z); 
}

void c_glVertexAttrib3dv(GLuint index, GLdouble *v){
   glVertexAttrib3dv(index, v); 
}

void c_glVertexAttrib3f(GLuint index, GLfloat x, GLfloat y, GLfloat z){
   glVertexAttrib3f(index, x, y, z); 
}

void c_glVertexAttrib3fv(GLuint index, GLfloat *v){
   glVertexAttrib3fv(index, v); 
}

void c_glVertexAttrib3s(GLuint index, GLshort x, GLshort y, GLshort z){
   glVertexAttrib3s(index, x, y, z); 
}

void c_glVertexAttrib3sv(GLuint index, GLshort *v){
   glVertexAttrib3sv(index, v); 
}

void c_glVertexAttrib4Nbv(GLuint index, GLbyte *v){
   glVertexAttrib4Nbv(index, v); 
}

void c_glVertexAttrib4Niv(GLuint index, GLint *v){
   glVertexAttrib4Niv(index, v); 
}

void c_glVertexAttrib4Nsv(GLuint index, GLshort *v){
   glVertexAttrib4Nsv(index, v); 
}

void c_glVertexAttrib4Nub(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w){
   glVertexAttrib4Nub(index, x, y, z, w); 
}

void c_glVertexAttrib4Nubv(GLuint index, GLubyte *v){
   glVertexAttrib4Nubv(index, v); 
}

void c_glVertexAttrib4Nuiv(GLuint index, GLuint *v){
   glVertexAttrib4Nuiv(index, v); 
}

void c_glVertexAttrib4Nusv(GLuint index, GLushort *v){
   glVertexAttrib4Nusv(index, v); 
}

void c_glVertexAttrib4bv(GLuint index, GLbyte *v){
   glVertexAttrib4bv(index, v); 
}

void c_glVertexAttrib4d(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w){
   glVertexAttrib4d(index, x, y, z, w); 
}

void c_glVertexAttrib4dv(GLuint index, GLdouble *v){
   glVertexAttrib4dv(index, v); 
}

void c_glVertexAttrib4f(GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w){
   glVertexAttrib4f(index, x, y, z, w); 
}

void c_glVertexAttrib4fv(GLuint index, GLfloat *v){
   glVertexAttrib4fv(index, v); 
}

void c_glVertexAttrib4iv(GLuint index, GLint *v){
   glVertexAttrib4iv(index, v); 
}

void c_glVertexAttrib4s(GLuint index, GLshort x, GLshort y, GLshort z, GLshort w){
   glVertexAttrib4s(index, x, y, z, w); 
}

void c_glVertexAttrib4sv(GLuint index, GLshort *v){
   glVertexAttrib4sv(index, v); 
}

void c_glVertexAttrib4ubv(GLuint index, GLubyte *v){
   glVertexAttrib4ubv(index, v); 
}

void c_glVertexAttrib4uiv(GLuint index, GLuint *v){
   glVertexAttrib4uiv(index, v); 
}

void c_glVertexAttrib4usv(GLuint index, GLushort *v){
   glVertexAttrib4usv(index, v); 
}

void c_glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void *pointer){
   glVertexAttribPointer(index, size, type, normalized, stride, pointer); 
}

#ifdef __cplusplus
}
#endif

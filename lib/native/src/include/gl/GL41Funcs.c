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

void c_glReleaseShaderCompiler(){
   glReleaseShaderCompiler(); 
}

void c_glShaderBinary(GLsizei count, GLuint *shaders, GLenum binaryFormat, void *binary, GLsizei length){
   glShaderBinary(count, shaders, binaryFormat, binary, length); 
}

void c_glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint *range, GLint *precision){
   glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision); 
}

void c_glDepthRangef(GLfloat n, GLfloat f){
   glDepthRangef(n, f); 
}

void c_glClearDepthf(GLfloat d){
   glClearDepthf(d); 
}

void c_glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei *length, GLenum *binaryFormat, void *binary){
   glGetProgramBinary(program, bufSize, length, binaryFormat, binary); 
}

void c_glProgramBinary(GLuint program, GLenum binaryFormat, void *binary, GLsizei length){
   glProgramBinary(program, binaryFormat, binary, length); 
}

void c_glProgramParameteri(GLuint program, GLenum pname, GLint value){
   glProgramParameteri(program, pname, value); 
}

void c_glUseProgramStages(GLuint pipeline, GLbitfield stages, GLuint program){
   glUseProgramStages(pipeline, stages, program); 
}

void c_glActiveShaderProgram(GLuint pipeline, GLuint program){
   glActiveShaderProgram(pipeline, program); 
}

GLuint c_glCreateShaderProgramv(GLenum type, GLsizei count, GLchar *const* strings){
  return glCreateShaderProgramv(type, count, strings); 
}

void c_glBindProgramPipeline(GLuint pipeline){
   glBindProgramPipeline(pipeline); 
}

void c_glDeleteProgramPipelines(GLsizei n, GLuint *pipelines){
   glDeleteProgramPipelines(n, pipelines); 
}

void c_glGenProgramPipelines(GLsizei n, GLuint *pipelines){
   glGenProgramPipelines(n, pipelines); 
}

GLboolean c_glIsProgramPipeline(GLuint pipeline){
  return glIsProgramPipeline(pipeline); 
}

void c_glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint *params){
   glGetProgramPipelineiv(pipeline, pname, params); 
}

void c_glProgramUniform1i(GLuint program, GLint location, GLint v0){
   glProgramUniform1i(program, location, v0); 
}

void c_glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint *value){
   glProgramUniform1iv(program, location, count, value); 
}

void c_glProgramUniform1f(GLuint program, GLint location, GLfloat v0){
   glProgramUniform1f(program, location, v0); 
}

void c_glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat *value){
   glProgramUniform1fv(program, location, count, value); 
}

void c_glProgramUniform1d(GLuint program, GLint location, GLdouble v0){
   glProgramUniform1d(program, location, v0); 
}

void c_glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble *value){
   glProgramUniform1dv(program, location, count, value); 
}

void c_glProgramUniform1ui(GLuint program, GLint location, GLuint v0){
   glProgramUniform1ui(program, location, v0); 
}

void c_glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint *value){
   glProgramUniform1uiv(program, location, count, value); 
}

void c_glProgramUniform2i(GLuint program, GLint location, GLint v0, GLint v1){
   glProgramUniform2i(program, location, v0, v1); 
}

void c_glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint *value){
   glProgramUniform2iv(program, location, count, value); 
}

void c_glProgramUniform2f(GLuint program, GLint location, GLfloat v0, GLfloat v1){
   glProgramUniform2f(program, location, v0, v1); 
}

void c_glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat *value){
   glProgramUniform2fv(program, location, count, value); 
}

void c_glProgramUniform2d(GLuint program, GLint location, GLdouble v0, GLdouble v1){
   glProgramUniform2d(program, location, v0, v1); 
}

void c_glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble *value){
   glProgramUniform2dv(program, location, count, value); 
}

void c_glProgramUniform2ui(GLuint program, GLint location, GLuint v0, GLuint v1){
   glProgramUniform2ui(program, location, v0, v1); 
}

void c_glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint *value){
   glProgramUniform2uiv(program, location, count, value); 
}

void c_glProgramUniform3i(GLuint program, GLint location, GLint v0, GLint v1, GLint v2){
   glProgramUniform3i(program, location, v0, v1, v2); 
}

void c_glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint *value){
   glProgramUniform3iv(program, location, count, value); 
}

void c_glProgramUniform3f(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2){
   glProgramUniform3f(program, location, v0, v1, v2); 
}

void c_glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat *value){
   glProgramUniform3fv(program, location, count, value); 
}

void c_glProgramUniform3d(GLuint program, GLint location, GLdouble v0, GLdouble v1, GLdouble v2){
   glProgramUniform3d(program, location, v0, v1, v2); 
}

void c_glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble *value){
   glProgramUniform3dv(program, location, count, value); 
}

void c_glProgramUniform3ui(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2){
   glProgramUniform3ui(program, location, v0, v1, v2); 
}

void c_glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint *value){
   glProgramUniform3uiv(program, location, count, value); 
}

void c_glProgramUniform4i(GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3){
   glProgramUniform4i(program, location, v0, v1, v2, v3); 
}

void c_glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint *value){
   glProgramUniform4iv(program, location, count, value); 
}

void c_glProgramUniform4f(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3){
   glProgramUniform4f(program, location, v0, v1, v2, v3); 
}

void c_glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat *value){
   glProgramUniform4fv(program, location, count, value); 
}

void c_glProgramUniform4d(GLuint program, GLint location, GLdouble v0, GLdouble v1, GLdouble v2, GLdouble v3){
   glProgramUniform4d(program, location, v0, v1, v2, v3); 
}

void c_glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble *value){
   glProgramUniform4dv(program, location, count, value); 
}

void c_glProgramUniform4ui(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3){
   glProgramUniform4ui(program, location, v0, v1, v2, v3); 
}

void c_glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint *value){
   glProgramUniform4uiv(program, location, count, value); 
}

void c_glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix2fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix3fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix4fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix2dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix3dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix4dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix2x3fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix3x2fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix2x4fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix4x2fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix3x4fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glProgramUniformMatrix4x3fv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix2x3dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix3x2dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix2x4dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix4x2dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix3x4dv(program, location, count, transpose, value); 
}

void c_glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble *value){
   glProgramUniformMatrix4x3dv(program, location, count, transpose, value); 
}

void c_glValidateProgramPipeline(GLuint pipeline){
   glValidateProgramPipeline(pipeline); 
}

void c_glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei *length, GLchar *infoLog){
   glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog); 
}

void c_glVertexAttribL1d(GLuint index, GLdouble x){
   glVertexAttribL1d(index, x); 
}

void c_glVertexAttribL2d(GLuint index, GLdouble x, GLdouble y){
   glVertexAttribL2d(index, x, y); 
}

void c_glVertexAttribL3d(GLuint index, GLdouble x, GLdouble y, GLdouble z){
   glVertexAttribL3d(index, x, y, z); 
}

void c_glVertexAttribL4d(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w){
   glVertexAttribL4d(index, x, y, z, w); 
}

void c_glVertexAttribL1dv(GLuint index, GLdouble *v){
   glVertexAttribL1dv(index, v); 
}

void c_glVertexAttribL2dv(GLuint index, GLdouble *v){
   glVertexAttribL2dv(index, v); 
}

void c_glVertexAttribL3dv(GLuint index, GLdouble *v){
   glVertexAttribL3dv(index, v); 
}

void c_glVertexAttribL4dv(GLuint index, GLdouble *v){
   glVertexAttribL4dv(index, v); 
}

void c_glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void *pointer){
   glVertexAttribLPointer(index, size, type, stride, pointer); 
}

void c_glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble *params){
   glGetVertexAttribLdv(index, pname, params); 
}

void c_glViewportArrayv(GLuint first, GLsizei count, GLfloat *v){
   glViewportArrayv(first, count, v); 
}

void c_glViewportIndexedf(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h){
   glViewportIndexedf(index, x, y, w, h); 
}

void c_glViewportIndexedfv(GLuint index, GLfloat *v){
   glViewportIndexedfv(index, v); 
}

void c_glScissorArrayv(GLuint first, GLsizei count, GLint *v){
   glScissorArrayv(first, count, v); 
}

void c_glScissorIndexed(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height){
   glScissorIndexed(index, left, bottom, width, height); 
}

void c_glScissorIndexedv(GLuint index, GLint *v){
   glScissorIndexedv(index, v); 
}

void c_glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble *v){
   glDepthRangeArrayv(first, count, v); 
}

void c_glDepthRangeIndexed(GLuint index, GLdouble n, GLdouble f){
   glDepthRangeIndexed(index, n, f); 
}

void c_glGetFloati_v(GLenum target, GLuint index, GLfloat *data){
   glGetFloati_v(target, index, data); 
}

void c_glGetDoublei_v(GLenum target, GLuint index, GLdouble *data){
   glGetDoublei_v(target, index, data); 
}

#ifdef __cplusplus
}
#endif


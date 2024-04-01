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

void c_glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar *name){
   glBindFragDataLocationIndexed(program, colorNumber, index, name); 
}

GLint c_glGetFragDataIndex(GLuint program, GLchar *name){
  return glGetFragDataIndex(program, name); 
}

void c_glGenSamplers(GLsizei count, GLuint *samplers){
   glGenSamplers(count, samplers); 
}

void c_glDeleteSamplers(GLsizei count, GLuint *samplers){
   glDeleteSamplers(count, samplers); 
}

GLboolean c_glIsSampler(GLuint sampler){
  return glIsSampler(sampler); 
}

void c_glBindSampler(GLuint unit, GLuint sampler){
   glBindSampler(unit, sampler); 
}

void c_glSamplerParameteri(GLuint sampler, GLenum pname, GLint param){
   glSamplerParameteri(sampler, pname, param); 
}

void c_glSamplerParameteriv(GLuint sampler, GLenum pname, GLint *param){
   glSamplerParameteriv(sampler, pname, param); 
}

void c_glSamplerParameterf(GLuint sampler, GLenum pname, GLfloat param){
   glSamplerParameterf(sampler, pname, param); 
}

void c_glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat *param){
   glSamplerParameterfv(sampler, pname, param); 
}

void c_glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint *param){
   glSamplerParameterIiv(sampler, pname, param); 
}

void c_glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint *param){
   glSamplerParameterIuiv(sampler, pname, param); 
}

void c_glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint *params){
   glGetSamplerParameteriv(sampler, pname, params); 
}

void c_glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint *params){
   glGetSamplerParameterIiv(sampler, pname, params); 
}

void c_glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat *params){
   glGetSamplerParameterfv(sampler, pname, params); 
}

void c_glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint *params){
   glGetSamplerParameterIuiv(sampler, pname, params); 
}

void c_glQueryCounter(GLuint id, GLenum target){
   glQueryCounter(id, target); 
}

void c_glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 *params){
   glGetQueryObjecti64v(id, pname, params); 
}

void c_glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 *params){
   glGetQueryObjectui64v(id, pname, params); 
}

void c_glVertexAttribDivisor(GLuint index, GLuint divisor){
   glVertexAttribDivisor(index, divisor); 
}

void c_glVertexAttribP1ui(GLuint index, GLenum type, GLboolean normalized, GLuint value){
   glVertexAttribP1ui(index, type, normalized, value); 
}

void c_glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint *value){
   glVertexAttribP1uiv(index, type, normalized, value); 
}

void c_glVertexAttribP2ui(GLuint index, GLenum type, GLboolean normalized, GLuint value){
   glVertexAttribP2ui(index, type, normalized, value); 
}

void c_glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint *value){
   glVertexAttribP2uiv(index, type, normalized, value); 
}

void c_glVertexAttribP3ui(GLuint index, GLenum type, GLboolean normalized, GLuint value){
   glVertexAttribP3ui(index, type, normalized, value); 
}

void c_glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint *value){
   glVertexAttribP3uiv(index, type, normalized, value); 
}

void c_glVertexAttribP4ui(GLuint index, GLenum type, GLboolean normalized, GLuint value){
   glVertexAttribP4ui(index, type, normalized, value); 
}

void c_glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint *value){
   glVertexAttribP4uiv(index, type, normalized, value); 
}

void c_glVertexP2ui(GLenum type, GLuint value){
   glVertexP2ui(type, value); 
}

void c_glVertexP2uiv(GLenum type, GLuint *value){
   glVertexP2uiv(type, value); 
}

void c_glVertexP3ui(GLenum type, GLuint value){
   glVertexP3ui(type, value); 
}

void c_glVertexP3uiv(GLenum type, GLuint *value){
   glVertexP3uiv(type, value); 
}

void c_glVertexP4ui(GLenum type, GLuint value){
   glVertexP4ui(type, value); 
}

void c_glVertexP4uiv(GLenum type, GLuint *value){
   glVertexP4uiv(type, value); 
}

void c_glTexCoordP1ui(GLenum type, GLuint coords){
   glTexCoordP1ui(type, coords); 
}

void c_glTexCoordP1uiv(GLenum type, GLuint *coords){
   glTexCoordP1uiv(type, coords); 
}

void c_glTexCoordP2ui(GLenum type, GLuint coords){
   glTexCoordP2ui(type, coords); 
}

void c_glTexCoordP2uiv(GLenum type, GLuint *coords){
   glTexCoordP2uiv(type, coords); 
}

void c_glTexCoordP3ui(GLenum type, GLuint coords){
   glTexCoordP3ui(type, coords); 
}

void c_glTexCoordP3uiv(GLenum type, GLuint *coords){
   glTexCoordP3uiv(type, coords); 
}

void c_glTexCoordP4ui(GLenum type, GLuint coords){
   glTexCoordP4ui(type, coords); 
}

void c_glTexCoordP4uiv(GLenum type, GLuint *coords){
   glTexCoordP4uiv(type, coords); 
}

void c_glMultiTexCoordP1ui(GLenum texture, GLenum type, GLuint coords){
   glMultiTexCoordP1ui(texture, type, coords); 
}

void c_glMultiTexCoordP1uiv(GLenum texture, GLenum type, GLuint *coords){
   glMultiTexCoordP1uiv(texture, type, coords); 
}

void c_glMultiTexCoordP2ui(GLenum texture, GLenum type, GLuint coords){
   glMultiTexCoordP2ui(texture, type, coords); 
}

void c_glMultiTexCoordP2uiv(GLenum texture, GLenum type, GLuint *coords){
   glMultiTexCoordP2uiv(texture, type, coords); 
}

void c_glMultiTexCoordP3ui(GLenum texture, GLenum type, GLuint coords){
   glMultiTexCoordP3ui(texture, type, coords); 
}

void c_glMultiTexCoordP3uiv(GLenum texture, GLenum type, GLuint *coords){
   glMultiTexCoordP3uiv(texture, type, coords); 
}

void c_glMultiTexCoordP4ui(GLenum texture, GLenum type, GLuint coords){
   glMultiTexCoordP4ui(texture, type, coords); 
}

void c_glMultiTexCoordP4uiv(GLenum texture, GLenum type, GLuint *coords){
   glMultiTexCoordP4uiv(texture, type, coords); 
}

void c_glNormalP3ui(GLenum type, GLuint coords){
   glNormalP3ui(type, coords); 
}

void c_glNormalP3uiv(GLenum type, GLuint *coords){
   glNormalP3uiv(type, coords); 
}

void c_glColorP3ui(GLenum type, GLuint color){
   glColorP3ui(type, color); 
}

void c_glColorP3uiv(GLenum type, GLuint *color){
   glColorP3uiv(type, color); 
}

void c_glColorP4ui(GLenum type, GLuint color){
   glColorP4ui(type, color); 
}

void c_glColorP4uiv(GLenum type, GLuint *color){
   glColorP4uiv(type, color); 
}

void c_glSecondaryColorP3ui(GLenum type, GLuint color){
   glSecondaryColorP3ui(type, color); 
}

void c_glSecondaryColorP3uiv(GLenum type, GLuint *color){
   glSecondaryColorP3uiv(type, color); 
}

#ifdef __cplusplus
}
#endif

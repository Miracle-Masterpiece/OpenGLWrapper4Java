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

void c_glSpecializeShader(GLuint shader, GLchar *pEntryPoint, GLuint numSpecializationConstants, GLuint *pConstantIndex, GLuint *pConstantValue){
   glSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue); 
}

void c_glMultiDrawArraysIndirectCount(GLenum mode, void *indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride){
   glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride); 
}

void c_glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void *indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride){
   glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride); 
}

void c_glPolygonOffsetClamp(GLfloat factor, GLfloat units, GLfloat clamp){
   glPolygonOffsetClamp(factor, units, clamp); 
}

#ifdef __cplusplus
}
#endif

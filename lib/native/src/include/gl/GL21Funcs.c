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

void c_glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix2x3fv(location, count, transpose, value); 
}

void c_glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix3x2fv(location, count, transpose, value); 
}

void c_glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix2x4fv(location, count, transpose, value); 
}

void c_glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix4x2fv(location, count, transpose, value); 
}

void c_glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix3x4fv(location, count, transpose, value); 
}

void c_glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat *value){
   glUniformMatrix4x3fv(location, count, transpose, value); 
}

#ifdef __cplusplus
}
#endif

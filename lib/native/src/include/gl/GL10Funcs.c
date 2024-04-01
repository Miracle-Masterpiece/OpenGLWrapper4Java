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

void c_glCullFace(GLenum mode){
   glCullFace(mode); 
}

void c_glFrontFace(GLenum mode){
   glFrontFace(mode); 
}

void c_glHint(GLenum target, GLenum mode){
   glHint(target, mode); 
}

void c_glLineWidth(GLfloat width){
   glLineWidth(width); 
}

void c_glPointSize(GLfloat size){
   glPointSize(size); 
}

void c_glPolygonMode(GLenum face, GLenum mode){
   glPolygonMode(face, mode); 
}

void c_glScissor(GLint x, GLint y, GLsizei width, GLsizei height){
   glScissor(x, y, width, height); 
}

void c_glTexParameterf(GLenum target, GLenum pname, GLfloat param){
   glTexParameterf(target, pname, param); 
}

void c_glTexParameterfv(GLenum target, GLenum pname, GLfloat *params){
   glTexParameterfv(target, pname, params); 
}

void c_glTexParameteri(GLenum target, GLenum pname, GLint param){
   glTexParameteri(target, pname, param); 
}

void c_glTexParameteriv(GLenum target, GLenum pname, GLint *params){
   glTexParameteriv(target, pname, params); 
}

void c_glTexImage1D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLint border, GLenum format, GLenum type, void *pixels){
   glTexImage1D(target, level, internalformat, width, border, format, type, pixels); 
}

void c_glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void *pixels){
   glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels); 
}

void c_glDrawBuffer(GLenum buf){
   glDrawBuffer(buf); 
}

void c_glClear(GLbitfield mask){
   glClear(mask); 
}

void c_glClearColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha){
   glClearColor(red, green, blue, alpha); 
}

void c_glClearStencil(GLint s){
   glClearStencil(s); 
}

void c_glClearDepth(GLdouble depth){
   glClearDepth(depth); 
}

void c_glStencilMask(GLuint mask){
   glStencilMask(mask); 
}

void c_glColorMask(GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha){
   glColorMask(red, green, blue, alpha); 
}

void c_glDepthMask(GLboolean flag){
   glDepthMask(flag); 
}

void c_glDisable(GLenum cap){
   glDisable(cap); 
}

void c_glEnable(GLenum cap){
   glEnable(cap); 
}

void c_glFinish(){
   glFinish(); 
}

void c_glFlush(){
   glFlush(); 
}

void c_glBlendFunc(GLenum sfactor, GLenum dfactor){
   glBlendFunc(sfactor, dfactor); 
}

void c_glLogicOp(GLenum opcode){
   glLogicOp(opcode); 
}

void c_glStencilFunc(GLenum func, GLint ref, GLuint mask){
   glStencilFunc(func, ref, mask); 
}

void c_glStencilOp(GLenum fail, GLenum zfail, GLenum zpass){
   glStencilOp(fail, zfail, zpass); 
}

void c_glDepthFunc(GLenum func){
   glDepthFunc(func); 
}

void c_glPixelStoref(GLenum pname, GLfloat param){
   glPixelStoref(pname, param); 
}

void c_glPixelStorei(GLenum pname, GLint param){
   glPixelStorei(pname, param); 
}

void c_glReadBuffer(GLenum src){
   glReadBuffer(src); 
}

void c_glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void *pixels){
   glReadPixels(x, y, width, height, format, type, pixels); 
}

void c_glGetBooleanv(GLenum pname, GLboolean *data){
   glGetBooleanv(pname, data); 
}

void c_glGetDoublev(GLenum pname, GLdouble *data){
   glGetDoublev(pname, data); 
}

GLenum c_glGetError(){
  return glGetError(); 
}

void c_glGetFloatv(GLenum pname, GLfloat *data){
   glGetFloatv(pname, data); 
}

void c_glGetIntegerv(GLenum pname, GLint *data){
   glGetIntegerv(pname, data); 
}

const GLubyte* c_glGetString(GLenum name){
  return glGetString(name); 
}

void c_glGetTexImage(GLenum target, GLint level, GLenum format, GLenum type, void *pixels){
   glGetTexImage(target, level, format, type, pixels); 
}

void c_glGetTexParameterfv(GLenum target, GLenum pname, GLfloat *params){
   glGetTexParameterfv(target, pname, params); 
}

void c_glGetTexParameteriv(GLenum target, GLenum pname, GLint *params){
   glGetTexParameteriv(target, pname, params); 
}

void c_glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat *params){
   glGetTexLevelParameterfv(target, level, pname, params); 
}

void c_glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint *params){
   glGetTexLevelParameteriv(target, level, pname, params); 
}

GLboolean c_glIsEnabled(GLenum cap){
  return glIsEnabled(cap); 
}

void c_glDepthRange(GLdouble n, GLdouble f){
   glDepthRange(n, f); 
}

void c_glViewport(GLint x, GLint y, GLsizei width, GLsizei height){
   glViewport(x, y, width, height); 
}

void c_glNewList(GLuint list, GLenum mode){
   glNewList(list, mode); 
}

void c_glEndList(){
   glEndList(); 
}

void c_glCallList(GLuint list){
   glCallList(list); 
}

void c_glCallLists(GLsizei n, GLenum type, void *lists){
   glCallLists(n, type, lists); 
}

void c_glDeleteLists(GLuint list, GLsizei range){
   glDeleteLists(list, range); 
}

GLuint c_glGenLists(GLsizei range){
  return glGenLists(range); 
}

void c_glListBase(GLuint base){
   glListBase(base); 
}

void c_glBegin(GLenum mode){
   glBegin(mode); 
}

void c_glBitmap(GLsizei width, GLsizei height, GLfloat xorig, GLfloat yorig, GLfloat xmove, GLfloat ymove, GLubyte *bitmap){
   glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap); 
}

void c_glColor3b(GLbyte red, GLbyte green, GLbyte blue){
   glColor3b(red, green, blue); 
}

void c_glColor3bv(GLbyte *v){
   glColor3bv(v); 
}

void c_glColor3d(GLdouble red, GLdouble green, GLdouble blue){
   glColor3d(red, green, blue); 
}

void c_glColor3dv(GLdouble *v){
   glColor3dv(v); 
}

void c_glColor3f(GLfloat red, GLfloat green, GLfloat blue){
   glColor3f(red, green, blue); 
}

void c_glColor3fv(GLfloat *v){
   glColor3fv(v); 
}

void c_glColor3i(GLint red, GLint green, GLint blue){
   glColor3i(red, green, blue); 
}

void c_glColor3iv(GLint *v){
   glColor3iv(v); 
}

void c_glColor3s(GLshort red, GLshort green, GLshort blue){
   glColor3s(red, green, blue); 
}

void c_glColor3sv(GLshort *v){
   glColor3sv(v); 
}

void c_glColor3ub(GLubyte red, GLubyte green, GLubyte blue){
   glColor3ub(red, green, blue); 
}

void c_glColor3ubv(GLubyte *v){
   glColor3ubv(v); 
}

void c_glColor3ui(GLuint red, GLuint green, GLuint blue){
   glColor3ui(red, green, blue); 
}

void c_glColor3uiv(GLuint *v){
   glColor3uiv(v); 
}

void c_glColor3us(GLushort red, GLushort green, GLushort blue){
   glColor3us(red, green, blue); 
}

void c_glColor3usv(GLushort *v){
   glColor3usv(v); 
}

void c_glColor4b(GLbyte red, GLbyte green, GLbyte blue, GLbyte alpha){
   glColor4b(red, green, blue, alpha); 
}

void c_glColor4bv(GLbyte *v){
   glColor4bv(v); 
}

void c_glColor4d(GLdouble red, GLdouble green, GLdouble blue, GLdouble alpha){
   glColor4d(red, green, blue, alpha); 
}

void c_glColor4dv(GLdouble *v){
   glColor4dv(v); 
}

void c_glColor4f(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha){
   glColor4f(red, green, blue, alpha); 
}

void c_glColor4fv(GLfloat *v){
   glColor4fv(v); 
}

void c_glColor4i(GLint red, GLint green, GLint blue, GLint alpha){
   glColor4i(red, green, blue, alpha); 
}

void c_glColor4iv(GLint *v){
   glColor4iv(v); 
}

void c_glColor4s(GLshort red, GLshort green, GLshort blue, GLshort alpha){
   glColor4s(red, green, blue, alpha); 
}

void c_glColor4sv(GLshort *v){
   glColor4sv(v); 
}

void c_glColor4ub(GLubyte red, GLubyte green, GLubyte blue, GLubyte alpha){
   glColor4ub(red, green, blue, alpha); 
}

void c_glColor4ubv(GLubyte *v){
   glColor4ubv(v); 
}

void c_glColor4ui(GLuint red, GLuint green, GLuint blue, GLuint alpha){
   glColor4ui(red, green, blue, alpha); 
}

void c_glColor4uiv(GLuint *v){
   glColor4uiv(v); 
}

void c_glColor4us(GLushort red, GLushort green, GLushort blue, GLushort alpha){
   glColor4us(red, green, blue, alpha); 
}

void c_glColor4usv(GLushort *v){
   glColor4usv(v); 
}

void c_glEdgeFlag(GLboolean flag){
   glEdgeFlag(flag); 
}

void c_glEdgeFlagv(GLboolean *flag){
   glEdgeFlagv(flag); 
}

void c_glEnd(){
   glEnd(); 
}

void c_glIndexd(GLdouble c){
   glIndexd(c); 
}

void c_glIndexdv(GLdouble *c){
   glIndexdv(c); 
}

void c_glIndexf(GLfloat c){
   glIndexf(c); 
}

void c_glIndexfv(GLfloat *c){
   glIndexfv(c); 
}

void c_glIndexi(GLint c){
   glIndexi(c); 
}

void c_glIndexiv(GLint *c){
   glIndexiv(c); 
}

void c_glIndexs(GLshort c){
   glIndexs(c); 
}

void c_glIndexsv(GLshort *c){
   glIndexsv(c); 
}

void c_glNormal3b(GLbyte nx, GLbyte ny, GLbyte nz){
   glNormal3b(nx, ny, nz); 
}

void c_glNormal3bv(GLbyte *v){
   glNormal3bv(v); 
}

void c_glNormal3d(GLdouble nx, GLdouble ny, GLdouble nz){
   glNormal3d(nx, ny, nz); 
}

void c_glNormal3dv(GLdouble *v){
   glNormal3dv(v); 
}

void c_glNormal3f(GLfloat nx, GLfloat ny, GLfloat nz){
   glNormal3f(nx, ny, nz); 
}

void c_glNormal3fv(GLfloat *v){
   glNormal3fv(v); 
}

void c_glNormal3i(GLint nx, GLint ny, GLint nz){
   glNormal3i(nx, ny, nz); 
}

void c_glNormal3iv(GLint *v){
   glNormal3iv(v); 
}

void c_glNormal3s(GLshort nx, GLshort ny, GLshort nz){
   glNormal3s(nx, ny, nz); 
}

void c_glNormal3sv(GLshort *v){
   glNormal3sv(v); 
}

void c_glRasterPos2d(GLdouble x, GLdouble y){
   glRasterPos2d(x, y); 
}

void c_glRasterPos2dv(GLdouble *v){
   glRasterPos2dv(v); 
}

void c_glRasterPos2f(GLfloat x, GLfloat y){
   glRasterPos2f(x, y); 
}

void c_glRasterPos2fv(GLfloat *v){
   glRasterPos2fv(v); 
}

void c_glRasterPos2i(GLint x, GLint y){
   glRasterPos2i(x, y); 
}

void c_glRasterPos2iv(GLint *v){
   glRasterPos2iv(v); 
}

void c_glRasterPos2s(GLshort x, GLshort y){
   glRasterPos2s(x, y); 
}

void c_glRasterPos2sv(GLshort *v){
   glRasterPos2sv(v); 
}

void c_glRasterPos3d(GLdouble x, GLdouble y, GLdouble z){
   glRasterPos3d(x, y, z); 
}

void c_glRasterPos3dv(GLdouble *v){
   glRasterPos3dv(v); 
}

void c_glRasterPos3f(GLfloat x, GLfloat y, GLfloat z){
   glRasterPos3f(x, y, z); 
}

void c_glRasterPos3fv(GLfloat *v){
   glRasterPos3fv(v); 
}

void c_glRasterPos3i(GLint x, GLint y, GLint z){
   glRasterPos3i(x, y, z); 
}

void c_glRasterPos3iv(GLint *v){
   glRasterPos3iv(v); 
}

void c_glRasterPos3s(GLshort x, GLshort y, GLshort z){
   glRasterPos3s(x, y, z); 
}

void c_glRasterPos3sv(GLshort *v){
   glRasterPos3sv(v); 
}

void c_glRasterPos4d(GLdouble x, GLdouble y, GLdouble z, GLdouble w){
   glRasterPos4d(x, y, z, w); 
}

void c_glRasterPos4dv(GLdouble *v){
   glRasterPos4dv(v); 
}

void c_glRasterPos4f(GLfloat x, GLfloat y, GLfloat z, GLfloat w){
   glRasterPos4f(x, y, z, w); 
}

void c_glRasterPos4fv(GLfloat *v){
   glRasterPos4fv(v); 
}

void c_glRasterPos4i(GLint x, GLint y, GLint z, GLint w){
   glRasterPos4i(x, y, z, w); 
}

void c_glRasterPos4iv(GLint *v){
   glRasterPos4iv(v); 
}

void c_glRasterPos4s(GLshort x, GLshort y, GLshort z, GLshort w){
   glRasterPos4s(x, y, z, w); 
}

void c_glRasterPos4sv(GLshort *v){
   glRasterPos4sv(v); 
}

void c_glRectd(GLdouble x1, GLdouble y1, GLdouble x2, GLdouble y2){
   glRectd(x1, y1, x2, y2); 
}

void c_glRectdv(GLdouble *v1, GLdouble *v2){
   glRectdv(v1, v2); 
}

void c_glRectf(GLfloat x1, GLfloat y1, GLfloat x2, GLfloat y2){
   glRectf(x1, y1, x2, y2); 
}

void c_glRectfv(GLfloat *v1, GLfloat *v2){
   glRectfv(v1, v2); 
}

void c_glRecti(GLint x1, GLint y1, GLint x2, GLint y2){
   glRecti(x1, y1, x2, y2); 
}

void c_glRectiv(GLint *v1, GLint *v2){
   glRectiv(v1, v2); 
}

void c_glRects(GLshort x1, GLshort y1, GLshort x2, GLshort y2){
   glRects(x1, y1, x2, y2); 
}

void c_glRectsv(GLshort *v1, GLshort *v2){
   glRectsv(v1, v2); 
}

void c_glTexCoord1d(GLdouble s){
   glTexCoord1d(s); 
}

void c_glTexCoord1dv(GLdouble *v){
   glTexCoord1dv(v); 
}

void c_glTexCoord1f(GLfloat s){
   glTexCoord1f(s); 
}

void c_glTexCoord1fv(GLfloat *v){
   glTexCoord1fv(v); 
}

void c_glTexCoord1i(GLint s){
   glTexCoord1i(s); 
}

void c_glTexCoord1iv(GLint *v){
   glTexCoord1iv(v); 
}

void c_glTexCoord1s(GLshort s){
   glTexCoord1s(s); 
}

void c_glTexCoord1sv(GLshort *v){
   glTexCoord1sv(v); 
}

void c_glTexCoord2d(GLdouble s, GLdouble t){
   glTexCoord2d(s, t); 
}

void c_glTexCoord2dv(GLdouble *v){
   glTexCoord2dv(v); 
}

void c_glTexCoord2f(GLfloat s, GLfloat t){
   glTexCoord2f(s, t); 
}

void c_glTexCoord2fv(GLfloat *v){
   glTexCoord2fv(v); 
}

void c_glTexCoord2i(GLint s, GLint t){
   glTexCoord2i(s, t); 
}

void c_glTexCoord2iv(GLint *v){
   glTexCoord2iv(v); 
}

void c_glTexCoord2s(GLshort s, GLshort t){
   glTexCoord2s(s, t); 
}

void c_glTexCoord2sv(GLshort *v){
   glTexCoord2sv(v); 
}

void c_glTexCoord3d(GLdouble s, GLdouble t, GLdouble r){
   glTexCoord3d(s, t, r); 
}

void c_glTexCoord3dv(GLdouble *v){
   glTexCoord3dv(v); 
}

void c_glTexCoord3f(GLfloat s, GLfloat t, GLfloat r){
   glTexCoord3f(s, t, r); 
}

void c_glTexCoord3fv(GLfloat *v){
   glTexCoord3fv(v); 
}

void c_glTexCoord3i(GLint s, GLint t, GLint r){
   glTexCoord3i(s, t, r); 
}

void c_glTexCoord3iv(GLint *v){
   glTexCoord3iv(v); 
}

void c_glTexCoord3s(GLshort s, GLshort t, GLshort r){
   glTexCoord3s(s, t, r); 
}

void c_glTexCoord3sv(GLshort *v){
   glTexCoord3sv(v); 
}

void c_glTexCoord4d(GLdouble s, GLdouble t, GLdouble r, GLdouble q){
   glTexCoord4d(s, t, r, q); 
}

void c_glTexCoord4dv(GLdouble *v){
   glTexCoord4dv(v); 
}

void c_glTexCoord4f(GLfloat s, GLfloat t, GLfloat r, GLfloat q){
   glTexCoord4f(s, t, r, q); 
}

void c_glTexCoord4fv(GLfloat *v){
   glTexCoord4fv(v); 
}

void c_glTexCoord4i(GLint s, GLint t, GLint r, GLint q){
   glTexCoord4i(s, t, r, q); 
}

void c_glTexCoord4iv(GLint *v){
   glTexCoord4iv(v); 
}

void c_glTexCoord4s(GLshort s, GLshort t, GLshort r, GLshort q){
   glTexCoord4s(s, t, r, q); 
}

void c_glTexCoord4sv(GLshort *v){
   glTexCoord4sv(v); 
}

void c_glVertex2d(GLdouble x, GLdouble y){
   glVertex2d(x, y); 
}

void c_glVertex2dv(GLdouble *v){
   glVertex2dv(v); 
}

void c_glVertex2f(GLfloat x, GLfloat y){
   glVertex2f(x, y); 
}

void c_glVertex2fv(GLfloat *v){
   glVertex2fv(v); 
}

void c_glVertex2i(GLint x, GLint y){
   glVertex2i(x, y); 
}

void c_glVertex2iv(GLint *v){
   glVertex2iv(v); 
}

void c_glVertex2s(GLshort x, GLshort y){
   glVertex2s(x, y); 
}

void c_glVertex2sv(GLshort *v){
   glVertex2sv(v); 
}

void c_glVertex3d(GLdouble x, GLdouble y, GLdouble z){
   glVertex3d(x, y, z); 
}

void c_glVertex3dv(GLdouble *v){
   glVertex3dv(v); 
}

void c_glVertex3f(GLfloat x, GLfloat y, GLfloat z){
   glVertex3f(x, y, z); 
}

void c_glVertex3fv(GLfloat *v){
   glVertex3fv(v); 
}

void c_glVertex3i(GLint x, GLint y, GLint z){
   glVertex3i(x, y, z); 
}

void c_glVertex3iv(GLint *v){
   glVertex3iv(v); 
}

void c_glVertex3s(GLshort x, GLshort y, GLshort z){
   glVertex3s(x, y, z); 
}

void c_glVertex3sv(GLshort *v){
   glVertex3sv(v); 
}

void c_glVertex4d(GLdouble x, GLdouble y, GLdouble z, GLdouble w){
   glVertex4d(x, y, z, w); 
}

void c_glVertex4dv(GLdouble *v){
   glVertex4dv(v); 
}

void c_glVertex4f(GLfloat x, GLfloat y, GLfloat z, GLfloat w){
   glVertex4f(x, y, z, w); 
}

void c_glVertex4fv(GLfloat *v){
   glVertex4fv(v); 
}

void c_glVertex4i(GLint x, GLint y, GLint z, GLint w){
   glVertex4i(x, y, z, w); 
}

void c_glVertex4iv(GLint *v){
   glVertex4iv(v); 
}

void c_glVertex4s(GLshort x, GLshort y, GLshort z, GLshort w){
   glVertex4s(x, y, z, w); 
}

void c_glVertex4sv(GLshort *v){
   glVertex4sv(v); 
}

void c_glClipPlane(GLenum plane, GLdouble *equation){
   glClipPlane(plane, equation); 
}

void c_glColorMaterial(GLenum face, GLenum mode){
   glColorMaterial(face, mode); 
}

void c_glFogf(GLenum pname, GLfloat param){
   glFogf(pname, param); 
}

void c_glFogfv(GLenum pname, GLfloat *params){
   glFogfv(pname, params); 
}

void c_glFogi(GLenum pname, GLint param){
   glFogi(pname, param); 
}

void c_glFogiv(GLenum pname, GLint *params){
   glFogiv(pname, params); 
}

void c_glLightf(GLenum light, GLenum pname, GLfloat param){
   glLightf(light, pname, param); 
}

void c_glLightfv(GLenum light, GLenum pname, GLfloat *params){
   glLightfv(light, pname, params); 
}

void c_glLighti(GLenum light, GLenum pname, GLint param){
   glLighti(light, pname, param); 
}

void c_glLightiv(GLenum light, GLenum pname, GLint *params){
   glLightiv(light, pname, params); 
}

void c_glLightModelf(GLenum pname, GLfloat param){
   glLightModelf(pname, param); 
}

void c_glLightModelfv(GLenum pname, GLfloat *params){
   glLightModelfv(pname, params); 
}

void c_glLightModeli(GLenum pname, GLint param){
   glLightModeli(pname, param); 
}

void c_glLightModeliv(GLenum pname, GLint *params){
   glLightModeliv(pname, params); 
}

void c_glLineStipple(GLint factor, GLushort pattern){
   glLineStipple(factor, pattern); 
}

void c_glMaterialf(GLenum face, GLenum pname, GLfloat param){
   glMaterialf(face, pname, param); 
}

void c_glMaterialfv(GLenum face, GLenum pname, GLfloat *params){
   glMaterialfv(face, pname, params); 
}

void c_glMateriali(GLenum face, GLenum pname, GLint param){
   glMateriali(face, pname, param); 
}

void c_glMaterialiv(GLenum face, GLenum pname, GLint *params){
   glMaterialiv(face, pname, params); 
}

void c_glPolygonStipple(GLubyte *mask){
   glPolygonStipple(mask); 
}

void c_glShadeModel(GLenum mode){
   glShadeModel(mode); 
}

void c_glTexEnvf(GLenum target, GLenum pname, GLfloat param){
   glTexEnvf(target, pname, param); 
}

void c_glTexEnvfv(GLenum target, GLenum pname, GLfloat *params){
   glTexEnvfv(target, pname, params); 
}

void c_glTexEnvi(GLenum target, GLenum pname, GLint param){
   glTexEnvi(target, pname, param); 
}

void c_glTexEnviv(GLenum target, GLenum pname, GLint *params){
   glTexEnviv(target, pname, params); 
}

void c_glTexGend(GLenum coord, GLenum pname, GLdouble param){
   glTexGend(coord, pname, param); 
}

void c_glTexGendv(GLenum coord, GLenum pname, GLdouble *params){
   glTexGendv(coord, pname, params); 
}

void c_glTexGenf(GLenum coord, GLenum pname, GLfloat param){
   glTexGenf(coord, pname, param); 
}

void c_glTexGenfv(GLenum coord, GLenum pname, GLfloat *params){
   glTexGenfv(coord, pname, params); 
}

void c_glTexGeni(GLenum coord, GLenum pname, GLint param){
   glTexGeni(coord, pname, param); 
}

void c_glTexGeniv(GLenum coord, GLenum pname, GLint *params){
   glTexGeniv(coord, pname, params); 
}

void c_glFeedbackBuffer(GLsizei size, GLenum type, GLfloat *buffer){
   glFeedbackBuffer(size, type, buffer); 
}

void c_glSelectBuffer(GLsizei size, GLuint *buffer){
   glSelectBuffer(size, buffer); 
}

GLint c_glRenderMode(GLenum mode){
  return glRenderMode(mode); 
}

void c_glInitNames(){
   glInitNames(); 
}

void c_glLoadName(GLuint name){
   glLoadName(name); 
}

void c_glPassThrough(GLfloat token){
   glPassThrough(token); 
}

void c_glPopName(){
   glPopName(); 
}

void c_glPushName(GLuint name){
   glPushName(name); 
}

void c_glClearAccum(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha){
   glClearAccum(red, green, blue, alpha); 
}

void c_glClearIndex(GLfloat c){
   glClearIndex(c); 
}

void c_glIndexMask(GLuint mask){
   glIndexMask(mask); 
}

void c_glAccum(GLenum op, GLfloat value){
   glAccum(op, value); 
}

void c_glPopAttrib(){
   glPopAttrib(); 
}

void c_glPushAttrib(GLbitfield mask){
   glPushAttrib(mask); 
}

void c_glMap1d(GLenum target, GLdouble u1, GLdouble u2, GLint stride, GLint order, GLdouble *points){
   glMap1d(target, u1, u2, stride, order, points); 
}

void c_glMap1f(GLenum target, GLfloat u1, GLfloat u2, GLint stride, GLint order, GLfloat *points){
   glMap1f(target, u1, u2, stride, order, points); 
}

void c_glMap2d(GLenum target, GLdouble u1, GLdouble u2, GLint ustride, GLint uorder, GLdouble v1, GLdouble v2, GLint vstride, GLint vorder, GLdouble *points){
   glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); 
}

void c_glMap2f(GLenum target, GLfloat u1, GLfloat u2, GLint ustride, GLint uorder, GLfloat v1, GLfloat v2, GLint vstride, GLint vorder, GLfloat *points){
   glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); 
}

void c_glMapGrid1d(GLint un, GLdouble u1, GLdouble u2){
   glMapGrid1d(un, u1, u2); 
}

void c_glMapGrid1f(GLint un, GLfloat u1, GLfloat u2){
   glMapGrid1f(un, u1, u2); 
}

void c_glMapGrid2d(GLint un, GLdouble u1, GLdouble u2, GLint vn, GLdouble v1, GLdouble v2){
   glMapGrid2d(un, u1, u2, vn, v1, v2); 
}

void c_glMapGrid2f(GLint un, GLfloat u1, GLfloat u2, GLint vn, GLfloat v1, GLfloat v2){
   glMapGrid2f(un, u1, u2, vn, v1, v2); 
}

void c_glEvalCoord1d(GLdouble u){
   glEvalCoord1d(u); 
}

void c_glEvalCoord1dv(GLdouble *u){
   glEvalCoord1dv(u); 
}

void c_glEvalCoord1f(GLfloat u){
   glEvalCoord1f(u); 
}

void c_glEvalCoord1fv(GLfloat *u){
   glEvalCoord1fv(u); 
}

void c_glEvalCoord2d(GLdouble u, GLdouble v){
   glEvalCoord2d(u, v); 
}

void c_glEvalCoord2dv(GLdouble *u){
   glEvalCoord2dv(u); 
}

void c_glEvalCoord2f(GLfloat u, GLfloat v){
   glEvalCoord2f(u, v); 
}

void c_glEvalCoord2fv(GLfloat *u){
   glEvalCoord2fv(u); 
}

void c_glEvalMesh1(GLenum mode, GLint i1, GLint i2){
   glEvalMesh1(mode, i1, i2); 
}

void c_glEvalPoint1(GLint i){
   glEvalPoint1(i); 
}

void c_glEvalMesh2(GLenum mode, GLint i1, GLint i2, GLint j1, GLint j2){
   glEvalMesh2(mode, i1, i2, j1, j2); 
}

void c_glEvalPoint2(GLint i, GLint j){
   glEvalPoint2(i, j); 
}

void c_glAlphaFunc(GLenum func, GLfloat ref){
   glAlphaFunc(func, ref); 
}

void c_glPixelZoom(GLfloat xfactor, GLfloat yfactor){
   glPixelZoom(xfactor, yfactor); 
}

void c_glPixelTransferf(GLenum pname, GLfloat param){
   glPixelTransferf(pname, param); 
}

void c_glPixelTransferi(GLenum pname, GLint param){
   glPixelTransferi(pname, param); 
}

void c_glPixelMapfv(GLenum map, GLsizei mapsize, GLfloat *values){
   glPixelMapfv(map, mapsize, values); 
}

void c_glPixelMapuiv(GLenum map, GLsizei mapsize, GLuint *values){
   glPixelMapuiv(map, mapsize, values); 
}

void c_glPixelMapusv(GLenum map, GLsizei mapsize, GLushort *values){
   glPixelMapusv(map, mapsize, values); 
}

void c_glCopyPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum type){
   glCopyPixels(x, y, width, height, type); 
}

void c_glDrawPixels(GLsizei width, GLsizei height, GLenum format, GLenum type, void *pixels){
   glDrawPixels(width, height, format, type, pixels); 
}

void c_glGetClipPlane(GLenum plane, GLdouble *equation){
   glGetClipPlane(plane, equation); 
}

void c_glGetLightfv(GLenum light, GLenum pname, GLfloat *params){
   glGetLightfv(light, pname, params); 
}

void c_glGetLightiv(GLenum light, GLenum pname, GLint *params){
   glGetLightiv(light, pname, params); 
}

void c_glGetMapdv(GLenum target, GLenum query, GLdouble *v){
   glGetMapdv(target, query, v); 
}

void c_glGetMapfv(GLenum target, GLenum query, GLfloat *v){
   glGetMapfv(target, query, v); 
}

void c_glGetMapiv(GLenum target, GLenum query, GLint *v){
   glGetMapiv(target, query, v); 
}

void c_glGetMaterialfv(GLenum face, GLenum pname, GLfloat *params){
   glGetMaterialfv(face, pname, params); 
}

void c_glGetMaterialiv(GLenum face, GLenum pname, GLint *params){
   glGetMaterialiv(face, pname, params); 
}

void c_glGetPixelMapfv(GLenum map, GLfloat *values){
   glGetPixelMapfv(map, values); 
}

void c_glGetPixelMapuiv(GLenum map, GLuint *values){
   glGetPixelMapuiv(map, values); 
}

void c_glGetPixelMapusv(GLenum map, GLushort *values){
   glGetPixelMapusv(map, values); 
}

void c_glGetPolygonStipple(GLubyte *mask){
   glGetPolygonStipple(mask); 
}

void c_glGetTexEnvfv(GLenum target, GLenum pname, GLfloat *params){
   glGetTexEnvfv(target, pname, params); 
}

void c_glGetTexEnviv(GLenum target, GLenum pname, GLint *params){
   glGetTexEnviv(target, pname, params); 
}

void c_glGetTexGendv(GLenum coord, GLenum pname, GLdouble *params){
   glGetTexGendv(coord, pname, params); 
}

void c_glGetTexGenfv(GLenum coord, GLenum pname, GLfloat *params){
   glGetTexGenfv(coord, pname, params); 
}

void c_glGetTexGeniv(GLenum coord, GLenum pname, GLint *params){
   glGetTexGeniv(coord, pname, params); 
}

GLboolean c_glIsList(GLuint list){
  return glIsList(list); 
}

void c_glFrustum(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top, GLdouble zNear, GLdouble zFar){
   glFrustum(left, right, bottom, top, zNear, zFar); 
}

void c_glLoadIdentity(){
   glLoadIdentity(); 
}

void c_glLoadMatrixf(GLfloat *m){
   glLoadMatrixf(m); 
}

void c_glLoadMatrixd(GLdouble *m){
   glLoadMatrixd(m); 
}

void c_glMatrixMode(GLenum mode){
   glMatrixMode(mode); 
}

void c_glMultMatrixf(GLfloat *m){
   glMultMatrixf(m); 
}

void c_glMultMatrixd(GLdouble *m){
   glMultMatrixd(m); 
}

void c_glOrtho(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top, GLdouble zNear, GLdouble zFar){
   glOrtho(left, right, bottom, top, zNear, zFar); 
}

void c_glPopMatrix(){
   glPopMatrix(); 
}

void c_glPushMatrix(){
   glPushMatrix(); 
}

void c_glRotated(GLdouble angle, GLdouble x, GLdouble y, GLdouble z){
   glRotated(angle, x, y, z); 
}

void c_glRotatef(GLfloat angle, GLfloat x, GLfloat y, GLfloat z){
   glRotatef(angle, x, y, z); 
}

void c_glScaled(GLdouble x, GLdouble y, GLdouble z){
   glScaled(x, y, z); 
}

void c_glScalef(GLfloat x, GLfloat y, GLfloat z){
   glScalef(x, y, z); 
}

void c_glTranslated(GLdouble x, GLdouble y, GLdouble z){
   glTranslated(x, y, z); 
}

void c_glTranslatef(GLfloat x, GLfloat y, GLfloat z){
   glTranslatef(x, y, z); 
}

#ifdef __cplusplus
}
#endif

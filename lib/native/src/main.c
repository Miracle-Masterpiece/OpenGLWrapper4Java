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
#include<glad/glad.h>
#include"glad.c"
#include<gl/GL10Funcs.c>
#include<gl/GL11Funcs.c>
#include<gl/GL12Funcs.c>
#include<gl/GL13Funcs.c>
#include<gl/GL14Funcs.c>
#include<gl/GL15Funcs.c>
#include<gl/GL20Funcs.c>
#include<gl/GL21Funcs.c>
#include<gl/GL30Funcs.c>
#include<gl/GL31Funcs.c>
#include<gl/GL32Funcs.c>
#include<gl/GL33Funcs.c>
#include<gl/GL40Funcs.c>
#include<gl/GL41Funcs.c>
#include<gl/GL42Funcs.c>
#include<gl/GL43Funcs.c>
#include<gl/GL44Funcs.c>
#include<gl/GL45Funcs.c>
#include<gl/GL46Funcs.c>
#include<stddef.h>
#include<inttypes.h>

struct ___GLFWgammaramp{
	unsigned short* red;
	unsigned short* green;
	unsigned short* blue;
	unsigned int* 	size;
}; typedef struct ___GLFWgammaramp ___GLFWgammaramp;

struct ___GLFWgamepadstate{
	char buttons[15];
	float axes[6];
}; typedef struct ___GLFWgamepadstate ___GLFWgamepadstate;

struct ___GLFWvidmode{
	int width;
 	int height;
	int redBits;
 	int greenBits;
	int blueBits;
	int refreshRate;
}; typedef struct ___GLFWvidmode ___GLFWvidmode;

#ifdef __cplusplus
extern "C"{
#endif
	
	/**
	 * struct GLFWgammaramp Data Fields
	 * unsigned short * 	red			// An array of value describing the response of the red channel.
	 * unsigned short * 	green		// An array of value describing the response of the green channel.
	 * unsigned short * 	blue		// An array of value describing the response of the blue channel.
	 * unsigned int 		size		// The number of elements in each array.
	 * 
	 * @param _red 		Where to store "red" field offset.
	 * @param _green 	Where to store "green" field offset.
	 * @param _blue 	Where to store "blue" field offset.
	 * @param _size 	Where to store "size" field offset.
	 * @param _sizeof 	Where to store structure byte size.
	 * */
	void GLFWgammaramp_dataOfStructure(uint32_t* _red, uint32_t* _green, uint32_t* _blue, uint32_t* _size, uint32_t* _sizeof){				
		(*_red) 	= offsetof	(___GLFWgammaramp, red);
		(*_green) 	= offsetof	(___GLFWgammaramp, green);
		(*_blue) 	= offsetof	(___GLFWgammaramp, blue);
		(*_size) 	= offsetof	(___GLFWgammaramp, size);
		(*_sizeof) 	= sizeof	(___GLFWgammaramp);
	}
	
	/**
    * struct GLFWgamepadstate Data Fields
	* unsigned char 	buttons[15]					// The states of each gamepad button, GLFW_PRESS or GLFW_RELEASE.
	* float 	 		axes[6]						// The states of each gamepad axis, in the range -1.0 to 1.0 inclusive.
	*
	*
	* @param _buttons 	Where to store "buttons" field offset.
	* @param _axes 		Where to store "axes" field offset.
	* @param _sizeof 	Where to store structure byte size.
	*/
	void GLFWgamepadstate_dataOfStructure(uint32_t* _buttons, uint32_t _sizeof_buttons, uint32_t* _axes, uint32_t* _sizeof){
		(*_buttons) = offsetof	(___GLFWgamepadstate, buttons);
		(*_axes) 	= offsetof	(___GLFWgamepadstate, axes);
		(*_sizeof) 	= sizeof	(___GLFWgamepadstate);
	}

	/*
	* struct GLFWvidmode Data fields 
	* int width							// The width, in screen coordinates, of the video mode.
 	* int height						// The height, in screen coordinates, of the video mode.
	* int redBits						// The bit depth of the red channel of the video mode.
 	* int greenBits						// The bit depth of the green channel of the video mode.
	* int blueBits						// The bit depth of the blue channel of the video mode.
	* int refreshRate					// The refresh rate, in Hz, of the video mode.
	*/
	void GLFWvidmode_dataOfStructure(uint32_t* _width, uint32_t* _height, uint32_t* _redBits, uint32_t* _greenBits, uint32_t* _blueBits, uint32_t* _refreshRate, uint32_t* _sizeof){
		(*_width) 		= offsetof(___GLFWvidmode, width);
		(*_height) 		= offsetof(___GLFWvidmode, height);
		(*_redBits) 	= offsetof(___GLFWvidmode, redBits);
		(*_greenBits) 	= offsetof(___GLFWvidmode, greenBits);
		(*_blueBits) 	= offsetof(___GLFWvidmode, blueBits);
		(*_refreshRate) = offsetof(___GLFWvidmode, refreshRate);
		(*_sizeof)		= sizeof(___GLFWvidmode);
	}

#ifdef __cplusplus
}
#endif	

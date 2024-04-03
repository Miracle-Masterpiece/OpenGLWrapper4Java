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
package gljw.openal;

import static gljw.openal.AL.*;
import static gljw.openal.ALC.*;
import gljw.helpers.WavData;

public final class ALHelpers {

	private ALHelpers() {throw new IllegalAccessError();}

	/**
	 * Interprets the error code into its description
	 * @see AL#alGetError()
	 * */
	public static String alErrorString(final int errorcode) {
		if(errorcode == AL_NO_ERROR) {
			return "No error.";
		}else if (errorcode == AL_INVALID_NAME) {
			return "Invalid name (ID) passed to an AL call.";
		}else if (errorcode == AL_INVALID_ENUM) {
			return "Invalid enumeration passed to AL call.";
		}else if (errorcode == AL_INVALID_VALUE) {
			return "Invalid value passed to AL call.";
		}else if (errorcode == AL_INVALID_OPERATION) {
			return "Illegal AL call.";
		}else if (errorcode == AL_OUT_OF_MEMORY) {
			return "Not enough memory to execute the AL call.";
		}
		throw new RuntimeException("err is not error!");
	}
	
	/**
	 * Interprets the error code into its description
	 * @see ALC#alcGetError(long)
	 * */
	public static String alcErrorString(final int errorcode) {
		if (errorcode == ALC_NO_ERROR) {
			return "No error.";
		}else if (errorcode == ALC_INVALID_DEVICE) {
			return "Invalid device handle.";
		}else if (errorcode == ALC_INVALID_CONTEXT) {
			return "Invalid context handle.";
		}else if (errorcode == ALC_INVALID_ENUM) {
			return "Invalid enumeration passed to an ALC call.";
		}else if (errorcode == ALC_INVALID_VALUE) {
			return "Invalid value passed to an ALC call.";
		}else if (errorcode == ALC_OUT_OF_MEMORY) {
			return "Out of memory.";
		}
		throw new RuntimeException("err is not error!");
	}
	
	/**
	 * Returns the wav format as an OpenAL constant.
	 * If the format is not supported by OpenAL, -1 will be returned.
	 * 
	 * @return {@link AL#AL_FORMAT_MONO8}, {@link AL#AL_FORMAT_MONO16}, {@link AL#AL_FORMAT_STEREO8}, {@link AL#AL_FORMAT_STEREO16} or -1.
	 * */
	public static int getFormat(final WavData wav) {
		if (wav.numChannels == 1){
			if (wav.bitsPerSample == 8) {
				return AL.AL_FORMAT_MONO8;
			}else if (wav.bitsPerSample == 16) {
				return AL.AL_FORMAT_MONO16;
			}
		}else {
			if (wav.bitsPerSample == 8) {
				return AL.AL_FORMAT_STEREO8;
			}else if (wav.bitsPerSample == 16) {
				return AL.AL_FORMAT_STEREO16;
			}
		}
		return -1;
	}
}

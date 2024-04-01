package gljw.openal;

import static gljw.openal.AL.*;
import static gljw.openal.ALC.*;
import static gljw.openal.ALHelpers.*;
import static nw4j.wrapper.c.pointers.VoidPointer.nullptr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import gljw.helpers.WavData;
import gljw.helpers.WavData.FileFormatException;
import nw4j.wrapper.c.allocators.ThreadLocalStack;
import nw4j.wrapper.c.pointers.IntPointer;

class Example {

	private static final ThreadLocalStack stack = new ThreadLocalStack(1024 * 1024);
	
	private static final int genBuffer(WavData wav) {
		try(stack){
			IntPointer $buffer = stack.pushInt(1); 
			alGenBuffers(1, $buffer.address());
			alBufferData($buffer.get(), wav);
			return $buffer.get();
		}
	}
	
	private static final int genSource(int buffer) {
		try(stack){
			IntPointer $buffer = stack.pushInt(1); 
			alGenSources(1, $buffer.address());
			alSource3f($buffer.get(), AL_POSITION, 0, 0, 0);
			alSourcei($buffer.get(), AL_BUFFER, buffer);
			return $buffer.get();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, FileFormatException, InterruptedException {
		WavData wav = new WavData(new File("./you.wav"));
		
		long device = alcOpenDevice(nullptr);
		
		long context = alcCreateContext(device, nullptr);		
		alcMakeContextCurrent(context);		
		
		alListener3f(AL_POSITION, 0, 0, 0);
		
		int buffer = genBuffer(wav);
		System.out.println(alErrorString(alGetError()));
		System.out.println(alcErrorString(alcGetError(device)));

	
		int source = genSource(buffer);
		alSourcei(source, AL_LOOPING, AL_TRUE);
		alSourcePlay(source);
		
		Thread.sleep(10000000);
	}
}

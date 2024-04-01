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
package gljw.helpers;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import gljw.annotations.Ctype;
import nw4j.helpers.Helpers;
import nw4j.wrapper.c.allocators.MemoryAccessor;
import nw4j.wrapper.c.pointers.BytePointer;
import static nw4j.helpers.Helpers.addressNonNull;

/**
 * This class loads and stores information about a ( .wav ) file.
 * 
 * Objects of this type must be cleaned using the close or free method, since they store information outside of java heap. 
 * Why? Everything is simple. The alBufferData() method expects a pointer/address to the data, 
 * but it is impossible to get the address from ByteBuffer in an honest way, so such things =)
 * 
 * @author Alexei Kuzmin
 * */
public class WavData implements AutoCloseable, Closeable {
	
	private static final char DEFAULT_BUFFER_SIZE = 1024;
	
	public final int 	chunkid;		//must be "RIFF" or 0x52494646..
	public final long 	chunkSize; 		//In general, there should be an int here, but we are in Java, where there is no unsigned int type, so long is used here.
	public final int 	format;			//must be "WAVE" or 0x57415645.
	public final int 	subchunk1Id;	//must be "fmt" or 0x666d7420.
	public final int 	subchunk1Size;	
	public final short 	audioFormat;
	public final short 	numChannels;	
	public final int 	sampleRate;
	public final int 	byteRate;
	public final short 	blockAlign;
	public final short 	bitsPerSample;
	public final int 	subchunk2Id;	//must be "data" or 0x64617461
	public final int 	subchunk2Size;
	public final int 						soundDatalen;
	public final @Ctype(" char* ") long 	soundData;		// C/C++ char's or Java byte's.
	
	public WavData(File wav) throws FileNotFoundException, IOException, FileFormatException {
		this(wav, DEFAULT_BUFFER_SIZE);
	}
	
	public WavData(File wav, int tmpBufferSize) throws FileNotFoundException, IOException, FileFormatException {
		final int buffersize = tmpBufferSize;
		try(FileChannel in = FileChannel.open(wav.toPath()); BytePointer auto_ptr = BytePointer.alloc(buffersize)){
			Helpers.addressNonNull(auto_ptr.address());
			ByteBuffer byteBuffer = MemorySegment.ofAddress(auto_ptr.address()).reinterpret(buffersize).asByteBuffer().clear();
			
			in.read(byteBuffer);
			byteBuffer.flip();
			
			chunkid 			= byteBuffer.getInt();	//must be "RIFF" or 0x52494646.
			if (chunkid != 0x52494646) throw new FileFormatException("Wrong file type! Expected 0x52494646, it turned out 0x" + Integer.toHexString(chunkid));
			
			//					  Without this fucking bullshit the size may be negative due to int limitations.
			chunkSize 			= Integer.toUnsignedLong(byteBuffer.getInt());
			
			format 				= byteBuffer.getInt(); //must be "WAVE" or 0x57415645.
			if (format != 0x57415645) throw new FileFormatException("Wrong file type! Expected 0x57415645, it turned out 0x" + Integer.toHexString(format));

			subchunk1Id 		= byteBuffer.getInt();	//must be "fmt" or 0x666d7420
			if (subchunk1Id != 0x666d7420) throw new FileFormatException("Wrong file type! Expected 0x666d7420, it turned out 0x" + Integer.toHexString(subchunk1Id));
								  
			//					  Without changing the byte order, there will be shit.
			byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
			subchunk1Size 		= byteBuffer.getInt();
			audioFormat 		= byteBuffer.getShort();
			numChannels 		= byteBuffer.getShort();
			sampleRate 			= byteBuffer.getInt();
			byteRate 			= byteBuffer.getInt();
			blockAlign 			= byteBuffer.getShort();
			bitsPerSample 		= byteBuffer.getShort();
			byteBuffer.order(ByteOrder.BIG_ENDIAN);
			
			subchunk2Id 		= byteBuffer.getInt();	//must be "data" or 0x64617461.	
			if (subchunk2Id != 0x64617461) throw new FileFormatException("Wrong file type! Expected 0x64617461, it turned out 0x" + Integer.toHexString(subchunk2Id));
			
			byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
			subchunk2Size 		= byteBuffer.getInt();
			byteBuffer.order(ByteOrder.BIG_ENDIAN);
			
			soundDatalen = subchunk2Size;
			
			//	   If malloc could not allocate memory and returned 0, then to hell with the application to continue working, so it will crash.
			soundData = addressNonNull(MemoryAccessor.malloc(soundDatalen));

			ByteBuffer soundDataSegment = MemorySegment.ofAddress(soundData).reinterpret(soundDatalen).asByteBuffer();
			in.read(soundDataSegment);
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
	
	@Override
	public void close() throws IOException {
		free();
	}
	
	public void free() {
		MemoryAccessor.free(soundData);
	}
	
	@SuppressWarnings("serial")
	public static final class FileFormatException extends Exception{
		public FileFormatException(String cause) {
			super(cause);
		}
	}
	
	@SuppressWarnings("serial")
	public static final class IllegalFormatException extends Exception{
		public IllegalFormatException(String cause) {
			super(cause);
		}
	}
}

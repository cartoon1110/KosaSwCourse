package sec19.exam01_nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {
	public static void main(String[] args) {
		System.out.println("Make 7byte Buffer");
		ByteBuffer buffer=ByteBuffer.allocateDirect(7);
		printState(buffer);
		
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("[2byte+]");
		printState(buffer);
		
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3byte+]");
		printState(buffer);
		
		buffer.flip();
		System.out.println("[flip()]");
		printState(buffer);
		
		buffer.get(new byte[3]);
		System.out.println("[3byte-]");
		printState(buffer);
		
		buffer.mark();
		System.out.println("[mark()]");
		
		buffer.get(new byte[2]);
		System.out.println("[2byte-]");
		printState(buffer);
		
		buffer.clear();
		
		

	}
	public static void printState(Buffer buffer){
		System.out.println(buffer.position());
		System.out.println(buffer.limit());
		System.out.println(buffer.capacity());
	}

}

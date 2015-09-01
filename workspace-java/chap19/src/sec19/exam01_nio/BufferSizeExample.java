package sec19.exam01_nio;

import java.nio.ByteBuffer;

public class BufferSizeExample {

	public static void main(String[] args) {
		ByteBuffer directBuffet=ByteBuffer.allocateDirect(200*1024*1024);
		System.out.println("Make buffer");
		ByteBuffer nonDirectBuffer=ByteBuffer.allocate(200*1024*1024);
		System.out.println("@");

	}

}

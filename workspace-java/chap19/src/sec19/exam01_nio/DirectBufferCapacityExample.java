package sec19.exam01_nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {

	public static void main(String[] args) {
		ByteBuffer byteBuffer=ByteBuffer.allocateDirect(100);
		System.out.println("capacity: "+byteBuffer.capacity());
		
		CharBuffer charBuffer=ByteBuffer.allocateDirect(100).asCharBuffer();
		System.out.println("char capacity: "+charBuffer.capacity());
		
		IntBuffer intBuffer=ByteBuffer.allocateDirect(100).asIntBuffer();
		System.out.println("int capacity:" +intBuffer.capacity());

	}

}

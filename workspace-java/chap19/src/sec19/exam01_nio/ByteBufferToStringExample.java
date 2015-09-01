package sec19.exam01_nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {
	public static void main(String[] args) {
		Charset charset =Charset.forName("UTF-8");
		
		String data="HELLO";
		ByteBuffer byteBuffer=charset.encode(data);
		
		data=charset.decode(byteBuffer).toString();
		System.out.println(data);
	}

}

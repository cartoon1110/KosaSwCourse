package sec19.exam01_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {
		Path from=Paths.get("C:/Temp/penguins.jpg");
		Path to=Paths.get("C:/Temp/penguins2.jpg");
		
		FileChannel fileChannel_from=FileChannel.open(from, StandardOpenOption.READ);
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		ByteBuffer buffer=ByteBuffer.allocate(100);
		int byteCount;
		
		while(true){
			buffer.clear();
			byteCount=fileChannel_from.read(buffer);
			if(byteCount==-1)break;
			buffer.flip();
			fileChannel_to.write(buffer);
		}
		
		fileChannel_from.close();
		fileChannel_to.close();
		
		System.out.println("파일복사성공");
		
	}

}

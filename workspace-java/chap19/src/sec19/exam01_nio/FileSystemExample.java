package sec19.exam01_nio;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class FileSystemExample {
	public static void main(String[] args) throws Exception {
		FileSystem fileSystem=FileSystems.getDefault();
		for(FileStore store: fileSystem.getFileStores()){
			System.out.println(store.name()+"\n"+store.type()+"\n"+store.getTotalSpace()+"\n"+
		(store.getTotalSpace()-store.getUnallocatedSpace())+"\n"+store.getUsableSpace()+"\n");
			
			System.out.println(fileSystem.getSeparator());
			for(Path path: fileSystem.getRootDirectories()){
				System.out.println(path.toString());
			}
			
			
		}

	}

}

package sec15.exam01_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("jdbc");
		list.add("yun");
		list.add(2,"hi");
		list.add("abc");
		
		int size=list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		
		String skil=list.get(2);
		System.out.println("2 index : "+skil);
		
		for(int i=0; i<list.size(); i++){
			String str=list.get(i);
			System.out.println(i+": "+str);
		}
		list.remove(2);
		list.remove(2);
		list.remove("Java");
		
		for(int i=0; i<list.size(); i++){
			String a=list.get(i);
			System.out.println(i+": "+a);
		}

	}

}

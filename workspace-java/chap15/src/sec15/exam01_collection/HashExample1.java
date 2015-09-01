package sec15.exam01_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("yun");
		set.add("java");
		set.add("iass");
		
		int size=set.size();
		System.out.println("HashSet size: "+size );
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			System.out.println(str);
		}
		
		set.remove("jdbc");
		set.remove("iass");
		
		System.out.println();
		System.out.println("HashSet size"+set.size());
		iterator=set.iterator();
		while(iterator.hasNext()){
			String str1=iterator.next();
			System.out.println(str1);
		}
		set.clear();
		if(set.isEmpty()){System.out.println("clear1");}

	}
}

package sec15.exam01_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("yun", 10);
		map.put("kim", 20);
		map.put("sung", 30);
		map.put("hyeon", 40);
		System.out.println("Size "+ map.size());
		
		System.out.println("yun : "+map.get("yun"));
		System.out.println();
		Set<String> keySet=map.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			Integer value=map.get(key);
			System.out.println(key+": "+value);
		}
		map.remove("yun");
		System.out.println("Size: "+map.size());
		System.out.println();
		
		Set<Map.Entry<String, Integer>> entrySEt=map.entrySet();
		Iterator<Map.Entry<String, Integer>> eiterator=entrySEt.iterator();
		while(eiterator.hasNext()){
			Map.Entry<String, Integer> entry=eiterator.next();
			String str=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(str+" : "+value);
		}
		
		System.out.println();
		map.clear();
		if(map.isEmpty()){System.out.println("Clear");}

	}

}

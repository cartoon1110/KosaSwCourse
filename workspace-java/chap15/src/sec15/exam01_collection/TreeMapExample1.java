package sec15.exam01_collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores=new TreeMap<Integer, String>();
		scores.put(new Integer(10), "I");
		scores.put(new Integer(30), "Ia");
		scores.put(new Integer(20), "Ib");
		scores.put(new Integer(50), "Ic");
		scores.put(new Integer(40), "Id");
		scores.put(new Integer(70), "If");
		
		Map.Entry<Integer, String> entry=null;
		entry=scores.firstEntry();
		System.out.println("lower : "+entry.getKey()+"-"+entry.getValue());
		
		entry=scores.lastEntry();
		System.out.println("higer: "+entry.getKey()+"-"+entry.getValue());
		
		NavigableMap<Integer, String> descendingMap=scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet=descendingMap.entrySet();
		for(Map.Entry<Integer, String> entrys: descendingEntrySet){
			System.out.println(entrys.getKey()+"-"+entrys.getValue());
		}
		
		NavigableMap<Integer, String> ascendingMap=descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet=ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry3: ascendingEntrySet){
			System.out.println(entry3.getKey()+"-"+entry3.getValue());
		}
	}

}

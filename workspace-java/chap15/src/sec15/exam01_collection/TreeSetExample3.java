package sec15.exam01_collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("coin");
		treeSet.add("doing");
		treeSet.add("forever");
		treeSet.add("going");
		
		System.out.println("[c~f] : ");
		NavigableSet<String> rangeSet=treeSet.subSet("c", true, "f", true);
		for(String word: rangeSet){
			System.out.println(word);
		}
	}

}

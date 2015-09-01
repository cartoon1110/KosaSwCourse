package sec15.exam01_collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<Integer>();
		scores.add(new Integer(30));
		scores.add(new Integer(40));
		scores.add(new Integer(50));
		scores.add(new Integer(60));
		scores.add(new Integer(70));
		
		NavigableSet<Integer> descendingSet=scores.descendingSet();
		for(Integer score: descendingSet){
			System.out.print(score);
			
		}
		
		System.out.println();
		NavigableSet<Integer> ascendingSet=descendingSet.descendingSet();
		for(Integer score: ascendingSet){
			System.out.print(score);
		}

	}

}

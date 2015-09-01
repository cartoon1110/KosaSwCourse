package sec15.exam01_collection;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<Integer>();
		scores.add(new Integer(41));
		scores.add(new Integer(433));
		scores.add(new Integer(22));
		scores.add(new Integer(123));
		scores.add(new Integer(445));
		
		Integer score=null;
		score=scores.first();
		System.out.println("lowest score: "+score);
		
		score=scores.last();
		System.out.println("Higest score: "+score);
		
		score=scores.lower(new Integer(50));
		System.out.println("50 >= "+score);
		
		score=scores.higher(new Integer(400));
		System.out.println("400<= "+score);
		
	}

}

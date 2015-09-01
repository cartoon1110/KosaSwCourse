package sec15.exam01_collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("ABC", "DFG", "HIJ");
		for(String name: list1){
			System.out.println(name);
		}
		
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		for(int value: list2){
			System.out.println(value);
		}

	}

}

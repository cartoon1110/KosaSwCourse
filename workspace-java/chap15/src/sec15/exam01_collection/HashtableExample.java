package sec15.exam01_collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("yun", "12");
		map.put("yun1", "123");
		map.put("yun2", "1234");
		map.put("yun3", "12345");
		
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("id, pw:");
			System.out.print("id: ");
			String id=scanner.nextLine();
			
			System.out.print("pw: ");
			String pw=scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)){
				if(map.get(id).equals(pw)){
					System.out.println("login");
					break;
				} else{
					System.out.println("pw error");
				}
			} 
			else{
				System.out.println("id error");
			}
		}

	}

}

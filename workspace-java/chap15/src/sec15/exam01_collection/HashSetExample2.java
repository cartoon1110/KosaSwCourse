package sec15.exam01_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		set.add(new Member("Yun", 24));
		set.add(new Member("Yun", 24));
		System.out.println("size : "+set.size());

	}

}

class Member{
	String name;
	int age;
	
	Member(String name, int age){
		this.name=name;
		this.age=age;
	}
	/*
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Member){
			Member member=(Member) obj;
			return member.name.equals(name) && (member.age==age);
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return name.hashCode()+age;
	}
	*/
}

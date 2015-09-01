package sec15.exam01_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(new Student(1, "yun"),95);
		map.put(new Student(1, "yun"),95);
		
		System.out.println("size: "+map.size());
		
		
		

	}

}

class Student{
	int sno;
	String name;
	
	public Student (int sno, String name){
		this.sno=sno;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student student=(Student) obj;
			return (sno==student.sno) &&  (name.equals(student.name));
		} else{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return sno+name.hashCode();
	}
}

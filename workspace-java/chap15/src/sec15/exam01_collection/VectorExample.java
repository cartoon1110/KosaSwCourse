package sec15.exam01_collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> vector=new Vector<Board>();
		vector.add(new Board("math","abc","me"));
		vector.add(new Board("eng","sdf","you"));
		vector.add(new Board("science","www","I"));
		vector.add(new Board("ddd","zxc","my"));
		vector.add(new Board("qw","hh","her"));

		for(int i=0; i<vector.size(); i++){
			Board bo=vector.get(i);
			System.out.println(bo.subject+" , "+bo.content+" , "+bo.writer+"!");
		}
		vector.remove(2);
		vector.remove(3);
		System.out.println();
		
		for(int i=0; i<vector.size(); i++){
			Board bo=vector.get(i);
			System.out.println(bo.subject+" , "+bo.content+" , "+bo.writer+"!");
		}
		

	}

}

class Board{
	String subject;
	String content;
	String writer;
	
	Board(String a, String b, String c){
		subject=a; content=b; writer=c;
	}
}
package sec12.exam01_thread;

public class YieldExample {
	public static void main(String[] args) {
		YieldThreadA threadA=new YieldThreadA();
		YieldThreadB threadB=new YieldThreadB();
		
		threadA.start();
		threadB.start();
		
		try{Thread.sleep(100);}catch(Exception e){}
		threadA.work=false;
		
		try{Thread.sleep(100);}catch(Exception e){}
		threadA.work=true;
		
		try{Thread.sleep(100);}catch(Exception e){}
	
		threadA.stop=true;
		threadB.stop=true;

	}

}

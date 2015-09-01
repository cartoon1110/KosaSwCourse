package sec12.exam01_thread;

public class WorkObject {
	public synchronized void methodA(){
		System.out.println("i am Thread A in methodA");
		notify();
		try{
			wait();
		}catch(Exception e){}
	}
	
	public synchronized void methodB(){
		System.out.println("i am Thread B in methodB");
		notify();
		try{
			wait();
		}catch(Exception e){}
	}

}

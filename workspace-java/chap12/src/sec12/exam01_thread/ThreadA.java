package sec12.exam01_thread;

public class ThreadA extends Thread {
	public ThreadA(){
		setName("ThreadA");
	}
	
	@Override
	public void run(){
		for(int i=0; i<2; i++){
			System.out.println("I am "+ getName());
		}
	}

}

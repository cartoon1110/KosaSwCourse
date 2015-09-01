package sec12.exam01_thread;

public class ThreadB extends Thread {
	public ThreadB(){
		setName("ThreadB");
	}
	
	@Override
	public void run(){
		System.out.println("I am "+getName());
	}

}

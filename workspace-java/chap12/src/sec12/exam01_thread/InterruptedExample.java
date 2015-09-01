package sec12.exam01_thread;

public class InterruptedExample {

	public static void main(String[] args) {
		Thread thread=new PrintThread2();
		thread.start();
		try{
			Thread.sleep(1000);
		} catch(Exception e){}
		
		thread.interrupt();

	}

}

package sec12.exam01_thread;

public class DaemonExample {

	public static void main(String[] args) {
		Thread thread=new AutoSaveThread();
		thread.setDaemon(true);
		thread.start();
		
		try{
			Thread.sleep(3000);
		} catch(InterruptedException e){}
		
		System.out.println("main thread end");
		

	}

}

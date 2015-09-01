package sec12.exam01_thread;

public class PrintThread2 extends Thread {
	@Override
	public void run(){
		try{
			while(true){
				System.out.println("run");
				Thread.sleep(1);
			}
		}catch(InterruptedException e){}
		
		System.out.println("111");
		System.out.println("End");
	}
	
}

package sec12.exam01_thread;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread){
		this.targetThread=targetThread;
	}
	
	@Override
	public void run(){
		while(true){
			Thread.State state=targetThread.getState();
			System.out.println("Target Thread State: "+state);
			if(state==Thread.State.NEW){
				targetThread.start();
			}
			
			if(state==Thread.State.TERMINATED){
				break;
			}
			
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

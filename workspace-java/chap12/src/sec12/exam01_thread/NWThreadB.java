package sec12.exam01_thread;

public class NWThreadB extends Thread {
	private WorkObject workObject;
	
	public NWThreadB(WorkObject workObject){
		this.workObject=workObject;
	}
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			workObject.methodB();}
	}

}

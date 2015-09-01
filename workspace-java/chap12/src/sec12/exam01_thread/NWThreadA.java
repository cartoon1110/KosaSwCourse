package sec12.exam01_thread;

public class NWThreadA extends Thread {
	private WorkObject workObject;
	
	public NWThreadA(WorkObject workObject){
		this.workObject=workObject;
	}
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			workObject.methodA();}
	}

}

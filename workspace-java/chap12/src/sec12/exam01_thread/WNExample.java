package sec12.exam01_thread;

public class WNExample {

	public static void main(String[] args) {
		WorkObject sharedObject= new WorkObject();
		
		NWThreadA nwThreadA=new NWThreadA(sharedObject);
		NWThreadB nwThreadB=new NWThreadB(sharedObject);
		
		nwThreadA.start();
		nwThreadB.start();

	}

}

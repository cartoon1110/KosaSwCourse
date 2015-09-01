package sec12.exam01_thread;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			Thread thread=new CalcThread(i+"thread");
			if(i!=10){
				thread.setPriority(Thread.MIN_PRIORITY);
			} else{
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}

	}

}

package sec12.exam01_thread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumthread=new SumThread();
		sumthread.start();

		try{
			sumthread.join();
		} catch(Exception e){}
		
		System.out.println("1~100 sum: "+sumthread.getSum());
	}

}

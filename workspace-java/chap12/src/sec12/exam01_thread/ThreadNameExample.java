package sec12.exam01_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println("Main Thread name is "+thread.getName());
		
		ThreadA threadA=new ThreadA();
		System.out.println("Sub Thread A name is "+threadA.getName());
		
		ThreadB threadB=new ThreadB();
		System.out.println("Sub Thread B name is "+threadB.getName());
		
		threadA.start();
		threadB.start();

	}

}

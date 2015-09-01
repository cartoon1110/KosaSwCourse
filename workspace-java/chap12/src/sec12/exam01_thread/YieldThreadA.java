package sec12.exam01_thread;

public class YieldThreadA extends Thread {
	public boolean stop=false;
	public boolean work=true;
	
	public YieldThreadA(){
		setName("ThreadA");
	}
	
	@Override
	public void run(){
		while(!stop){
			if(work){
				System.out.println("i am "+getName());
			}
			else{
				Thread.yield();
			}
		}
		
		System.out.println(getName()+"End !");
	}

}

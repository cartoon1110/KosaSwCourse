package sec12.exam01_thread;

public class SumThread extends Thread{
	private long sum;
	
	public long getSum(){
		return sum;
	}
	public void SetSum(long sum){
		this.sum=sum;
	}
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			sum+=i;
		}
	}

}

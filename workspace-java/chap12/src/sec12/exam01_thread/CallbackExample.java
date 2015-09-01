package sec12.exam01_thread;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;
	
	
	public CallbackExample(){
		executorService=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	
	private CompletionHandler<Integer, Void> callback= new CompletionHandler<Integer, Void>(){
		@Override
		public void completed(Integer result, Void attachment){
			System.out.println("completed() Start : "+result);
		}
		
		@Override
		public void failed(Throwable exc, Void attachment){
			System.out.println("failed() Start : "+exc);
		}
	};
	
	public void doWork(final String x, final String y){
		Runnable task=new Runnable(){
			@Override
			public void run(){
				try{
					int intx=Integer.parseInt(x);
					int inty=Integer.parseInt(y);
					int result=intx+inty;
					callback.completed(result, null);
				} catch(NumberFormatException e){
					callback.failed(e, null);}
			}
		};
		executorService.submit(task);
	}
		
		public void finish(){
			executorService.shutdown();
		}
	
	public static void main(String[] args) {
		CallbackExample example=new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "»ï");
		example.finish();
	}

}

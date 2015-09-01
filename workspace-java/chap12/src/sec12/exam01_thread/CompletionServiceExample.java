package sec12.exam01_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		CompletionService<Integer> completionService=new ExecutorCompletionService<
				Integer>(executorService);
		int j=0;
		System.out.println("START");
		for(int i=0; i<3; i++){
			completionService.submit(new Callable<Integer>(){
				@Override
				public Integer call() throws Exception {
					int sum=0;
					return sum;
				}
			});
		}
		
		System.out.println("what is ");
		executorService.submit(new Runnable(){
			@Override
			public void run(){
				while(true){
					try{
						Future<Integer> future=completionService.take();
						int value=future.get();
						System.out.println("result "+value);
					} catch(Exception e){break;}
				}
			}
		});
		
		try{Thread.sleep(3000);}
		catch(InterruptedException e){}
		System.out.println(">");
		executorService.shutdown();
		
		
	}

}

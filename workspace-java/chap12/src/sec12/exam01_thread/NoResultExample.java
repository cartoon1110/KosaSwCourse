package sec12.exam01_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("累诀贸府夸没");
		
		System.out.println("累诀贸府夸没");
		Callable<Integer> callable=new Callable<Integer>(){
			@Override
			public Integer call() throws Exception{
				int sum=0;
				for(int i=1; i<=10; i++){
					sum+=i;
				}
				return sum;
			}
		};
		
		Future<Integer> future=executorService.submit(callable);
		try{
			int result=future.get();
			System.out.println("result is "+result);
			System.out.println("Success");
		} catch(Exception e){ System.out.println("exception");}
		executorService.shutdown();
	}

}

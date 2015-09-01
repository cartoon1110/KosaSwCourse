package sec12.exam01_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnalbeExample {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("Start!");
		class Task implements Runnable{
			Result result;
			Task(Result result){
				this.result=result;
			}
			@Override
			public void run(){
				int sum=0;
				for(int i=1; i<=10; i++)
					sum+=i;
				result.sum(sum);
			}
		}
		
		Result result=new Result();
		Runnable task1=new Task(result);
		Runnable task2=new Task(result);
		
		Future<Result> future1=executorService.submit(task1, result);
		Future<Result> future2=executorService.submit(task2, result);
		
		try{
			result=future1.get();
			result=future2.get();
			System.out.println("result: "+result.accumValue);
			System.out.println("Success");
		}catch(Exception e ){
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

}

class Result{
	int accumValue;
	synchronized void sum(int value){
		accumValue+=value;
	}
}

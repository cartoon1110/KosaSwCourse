package sec12.exam01_thread;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox sharedbox=new DataBox();
		
		ProducerThread producerThread=new ProducerThread(sharedbox);
		ConsumerThread consumerThread=new ConsumerThread(sharedbox);
		
		producerThread.start();
		consumerThread.start();
		

	}

}

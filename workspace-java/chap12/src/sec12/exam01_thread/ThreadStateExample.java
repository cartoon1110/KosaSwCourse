package sec12.exam01_thread;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread=new StatePrintThread(new TargetThread());
		statePrintThread.start();

	}

}

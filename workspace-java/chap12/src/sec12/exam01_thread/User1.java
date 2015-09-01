package sec12.exam01_thread;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator){
		this.setName("Calculator 1");
		this.calculator=calculator;
	}
	
	@Override
	public void run(){
		calculator.setMemory(100);
	}

}

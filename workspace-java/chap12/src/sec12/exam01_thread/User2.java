package sec12.exam01_thread;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator){
		this.setName("Calculator 2");
		this.calculator=calculator;
	}
	
	@Override
	public void run(){
		calculator.setMemory(50);
	}

}

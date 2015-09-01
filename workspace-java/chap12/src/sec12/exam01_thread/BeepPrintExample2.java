package sec12.exam01_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable(){
			@Override
			public void run(){
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				toolkit.beep();
				try{Thread.sleep(1000);}catch(Exception e){}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++){
			System.out.println("TTing");
			try{ Thread.sleep(1000);} catch(Exception e){}
		}

	}

}

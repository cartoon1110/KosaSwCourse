package sec12.exam01_thread;

public class AutoSaveThread extends Thread {
	public void save(){
		System.out.println("save");
	}
	
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){ break; }
			save();
		}
	}

}

package threading.demo;

public class JavaThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<= 100;i++) {
			System.out.println("java threads");
		}
		
	}
	
}

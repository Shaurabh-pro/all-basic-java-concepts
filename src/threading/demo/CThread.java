package threading.demo;

public class CThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<= 100;i++) {
			System.out.println("c programming threads");
		}
		
		
	}

}

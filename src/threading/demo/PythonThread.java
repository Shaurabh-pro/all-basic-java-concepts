package threading.demo;

public class PythonThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<= 100;i++) {
			System.out.println("python threads");
		}
		
		
	}

}

package threading.demo;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		
		Runnable runnable = new PythonThread();
		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable2 = new JavaThread();
		Thread thread2 = new Thread(runnable2);
		thread2.start();

		Runnable runnable3 = new CThread();
		Thread thread3 = new Thread(runnable3);
		thread3.start();
		 
		 
		/*
		 * new Thread(new JavaThread()).start(); new Thread(new PythonThread()).start();
		 * new Thread(new CThread()).start();
		 */

	}

}

package abstraction;

public class TestInterface implements MyInterfaceOne,MyInterfceTwo {

	@Override
	public void show() {
		System.out.println("1");
		
	}
	@Override
	public void info() {
		System.out.println("2");
		
	}
	
	public static void main(String[] args) {
		TestInterface testInterface = new TestInterface();
		testInterface.show();
		testInterface.info();
	}
	

}

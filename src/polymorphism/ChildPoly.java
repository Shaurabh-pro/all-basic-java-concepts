package polymorphism;
public class ChildPoly extends PolyPerent{
	
	public void show() {
		System.out.println("im child method");
		
	}
	
	public static void main(String[] args) {
		ChildPoly childPoly = new ChildPoly();
		childPoly.show();
	}
	
}
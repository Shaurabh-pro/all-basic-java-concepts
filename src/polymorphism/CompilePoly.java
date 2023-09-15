package polymorphism;

public class CompilePoly {
	public void info(int a) {
		System.out.println("im first method" +" "+a);
		
	}
	
	public void info(int a,String b) {
		System.out.println("im second method" +" "+a+" "+b);
		
	}
	
	public static void main(String[] args) {
		CompilePoly cmPoly = new CompilePoly();
		cmPoly.info(100,"shaurabh");
	}
	
}

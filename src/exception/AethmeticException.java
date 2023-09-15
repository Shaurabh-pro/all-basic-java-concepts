package exception;

public class AethmeticException {
	public static void main(String[] args) {
		
		int a,b,result;
		a=10; b=0;
		try {
			result =a/b;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
}

package demo;

import java.util.Scanner;

public class CountSimpleIntrest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter principle");
		int p = scanner.nextInt();
		System.out.println("enter rate");
		int r = scanner.nextInt();
		System.out.println("enter time");
		int t = scanner.nextInt();
		
		int result = (p*r*t)/100;
		System.out.println(result);
		
	}

}

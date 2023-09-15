package demo;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] str ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}
}

package demo;

import java.util.Scanner;

public class CheckNumIsPositiveAndNegetive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		
		if(n>0) {
			System.out.println("number is positive");
		}else if (n<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is zero");
		}
		
	}
}

package demo;

import java.util.Scanner;

public class PlindromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String revString = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			revString = revString+s.charAt(i);
		}
		
//		System.out.println(revString);
		if(s.equals(revString)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		

	}
	
}

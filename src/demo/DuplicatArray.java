package demo;

public class DuplicatArray {

	public static void main(String[] args) {
		int [] arr = new int[] {1,3,8,6,6,5,5,9,4};
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = i+1;j< arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
					
				}
			}
			
		}
	}
}

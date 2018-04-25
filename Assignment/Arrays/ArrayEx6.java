//6. Write a program to find duplicate element element in an integer array?

import java.util.*;
class ArrayEx6{
	public static void main(String[] args) {
		int[] arr = new int[6];
		int[] count = new int[100];

		//enter arrray element
		Scanner sc = new Scanner(System.in);
		for(int i =0;i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		//logic
		for(int i = 0 ;i<arr.length ;i++){
			if(count[arr[i]] == 0){
				count[arr[i]] = 1;
			}
			else{
				
				System.out.println("duplicate element is : " + arr[i]);
			}
		}
	}
}
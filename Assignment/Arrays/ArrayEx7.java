//7. Write a program to reverse the given array?

/*
class ArrayEx7{
	public static void main(String[] args) {
		
        //initializing
		int[] arr = {1,2,3,4,5,6};
		int[] revarr = new int[arr.length];

		//logic
        int j = 0;
		for(int i = arr.length-1 ; i >= 0 ; i-- ){
			
			revarr[j++] = arr[i]; 
		}

		//print
		System.out.println("Reverse Array");
		for(int i = 0; i<revarr.length;i++){
			System.out.println(revarr[i]);
		}
	}
}
*/

//Array class
//there is no reverse method in Array class


//using ArrayList
import java.util.*;
class ArrayEx7{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before Reverse" + list);
		Collections.reverse(list);
		System.out.println("After Reverse" + list);
	}
}
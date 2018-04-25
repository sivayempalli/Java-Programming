//copying one array to another array
import java.util.*;
class ArrayEx1{
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,2,5};
		
		//arr2 is array of values of type  int
		int[] arr2;

		/*
		//arr1 object reference is given to arr2
		arr2 = arr1;

		//print
		for(int i : arr2){
			System.out.print(i);
		}
		*/

		//another way
		//copying one element by one element

		/*
		int n = arr1.length;
		//create array object of that size
		arr2 = new int[n];
		for(int i = 0; i<n ; i++){
			arr2[i] = arr1[i];
		}

		for(int i : arr2){
			System.out.println(i);
		}
		*/

		//another way by Arrays class
		int[] arr3 = Arrays.copyOf(arr1,arr1.length);

		for(int i : arr3){
			System.out.println(i);
		}

		//another way 
		int[] arr4 = new int[arr1.length];
		System.arraycopy(arr1,0,arr4,0,arr1.length);
		for (int i : arr4){
			System.out.println(i);
		}

		//another way object class have clone method it will return object reference
		int[] arr5 = (int[])arr1.clone();
		for (int i : arr5){
			System.out.println(i);
		}

	}
}
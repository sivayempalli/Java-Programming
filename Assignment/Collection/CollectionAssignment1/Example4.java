//4)Count number of 1's in binary sorted array using binarySearch() function?

import java.util.*;

class Example4{
	public static void main(String[] args) {
		int[] arr = {0,0,0,1,1,1,1,1};

		//if Starting element is 1
		//base condition
		if(arr[0] == 1){
			System.out.println("count = "+arr.length);
		}
		else{

		  //return index
		  int index = Arrays.binarySearch(arr,1);

		     while(arr[index - 1] != 0){

			    //arr at that index is 0 or 1
			    if(arr[index] == 1){
				   index = Arrays.binarySearch(arr,0,index-1,1);
			    }
			    else{
				   index = Arrays.binarySearch(arr,index+1,arr.length-1,1);
			    }

		     }
           //say number of one are present
           System.out.println("count = "+(arr.length - index));
       }
	}
} 
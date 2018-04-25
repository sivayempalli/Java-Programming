//4.write a program to print the numbers which are occuring odd number of times?
 /*
class ArrayEx4 {
	public static void main(String[] args) {
	
        //by using hash(key,value);
        int[] a = {3,4,6,5,3,5,7,9};
        int[] hash  = new int[10];
        int count,key;

        for(int i = 0;i < a.length ; i++){
        	//find index
        	key = a[i]%10;

        	//assign value to count
        	count = hash[key];

        	//increament and assign
        	hash[key] = count+1;

        	//if(hash(key) == a[i]){
        	//	count++;
        	//}
        	//else{
        	//	hash[key] = a[i];
        	//}
        }
         
        //we create hash upto largest element present in array 
        for(int i = 0;i < hash.length ; i++){
        	//System.out.println(hash[i]);
        	if(((hash[i])%2) != 0){
        		System.out.println(i);
        	}
        }

	}
}

*/
//create using array
import java.util.*;
class ArrayEx4{
	public static void main(String[] args) {
		int[] arr = {2,6,7,5,4,3,4,5};
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    for(int i = 0;i<arr.length;i++){
	    	hmap.add(i)
	}
}
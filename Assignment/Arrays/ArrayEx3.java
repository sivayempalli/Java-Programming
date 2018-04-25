//Given an array A[], write a program to sort the array?
/*
class ArrayEx3{

//quicksort method
public static void quickSort(int[] arr , int low,int high){
	int m;
	if(low < high){
	m = partition(arr,low,high);
	//System.out.println("partition is "+m);
	quickSort(arr,low,m-1);
	quickSort(arr,m+1,high);
    }
} 

//quick sort method
public static int partition(int[] arr,int low,int high){
	
	//intializing
	int i,j,pivot;
	j = low;
	i = j-1;
	pivot = arr[high];

    //find pivot position
    while(j < high){
       
       if(arr[j] <= pivot){ //if i put equal may not be correct position
       	i = i+1;
       	swap(arr,i,j);
       	j++;
       }
       else{
       	j++;
       }
    }
    swap(arr,i+1,high);
    return i+1;
}

//swaping two element pass by element
public static void  swap(int[] arr,int x,int y){
	int temp;
	temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
}

    public static void main(String[] args) {
    	int[] arr = {6,5,4,7,8,2};
    	int high = arr.length;
    	quickSort(arr,0,high-1);

    	//print element
    	for(int ele : arr){
    		System.out.println(ele);
    	}
    }
}

output : 
partition is 0
partition is 3
partition is 1
partition is 4
2
4
5
6
7
8
*/

//another way by usin arrays class
import java.util.Arrays;
import java.util.Collections;
class ArrayEx3{
	public static void main(String[] args) {
		int[] arr = {6,5,4,7,8,2};
		//we can sort sub array
		Arrays.sort(arr);

		//reverse order 
		//reverse  will work only if it is object not primitive type
		//Arrays.sort(arr,Collections.reverseOrder());
		
        //print arr
		for (int i : arr){
		   System.out.println(i);
		}
	}
}
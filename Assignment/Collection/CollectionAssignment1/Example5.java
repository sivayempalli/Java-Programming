//Find the sum of k smallest elements in given unsorted array using TreeSet?
//		Example : 
//			Input : 10, 30, 50, 67, 34, 68
//				   k = 3
//          Output : 74

import java.util.*;
class Example5{
	public static void main(String[] args) {
		//create array
		int[] arr = {10,30,50,67,34,68};
		smallestElementSum(arr,3);
	}
//static method
public static void smallestElementSum(int[] arr,int k){
	TreeSet<Integer> set = new TreeSet<Integer>();

	//intialization
    int total=0;

	for(int i =0;i<arr.length;i++){
		set.add(arr[i]);
	} 

	//Treeset internally implement Treemap
	//implement red-black tree
    
    //int[] a
    Iterator itr = set.iterator();
    while(k != 0){
    	//set.first() method return min element 

    	
    	total = total + (int)itr.next();
        
        //TreeMap order the keys by natural order
        k--;
    }
    

    //floor is a method which return greaterkey which is less than and equal to that key
    //System.out.println(set.floor(new Integer(50)));

    //print
    System.out.println("OutPut : " +total);
}
}
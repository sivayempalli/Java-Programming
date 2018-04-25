//You are given with unsorted array and an element, find the next highest element than a given element x in the input array using TreeMap?
//	Example : 
//			Input : 10, 30, 50, 67, 34, 68
//				    x = 67

import java.util.*;
class Example6{
	//method nextElement
	public static void nextElement(int[] input,int k){
           //treemap will take key,value  pair
           TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();

           //adding element in TreeMap
           for(int i = 0;i < input.length;i++){
               tmap.put(input[i],0);
           }
              
           //treemap is sorted order
           //Iterator itr = new iterator();
           //Set set = tmap.entrySet();
           //tmap.floorKey(k);

           //higher method will take Object as argument but we give primitive type so autoboxing is done  
           System.out.println("next element "+ tmap.higherKey(k));

	}
	public static void main(String[] args) {
		int[] input = {10,30,50,67,34,68};
		int k = 67;
		nextElement(input,k);
	}
}
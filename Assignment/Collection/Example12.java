//Find the number of distinct duplicate elements in given array?
import java.util.*;
class Example12{
    
    static void duplicateEle(int[] arr){
       int n = arr.length;    	
       HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

       for(int i = 0; i < n;i++){
       	 if(!hmap.containsKey(arr[i])){
             hmap.put(arr[i],1); 
       	 }
       	 else{
       	 	int count = hmap.get(arr[i]);
       	 	hmap.put(arr[i],count+1); 
       	 }
       }

       Set set = hmap.entrySet();
       Iterator itr = set.iterator();

       System.out.println("duplicate element are : ");

       while(itr.hasNext()){
       	Map.Entry me = (Map.Entry)itr.next();
       	int val = (int)me.getValue();
       	   if(val > 1){
       	   	System.out.println(me.getKey());
       	   }
       }
    }

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,5};
		duplicateEle(arr);

	}
}
//duplicate element are : 
//1
//2

import java.util.*;
class Example10{

   static boolean majorityElement(int[] arr){
   	  int n = arr.length;

   	  //hashmap with key as array element and value as count
   	  HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
      
      //logic
   	  for(int i = 0 ;i < n ; i++){
         if(!hmap.containsKey(arr[i])){
         	hmap.put(arr[i],1);
         }
         else{
         	int count = hmap.get(arr[i]);
         	hmap.put(arr[i],count+1);
         }
   	  }

   	  //create set
   	  Set set = hmap.entrySet();
   	  Iterator itr = set.iterator();

   	  while(itr.hasNext()){
   	  	Map.Entry me = (Map.Entry)itr.next();
   	  	int val = (Integer)me.getValue();

   	  	if(val > (n/2)) {
   	  		System.out.println("Majority element is : " + me.getKey());
   	  		return true;
   	  	}
   	  }
   	  return false;
   }

    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,4,4,4};
    	majorityElement(arr);
    }
}

//output
//Majority element is : 4

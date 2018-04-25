import java.util.*;
class Example9{

	 static boolean findPairs(int[] arr){
		//create hashmap key as sum and value as index
		//ceate hashmap with integer and pair(pair is class in which it store values)
         HashMap<Integer,Pair> hmap = new HashMap<Integer,Pair>();
         
         //logic
         for(int i = 0 ;i < arr.length ;i++){
         	for(int j = i+1;j < arr.length;j++){
         		int sum = arr[i] + arr[j];
         		if(!(hmap.containsKey(sum))){
         			hmap.put(sum,new Pair(i,j));
         		}
         		else{
                    //print value

                    //find previous value
                    Pair p = hmap.get(sum);

                    System.out.println("("+arr[p.first]+","+arr[p.second]+")"+" and "+"(" + arr[i]+","+arr[j]+")");
                    return true;
         		}
         	}
         }
    return false;
	}


	public static void main(String[] args) {
		int[] arr = { 3,4,71,2,9,8};
		findPairs(arr);
	}
}

class Pair{
	int first;
	int second;
	Pair(int i,int j){
		first = i;
		second = j;
	}
}
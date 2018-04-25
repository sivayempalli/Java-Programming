//Given an array A[] and a number x, check for pair in A[] with sum as x using HashMap?
//		Example : 
//			Input : 10, 30, 50, 67, 34, 68
//				   x = 60

/*
import java.util.*;
class Example7{
	public static void main(String[] args) {
		int[] input = {10,30,50,67,34,68};
		int key = 97;
		int high = input.length;
		pairSum(input,0,high-1,key);
	}

	//method pairSum()
	public static void pairSum(int[] input,int low,int high,int key){
          Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
          int i , j;
          i = low;
          j= high;
          while(i <= j){
          	hmap.put(input[i],0);
          	i++;
          }

          Map<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
          tmap.putAll(hmap);

          

          //iterate through array
          Set set = tmap.entrySet();
          Iterator itr = set.iterator();
           while(itr.hasNext()){
           	Map.Entry me = (Map.Entry)itr.next();
           	System.out.println("key"+me.getKey());
           }

           

           //return an arrays of keys
           //convert into array
           i=0;
           int[] array = new int[6];
           while(i <= j){
           Integer[] arr = tmap.keySet().toArray(new Integer[i]);
           //System.out.println(tmap.keySet().toArray());
           array[i] = arr[i];
           System.out.println(arr[i]);
           i++;
           } 
           
           //logic
           i=0;
           while(i != j){
                int x = array[i] + array[j];
                if(x == key){
                	System.out.println("pair element are :"+array[i]+" "+array[j]);
                	i = i+1;
                	j = j-1;
                }
                else if( x < key){
                	i = i+1;
                } 
                else{
                	j = j-1;
                }
           } 
           


	}
}

//output:
//10
//30
//34
//50
//67
//68
//pair element are :30 67
*/


import java.util.HashMap;
import java.util.Map;
 
 class Example7 {
 
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,4,45,6,10,8};
		int sum=16;
 
		findPair(arr,sum);
	}
 
	public static void findPair(int arr[],int sum)
	{
		Map<Integer,Integer> map=new HashMap<>();
		int temp=0;
 
		for(int i=0;i<arr.length;i++)
		{
			    temp=sum-arr[i];
				int index=map.get(temp)==null?-1:map.get(temp);
 
				if(index<0)
				{
					map.put(arr[i],i);
				}
				else
				{
					System.out.println("Pair Found : "+arr[i]+" and "+arr[index]);
					System.out.println("Index are : "+i+" and "+index);
				}		
		}
	}
 
}

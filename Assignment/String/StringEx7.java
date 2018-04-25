//7. Write a java program to find the most repeted character in the given string?

//by using hash map

import java.util.*;
class StringEx7{
    int f;
	public static void main(String[] args) {
		String str = "Ravindradddd";
		int len = str.length();
		char[]  arr = str.toCharArray();
		int len1 = arr.length;
		//System.out.println(arr[0]);
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        
        /*
        //put element in hash
        for(int i = 0;i < len1 ;i++){
        	if(hmap.get(arr[i]) == 0){//getting null pointer exception
        	  hmap.put(arr[i],1);
        	}
        	else{
        		hmap.put(arr[i],hmap.get(arr[i])+1);
        	}
        }
       */ 

        for(char character : arr){
        	if(hmap.containsKey(character)){
        		hmap.put(character,hmap.get(character)+1);
        	}
        	else{
        		hmap.put(character,1);
        	}
        }

        //for(int i = 0;i < len1 ; i++){
        //	System.out.println(hmap.get(arr[i]));
        //}

        Set<Character> set = hmap.keySet();
        //Iteration itr = set.iteration();
        //while(itr.hasNext()){
        //	Map.Entry me = (Map.Entry)itr.next();
        //	System.out.println(me.getValue);
        //}

        
        //most repeated element
        int largest = 0;
        char c = '\u0000';
        for(char ch : set){
            
        	if(hmap.get(ch) > largest){
                largest = hmap.get(ch);//AutoBoxing
                c = ch;
        	}
        }
        System.out.println(c + " is most repeated character with "+largest);



	}
}

//output
//d is most repeated character with 5

//concept
//for local variable we want to  intialize

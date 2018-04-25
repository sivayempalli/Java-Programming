//Find the maximum occuring character in the given input //string using HashMap?
//Example : 
//			Input :"javalanguage"
//		    output : a

import java.util.*;
class Example8{
	public static void main(String[] args) {
		
		//intialization
		String string = "javalanguagea";
		int count;
		//int[] arr = new int[26];
		char c;

		//hashmap
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();

        //logic
		for(int i = 0;i < string.length(); i++){
             c = string.charAt(i);
            count = (hmap.get(c) == null?0:(int)hmap.get(c));
              if (count == 0){
                  hmap.put(c,count+1);
              }
              else{
              	   hmap.remove(c);
              	   hmap.put(c,count+1);
              }
        }
		
		//system.out.println(hmap.getValue());
		int ele,larelement;
		char ch = 'z' ;
		larelement =0;
		Set set = hmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			ele = (int)me.getValue();
            //ch = (char)me.getKey();  	   
			if(larelement < ele){
				larelement = ele;
				System.out.println(larelement);
				ch = (char)me.getKey();

			}
		}
		/*
        Iterator itr1 = set.iterator();
		while(itr1.hasNext()){
			Map.Entry me = (Map.Entry)itr1.next();
			if(larelement == ((int)me.getValue())){
				System.out.println((char)me.getKey());
			}
		}
		*/
		System.out.println(larelement + " char is " + ch);

	}
}
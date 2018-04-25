//9. Given a string, find its first non-repeating character?
//	Example : Given String : ravindra
//					Output : v
import java.util.*;
class StringEx9{
	static char firstNonReapting(String str){

		//linkedHashMap insert line by line
		Map<Character,Integer> hmap = new  LinkedHashMap<Character,Integer>();
		char[] arr = str.toCharArray();

		//logic
		for(Character ch : arr){
			if(hmap.containsKey(ch)){
				hmap.put(ch,(hmap.get(ch)+1));
			}
			else{
				hmap.put(ch,1);
			}
		}
        
        Set<Character> set = hmap.keySet();
        System.out.println(set);
		//print
		for(char ch : set){
			if(hmap.get(ch) == 1){
				//System.out.println("first non-repeating character is " + ch);
				return ch ;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String str = "ravindra";
		System.out.println(firstNonReapting(str));
	}

}

//output:[r, a, v, i, n, d]
//          v


//error: incompatible types: possible lossy conversion from int to char
//                return -1;

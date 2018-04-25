//4. Given a string s1 and a string s2, write a java method to say whether s2 is a rotation of s1 ?

class StringEx4{
	public static void main(String[] args) {
		//intilialize
		String str1 = "abcd";
		String str2 = "cdab";
		int i=0,j=0;
		int count = 0;
		int len1 = str1.length();
		int len2 = str2.length();

		//logic 
		//check starting char of string str2 in which index present in str1
		while(i < len1){
			if(str1.charAt(i) == str2.charAt(j)){
               break;
			}

			//if i reaches last but not found then it is not possible
		    if(i == (len1-1)){
		    	System.out.println("str2 is not a rotation of str1");
		    }
		    i = i+1;
		}

		//System.out.println(i);

		while(j < len2){
			//if index reaches last it initialize to zero
			if(i == len1){
				i = 0;
			}

			//check char present at index i and j
			if(str2.charAt(j) == str1.charAt(i)){
				count++;
			 	j++;
			 	i++;
			}
			else{
				j++;
			}
		}

        //System.out.println(count);		

		if(count == len2){
			System.out.println("str2 is rotation of str1");
		}
		else{
			System.out.println("str2 is not a rotation of str1");
		}

	}
}

//output:
//str2 is rotation of str1

//another method
//str1.length() == str2.length()) & ((str1 + str1).indexOf(str2) != -1)


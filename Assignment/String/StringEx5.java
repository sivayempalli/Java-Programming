//5. Write a java program to remove characters from the first string which are present in the second string?


class StringEx5{
   public static void main(String[] args) {
   	String str1 = "RavindraBabuRavula";
   	String str2 = "Babu";
   	StringBuffer str3 = new StringBuffer();
   	int i ,j = 0  ;
   	int len1 ;//= str1.length();
   	int len2 = str2.length();
   	int len3;
    
    //System.out.println(len1);

    //logic
   	while(j < len2){
   		i=0;
   		len1 = str1.length();
   		while(i < len1){
   			if(str2.charAt(j) == str1.charAt(i)){
   				i++;
   			}
   			else{
   				str3.append(str1.charAt(i));
   				i++;
   			}

   		}
   		str1 = str3.toString();
   		//public StringBuilder delete(int start, int end)
   	    //remove substring
        len3 = str3.length();
   	    str3.delete(0,len3);
   	    j++;
   	    //System.out.println(str1);
   	}  
     System.out.println(str1);
   }
}

//output:
//RvindrRvl
//timeComplexity : o(len1*len2);

//we can do in 0(n)

//I will use char array to count str2 character
//Then i will use count array
//if count array is not equal to 0 then i will not put in str
//this way we can remove the str2 character 
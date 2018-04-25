//10. Write a java program to sort the given string?
//	Example: input : ravindra
//			 output : aadinrrv

//counting sort

class StringEx10{
    
    static void sortMethod(String str){
    	int[] count = new int[256];
    	char[] ch = str.toCharArray();
    	char[] output = new char[ch.length]; 
        int len = str.length();


        for(int i = 0;i < len ;i++){
        	count[ch[i]]++ ;
        }
        
        for(int i = 1; i < count.length ; i++){
           //System.out.println(count[i]);
        	count[i] += count[i-1];
        }

        for(int i = 0; i < len ;i++){
        	output[count[ch[i]]-1] = ch[i];
        	count[ch[i]]--;
        }

        for(int i = 0 ; i < len ; i++){
        	System.out.print(output[i]);
        }
    }

	public static void main(String[] args) {
       String str = "ravindra";
       sortMethod(str);		
	}
}

//output :
//aadinrrv


//we can implement sort method in Arrays class
//Arrays.sort(char c[]) sort based on Ascii value
//or
//custom sorting
//Arrays.sort(t[] , Comparator c)
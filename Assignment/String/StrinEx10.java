//10. Write a java program to sort the given string?
//	Example: input : ravindra
//			 output : aadinrrv

//counting sort

class StrinEx10{
    
    static void sortMethod(String str){
    	int[] count = new int[256];
        int len = str.length();

        for(int i = 0;i < len ;i++){
        	count[str.charAt(i)]++ ;
        }
        
        for(int i = 0; i < count.length ; i++){
           System.out.println(count[i]);
        }

    }

	public static void main(String[] args) {
       String str = "ravindra";
       sortMethod(str);		
	}
}
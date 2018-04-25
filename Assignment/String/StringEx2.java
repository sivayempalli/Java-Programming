//2. PALINDROME: Write a program that takes an English word and test whether or not this word is a palindrome. (e.g. a word that reads the same both forwards and backwards such as “level”).

/*
class StringEx2{
  public static void main(String[] args) {
   	//String str = "level";

    String str1 = "level";
   	String str = new StringBuffer(str1).reverse().toString();

    if(str1.equals(str)){
    	System.out.println("palindrome");
    }   
   	//System.out.println(str.reverse());
   	//string does not reverse method
   } 
}
*/

class StringEx2{
	public static void main(String[] args) {
		//here we use stringbuffer because while inserting new object will not created
	    String str = "MadaM";
	    StringBuffer str1 = new StringBuffer();

	    //copying in stringbuffer
	    for(int i = str.length()-1 ; i >= 0;i--){
	    	str1.append(str.charAt(i));
	    }
	    //str1 = str1.toString();
        //print
	    //System.out.println(str1);

	    //check palindrome or not
	    //stringBuffer convert into String
	    if(str.equals(str1.toString())){
	    	System.out.println(str +" is palindrome");
	    }
	    else{
	    	System.out.println(str+"is not palindrome");
	    }
	}   

}

//output :
//MADAM is palindrome
//It will not in cases like Madam it will not work
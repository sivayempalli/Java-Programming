//Q1. Write a java program to remove the space in the given string?
//	Input: Ravindra babu ravula
//	Output: Ravindrababuravula


class StringEx1{
	public static void main(String[] args) {
		String s = "Ravindra babu ravula";
		char[] str = new char[s.length()-1];
		int i = 0,j = 0;
		int len = s.length();

		//logic
		while(i < len){
			if(s.charAt(i) == ' '){
				i++;
			}
			else{
			  str[j++] = s.charAt(i++);
			}
		}
        
        System.out.println(s);

        System.out.println("after remove spaces");

        System.out.println(str);

        //for(i = 0;i < j; i++){
		 // System.out.print(str[i]);
	    //}

		//print
		//System.out.println(count);
	}
}

//another way
        //String noSpaceStr = str.replaceAll("\\s", ""); // using built in method





//Q4. Write a java program to check whether given string contains /../ or /./?

import java.util.regex.*;
class RegexpEx4{
	public static void main(String[] args) {
		String input = "ravindraravula/./";
		String check1 = ".*/\\./*";//twice escape because one for compiler another for regex
        String check2 = ".*/\\.\\./*";
        
        //Syntax : Pattern.matches(pattern,content); 
		boolean val1 = Pattern.matches(check1,input);
		boolean val2 = Pattern.matches(check2,input);

		if(val1 || val2){
			System.out.println("True");
	    }
	    else{
	    	System.out.println("False");
	    }
	}
}
//Q6. Check whether given string represents IPV4 address or not?
import java.util.regex.*;
class RegexpEx6{

	static boolean checkMethod(String str){

		//check the string is empty or not
		if(str == null && str.isEmpty()){
           return false;
		}

		String[] parts = str.split("\\."); //if u not put \\ then . will take it as Regex quantifier

		//no of parts equal to 4 or not
		if(parts.length != 4){
			return false;
		}

		for(String s  : parts){
			//System.out.println(s);
			int i = Integer.parseInt(s);
			if(i < 0 || i > 255){
				return false;
			}
		}
		if(str.endsWith(".")){
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		String input = "254.16.254.1";

		 boolean check = checkMethod(input);

         if(check){
         	System.out.println("ip is valid");
         }
         else{
         	System.out.println("ip is invalid");
         }
	}
}


	//String check ="[0-9]*.[0-9]*.[0-9]*.[0-9]*";
		 /*
		 //wrong way
		 if(Pattern.matches(check,input)){
		 	System.out.println("IP address is valid");
		 }
		 else{
		 	System.out.println("IP address not valid");
		 }
		 */
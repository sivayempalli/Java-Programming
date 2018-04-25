//regular expression
//pattern and matcher class
//pattern will convert match string into NFA
//matcher  method  will check how many times that match string match

//this will say how many times a pattern is repeat

import java.util.regex.*;
class RegexEx2{
	public static void main(String[] args) {
		String txt1 = "learn how to code start with basics";
        String txt = "ar";
        Pattern pattern = Pattern.compile(txt);
        Matcher matcher = pattern.matcher(txt1);
        while(matcher.find()){
        	System.out.println(matcher.start()+" "+matcher.end());
        } 
	}
}
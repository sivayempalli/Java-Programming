//Q1. Write a java program to remove the comments from xml string ?

import java.util.regex.*;
class RegexpEx1{
	public static void main(String[] args) {
		String input = "<?xml version = \"1.0\" encoding = \"UTF-8\"?><root><a<!-- I'm a comment-->><b/><b/>hola<c i='o'></c></a></root>";
	    String pat =  "<!--.*.-->";

	    Pattern pattern = Pattern.compile(pat);
	    //Matcher matcher = pattern.matcher(input);

	    String[] str = pattern.split(input);

	    System.out.println(str[0] + str[1]);

	}
}

//output
//<?xml version = "1.0" encoding = "UTF-8"?><root><a><b/><b/>hola<c i='o'></c></a></root>



//Problem with string.replaceAll("\\n", " "); is that replaceAll expects regular expression, and \ in regex is special character used for instance to create character classes like \d which represents digits, or to escape regex special characters like +.

//So if you want to match \ in Javas regex you need to escape it twice:

//once in regex \\
//and once in String "\\\\".

//another way
//String str = input.replaceAll(pat,"");
//regular expression will match with entire string

import java.util.regex.*;
class RegexEx3{
	public static void main(String[] args) {
		String text = "start with basic and continue to learn";
		String txt = ".*basic.*";
		//Pattern pattern = Pattern.compile(txt);
		

		//matches method return true if matches
		boolean b = Pattern.matches(txt,text);

		System.out.println(b);

		//we can use lookingat method also
        
	}
}
import java.util.regex.*;
class RegexpEx2{
	public static void main(String[] args) {
		String input = "http://www.ravindrababuravula.com";
		String valid = "http(s?)://";//? is occur zero or more
		Pattern  pattern = Pattern.compile(valid);
		Matcher m = pattern.matcher(input);

		if(m.find()){
			System.out.println("valid");
		}
		else{
			System.out.println("Not Valid");
		}
		
	}
}

//output:
//valid
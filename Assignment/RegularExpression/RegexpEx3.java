import java.util.regex.*;
class RegexpEx3{
	public static void main(String[] args) {
		String input = "http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2";
	    String check1 = "([a-z])*://";
	    String check2 = "www.*.com";
	    String check3 = ":../.*.html";

	    //if(Pattern.matches(check1,input)){
	    //	String str = input.subString()
	    //}

	    Pattern pattern = Pattern.compile(check1);
	    Matcher m = pattern.matcher(input);
	    //System.out.println(m.matches());
	    //Pattern.matches(check1,input)

	    //use find method substring present or not
	    if(m.find()){
	    	String str = input.substring(m.start(),m.end());
	        System.out.println("protocol : " + str );
	    }
	    else{
	    	System.out.println("Url not correct");
	    }

	    pattern = Pattern.compile(check2);
	    m = pattern.matcher(input);
	     if(m.find()){
	    	String str = input.substring(m.start(),m.end());
	        System.out.println("name : " + str );
	    }

	    pattern = Pattern.compile(check3);
	    m = pattern.matcher(input);
	     if(m.find()){
	    	String str = input.substring(m.start()+3,m.end());
	        System.out.println("path : " + str );
	    }



	}
}

//output:
//protocol : http://
//name : www.example.com
//path : :80/path/to/myfile.html

//Q5. Write a java program to check whether the given string ended with ".htm" or ".html"?
import java.util.regex.*;
class RegexpEx5{
       public static void main(String[] args) {
       	String input = "www.facebook.com/career.html";
       	String check1 = ".*html";
       	String check2 = ".*htm";

       	System.out.println("Is input end with html : " + Pattern.matches(check1,input));
       	System.out.println("Is input end with htm : " +  Pattern.matches(check2,input));
       }
}
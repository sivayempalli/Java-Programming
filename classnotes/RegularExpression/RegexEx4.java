//how split method will work
import java.util.regex.*;
class RegexEx4{
    public static void main(String[] args) {
        String text = "understand how their are saying and remember the things";
        String txt = " ";
        Pattern pattern = Pattern.compile(txt);
        //Matcher matcher = pattern.Matcher(text);


        //split method
        String[] string = pattern.split(text);
        

        for(String str : string){
        	System.out.println(str);
        }
    }
}

import java.util.regex.*;
class RegexEx1{
	public static void main(String[] args) {
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("abaaaaba");
		while(m.find()){
			System.out.println(m.start());
			System.out.println(m.end() - 1);
		}
	}
}
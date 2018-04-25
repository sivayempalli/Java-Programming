import java.util.*;
class GenericsEx1{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("100");
		for (Object o : al){
			String str = (String)o;
			System.out.println(str);
		}
	}
}
//sivayempalli@SivaYempalli ~/Desktop/homework/classnotes/Generics $ javac GenericsEx1.java
//Note: GenericsEx1.java uses unchecked or unsafe operations.
//Note: Recompile with -Xlint:unchecked for details.

import java.util.*;
class EnumEx1{
	public static void main(String[] args) {
		Vector<String> ve = new Vector<String>();
		ve.add("Ravi");
		ve.add("Ravula");
		ve.add("Babu");
		Enumeration en = ve.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
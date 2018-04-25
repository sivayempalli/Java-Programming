import java.util.*;

public class GenericExample{
	public static void main(String[] args){
		ArrayList list = new ArrayList();//array of object created
		//ArrayList<String> = new Arraylist<string>()
		list.add("ravi") 
		//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		list.add(100);
		for(Object object : list){
			String str = (String)object;
			System.out.println(str);
		}
	}
}//run time it will give error
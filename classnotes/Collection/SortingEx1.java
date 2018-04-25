import java.util.*;
class SortingEx1{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	    list.add("ravi");
	    list.add("babu");
	    list.add("ravula");
	    Collections.sort(list);//merge sort will be called
	    System.out.println("sortlist : "+list);
	}
}
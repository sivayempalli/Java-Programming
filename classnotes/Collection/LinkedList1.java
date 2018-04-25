import java.util.LinkedList;
import java.util.Iterator; 	
class LinkedList1{
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
	    ll.add("RAVI");
	    ll.add("BABU");
	    ll.add("VARMA");
	    Iterator it = ll.iterator();
	    while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
}  
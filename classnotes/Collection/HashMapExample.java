import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.lang.Integer;
 public class HashMapExample{
 	public static void main(String[] args) {
 		HashMap<Integer,String> hmp = new HashMap<Integer,String>();
 		hmp.put(1,"Ravi");
 		hmp.put(2,"Ravula");
 		hmp.put(3,"Babu");

 		//search key is present or not
 		if ( hmp.containsKey(new Integer(1))){
 			System.out.println("key is present");
 		}



 		Set set = hmp.entrySet();
 		Iterator itr = set.iterator();
 		while(itr.hasNext()){
 			Map.Entry me = (Map.Entry)itr.next();
 			System.out.println("keys "+me.getKey()+"value "+me.getValue());
 		}
 	}
 }
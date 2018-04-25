import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.lang.*;
public class LinkedHashMapExample{
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(2,"A");
		lhm.put(6,"B");
		lhm.put(5,"C");
		lhm.put(7,"D");
		Set set = lhm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("key is "+me.getKey()+"Value is"+me.getValue());
		}
	}
}
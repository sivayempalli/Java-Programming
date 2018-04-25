import java.util.*;
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(7,"A");
		tm.put(9,"B");
		tm.put(2,"C");
		tm.put(1,"D");
		Set set = tm.entrySet();//creating set
		System.out.println(set);
		Iterator itr = set.iterator();//creating iterator object
		System.out.println(itr);
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("key"+me.getKey()+"value"+me.getValue());
			//System.out.println(itr.next());
		}
	}
}
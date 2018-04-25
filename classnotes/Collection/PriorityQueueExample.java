//priority queue act like min heap
import java.util.*;
class PriorityQueueExample{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Anirudh");
		pq.add("RAVI");
		pq.add("BABU");
		System.out.println(pq.element());
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.remove());
		Iterator itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
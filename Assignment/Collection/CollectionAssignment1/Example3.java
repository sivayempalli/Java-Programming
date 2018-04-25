import java.util.*;
class Example3{
	public static void main(String[] args) {
		//creating object
		Queue<Integer> qu = new PriorityQueue<Integer>();

		//input element are
		int[] input = {10,30,50,67,34,68};

		//inset in queue
		for(int ele : input){
			qu.add(ele);
		}

		//get third smallest element
		int k = 3;
		//remove k-1 element
		while((--k) != 0){
			qu.remove();
			//System.out.println(qu.remove());
		}

		//print 3rd smallest element
		System.out.println(qu.peek());

	}
}

//output : 34
//Time(sec) : 0.07 Memory(MB) : 54.9219
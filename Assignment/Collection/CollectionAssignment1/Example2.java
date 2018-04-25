import java.util.*;
class Example2{
	public static void main(String[] args) {
		int[] input = {10,30,50,67,34,68};
		//create object 
		Queue<Integer> qu = new PriorityQueue<Integer>(Collections.reverseOrder());
		//add in queue
	    for ( int ele : input ){
	    	qu.add(ele);
	    }

	    //peek return head element
	    System.out.println(qu.peek());
	}
}

//output 68
//Time(sec) : 0.07 Memory(MB) : 56.6445
//we can use comparable class also 
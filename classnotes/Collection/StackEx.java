import java.util.*;
class StackEx{
	public static void main(String[] args) {
		//creating Stack object which is type Interger
		Stack<Integer> st = new Stack<Integer>();

		//pushing object in stack
		//stack internally implement vector class
		st.add(10);
		st.push(20);
		st.push(30);//internal push method implement add method

		//using some stack methods
		System.out.println("Top Element"+st.peek());
		System.out.println("delete top Element"+st.pop());

		//print all element in stack
		Iterator itr = st.iterator();
		while ( itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
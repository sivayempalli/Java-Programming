//Write a method that removes the duplicate elements from an array list of integers 

import java.util.*;
class Example5{

	public static void removeDuplicate(ArrayList<Integer> list){
		
       Set<Integer> set = new HashSet<Integer>();
       set.addAll(list);
       list.clear();
       list.addAll(set);

		Iterator itr = list.iterator();
        System.out.println("removing duplicate element");
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}

	}
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size");
		int n = sc.nextInt();

		System.out.println("enter element");
		ArrayList<Integer>  list = new ArrayList<Integer>();

		for(int i = 0;i < n ;i++){
          list.add(sc.nextInt());
		}

		removeDuplicate(list);
	}
}
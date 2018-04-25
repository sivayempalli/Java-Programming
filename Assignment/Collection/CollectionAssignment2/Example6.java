//Q6. (Combine two lists) Write a method that returns the union of two array lists of integers 

import java.util.*;

class Example6{
    
    public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
    	list1.addAll(list2);
        System.out.println(list1);
        return list1;
    }

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
		int n = sc.nextInt();
		for(int i = 0;i < n ; i++){
			list1.add(sc.nextInt());
		}

		System.out.println("Second list");
		for(int i = 0;i < n ; i++){
			list2.add(sc.nextInt());
		}
	    union(list1,list2);

	}
}
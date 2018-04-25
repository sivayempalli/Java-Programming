//Arrays.sort works for arrays which can be of primitive data type also. Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.

//Q4. (Sort ArrayList) Write the following method that sorts an ArrayList of numbers: 
import java.util.*;
class Example4{
	public static void main(String[] args) {
		//int arr[] = {3,5,2,4,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("enter element");
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0;i < n ;i++){
			list.add(arr[i]);
		}

        //doesnot return any thing void type
		Collections.sort(list);

		//System.out.println(list);

		Integer[] num = new Integer[list.size()]; 
        
        //why we sending array as parameter because
        //it will return type of that array
		 num = list.toArray(num);




		for(Integer ele : num){
			System.out.println(ele);
		}

	}
}



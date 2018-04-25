/*
class Example11{
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {12,1,2,3,0,11,4};
		int[] countSmaller = new int[arr.length];

		//for this logic time complexity is O(n^2)

		for(int i = 0;i < arr.length; i++){
			for(int j = i+1;j < arr.length ; j++){
                 if(arr[i] > arr [j]){
                 	count++;
                 }
			}
			countSmaller[i] = count;
			count  = 0;
		}

		//print
		for(int i = 0 ;i < arr.length ;i++){
			System.out.println(countSmaller[i]);
		}


	}
}
*/

//i use brute fore method
//output
//Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 
//we use BST(balance search tree)


//using treemap
class Example{

	static int getCount(int[] arr){
		TreeMap
	}
	public static void main(String[] args) {
		int[] arr = {12,1,2,3,0,11,4};
		getCount(arr);
 	}
}
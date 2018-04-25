//1. Write a program to find the largest and smallest element in the given array?

class ArrayEx1{

	//find large element
	static void findElement(int[] arr){
		int x = arr[0];
		int y = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(x < arr[i]){
				x = arr[i];
			}
			else if(y > arr[i]){
				y = arr[i];
			}
		}
		System.out.println("largest element"+x+"smallest element"+y);
	}
	public static void main(String[] args) {
		int[] arr = {4,6,3,5,9,7};
		//print largest element
		//System.out.println("largest element "+largeElement(arr));
		//print smallest element
		//System.out.println("smallest element " + smallElement(arr));
	     
	    findElement(arr);

	}
}
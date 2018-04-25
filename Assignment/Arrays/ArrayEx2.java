//2. Given an array A[], write a program to check whether the element "x" present in the array or not?

class ArrayEx2{

	//find element
	//static void findElement(int[] arr,int x){
		//int i=0;
		//while(x == arr[i++])
		//	System.out.println(x+"element found"+arr[i]);  
		//System.out.println(x+"element not found");
	//}
	public static void main(String[] args) {
		int[] arr = {4,8,6,3,5};
		//findElement(arr,3);
		int ele = 3;
		for(int i : arr){
			  if(ele == i){
			  	 System.out.println(i);
			  }
		}
	}
}
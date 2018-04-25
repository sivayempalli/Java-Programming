//Q1: You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the index is equals to sum of numbers succeeding the index?

class Example1{


	//we can do on O(n)
	static int findIndex(int[] arr , int n){

       int startindex = 0;
       int endindex = n-1;
       int lsum = 0;
       int rsum = 0;

       while(true){
       	 if(lsum > rsum){
       	 	rsum = rsum + arr[endindex--];
       	 }
       	 else{
       	 	lsum = lsum + arr[startindex++];
       	 }

       	   if(startindex >= endindex){
       	   	   if(lsum == rsum){
       	   	   	break;
       	   	   }
       	       else{
       	       	System.out.println(lsum+""+rsum);
       	   	   System.out.println("no such combination");
       	       }
       	    }
       }
    return endindex;
	} 

	public static void main(String[] args) {
		int[] arr = {2,5,4,6,1,10,3,4};
		int n = arr.length;

		//logic
		//time complexity O(n^2)
		//int lsum = 0;
		//for(int i = 1;i < n ; i++){

		//	lsum = lsum + arr[i-1];
		//	int rsum = 0;
		//	   for(int j = i+1;j < n; j++){
		//	   	rsum = rsum + arr[j];
		//	   }

		//	   if(lsum == rsum){
		//	   	System.out.println("index where left sum and right sum are equals is :" + i);
		//	   }
			   //else{
			   	//System.out.println("index at left and right are not equals");
			   //}
	    //}
	    int index = findIndex(arr,n);
	    System.out.println("index at"+index+"left and right are equal");
		
	}
}
//8. Write a program to find third smallest element in the given array?

class ArrayEx8{

   static void swap(int[] arr,int x,int y){
	 int temp;
	 temp = arr[x];
	 arr[x] = arr[y];
	 arr[y] = temp;
    }

    static void minHeapify(int[] arr,int index , int n){
	 int l,r;
	 int largest;

	 l = 2*index +1;
	 r = 2*index + 2;
	 if(l <= n && arr[l] > arr[index]){
	    	largest = l;
	 }
	 else{
		largest = index;
	 }

	 if(r <= n && arr[r] > arr[largest]){
		 largest = r;
	 }

	 if(largest != index){
		 swap(arr,largest,index);
		 minHeapify(arr,largest,n);
	 }
}

  static void buildHeap(int[] arr){
	int size = arr.length;
	for(int i = (size/2)-1; i>=0;i--){
		minHeapify(arr,i,size-1);

	}
  }

  static void heapSort(int[] arr,int k){
  	buildHeap(arr);
    
    //for(int i =0 ;i < arr.length;i++){
  	//  System.out.println(arr[i]);
  	//}
  	//System.out.println("\n");
  



  	for(int i = arr.length -1; i > 0 ; i--){
  		swap(arr,0,i);
  		minHeapify(arr,0,i-1);

  		 //for(int j =0 ;j < arr.length;j++){
  	     //   System.out.println(arr[j]);
  	     //}
  	     //System.out.println("\n");
  	}
  	
  }

  public static void main(String[] args) {
  	int[] arr = {1,3,4,5,6,7,2};
  	heapSort(arr,3);

  	//3rd smallest element
  	//int k=3;
  	int i;
  	for( i =0 ;i < 2;i++);
  	  System.out.println("third smallest element is :"+ arr[i]);
  }
}


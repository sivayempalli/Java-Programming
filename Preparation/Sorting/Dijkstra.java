class Dijkstra{

	b

    heapSort(int[]arr){
    	int size = arr.length;
    	buidHeap(arr,size);
    	for(int i = (size/2)-1 ; i >= 0 ; i--){
    		swap(arr,i,size); 
    	}
    }

	public static void main(String[] args) {
		int[] arr;
		heapSort(arr);
	}
}
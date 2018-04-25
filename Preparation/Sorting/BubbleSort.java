class BubbleSort{
    static void swap(int[] arr,int x,int y){
    	int temp;
    	temp = arr[x];
    	arr[x] = arr[y];
    	arr[y] = temp;
    }

	static void bubSort(int[] arr){
       //intialization
		int len = arr.length;
		int i,j;
		int swaping;

      //logic
		for(i = 0;i < len ; i++){
			swaping = 0;
			for(j = 0 ; j < len-i-1 ;j++){
				if(arr[j] > arr[j+1]){
					swaping = 1;
					swap(arr,j,j+1);
				}
			}

			if(swaping == 0){
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,20,30,5,2};
		bubSort(arr);

		for(int i = 0 ; i < arr.length ; i++){
		   System.out.println(arr[i]);
		}
	}

}
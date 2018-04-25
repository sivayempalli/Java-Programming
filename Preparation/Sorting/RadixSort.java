class RadixSort{

	static int larElement(int[] arr){
		int lar = arr[0];
		for(int i = 1;i < arr.length ; i++){
			if(lar < arr[i]){
				lar = arr[i];
			}
		}
		return lar;
	}

	static void radixSort(int[] arr, int mux){
		int[] count = new int[10];
		int[] output = new int[arr.length];

		for(int i = 0 ;i < arr.length ; i++){
			count[(arr[i]/mux)%10]++;
		}

		for(int i = 1 ;i < 10;i++){
			count[i] += count[i-1];
			//System.out.println(count[i]);
		}

		for(int i = arr.length-1;i >= 0;i--){
			output[count[(arr[i]/mux)%10]-1] = arr[i];
		    count[(arr[i]/mux)%10]--;
		}

		for(int i = 0 ;i < arr.length ;i++){
			arr[i] = output[i];
			//System.out.println(output[i]);
		}
	}

    public static void main(String[] args) {
    	
    	int[] arr = {170,45,75,90,802,24,2,66};
    	int m = larElement(arr);
        //System.out.println(m);
        for(int i = 1 ; (m/i) > 0 ; i = i*10){
        	radixSort(arr,i);
        }
        
        System.out.println("After Sorting");
        for(int i = 0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
    }	
}
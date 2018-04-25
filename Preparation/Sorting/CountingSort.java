import java.util.*;
class CountingSort{
    
    static void countSort(int[] arr ,int n){
    	int i;
    	int[] count = new int[10];
    	int[] output = new int[n];
    	Arrays.fill(count,0);

    	for(i = 0;i < n;i++){
    		count[arr[i]]++;
    	}

    	//for(i = 0;i < 10;i++){
    	//	System.out.println(count[i]);
    	//}



    	//count will changed 
    	//to know where current index should placed
    	for(i = 1; i < 10;i++){
    		count[i] += count[i-1];
    	} 

    	//for(i = 0;i < 10;i++){
    	//	System.out.println(count[i]);
    	//}


    	for(i = 0 ; i < n ;i++){
          output[count[arr[i]]-1] = arr[i];
          count[arr[i]]--;
    	}

    	//for(i = 0;i < n;i++){
    	//	System.out.println(output[i]);
    	//}

    	for(i = 0;i < n ; i++){
    		arr[i] = output[i];
    	}
    } 

	public static void main(String[] args) {
		int[] arr = { 1,4,1,2,7,5,2,0 };
		int len = arr.length;
		countSort(arr,len);

		for(int i = 0;i < len;i++){
			System.out.println(arr[i]);
		}
	}
}
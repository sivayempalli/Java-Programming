import java.util.*;
class RemoveDuplicate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}

		//base condition
		//n < 1 then no repeated element 
 
		/*

		int m = arr[n-1];

		int[] count = new int[m+1];
        
        //using count array  to count number of times a number repeat
 		for(int i = 0 ; i < n ; i++ ){
			count[arr[i]]++;
		}
        
        //using new array insert element after remove duplicate
		int[] newarr = new int[n];

		int j = 0;

		for(int i = 0 ;i < n ; i++){
			if(count[arr[i]] == 1){
				newarr[j++] = arr[i];
			}
			else if(count[arr[i]] > 1){
				newarr[j++] = arr[i];
				count[arr[i]] = 0;
			}
		}

        System.out.println("After Removing Duplicate");
		int len = j;

		for(int i = 0 ; i < len ; i++){
           System.out.print(newarr[i] + " " );
		}
		System.out.println();

		*/
		//do in tc = o(n) and sc = o(1);

        int j = 0;
        for(int i = 0 ; i < n-1 ; i++){
        	if(arr[i] != arr[i+1]){
              arr[j++] = arr[i];
        	}
        }
        arr[j++] = arr[n-1];

        for(int i = 0 ; i < j ; i++){
        	System.out.print(arr[i]+" ");
        }
	}
}
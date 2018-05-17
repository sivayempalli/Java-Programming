import java.util.*;
class Xor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//test case
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    int[] arr1  = new int[n];
		    for(int i = 0 ; i < n ; i++ ){
			  arr1[i] = sc.nextInt();
		    } 
           /*
		   int size = n*n;
		   int k = 0;
		   long[] arr2 = new long[size];
		   for(int i = 0 ; i < n ; i++){
			 for(int j = 0 ; j < n ; j++ ){
				arr2[k] = arr1[i] + arr1[j];
				k = k+1;
			 } 
		   }
		   */
		
		   int[] arr2 = new int[n];
		   for(int i = 0 ; i < n ; i++ ){
			  arr2[i] = arr1[i]+arr1[i];
		    }
        
           int opr = arr2[0];
           //System.out.println(opr);
		   for(int i = 1 ; i < n; i++){
              opr = opr ^ arr2[i];
		   }

		   System.out.println(opr);
         t--;
	    }
	}

}
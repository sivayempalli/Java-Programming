import java.util.*;
class MinimumDeletion{
    
    static int gcd(int a,int b){
    	if(a == 0){
    		return b;
    	}
    	else
    		return gcd(b%a,a);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//test case
		int t = sc.nextInt();

		//int[] store = new int[t];
        
        int k = 0 ;
        while(k != t){

		   int n = sc.nextInt();

		   //sequence of number
		   int[] arr = new int[n];
	        for(int i = 0 ; i < n ; i++){
	    	  arr[i] = sc.nextInt();
	        }
            
            //reverse an array

            /*
            for(int i = 0 ;i < n/2 ; i++){
               int temp = arr[i];
               arr[i] = arr[n-i-1];
               arr[n-i-1] = temp;
            }
            */

            /*
            //logic time complexity O(n2)
            Arrays.sort(arr,Collections.reverseOrder())
             int count = 0;
	         for(int i = 0; i < n ; i++){
	    	    for(int j = i+1 ; j < n ; j++){
                   int x = gcd(arr[i],arr[j]);
                   if(x != 1 && i != j){
               	      //checking which number are not possible(gcd not equal to 1)
              	      count++;
               	      break;
                    }
	    	    }
	        }
      

	        if((n-count) < 2){
	    	  //System.out.println(-1);
	    	  store[k] = -1;
	        }
	        else{
	    	 // System.out.println(count);
	    	  store[k] = count;
	        }
	        */
            int g ;
	        g= gcd(arr[0],arr[1]);
	        for(int i = 2;i < n ;i++){
	        	g = gcd(g,arr[i]);
	        }

	        if(g == 1){
	        	System.out.println(0);
	        }
	        else{
	        	System.out.println(-1);
	        }

	    k++;
	    }

	    //for(int i : store){
	    //	System.out.println(i);
	    //}

	}
}
import java.util.*;

class Rainbow{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t > 0){

		  int n = sc.nextInt();
		  int[] arr = new int[n];
        
        
          
		  for(int i = 0 ; i < n ;i++){
			  arr[i] = sc.nextInt();
		  }

		  int mid = n/2;
		  boolean bol = true;
          int d = 0;
          int i;
          int count = 0;

          if(arr[0] == arr[n-1] && arr[0] == 1){
          	count++;
          }

          //System.out.println(count);

		  for(i = 1 ; i < mid ; i++){
		  	  d = arr[i] - arr[i-1];
			  if(arr[i] == arr[n-i-1]){
				  if(d == 1){
				  	count++;
				  }
				  else if( d > 1){
                    bol = false;
				  }
				  else{

				  }
				  
				   //if(i != 0){
				   //	d = arr[i] - arr[i-1];
				   //}
			  }
   		  }
		  //System.out.println(count);

		  if(arr[i] == 7 && arr[i-1] != 7){
			  count++;
		  }

		  if(count == 7 && bol){
			  System.out.println("yes");
		  }
		  else{
			  System.out.println("no");
		  }
		t--;
	    }
	}
}
//HARDEST GCD PROBLEMS
import java.util.*;
class Example2{

   static int gcd(int x,int y){
   	 if(x == 0){
   		return y;
   	 }
   	 else{
   		return gcd(y%x , x);
   	 }
   }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//enter number of test case
		int t = sc.nextInt();
		int[] res = new int[t];
        int tc = t;
		while(tc > 0){

		  //enter how many number and that range
		  int n = sc.nextInt();
		  int k = sc.nextInt();

   		  int[] arr = new int[n];
		  //number are
		  for (int i = 0;i < n ;i++ ) {
			  arr[i] = sc.nextInt();
		  }

          int result = arr[0];
		  for(int i = 1 ;i < n ; i++){
          result = gcd(arr[i],result);
		  }

	      //System.out.println(result);
		  if(result == 1 || result > k){
			 //System.out.println("yes");
		  	res[--tc] = 1;
		  }
		  else{
			//System.out.println("no");
			res[--tc] = 0;
		  }
		}

		for(int i = (t-1) ; i >= 0 ; i--){
			if(res[i] == 1){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}
	
}

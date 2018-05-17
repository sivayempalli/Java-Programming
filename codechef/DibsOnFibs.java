import java.util.*;
class DibsOnFibs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//test case
		int t = sc.nextInt();
		while(t > 0){
          //input 
		  int m = sc.nextInt();

		  //fib 
		  int n = sc.nextInt();
        
          int[] a = new int[m];
          int[] b = new int[m];
		  for(int i = 0;i < m ; i++){
              a[i] = sc.nextInt();
		  }
		  for(int i = 0 ; i < m ; i++){
			  b[i] = sc.nextInt();
		  }

		  //logic
		  int result = 0;
		  for(int i = 0 ; i < m ; i++){
			  for(int j = 0 ;j < m ; j++){
				  int[] fib = new int[n+1];
				  fib[1] = a[i];
				  if( n > 1){
				  	fib[2] = b[j];
				  }
				  //fib[2] = b[j];
				  for(int k = 3 ; k <= n ;k++){
					  fib[k] = fib[k-1] + fib[k-2];
				  }
				  result = result + fib[n];
			  }
		  }
		  //System.out.println(result);
          result = result % ((int)(Math.pow(10,9)) + 7);
 		  System.out.println(result);
 		  t--;
 		}
	}
}
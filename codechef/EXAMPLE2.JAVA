//HARDEST GCD PROBLEMS

class EXAMPLE2{

   int gcd(int x,int y){
   	if(x == 0){
   		return y;
   	}
   	else{
   		gcd(y%x , x);
   	}
   }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//enter number of test case
		int t = sc.nextInt();

		//enter how many number and that range
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		//number are
		for (int i = 0;i < n ;i++ ) {
			arr[i] = sc.nextInt
		}

        int result = arr[0];
		for(int i = 1 ;i < n ; i++){
         result = gcd(arr[i],result);
		}

		System.out.println(result);
	}
	
}

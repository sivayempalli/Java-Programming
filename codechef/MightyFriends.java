import java.util.*;
class MightyFriends{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         
        //test case
        int t = sc.nextInt();
        while(t > 0){ 
          //size of array
		  int n = sc.nextInt();
		  int[] arr = new int[n];
		  //no of swap
		  int k = sc.nextInt();

		  for(int i = 0 ; i< n ; i++){
			  arr[i] = sc.nextInt();
		  }
        
          int n1 = 0;
          int n2 = 0;
          int m = n/2;
		  if(n%2 != 0){
            n1 = m+1;
            n2 = m;
		  }
		  else{
			  n1 = m;
			  n2 = m;
		  }

		  int[] mottu = new int[n1];
		  int[] tommu = new int[n2];

		  int j = 0;
		  for(int i = 0; i < n ; i = i+2){
			  mottu[j++] = arr[i];
		  }
		  j = 0;
		  for(int i = 1;i < n ; i = i+2){
			  tommu[j++] = arr[i];
		  }

		  //upto k swap we  want to do
		  Arrays.sort(mottu);
		  Arrays.sort(tommu);

		  int swap = 0;
		  if(n2 < k){
			  swap = n2;
		  }
		  else{
			  swap = k;
		  }
		  j = 0 ;
		  while(swap > 0){
			  if(mottu[n1-j-1] > tommu[j]){
                int temp = mottu[n1-j-1];
                mottu[n1-j-1] = tommu[j];
                tommu[j] = temp;
                j++;
			  } 
			  swap--;
		  }

		  //sum
		  int sum1 = 0 ;
		  int sum2 = 0 ;
		  for(int i = 0 ;i < n1 ; i++){
			  sum1 = sum1 + mottu[i];
		  }
		  for(int i = 0 ; i < n2 ; i++){
			  sum2 = sum2 + tommu[i];
		  }

		  //print
		  if(sum2 > sum1 ){
			  System.out.println("YES");
		  }
		  else{
			  System.out.println("NO");
		  }
		t--;
		}
	}
}
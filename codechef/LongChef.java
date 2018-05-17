import java.util.*;
class LongChef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //number of test case
		int t;
		t = sc.nextInt();

		//input values
		int[] arr = new int[t];

		for(int i = 0 ;i < t ;i++){
			arr[i] = sc.nextInt();
		}

		//logic
		int count ;
		
		for(int i = 0 ; i< t ; i++){
			count = 0;
			int x = arr[i];
			  //while(count != 5){
			  //	if(x%10 == 0){
			  //		System.out.println(count);
			  //		break;
			  //	}
			  //	count++;
			  //	x = x*2;
			  //}
			  //if(count == 5){
			  //	System.out.println(-1);
			  //}

			  int y = (x % 5 == 0)?((x%2 == 0)?0:1):-1;
               System.out.println(y);
		}

	}
}
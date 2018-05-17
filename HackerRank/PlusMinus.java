import java.util.*;
class PlusMinus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//size
		int n = sc.nextInt();

		//array
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++ ){
			arr[i] = sc.nextInt();
		} 

		double pos = 0;
		double neg = 0 ;
		double zer = 0 ;

		for(int i = 0 ;i < n ; i++){
			if(arr[i] > 0){
				pos = pos+1;
			}
			else if(arr[i] < 0){
				neg = neg+1;
			}
			else{
				zer = zer+1;
			} 
		}
		pos = pos/n;
		neg = neg/n;
		zer = zer/n;

		System.out.printf("%.6f",pos);
		System.out.print("\n");
		System.out.printf("%.6f",neg);
		System.out.print("\n");
		System.out.printf("%.6f",zer);
	}
}
import java.util.*;
class StairCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//input
		int n = sc.nextInt();

		//logic
		for(int i = 0 ; i < n ; i++ ){
			int j = 0 ;
			for(; j < n-i-1 ; j++){
				System.out.print(" ");
			}

			for(; j < n ; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
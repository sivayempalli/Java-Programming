import java.util.*;
class InsertionSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[50];
		System.out.println("enter size");
		int n = sc.nextInt();
		System.out.println("Element Are");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//insertion sort
		for(int j=1;j<n;j++){
			int key = arr[j];
			int i =j-1;
			while(i >= 0 && arr[i] > key ){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		//printing Statement
		for ( int i=0;i < n;i++){
			System.out.println(arr[i]);
		}
	}
}
//Given an array A and a number X,find a pair(a,b) in X such that a+b=x 
import java.util.*;
class Array1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] hash = new int[10];
		int size,temp;
		System.out.println("enter size");
		size = sc.nextInt();
		//creating array
		System.out.println("enter array element");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		//creating hash
		for(int i=0;i<10;i++){
			hash[i]=0;
		}
		System.out.println("enter sum");
		int sum;
		sum = sc.nextInt();
		
		for(int index =0;index<size;index++){
			temp = sum - arr[index];
			if(temp>0 && hash[temp] == 1){
				System.out.println("pair with given "+sum+"is :("+arr[index]+temp+")");
			}
			hash[arr[index]] = 1;
		}

	}
}
import java.util.*;
class MergeSort{
	public void mergesort(int[] arr,int l,int mint h){
		int n1,n2;
		//create two sublist length
		n1 = 
	}
	public static void main(String[] args) {
		//Create input
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[50];
		System.out.println("enter size");
		int n = sc.nextInt();
		System.out.println("Element Are");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//creating Object
		Merging mer = new Merging();
		mer.mergesort(arr,0,n-1);
		for(int i = 0 ; i < n ;i++){
			System.out.println(arr[i]);
		}
	}
}
/*
//creating heart of the programming
class Merging{
	int i;//first index
	int p;//mid index
	int q;//mid index+1
	int j;//last
	int k;//for looping


	//merge sort
	public void mergesort(int[] arr,int d,int n){
		int low = d;
		int high = n;
		if(low < high){
			int mid = (low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}

	}

	//merging procedure
	public void merge(int[] arr,int i,int p,int j){
		this.i = i;
		this.j = j;
		this.p = p;
		q = p+1;

		//length
		int l = p-i+1;
		int r = j-q+1;

		//creating left array
		int[] left = new int[50];  
		for(k=0 ; k<=l ; k++){
			left[k] = arr[k];
		} 

		//creating right array
		int[] right = new int[50];
		for(k=0;k<=r;k++){
			right[k] = arr[q+k];
		}


		k = i;
		int m=0,n=0;
		while(k<=j){
			if(left[k]<right[k]){
				arr[k] = left[m];
				m++;
			}
			else{
				arr[k] = right[n];
				n++;
			}
		}
	}
}
*/
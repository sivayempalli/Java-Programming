import java.util.*;
class TwoMaxEle{

  public static void heapify(int[] arr, int ele ,int len ){
     //int l = 2 * ele + 1;
     //int r = 2 * ele + 2;
     int largest;
     //int i = ele;
       
       	int l = 2 * ele + 1;
        int r = 2 * ele + 2;

       	if(l < len && arr[l] > arr[ele]){
       		largest = l;
       	}
       	else{
       		largest = ele;
       	}

       	if(r < len && arr[r] > arr[largest] ){
       		largest = r;
       	}

       	if(largest != ele){
       		int temp = arr[ele];
       		arr[ele] = arr[largest];
       		arr[largest] = temp;
       		heapify(arr,largest,len);
       	}
       	
  }


  public static void buildHeap(int[] arr , int n){
  	//Build Heap
  	for(int i = (n/2 -1); i >= 0 ; i--){
  		heapify(arr,i,n);
  	}
  }
  public static void main(String[] args) {
  	
  	Scanner sc = new Scanner(System.in);

  	//Enter number of element
  	int n ;
  	n = sc.nextInt();

  	int[] arr = new int[n];

  	//store in array
  	for(int i = 0 ;i < n ; i ++){
  		arr[i] = sc.nextInt();
  	}

  	//How Many max ele u want
  	System.out.println("how many max element u want");
  	int m = sc.nextInt();
    //int j = 0;
  	buildHeap(arr,n);


  	//first max element
  	System.out.println("output : ");
  	System.out.println(arr[0]);
    
    for(int j = 0; j < m-1;j++){
       int temp = arr[0];
       arr[0] = arr[n-j-1];
       arr[n-j-1] = temp;

       heapify(arr,0,n-j-1);
       System.out.println(arr[0]);
    }

  }
}
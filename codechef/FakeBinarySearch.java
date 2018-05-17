import java.util.*;
class FakeBinarySearch{
  static int findElement(int[] arr , int ele){
	  for(int i = 0 ; i < arr.length ; i++){
		  if(arr[i] == ele){
			  return i;
		  }
	  }
	  return -1;
  }

  static int binarySearch(int[] arr ,int low ,int high ,int swap ,int[] sortarr ,int smallest,int largest,int k ,int x){
     if(low <= high){
	    int mid = (low + high)/2;
	     if(arr[mid] == x){
	   	  return swap;
	     }
	     else if(k < mid){
	   	    if(arr[k] < arr[mid]){
	   	  	  high = mid-1;
	   	  	  return binarySearch(arr,low,high,swap,sortarr,smallest,largest,k,x);
	   	    }
	   	    else{
	   	  	  int large = sortarr[largest];
	   	  	  int pos = findElement(arr,large);
	   	  	  largest--;
	   	  	   if(large == arr[k]){
	   	  	   	return -1;
	   	  	   }
	   	  	   else{
                swapping(arr,mid,pos);
	   	  	   }
	   	  	  swap++;
	   	  	  //System.out.println("swap"+swap);
	   	  	  high = mid-1;
	   	  	  return binarySearch(arr,low,high,swap,sortarr,smallest,largest,k,x);
	   	    }
	     }
	     else{
	   	    if(arr[k] > arr[mid]){
	   	  	  low = mid+1;
	   	  	  return binarySearch(arr,low,high,swap,sortarr,smallest,largest,k,x);
	   	  	}
	   	    else{
	   	  	  int small = sortarr[smallest];
	   	  	  int pos = findElement(arr,small);
	   	  	  smallest++;
	   	  	    if(small == arr[k]){
	   	  	    	return -1;
	   	  	    }
	   	  	    else{
                  swapping(arr,pos,mid);
	   	  	    }
	   	  	  swap++;
	   	  	  //System.out.println("swap" + swap);
	   	  	  low = mid+1;
	   	  	  return binarySearch(arr,low,high,swap,sortarr,smallest,largest,k,x);
	   	    }
	     }
	  }
	  else{
	  	return -1;
	  }
  
  }

   static void swapping(int[] arr , int x ,int y){
	  int temp = arr[x];
	  arr[x] = arr[y];
	  arr[y] = temp;
  }

  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  //test case
	  int t = sc.nextInt();
	  while(t > 0){
        
          //size of array
          int n = sc.nextInt();
          //number of student
          int num = sc.nextInt();

          //array
          int[] arrval = new int[n];
          int[] sortarr = new int[n];
          for(int i = 0;i < n ;i ++){
        	  arrval[i] = sc.nextInt();
        	  sortarr[i] = arrval[i];
          } 

          //Sortarray
          Arrays.sort(sortarr);

          //printing sort array
          //System.out.println("Sorted");
          //for(int i = 0;i<n;i++){
            //System.out.println(sortarr[i]);
          //}        

          while(num > 0){
          	  //search for that element
          	  int search = sc.nextInt();
          	  int k = findElement(arrval,search);

          	  int[] arr = new int[n];
          	  for(int i = 0 ; i < n ;i++){
          		  arr[i] = arrval[i];
          	  }

          	  int count = binarySearch(arr,0,n-1,0,sortarr,0,n-1,k,search);
          	  System.out.println(count);
          	  num--;
            }
		  t--;
	    }
    }
}
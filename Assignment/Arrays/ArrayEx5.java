//5. Write a program to find the missing number in integer array of 1 to 100? 

import java.util.*;
class ArrayEx5{
	public static void main(String[] args) {
		int[] arr = new int[5];//size is n-1
		int[] count = new int[6];
		int i;

		//intialise
		Scanner sc = new Scanner(System.in);
		for(i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();//element are n
			count[arr[i]-1] = 1;
		}
        
        //check which element is missing
        for(i=0;i<count.length;i++){
        	//i(rr[i] != i){
        		//System.out.println("missing element is "+arr[i]);
        	//}
            
            //check condition
            if(count[i] == 0){
            	System.out.println("missing element is"+(i+1));
            }

        }

	}
}

//use sum formala
void missingNumber(int[] arr,int n){
	int i;
	int total = (n+1)(n+2)/2;
	for(i=0;i<arr.length;i++){
		total -= arr[i];
	}

}

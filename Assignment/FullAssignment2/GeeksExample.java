/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GeeksExample {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc .nextInt();
		
		while(t > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] arr =new int[n];
		    
		    for(int i = 0;i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int sum = arr[n-1];
		    int max = arr[n-1];
		    int count = 0;
		    int val = 0;
		    
		    for(int i = n-2 ; i>= 0 ;i--){
		        
		        if(arr[i] == max-1){
		             if(val <= max && count == 1){
		                sum = sum + arr[i];
		                //System.out.println(sum);
		             }
		             else{
		                 count = 1;
		                 val = max;
		             }
		            
		        }
		        
		        
		        if(arr[i] == max ){
		            sum = sum + arr[i];
		        }
		        
		        if(arr[i] == max-2){
		            sum = sum+arr[i];
		            max = max-2; 
		        }
		         
		    }
		    System.out.println(sum);
		    
		    t--;
		}
	}
}

import java.util.*;
class Example5{
   public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);
   		System.out.println("enter size");
   		int size = sc.nextInt();
   		System.out.println("enter numbers : ");
   		int[] arr = new int[size];
   		for(int i = 0 ;i< size ;i++){
             arr[i] = sc.nextInt();
   		}

        //counting pos & neg number & average
        double avg = 0;
        int sum = 0;
        int pos = 0;
        int neg = 0;
        int zer = 0;

        for(int i = 0;i<size;i++){
        	sum = sum + arr[i];
        	if(arr[i] > 0){
        		pos++;
        	}
        	else if(arr[i] < 0){
        		neg++;
        	}
        	else{
        		zer++;
        	}
        }
        //because of negative number it will get zero as average
        avg = (double)(sum/(size-zer));

        //print 
        System.out.println("Positive number are : "+pos);
        System.out.println("Negative numbere are : "+neg);
        System.out.println("Total is :"+sum);
        System.out.println("Average is :"+avg);

   	}	
}
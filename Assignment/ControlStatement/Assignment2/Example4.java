import java.lang.*;

class Example4{
	public static void main(String[] args) {
		int num = 1634;
		double n = 0 ;
		double armsnum = 0;
		double rem = 0;
		//int[] arr = new int[];

		//size of the number
        int digit = num;
		while(digit > 0){
            n = n+1;
            digit = digit/10;
		}

		//logic
        digit = num;
		while(digit > 0){
           rem = digit%10;

           //Java.lang.Math.pow(double a, double b)
           rem = Math.pow(rem,n);

           armsnum = armsnum + rem;
           digit = digit/10;
		}
        
        if(num == armsnum){
        	System.out.println(num+" is Armstrong number");
        }
        else{
        	System.out.println(num + " is not Armstrong number");
        }
	}
}

//output:
//153 is Armstrong number

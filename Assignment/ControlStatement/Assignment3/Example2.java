//2. Write a program to check the given number is palindrome or not?

class Example2{

    //logic for power
    static int power(int rem , int n){

    	if(n == 0 ){
    		return rem;
    	}
    	while(n > 0 ){
    		rem = rem * 10;
    		n--;
    	}
    	return rem;
    }

	public static void main(String[] args) {
		int num = 25852;
		int digit;
		digit = num;

		//check no of digit in number
		int n = 0 ;
		while(digit > 0){
			n = n+1;
			digit = digit/10;
		}

		//logic O(n)
        int revnum = 0;
        digit = num;

        while(digit > 0){
        	int rem = digit%10;
        	rem = power(rem,n-1);
        	revnum = revnum + rem;

        	digit = digit/10;
        	n--;
        }

        System.out.println("reverse number"+revnum);
        

        if(num == revnum){
        	System.out.println(num + " is palindrome");
        }
        else{
        	System.out.println(num +" is not a palindrome");
        }
	}
}
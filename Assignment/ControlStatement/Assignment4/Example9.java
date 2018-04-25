
import java.lang.*;
class Example9{
	public static void main(String[] args) {
		int n;
		n = (int)Math.cbrt(12000);
        //check value is correct
		int num = (int)Math.pow(n+1,3);
		if(num < 12000){
		   System.out.println(n +1);
	    }
	    else{
	    	System.out.println(n);
	    } 
	}
}
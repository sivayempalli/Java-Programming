import java.util.*;
import java.math.*;

class RiseAndFall{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t > 0){
            
            int n = sc.nextInt();
            int k = sc.nextInt();

            BigDecimal i = BigDecimal.valueOf(Math.pow(n,n));
            System.out.println(i);
            /*
            BigDecimal num = i;
            int div = (int)Math.pow(10,k);
            BigInteger first = num;
            System.out.println(first);

            while(first >= div){
            	first = first/10;
            	System.out.println(first);
            }
            double divide = div;
            //System.out.println(divide);

            double second = num/divide;
            //System.out.println(second);

            System.out.println(first);
            System.out.printf("%.2d",second);
            */
			t--;
		}
	}
}
//print prime number upto 1000
import java.lang.Math;
class PrintPrime{
	public static void main(String[] args) {
		int n = 1000;
		int count = 0;
		System.out.println(2);
		System.out.println(3);
        int total = 2;

		for(int i = 4; i < n ; i++){
			count = 0;
			int k = (int)Math.sqrt(i);
			for(int j = 2 ; j <= k ; j++){
				if(i%j == 0){
					count = 1;
					break;
				}
			}

			if(count == 0){
			   System.out.println(i);
			   //how many prime number are present
			   total++;
		    }
		} 
		System.out.println("Total prime number are " + total);   
	}
}
//2. Write a program to reverse number?
class Example2{
	public static void main(String[] args) {
		int x = 839;
		int num;
		double revsum = 0;
		double s = 0 ;
		int r=10;
		double digit = 2;


		//logic
		num = x;
		while( num > 0 ){
			
			s = num % 10;
			s = s * (Math.pow(10,digit));
			revsum = revsum + s;
            num = num/r;
			//r = r*10;
            digit--;

		}
		System.out.println(revsum);
	}
}
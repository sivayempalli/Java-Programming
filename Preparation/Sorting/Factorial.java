//factorial using factorail
import java.util.*;
class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter factor number");
		int n = sc.nextInt();
		Fact f = new Fact();
		System.out.println("Factorial Number is" + f.factor(5));
	}
	
}
class Fact{
	public int factor(int i){
		if (i == 1)
		    return 1;
		else 
			return factor(i-1) * i;
	}
}
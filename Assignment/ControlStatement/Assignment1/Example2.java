
//2. Write a program to find given number is odd or even?

import java.util.*;
class Example2{
	public static void main(String[] args) {
		int x;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if((x %2) == 0){
			System.out.println(x + " is even number");
		}
		else{
			System.out.println(x + " is odd number");
		}
	}
}
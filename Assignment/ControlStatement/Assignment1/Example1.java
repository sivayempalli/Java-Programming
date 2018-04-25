//1. Write a program to find sum of two numbers?

import java.util.*;
class Example1{
	public static void main(String[] args) {
		int x , y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		//System.out.println("Sum of two numbers :" + x+y);//will concatenate two number
		System.out.println("Sum of two numbers :" + (x+y)); // it will sum two number
	}
}
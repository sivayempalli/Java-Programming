//BQ1 : (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, …, December for the number 1, 2, …, 12, accordingly.
import java.util.*;
//import java.lang.*;
class Example1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();

		int x = (int)Math.random();
        System.out.println(x);
		switch(x){
			case 1 : System.out.println("January");
			         break;

			case 2: System.out.println("February");
			        break;
			case 3: System.out.println("March");
			        break;
			case 4: System.out.println("April");
			        break;
			case 5 : System.out.println("May");
			         break;
			case 6: System.out.println("june");
			        break; 
			case 7: System.out.println("july");
			        break; 
			case 8: System.out.println("August");
			        break;
			case 9: System.out.println("Sptember");
			        break;
			case 10: System.out.println("October");
			        break;
			case 11: System.out.println("November");
			        break;
			case 12: System.out.println("December");
			        break;
			default:
				System.out.println("check that number");
		}
		
	}
}
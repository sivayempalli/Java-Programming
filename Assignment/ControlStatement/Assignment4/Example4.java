//Write a program that prompts the use enter the month and year and displays the number of days in the month.

import java.util.*;
class Example4{

	static int leapYear(int year){
		if((year%400) == 0){
			return 1;
		}

		if((year%100) == 0){
			return 0;
		}

		if((year%4) == 0){
             return 1;
        }
        return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		int month = sc.nextInt();
		System.out.println("enter year");
		int year = sc.nextInt();

		//print
		System.out.println("month is " + month+" and year is "+year);


		switch(month){
			case 1 : System.out.println("January "+year+" had 31 days");
			         break;
			case 2 : int leap = leapYear(year);
			         if(leap == 1){
			         	System.out.println("February "+year+" had 29 days");
			         }
			         else{
			            System.out.println("February "+year+" had 29 days");	
			         }
			         break;

			case 3 : System.out.println("March "+year+" had 31 days");
			         break;
			case 4 : System.out.println("April "+year+" had 30 days");
			         break;
            case 5 : System.out.println("May "+year+" had 31 days");
			         break;
		    case 6 : System.out.println("June "+year+" had 30 days");
			         break;
            case 7 : System.out.println("July "+year+" had 31 days");
			         break;
			case 8 : System.out.println("August "+year+" had 31 days");
 			         break;
 			case 9 : System.out.println("September "+year+" had 30 days");
 			         break;
 			case 10 : System.out.println("October "+year+" had 31 days");
 			         break;
 			case 11 : System.out.println("November "+year+" had 30 days");
 			         break;
 			case 12 : System.out.println("December "+year+" had 31 days");
 			         break;
 			default : System.out.println("Enter a valid number");
        }   

	}
}
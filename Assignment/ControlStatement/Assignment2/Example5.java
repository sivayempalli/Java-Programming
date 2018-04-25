//5. Write a program to Find Largest Number Among Three Numbers
import java.util.*;
class Example5{
	public static void main(String[] args) {
		int x,y,z;
		int larnum;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        /*
        if(x > y){
        	if(x > z){
        		System.out.println("largest number : " + x);
        	}
        	else{
        		System.out.println("largest number is : " + z);
        	}
        }
        else{
        	if(y > z){
        		System.out.println("largest number :"+ y);
        	}
        	else{
        		System.out.println("largest number :" + z);
        	}
        }
        */
        larnum = (x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println("largest number : "+larnum);
	}
	
}
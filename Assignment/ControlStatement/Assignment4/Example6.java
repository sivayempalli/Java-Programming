//Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name of the student with the highest score.
import java.util.*;
class Example6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student");
		int n = sc.nextInt();

		System.out.println("enter name and marks");
		int[] arr = new int[n];
		String[] str = new String[n];

		for(int i = 0;i < n;i++){
		    str[i] = sc.next();
			arr[i] = sc.nextInt();
		}	

		//check
		for(int i = 0 ;i < n;i++){
			System.out.println(str[i]+" mark is "+arr[i]);
		}

		//highest marks
		int hmark = 0;
		int index = 0;
		for(int i = 0;i < n;i++){
			if(hmark < arr[i]){
                hmark = arr[i];
                index = i;  
			}
		}

		System.out.println("Name of  the Student with highest score is : "+str[index]+" with "+hmark+" mark");
	}
}

//output:
//Enter number of Student
//4
//enter name and marks
//ravi 3
//ravula 4
//ravindra 5
//babu 2
//ravi mark is 3
//ravula mark is 4
//ravindra mark is 5
//babu mark is 2
//Name of  the Student with highest score is : ravindra with 5 mark

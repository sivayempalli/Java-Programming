import java.util.Scanner;
class Scanner1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll number");
		int rollno = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		sc.close();
	}
}
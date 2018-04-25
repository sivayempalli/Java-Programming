import java.util.Scanner;
class ArrayTest3
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int a[];
a=new int[n];
System.out.println(a);
System.out.println(a[0]);
System.out.println(a.length);
System.out.println("input elements are:");
int sum = 0;
for(int i = 0;i<n;i++)
{
a[i]=scan.nextInt();
sum = sum+a[i];
}
System.out.println("print the element using enhanced for loop");
for(int e :a)
System.out.println(e);
System.out.println("total value:");
System.out.println("sum" +sum);
}
}

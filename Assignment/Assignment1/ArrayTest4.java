import java.util.Scanner;
class ArrayTest4
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int a[][];
a=new int[2][2];
System.out.println(a);
System.out.println(a[0]);
System.out.println(a.length);
System.out.println("input elements are:");
for(int i = 0;i<2;i++)
{
for(int j=0;j<2;j++)
a[i][j]=scan.nextInt();
}
System.out.println("print the element using enhanced for loop");
for(int x[] :a)
{
for(int e :x)
System.out.printf("%3d",e);
System.out.println();
}
}
}

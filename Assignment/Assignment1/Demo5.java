// create class
class Student
{
private int roll_no;
private int salary;
void value()
{
roll_no = 10;
salary = 2000;
}
void print()
{
System.out.printf("%d,%d",roll_no,salary);
}
}


class Demo5
{
public static void main(String args[])
{
//create objects
Student obj1 = new Student();
Student obj2 = new Student();
obj1.roll_no = 23;
obj1.salary = 1000;
obj1.print();
obj2.value();
obj2.print();
}
}
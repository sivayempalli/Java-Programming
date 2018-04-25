//Q2. 
//(The Person, Student, Employee, Faculty, and Staff classes) 
//Design a class named Person and its two subclasses named Student and Employee.          
//Make Faculty and Staff subclasses of Employee. 
//A person has a name,address, phone number, and email address. 
//A student has a class status(freshman, sophomore, junior, or senior). 
//Define the status as a constant. 
//An employee has an office, salary, and date hired. 
//Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
//A faculty member has office hours and a rank. 
//A staff member has a title. 
//Override the toString method in each class to display the class name and the person’s name


abstract class Person{
	public abstract String toString();
}
class Student extends Person{
	String str;

	Student(String str){
		this.str = str;
	}

	public String toString(){
		return ("Class Name : "+ this.getClass().getName()+" person name : "+this.str);
	}
}

class Employee extends Person{
	String str;

	//no-arg constructor
	Employee(){}

    //default constructor
	Employee(String str){
		this.str = str;
	}

	public String toString(){
		return ("Class Name : "+ this.getClass().getName()+" person name :"+this.str);
	}
}

class Faculty extends Employee{
	String str;
	
	Faculty(String str){
		//it will call super class constructor
		this.str = str;
	}


	public String toString(){
		return ("Class Name : "+ this.getClass().getName()+" person name : "+this.str);
	}
}
class Staff extends Employee{
	String str;
	Staff(String str){
		this.str = str;
	}

	public String toString(){
		return ("Class Name : "+ this.getClass().getName()+" person name : "+this.str);
	}
}

class Example2{
	public static void main(String[] args) {
		
		Person st = new Staff("RAVI");
		System.out.println(st);

		Person fac = new Faculty("Ravula");
		System.out.println(fac);

		Person emp = new Employee("Babu");
		System.out.println(emp);

		Person stu = new Student("Siva");
		System.out.println(stu);
	}
}
//Q1: (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:                                           
// Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.   
// ■ A no-arg constructor that creates a default triangle.
// ■ A constructor that creates a triangle with the specified side1, side2, and  side3.                                        
// ■ The accessor methods for all three data fields.                            
// ■ A method named getArea() that returns the area of this triangle.             
// ■ A method named getPerimeter() that returns the perimeter of this triangle.   
//■ A method named toString() that returns a string description for the triangle.
                                                                                
//The toString() method is implemented as follows:                         
// return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3; 


import java.lang.*;

//abstract class
abstract class GeometricObject{
	

	//Area of Triangle Method
	public abstract void getArea();

    //Perimeter of Triangle
    public abstract double getPerimeter();
}


class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;

	//no-arg constructor
	Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	//constructor
	Triangle(double side1,double side2,double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

    //print Area of Triangle
	public void getArea(){
		double s ;
		s = (side1+side2+side3)/2;
		double cal = (s * (s - side1) * (s - side2) * (s - side3));
		
		//check condition
		if( cal >= 0){
		    System.out.println("Area of Triangle = "+Math.sqrt(cal));
		}
		else{
			System.out.println("Area doesnot Exit");
		}
	}
    
    //return Perimeter of Triangle
	public double getPerimeter(){
		return side1+side2+side3;
	}

	public String toString(){
	    return ("side1 = " +side1+" side2 = "+side2+" side3 = "+side3);
	}
}
class Example1{

	public static void main(String[] args) {
		
		//create object with no-arg constructor
		Triangle tri = new Triangle();
		System.out.println(tri.toString());
		tri.getArea();
		System.out.println("Perimeter of Triangle = " + tri.getPerimeter());

		//create object with parameter constructor
		Triangle tri1 = new Triangle(3.0,4.0,9.0);
		System.out.println(tri1.toString());
		tri1.getArea();
		System.out.println("Perimeter of Triangle = " + tri1.getPerimeter());
	}
}

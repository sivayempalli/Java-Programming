abstract class Shape{

	//we can create abstract method
	abstract void draw();
}

//By Inheritance concept access abstract classs
class Circle extends Shape{
	void draw(){
		System.out.println("Circle is drawn");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Rectangle is Drawn");
	}
}

class AbstractEx1{
	public static void main(String[] args) {
		
		//circle object 
		Shape s = new Circle();
		s.draw();

		//rectangle
		s = new Rectangle();
		 s.draw();	}
	
}
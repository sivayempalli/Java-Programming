class Example1{
	public static void main(String[] args) {
	
    //create sub class object
	Sub sub = new Sub();
      
    // access  Super class Static member from Sub class
    System.out.println(sub.i);
   
    //printing Subclass static method
    Sub.display();
	}
}
class Super{
	static int i = 4; 
	public static void display(){
		System.out.println("static method of super class");
	}
}
class Sub extends Super{
	public  void display(){
		Super.display();
		System.out.println("static method of sub class");
	}
}
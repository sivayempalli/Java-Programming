//package main; 
class Parent {
    public void display() {
        System.out.println("Parent");
    }         
}

//Inheritance concept
class Child extends Parent {    
    public void display() {
        System.out.println("Derived");
    }
}
class Main{

    //static method take argument Parent object reference
    public static void doDisplay( Parent o ) {
        o.display();   
    }

    public static void main(String[] args) {
        Parent x = new Parent();//Parent Object
        Parent y = new Child();//child Object Of type Parent
        Child z = new Child();//child object
        doDisplay(x);//print Parent
        doDisplay(y);//Print Derived
        doDisplay(z);//Print Derived
    }
}
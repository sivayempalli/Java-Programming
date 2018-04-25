class SuperClass {
    protected  void foo() {}
}
class Child extends SuperClass {
     //weaker access privileges;
     void foo() {}//here modifier access not written so override is not happenning
}
public class Test1 {
    public static void main(String args[]) {
        Child child = new Child();//child object of type child class will create

        //Method Overriding concept
        //JVM will access child class foo() method
        child.foo();
    }
}

//compile error 
//override is not happenning

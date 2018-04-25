public class Test {    
    int x = 2;
    Test(int i) { x = i; } 
    public static void main(String[] args) {    
         
         //object will create and constructor will called 
         Test t = new Test(5);
         
         System.out.println("x = " + t.x);//print x value
    }
}

//output x=5
//4. Write a program to Swap two numbers without using third variable?

class Example4{
    public static void main(String[] args) {
    	
        int x = 4;
        int y = 5;

        System.out.println("before swapping");
        System.out.println("x is : "+x+"\n"+"y is : "+y);

        x = x+y-(y=x);

        System.out.println("after swapping");
        System.out.println("x is : "+x+"\n"+"y is : "+y);
    }
}
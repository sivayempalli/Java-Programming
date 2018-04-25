//3. Write a java program to swap two variables?

class Example3{
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int temp;

		//swapping
        
        System.out.println("before swapping ");
        System.out.println("x is :"+x+"\n"+"y is :"+y);

		temp = x;
		x = y;
		y = temp;
        
        System.out.println("after swapping");
		System.out.println("x is :" + x + "\n" + "y is :" + y); 
	}
}
//1. Find largest number among three numbers using ternary operator?

class Example1{
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		int larelement = x>y?((x>z)?x:z):((y>z)?y:z);
        
        System.out.println("largelement is : " + larelement);
	}
}
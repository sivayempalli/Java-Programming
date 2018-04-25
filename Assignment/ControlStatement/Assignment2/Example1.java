class Example1{
	public static int factorial(int fact){
		if(fact == 1){
			return 1;
		}
		else{
			fact = fact*factorial(fact-1);
			return fact;
		}
	}

	public static void main(String[] args) {
		System.out.println("factorial of 6 is " + factorial(6));
	}
}

//output
//factorial of 6 is 720

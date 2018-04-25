//Q3.
//(The MyInteger class) Design a class named MyInteger. The class contains:      
                                                                             
//■ An int data field named value that stores the int value represented by this object.                                                                      
//■ A constructor that creates a MyInteger object for the specified int value.   
//■ A getter method that returns the int value.                                  
//■ The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.                   
//■ The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.     
//■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd,or prime, respectively.                                                   
//■ The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.            
//■ A static method parseInt(char[]) that converts an array of numeric characters to an int value.                                                  
//■ A static method parseInt(String) that converts a string into an int value.

// Write a client program that tests all methods in the class.

class Example3{
	static int val;

	static boolean isEven(int value){
		return checkEven(value);
	}
	static boolean isOdd(int value){
		return checkOdd(value);
	}

	//check even number
	static boolean checkEven(int value){
		if((value % 2) == 0){
			return true;
		}
		return false;
	}

	//check odd number
	static boolean checkOdd(int value){
		if((value % 2) != 0){
			return true;
		}
		else
			return false;
	}

    //static method with int as arguement
	static boolean isEven(Example3 o){
		return checkEven(o.value);
	}
	static boolean isOdd(Example3 o){
		return checkOdd(o.value);
	}
     
    //static method with object as arguement
    //static boolean check(Example3 o){
    //	int var = o.value;
	//	if((var / 2) == 0){
	//		return true;
	//	}
	//	else
	//		return false;
	//}


	int value;
	Example3(int value){
		this.value = value;
	}
	//public int isEven(){
    //
	//}
	public static void main(String[] args) {
		if(isEven(4)){
			System.out.println("Odd Number");
		}
		Example3 ex1 = new Example3(4);
		//System.out.println(isEven(ex1));
		if(isEven(ex1)){
			System.out.println("Even number");
		}

		//non static method
		Example3 ex2 = new Example3(5);
		if(ex2.checkOdd(ex2.value)){
			System.out.println("odd number");
		}
	}
}
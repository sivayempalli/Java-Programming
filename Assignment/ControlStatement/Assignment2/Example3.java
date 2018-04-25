// Write a program to print Fibonacci Series?

class Example3{
	public static void main(String[] args) {
	  int i=0;
	  int j=1;
	  int fib=0;

	  System.out.println("fib series are: ");
	  System.out.println(i);
	  System.out.println(j);
      
      //upto which number u want fib series;
	  int x = 21;	

	  while(fib < 21){
	  	fib = i+j;
	  	System.out.println(fib);
	  	i = j;
	  	j = fib;
	  }
	}
}


//output:
//fib series are: 
//0
//1
//1
//2
//3
//5
//8
//13
//21
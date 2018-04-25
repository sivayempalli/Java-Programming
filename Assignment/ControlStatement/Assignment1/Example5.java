/*
class Example5{
	public static void main(String[] args) {
		int x = 45;
		int i,t;
		t = (x/2);
		for( i = 2;i < t;i++){
			//System.out.println(i);
			if((x%i) == 0){
			  System.out.println(x+" is not a prime number");
			  break;
		    }
		    //else{
		 	//  System.out.println(x+"is not a prime number");
		    //}
		}

		if(i == t){
			System.out.println(x+" is prime number");
		}
		 //else{
		 //	System.out.println(x+"is not a prime number");
		 //}
	}
}
*/

class Example5{
	public static void main(String[] args) {
		int x = 19;
        int i; 
		for(i = 2; i*i < x ; i++){
			if((x%i) == 0 ){
				System.out.println(x +" is not a prime number ");
			}
		}

		if(i*i > x){
			System.out.println(x + " is prime number");
		}
	}
}
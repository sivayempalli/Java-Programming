class Example4{

    static void printPattern(int n){

       int k = 2*n -2;

       int len = n-1;

        for(int i = len ; i >= 0 ; i--){

    	  for(int j = 0 ; j < k ;j++){
    		System.out.print(" ");
    	  }

    	  k = k+2;

    	  for(int j = 0;j < ((2*i)+1) ; j++ ){
    		System.out.print("* ");
    	  }

    	  System.out.println("");
        }
    }
    public static void main(String[] args) {
    		int n = 3;
    		printPattern(n);
    }	
}
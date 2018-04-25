class Example5{
    
    static void printPattern(int n){
    	int k = 2*n-2;
    	int len = n-1;
    	for(int i = 0 ;i < n ; i++){

    		//space
    		for(int j = 0 ; j < k ; j++){
    			System.out.print(" ");
    		}

    		 k = k - 2;

    		for(int j = 0 ; j < ((2*i)+1) ; j++){
                System.out.print("* ");   
    		}

    		System.out.println();
    	}
        k = k + 4;

    	for(int i = len-1 ; i>=0 ; i--){

    	    for(int j = 0 ; j < k;j++){
    		   System.out.print(" ");
    	    }

    	    k = k + 2;
            
            for(int j = 0; j < ((2*i)+1) ; j++){
            	System.out.print("* ");
            } 
             System.out.println();
    	}

          
    }

	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
	}
}
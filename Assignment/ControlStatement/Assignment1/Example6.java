//prime number upto less than that number

class Example6{
	public static void main(String[] args) {
		int x = 20 ;
		int[] arr = new int[x];
		int i,j;

		for(i = 0; i < x;i++){
           arr[i] = i;
		}

		i = 2;
		while(i < x){

			//insert which are divisible by i 
			for(j = i+1;j < x; j++){
				if((arr[j]%i) == 0 && arr[j] != 0){
                  arr[j] = 0;
				}
			}
             
            //choosing i
            i = i+1;
            //in while loop ArrayOutOfIndex Exception will occur before it check base condition
			while( i < x && arr[i] != i){
                  i++;  
				}    
			
		
		}

		for(i = 2;i < x;i++){
			if(arr[i] != 0){
				System.out.println("prime number are : "+i);
			}
		}
	}
}
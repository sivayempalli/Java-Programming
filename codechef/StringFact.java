import java.util.*;

class StringFact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//test cases
		int t = sc.nextInt();
	       while(t > 0){
		      String str = sc.next();

		      int[] count = new int[256];//ASCII
		      int len = str.length();

		      //for(int i = 0 ; i < 256 ; i++ ){
		      //	count[i] = 0;
		      //}
              
              //counting each character
              int arrlen = 0;
		      for(int i = 0 ; i < len ; i++ ){
			    if(count[str.charAt(i)] == 0){
				  arrlen++;
				  count[str.charAt(i)]++;
			    }
			    else{
			      count[str.charAt(i)]++;
			    }
			    //System.out.println(count[str.charAt(i)]);
			    //System.out.println((int)str.charAt(i));
		      }
		      //System.out.println(count[100]);

		      int[] arr = new int[arrlen];
        
              //int i = 0;
              int j = 0;

		      //while(count[i++] != 0){
		      //	arr[j++] = count[i-1];
		      //	System.out.println(count[i-1]);
		      //}
              
              //if count have some value then i put in array
		      for(int i = 0 ;i < 256;i++){
			     if(count[i] != 0){
				   arr[j] = count[i];
				   j++;
			     }
		      }

              //sort the array
		      Arrays.sort(arr);

		      //System.out.println(arr.length);
		      //System.out.println("j="+j);

		      //for(int i = 0 ; i < arrlen ; i++){
			  //  System.out.println(arr[i]);
		      //}

		      //for(int k = 0 ; k < count.length ; k++){
		      //	System.out.println(count[i]);
		      //}
        
              int fib = 0;
              //if(arrlen < 2 ){
              //  System.out.println("Dynamic");
              //}
              //checking condition
		      for(int i = 2 ; i < arrlen ; i++){
			     if(arr[i] == arr[i-1] + arr[i-2]){
				   fib++;
			     }
		      }

		      if(fib != 0 || arrlen < 2){
			    System.out.println("Dynamic");
		      }
		      else{
			    System.out.println("Not");
		      }
		      t--;
	        }
    }
}
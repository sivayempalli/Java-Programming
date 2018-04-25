//10. Can you store String in an array of Integer in Java? compile time error or runtime exception? 
//a)Compile Time Error


class ArrayEx10{
	public static void main(String[] args) {
		
        //asssign int value in string
		String[] arr = {10,"sdc","edd"};

        //print all values
		for(int i = 0 ;i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

//output:
//error: incompatible types: String cannot be converted to int
 //               int[] arr = {"abc","sdc","edd"};
  //                           ^

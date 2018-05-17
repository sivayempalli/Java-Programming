import java.util.*;
class CommonElement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ni and n2 input");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("enter arr1 and arr2");
		int[] arr1 = new int[n1];
		 for(int i = 0 ; i < n1;i++){
		 	arr1[i] = sc.nextInt();
		 }

         int[] arr2 = new int[n2]; 
		 for(int i = 0 ; i < n2 ; i++){
		 	arr2[i] = sc.nextInt();
		 }

		 //using hashing
		 int[] hash = new int[1000];
		 int[] count = new int[1000];
 
		 for(int i = 0;i < n1 ;i++){
            hash[arr1[i]] = arr1[i];
            count[arr1[i]] = 1;
		 }
         System.out.println("CommonElement");
		 for(int i = 0;i < n2 ; i++){
		 	if(hash[arr2[i]] != 0 && count[arr2[i]] != 0){
		 		System.out.println(arr2[i]);
		 		count[arr2[i]] = 0;
		 	}   
		 }

	}
}
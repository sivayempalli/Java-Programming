import java.util.*;
class Example7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student");
		int n = sc.nextInt();

		System.out.println("enter name and marks");
		int[] arr = new int[n];
		String[] str = new String[n];

		for(int i = 0;i < n;i++){
		    str[i] = sc.next();
			arr[i] = sc.nextInt();
		}	

		//check
		for(int i = 0 ;i < n;i++){
			System.out.println(str[i]+" mark is "+arr[i]);
		}

		//logic
		int sechmarks = 0,hmarks = 0;
		int index1 = 0;
		int index2 = 0;
		for(int i =0 ;i< n;i++){
			if(arr[i] > hmarks){
				sechmarks = hmarks;
				hmarks = arr[i];
				index1 = i;
				index2 = index1;
			}
			else if(hmarks > arr[i] && sechmarks < arr[i]){
				sechmarks = arr[i];
				index2 = i;
			}
			else{
				
			}
    	}


    	//print
    	System.out.println("name :"+str[index2]);
    	System.out.println("Second highest marks :"+sechmarks);

    }
}

//output:
//Enter number of Student
//5
//enter name and marks
//ravi 10
//babu 2
//ravula 3
//ravindra 4
//classroom 5
//ravi mark is 10
//babu mark is 2
//ravula mark is 3
//ravindra mark is 4
//classroom mark is 5
//name :classroom
//Second highest marks :5

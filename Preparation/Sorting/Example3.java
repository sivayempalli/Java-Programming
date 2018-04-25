//Q3:(Sort three integers) Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.


class Example3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		//int y = sc.nextInt();
		//int z = sc.nextInt();

		int[] arr = new int[3];


		//int larele = (x > y)?((x>z)?x:z):((y>z)?y:z);
		//System.out.println(larele);

		for(int i = 0;i<3;i++){
           arr[i] = sc.nextInt();
		}

		//bubble sort
		for(int i = 0;i < 3;i++){
			for(int j=0, j < 3-i-1 ; j++){
				if(arr[j] >  arr[j+1]){
                   int temp;
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
				}
			}
		}

		System.out.println("element are : ");
		for(int i = 0;i < 3;i++ ){
			System.out.println(arr[i]);
		}
	}
}
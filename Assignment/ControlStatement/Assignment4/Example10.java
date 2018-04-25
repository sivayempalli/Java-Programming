class Example10{
	public static void main(String[] args) {
		int num = 120;
		int i = 2;

		while(num > 1){
			while((num%i) == 0){
				System.out.println(i);
				num = num/i;
			}
			i++;
		}
	}
}

//output:
//2
//2
//2
//3
//5

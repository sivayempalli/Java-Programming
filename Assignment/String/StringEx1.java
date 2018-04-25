//1. Write a Java program that counts vowels in a string?

class StringEx1{
	public static void main(String[] args) {
		String s = "RavindraBabuRavula";
		int len = s.length();//length

		//logic
		int i = 0;
		int count = 0;
		char c;
		while(i < len){
			c = s.charAt(i);
			if(c == 'a'||c == 'e'||c == 'i'||c =='o'||c == 'u'){
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}

//output:
// 8

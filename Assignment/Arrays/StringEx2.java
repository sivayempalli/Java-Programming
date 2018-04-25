class StringEx2{
	public static void main(String[] args) {
		//splitting by space
		String[] str = "java is a programming language. It is mostly used in big data applications".split(" ");
		
		//String[] str1 = str.split(" ");
		//check whether it working or not
		//System.out.println(str[0]);

		//intialization
		int count = 0;
		int len = str.length;//array of string
		int i = 0;
		String token = "is";
		

		//logic
		while(i < len){
			//System.out.println(str[i]);
			//we use equal method it will check inside object
			if(str[i].equals(token)){
				count = count + 1;
			}
		i++;
		}

		//print 
		System.out.println(count);
	}
}
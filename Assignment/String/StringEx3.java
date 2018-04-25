//3. Write a java program to reverse a string without using reverse() method?

class StringEx3{
	public static void main(String[] args) {
		//string does not have reverse method
		//stringbuffer have reverse method

		//without using reverse method
		String str = "Ravindra Babu Ravula";
		int len = str.length() -1;
		StringBuffer strbuf = new StringBuffer();

		//logic
		for(int i = len ; i >= 0 ; i--){
			strbuf.append(str.charAt(i));
		}
        
        //internally it call strbuf.toString() method in print statement 
		System.out.println(strbuf);


	}
	
}

//output
//aluvaR ubaB ardnivaR

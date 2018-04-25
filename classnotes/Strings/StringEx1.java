class StringEx1{
	public static void main(String[] args) {
		
		/*
		//reverse a string 
		String s = "RaviBabu";
		String str = "";
		int i;
		for( i = (s.length()-1);i >= 0; i--){
		   str = str + s.charAt(i);  
		}
		System.out.println(str);
		Time(sec) : 0.09 Memory(MB) : 60.5664
		*/

		//reverse a string using StringBuffer
		String s = "RaviBabu";
		StringBuffer sb = new StringBuffer();
        for(int i =(s.length()-1);i >= 0; i--){
        	sb.append(s.charAt(i));
        }
        System.out.println(sb);

        //Time(sec) : 0.08 Memory(MB) : 57.0742

	}
}
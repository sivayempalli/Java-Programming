//6. Write a java program to print all the duplicate characteres in the given string?

class StringEx6{
	public static void main(String[] args) {
		
		//declaring
		String str = "ravindra babu";
		int len = str.length();
        int[] count = new int[255];
        char[] duparr = new char[len];
        int j=0;

        //logic o(n)

        for(int i = 0 ; i < len ; i++){
        	if(count[str.charAt(i)] == 0){
        		count[str.charAt(i)] = 1;
        	}
        	else{
                 if(count[str.charAt(i)] == 1){
                    duparr[j++] = str.charAt(i);
                    count[str.charAt(i)] = 2;	
                 }

        	}
        }

        //for(int i = 0;i < duparr.length ; i++){
        //	System.out.println(duparr[i]);
        //}

        System.out.println("Duplicate character are :");
        int i = 0;
        while(duparr[i] != '\0'){
             System.out.println(duparr[i++]);
        }



	}
}
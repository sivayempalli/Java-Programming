class Example8{
	public static void main(String[] args) {
		int count = 0;

		System.out.println("numbers divisible by 5 and 6");
        //why j ? to reduce time complexity
        int j = 100/30;
		for(int i = 100;i <= 1000;i = j*30){
            
            if((i%2 == 0) && (i%3 == 0) && (i%5 == 0)){
            	System.out.print(i + " ");
            	count++;
            }

            if( count == 10  ){
            	System.out.println();
            	count = 0;
            }
        j++;
		}
	}
}

//output:
//numbers divisible by 5 and 6
//120 150 180 210 240 270 300 330 360 390 
//420 450 480 510 540 570 600 630 660 690 
//720 750 780 810 840 870 900 930 960 990 

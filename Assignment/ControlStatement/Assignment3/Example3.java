//3. Write a program to print star pattern?+

class Example3{
	public static void main(String[] args) {
		char[] arr = new char[11];
		int len = arr.length;
		int mid = len/2;
		int var = mid;
		int count = 1;
        
        //making arr value as "*" 
		for(int i = 0 ; i < len ; i++ ){
			arr[i] = '*';
		}
        //logic 
        //thier is no logic to print  mid
        //for(int i = 0;i <= mid ; i++){
        //	if(i == mid){
        //		System.out.print(arr[i]);
        //	}
        //	else{
        //		System.out.print(" ");
        //	}
        //} 
        //System.out.print("\n"); 
        //count++;
        

        //odd number of size it will work fine for even number it will not work
		while(var >= 0){
			int j = 0;
			int k = 0;
			for(int i = 0 ; (i < len && k < count) ; i++){
                
                if(i == (var + j )){
                   System.out.print(arr[i]);
                   j = j+2;
                   k++;
                }
                else{
                   System.out.print(" ");
                }
			
			}
			System.out.print("\n");
		count++;
		var--;
		} 
	}
}
import java.util.*;

class Example1{

	//static void larElement(int[] arr){

	//}
	public static void main(String[] args) {
		//int[] arr = {1,2,3,45,6};
		//larElement(arr);
	    
	    Scanner sc = new Scanner(System.in);
	    //using list
	    List<Integer> list = new ArrayList<Integer>();
        
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int i = 0;
        
        System.out.println("Enter element");
        while (i < size){
        	Integer num = sc.nextInt();
        	list.add(num);
        	i++;
        }

        //largest number
        int lar = 0;

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
        	int ele = itr.next();
        	if(lar < ele){
               lar = ele;
        	}
        }

        System.out.println("largest element  : "+lar);

	}
}

//Enter Size
//3
//Enter element
//1
//2
//3
//largest element  : 3

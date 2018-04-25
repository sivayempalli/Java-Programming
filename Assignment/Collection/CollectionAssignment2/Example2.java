//2Q
import java.util.*;
class Example2{
   public static void main(String[] args) {
   	 List list = new ArrayList();
   	 list.add(new Loan(1000));
   	 list.add(new String("ArrayList Examples"));
   	 list.add(new Date());
   	 list.add(new Circle());

   	 Iterator itr = list.iterator();
   	 while(itr.hasNext()){
   	 	Object o = itr.next();
   	 	if(o instanceof Loan){
   	 	  ((Loan)o).getExe();
   	    }

   	    if(o instanceof Circle){
   	    	((Circle)o).getExe();
   	    }
   	 	System.out.println(o.toString());

   	 }

     //error: array required, but List found
   	 //System.out.println(list[1].toString());
   }
}

//create Loan class
class Loan{
	int amount;
	Loan(int i){
      amount = i;
	}
	public int getExe(){
		System.out.println("amount is "+ amount);
		return 1;
	}
	public String toString(){
	  return "Loan classs"; 
	}
}

//class Da{
//	String date;
//	Date(String date){
//		this.date = date;
//	}
//}

class Circle{
	int getExe(){
		System.out.println("Circle");
		return 1;
	}
     
    public String toString(){
    	return "Circle class";
    }
} 

//output
//samount is 1000
//Loan classs
//ArrayList Examples
//Mon Apr 23 13:11:33 IST 2018
//Circle
//Circle class

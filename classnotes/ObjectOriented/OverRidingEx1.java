//In overriding Arguement should be same
//same modifier access
class OverRiding{
	public void display(String str){
		System.out.println(str);
	}
}



class OverRidingEx1 extends OverRiding{

	//overriding concept
	public void display(String str){
		System.out.println(str + "babu ravula");
		System.out.println("overriding concept");

		//if u want super class method also 
		super.display("Super Method");
	}


	public static void main(String[] args) {

		//Object Reference of super class will be created
		OverRiding ore = new OverRidingEx1();

		//jvm will check method of sub class
		ore.display("Ravi");
	}
}
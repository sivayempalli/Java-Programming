//In overriding Arguement should be same
//same modifier access
class OverRiding{
	public void display(String str){
		System.out.println(str);
	}
}



class OverRidingEx1 extends OverRiding{
	public static void main(String[] args) {
		OverRidingEx1 ore = new OverRidingEx1();
		ore.display("Ravi");
	}
}
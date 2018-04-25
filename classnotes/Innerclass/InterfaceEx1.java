//interface class
interface Printer {
	public void print();
	public void typePrint();
}

//Scanner Interface
interface Scanner{
	public void print();
	public void typeScan();
}

//implement multiple inheritance
class HpComp implements Printer,Scanner{
	
    //here multipleInheritance is Done 
	public void  print(){
		System.out.println("printing and Scanning");
	}

	//provide all method interface
	public void typeScan(){
		System.out.println("scanner");
	}
	public void typePrint(){
		System.out.println("printer");
	}
}
class InterfaceEx1 {
	public static void main(String[] args) {
		HpComp hp = new HpComp();
		hp.print();
		hp.typePrint();
		hp.typeScan();
	}
}
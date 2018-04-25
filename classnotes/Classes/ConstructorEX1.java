class ConstructorEX1{
	static int staticvar = 3;
	int nonstaticvar = 6;
	static{
		System.out.println("staticvariable");
	}
	{
		System.out.println("nonstaticvariable");
	}
	ConstructorEX1(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		ConstructorEX1 cons = new ConstructorEX1();
	}
}
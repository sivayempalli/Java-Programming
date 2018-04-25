interface animal{
	void eat();
}




class AnonymousInnerClass1{
	public static void main(String[] args) {
		animal a = new animal(){
			public void eat(){
				System.out.println("by using interface");//by using interface we can create object without creating object for that interface
			}
		};
		a.eat();
	}
}
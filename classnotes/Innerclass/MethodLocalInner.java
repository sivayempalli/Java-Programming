class MethodLocalInner{
	public static void main(String[] args){
		Outer2.Inner2 i = new Outer2().new Inner2();
		i.innerMethod(); 
	}
}
class Outer2{
	private String o = "Outer class";
	public void doMethod(){
		//object of inner class created in inside method
		String e = "Inner class";//local method will not used in localmethodinnerclass
		final int f = 40;//local final variable are access(with in proram)
		class Inner2{
			void innerMethod()
			{
				System.out.println("outer member is " + o);

			}		
		}
		Inner2 i = new Inner2();
	    i.innerMethod();
	} 
}
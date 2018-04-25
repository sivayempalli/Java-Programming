class RegularInner1{
	public static void main(String[] args){
		Outer1.Inner1 i = new Outer1().new Inner1();
		i.accessOuter();
	}
}
class Outer1{
	private int i = 30;
	class Inner1{
		public void accessOuter(){
			System.out.println("outer class i :" + i);
			System.out.println("inner class ref" + this);//"this" keyword will use reference variable 
			System.out.println("outer class reference"+" "+Outer1.this);
		}
	} 
}
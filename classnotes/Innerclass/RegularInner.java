class RegularInner{
	public static void main(String[] args){
		//First we want create outer class object
		//Outer o = new Outer();
		//by using outer ref we want to create inner object
		//Outer.Inner i = o.new Inner();
		//i.accessOuter();
		//we can create object another way also
		Outer.Inner i = new Outer().new Inner();
		i.accessOuter();
	}
}

//creating outer class and inner class
class Outer{
	private int i = 20;
	class Inner{
		public void accessOuter(){
			//we can access outer class private member and member function also
			System.out.println("Outer is i "+i);
		}
	} 
}
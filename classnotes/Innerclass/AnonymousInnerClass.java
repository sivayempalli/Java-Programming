//Anonymous innerclass 
class AnonymousInnerClass{
	public static void main(String args[]){
		Test  t = new Test(){
			void doMethod(){
				System.out.println("method override");
			}
		};
		t.doMethod();
	}
}
class Test{
	void doMethod(){
		System.out.println("execute method");
	}
}
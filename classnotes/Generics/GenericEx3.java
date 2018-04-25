//Generic Methods

class GenericEx3{
	public static void main(String[] args) {
		TestEx2 te = new TestEx2("Ravi");
		System.out.println(te.getE("Ravi"));
		TestEx2 te1 = new TestEx2(10);
		te1.getE(20);
	}
}
class TestEx2{
	public <T> TestEx2(T e){
		System.out.println(e);
	}
	public <T>  T getE(T e){
		return e;
	}
}
class TestEx<E>{
	E e;
	TestEx(E e){
		this.e = e;
	}
	public void setE(E e){
		this.e = e;
	}
	public E getE(E e){
		retrun e;
	}	
}
class GenericEx2{
	public static void main(String[] args) {
		TestEx<String> te1 = new TestEx<String>("Ravi");
		System.out.println(te1.getE);
		TestEx<Integer> te2 = new TestEx<Integer>(20);
		System.out.println(te2.getE);
	}
}
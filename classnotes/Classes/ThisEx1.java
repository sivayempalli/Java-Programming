class ThisEx1{
	public static void main(String[] args) {
		number no = new number();
		no.favorite(3);
	}
}
class number{
	int i;
	public void favorite(int i){
		//inside method high prefernce will given to local variable
	    System.out.println(i);//i will 3
	    System.out.println(this.i);//default jvm will assign default value
	}
}
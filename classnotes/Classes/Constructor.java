class Constructor{
	    int i;
		float f;
		double d;
		char c;
		void display(){
			System.out.printlns("default int "+i+" default float f"+f+" default double : "+d+" default char : "+c);
		}
	public static void main(String[] args) {
		Constructor co = new Constructor();
		co .display();
	}
}
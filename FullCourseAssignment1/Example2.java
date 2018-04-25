//Q2. Implement a singleton class.
class Example{
	private Example(){

	}

	static Example getObject(){
		return new Example();
	}

	void getOutput(){
		System.out.println("Singleton implement");
	}
}
class Example2{
	public static void main(String[] args) {
		Example e1 = Example.getObject();
		e1.getOutput();
		Example e2 = Example.getObject();
		if (e1 == e2){
            System.out.println("Reference are equals");
		}
		else{
			System.out.println(e1 + " "+e2);
		}

	}
}

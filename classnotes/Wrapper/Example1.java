class Example1{
	public static void main(String[] args) {
		Integer i = new Integer(23);
		//convert wrapper numeric into primitive type
		byte b = i.byteValue();
		System.out.println(b);
		double d = i.doubleValue();
		System.out.println(d);

		//return primitive
		double db = Double.parseDouble("3.14");
		System.out.println(db);

		//toString method
		Double dbv = new Double("3.14");
		System.out.println(dbv.toString());

		String s = Long.toString(254,16);//(number , base)
	    System.out.println(s);
	}
}
class MethodOverloading{
	    int add(int x,int y){

		    return x+y;
	    }
	    public double add(double x,double y){
		    return x+y;
	    }
	public static void main(String[] args) {
	    MethodOverloading mol = new MethodOverloading();
	    System.out.println(mol.add(2,3));
	    System.out.println(mol.add(2.1,3.2));
	 }
}

class FirstAssignment8{
	public static void main(String args[]){
		double a,b,c,d,e,f,x,y;
		a=3.4;
		b=50.2;
		c=2.1;
		d=0.55;
		e=44.5;
		f=5.9;
		//using crammer rule
		x = (e*d-b*f)/(a*d-b*c);
		y = (a*f-c*e)/(a*d-b*c);
		System.out.println("x=" + (float)x + "\ny=" + (float)y);
	}
}
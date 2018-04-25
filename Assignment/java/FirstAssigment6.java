class FirstAssignment6{
	public static void main(String args[]){
		int k,m,s;
		double mil,hr,speed;
		k = 14;
		m = 45;
		s = 30;
		mil = k/60;
		hr = (m+s/60)/60;
		speed = mil/hr;
		System.out.println(speed+"miles/hour");
	}
}
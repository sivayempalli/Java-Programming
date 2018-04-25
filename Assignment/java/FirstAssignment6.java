class FirstAssignment6{
	public static void main(String args[]){
		double s,m,k,mil,hr,speed;
		k = 14;
		m = 45;
		s = 30;
		mil = k/1.6;
		//System.out.println(mil);
		hr = (m+(s/60))/60;
		//System.out.println(hr);
		speed = mil/hr;
		System.out.printf((float)speed +" miles/hour");
	}
}
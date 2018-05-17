import java.util.*;
class Time{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int n = str.length();

		String substr1 = str.substring(0,2);
		String substr2 = str.substring(2,n-2);
		String substr3 = str.substring(n-2,n);
		//System.out.println(substr1+substr2+substr3);

		int hour = Integer.parseInt(substr1);
		//System.out.println(hour);

        boolean val = substr3.equals("AM");
		if(hour == 12 && val){
			//substr1 = Integer.toString(00);
			//substr1 = substr1.concat(substr2);
			System.out.println("00"+substr2);
		}
		else if(!val && hour != 12){
			hour = hour + 12;
			substr1 = Integer.toString(hour);
			substr1 = substr1.concat(substr2);
			System.out.println(substr1);
		}
		else{
			System.out.println(substr1+substr2);
		}
	}
}
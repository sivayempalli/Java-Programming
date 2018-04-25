//writing String in file
import java.io.*;

class IoEx1{
	public static void main(String[] args){
		try{
			FileOutputStream fout = new FileOutputStream("Sample.txt");
			String s = "HELLOWORLD";

			//convert string into byte of each character
			byte[] b = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}

		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
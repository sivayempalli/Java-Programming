//BufferReader and BufferWriter
import java.io.*;
class IoEx4{
	public static void main(String[] args) {
		try{

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Sample.txt")));
		bw.write("Welcome To India");
		bw.close();


		//BufferedReader
		BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
		int d;

		//read() will take character by character
		while((d = br.read()) != -1){
			System.out.println((char)d);
		}
		br.close();
	    }
	    catch(Exception e){
	    	System.out.println(e.getMessage());
	    }
	}
}
import java.io.*;

class IoEx2{
	public static void main(String[] args) {
		int i;
		try{
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream("Sample.txt"));
			while((i = bin.read()) != -1){
				System.out.print((char)i);
			}
			bin.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
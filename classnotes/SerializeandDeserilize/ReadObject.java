import java.io.*;
public class ReadObject{
	public static void main(String[] args) {
		Address address;
		 try{
		 	FileInputStream fis = new FileInputStream("TestEx1.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    address = (Address)ois.readObject();
		    ois.close();

		    System.out.println(address);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
import java. io.*;
public class WriteObject{
	public static void main(String[] args) {
		
		//creating object
		Address address = new Address();
		address.setStreet("Kondapur");
		address.setCountry("India");
        try{
		  FileOutputStream fos = new FileOutputStream("TestEx1.ser");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(address);
		  oos.close();
		  System.out.println("done");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
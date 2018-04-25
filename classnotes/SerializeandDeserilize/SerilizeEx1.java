import java.io.*;

class SerilizeEx1{

	public static void main(String[] args) {
		Cat c = new Cat();
		try{
		   FileOutputStream fos = new FileOutputStream("Serialize.ser");
	       ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(c);
           oos.close();

           //deserilizable
           FileInputStream fis = new FileInputStream("Serialize.ser");
           ObjectInputStream ois = new ObjectInputStream(fis);
           c = (Cat)ois.readObject();
           System.out.println(c);
           ois.close();

        }

        catch(Exception e){
        	System.out.println(e.getMessage());
        }
    }

	 
}

class Cat implements Serializable{
	String name;
}
import java.io.*;
class IoEx3{
	public static void main(String[] args) {
		try
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("Sample.txt"));
            dos.writeInt(23);
            dos.writeChar('a');
            dos.writeDouble(23.23);
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("Sample.txt"));
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            dis.close();
		}

		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
  //client Ecample
import java.io.*;
import java.net.*;
class ClientEx1{
	public static void main(String[] args) {
	  try{
		Socket s = new Socket("127.0.0.1",3333);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str="",str1 = "";
		while(!(str.equals("stop"))){
			str1 = br.readLine();
			dos.writeUTF(str1);
			dos.flush();
            str = din.readUTF();
            System.out.println("Server say :"+str);
		}
         
         s.close();
         br.close();
       }catch(Exception e){
       	System.out.println(e.getMessage());
       }
	}
}
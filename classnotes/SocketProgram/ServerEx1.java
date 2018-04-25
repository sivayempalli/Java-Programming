//server example 

import java.io.*;
import java.net.*;
class ServerEx1{
	public static void main(String[] args) {
	  try{
        //creating socketserver which will listen request 
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
        //datainputstream will take input from Socket and send to Server  
		DataInputStream din = new DataInputStream(s.getInputStream());
		//dataoutputstream will take output from server and send socket
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		//server write from keyboard to say client
		//bufferreader reads character only
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = "",str2 = "";
        while(!(str1.equals("Stop"))){
        	str1 = din.readUTF();
        	System.out.println("client says : "+ str1);
            str2 = br.readLine();
            dos.writeUTF(str2);
            dos.flush();    
        }
        br.close();
        s.close();
        ss.close();   
       }catch(Exception e){
       	System.out.println(e.getMessage());
       }  
	}
}
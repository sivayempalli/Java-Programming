import java.io.*;
import java.net.*;
class UdpClientEx1{
	private final static int PACKETSIZE = 100 ; 
	public static void main(String[] args) {

		try{
		 DatagramSocket socket = new DatagramSocket();
		 //InetAddress address = InetAddress.getByName("www.ravindrababuravula.com");
		 InetAddress address = "127.0.0.1"
		 int port = 6336;
		 byte[] buffer = "Hello packet".getBytes();
		 DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,port);
		 socket.send(packet);
		 packet.setData(new byte[PACKETSIZE]);
		 socket.receive(packet);
		 System.out.println(new String (packet.getData()));
        }catch(Exception e){
        	System.out.println(e);  
        }
        //finally{
        //	if(socket != null){
        //		socket.close();
        //	}
        //}   

	}
}
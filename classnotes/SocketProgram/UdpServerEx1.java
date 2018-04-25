import java.io.*;
import java.net.*;
class UdpServerEx1{
	private final static int PACKETSIZE = 100 ; 
	public static void main(String[] args) {
		try {
			int port = 6336;
			DatagramSocket socket = new DatagramSocket(port);
			System.out.println("Server is Ready");

			//infinity loop
			for(;;){
				DatagramPacket packet = new DatagramPacket(new byte[PACKETSIZE],PACKETSIZE);
				socket.receive(packet);
				System.out.println( packet.getAddress() + " " + packet.getPort() + ""+new String(packet.getData())) ;
				String data = "Received Data";
				byte[] buffer = data.getBytes();
				DatagramPacket clientPacket = new DatagramPacket(buffer,buffer.length,packet.getAddress(),packet.getPort());
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}  
	}
}

package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UNPDNSClient {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientsocket = new DatagramSocket();
		InetAddress ipaddress;
		if(args.length==0)
			ipaddress=InetAddress.getLocalHost();
		else
			ipaddress=InetAddress.getByName(args[0]);
		byte[] senddata=new byte[1024];
		byte[] receivedata = new byte[1024];
		
		int portaddr=1362;
		System.out.println("Enter the hostname: ");
		String sentence = br.readLine();
		senddata = sentence.getBytes();
		DatagramPacket pack = new DatagramPacket(senddata, senddata.length,ipaddress,portaddr);
		clientsocket.send(pack);
		DatagramPacket recvpack = new DatagramPacket(receivedata,receivedata.length);
		clientsocket.receive(recvpack);
		String modified=new String(recvpack.getData());
		System.out.println("IP Address: "+modified);
		clientsocket.close();
	}
}

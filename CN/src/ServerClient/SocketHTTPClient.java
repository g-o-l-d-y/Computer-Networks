package ServerClient;

import java.io.*;
import java.net.*;

public class SocketHTTPClient {
	
	public static void main(String args[]) throws IOException
	{
		String hostName="www.geeksforgeeks.org";
		int portNumber=80;
		
		try
		{
			Socket socket=new Socket(hostName,portNumber);
			PrintWriter out= new PrintWriter(socket.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String inputLine;
			while((inputLine=in.readLine())!=null)
			{
				System.out.println(inputLine);
			}
		}
		catch(UnknownHostException e)
		{
			System.out.println("Don't know about host "+e);
			System.exit(1);
		}
	}
	
}

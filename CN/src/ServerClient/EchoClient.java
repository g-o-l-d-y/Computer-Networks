package ServerClient;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String [] args) throws IOException
	{
		try
		{
			Socket socket=new Socket("127.0.0.1",8070);
			PrintWriter out= new PrintWriter(socket.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader con = new BufferedReader(new InputStreamReader(System.in)); 
			String line;
			 do
			 { 
				 line = in.readLine();
				 if ( line != null )
					 System.out.println(line);
				 line = con.readLine();
				 out.println(line); 
			 }while ( !line.trim().equals("bye") );

		}
		catch(UnknownHostException e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
}

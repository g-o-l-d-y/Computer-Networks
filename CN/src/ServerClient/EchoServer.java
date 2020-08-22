package ServerClient;

import java.io.*;
import java.net.*;

public class EchoServer {
	
	ServerSocket server;
	
	public EchoServer(int portNumber)
	{
		try
		{
			server = new ServerSocket(portNumber);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void serve() throws IOException
	{
			while(true)
			{
				Socket client=server.accept();
				BufferedReader r=new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter w= new PrintWriter(client.getOutputStream(),true);
				
				w.println("Welcome to the Java EchoServer. Type 'bye' to close."); 
				
				String line;
				do
				{
					line = r.readLine(); 
					if ( line != null ) 
						w.println("Got: "+ line); 
					System.out.println (line); 
				}while(!line.trim().equals("bye"));
				client.close();
			}
	}
	
	public static void main(String [] args) throws IOException
	{
		EchoServer e=new EchoServer(8070);
		e.serve();
	}

}

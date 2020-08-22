package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String [] args) throws IOException
	{
		ServerSocket ss=new ServerSocket(2000);
		Socket sk=ss.accept();
		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream cout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while(true)
		{
			s=cin.readLine();
			if(s.equalsIgnoreCase("END"))
			{
				cout.println("BYE");
				break;
			}
		
			System.out.println("Client: "+s);
			System.out.print("Server: ");
			s=stdin.readLine();
			cout.println(s);
		}
		ss.close();
		sk.close();
		cin.close();
		cout.close();
		stdin.close();
	}
	
}

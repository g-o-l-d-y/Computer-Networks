package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String [] args) throws IOException
	{
		
		Socket sk=new Socket("127.0.0.1",2000);
		BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream sout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

		String s;
		while(true)
		{
			System.out.print("Client: ");
			s=stdin.readLine();
			sout.println(s);
			s=sin.readLine();
			System.out.println("Server: "+s);
			if(s.equalsIgnoreCase("BYE"))
				break;
		}
		sk.close();
		sin.close();
		sout.close();
		stdin.close();
	}
}

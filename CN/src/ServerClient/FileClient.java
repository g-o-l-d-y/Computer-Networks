package ServerClient;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class FileClient {
	
	public static void main(String args[]) throws IOException
	{
		Socket socket=new Socket(InetAddress.getByName("localhost"),5000);
		byte[] contents = new byte[10000];
		FileOutputStream fos=new FileOutputStream("D:\\nppfiles\\sample1.html");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		InputStream is=socket.getInputStream();
		int bytesRead=0;
		while((bytesRead=is.read(contents))!=-1)
			bos.write(contents,0,bytesRead);
		bos.flush();
		socket.close();
		System.out.println("file saved successfully");
	}
}

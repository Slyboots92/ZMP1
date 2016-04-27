package lesson2server;
import java.io.*;
import java.net.*;

class TCPClient {
	
	public void connect() throws UnknownHostException, IOException{
		Socket clientSocket = new Socket("localhost", 6789);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		outToServer.writeBytes("hello" + "\n");
		clientSocket.close();
	}
		
}
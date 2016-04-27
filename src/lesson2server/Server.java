package lesson2server;
import java.io.*;
import java.net.*;

class TCPServer {
	String clientSentence;
	String capitalizedSentence;
	ServerSocket welcomeSocket ;

	public TCPServer() throws IOException {
		welcomeSocket = new ServerSocket(6789);
	}

	public void start() throws IOException {
		System.out.println("serwer wystartowal ");
		while (true) {
			Socket connectionSocket = welcomeSocket.accept();
			System.out.println("polaczono");
			BufferedReader in = new 
					BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		
			System.out.println(in.readLine()); // Read one line and output it

			System.out.print("'\n");
			in.close();
		}

	}
}

package lesson2server;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		TCPServer server = new TCPServer();
		server.start();
	}

}

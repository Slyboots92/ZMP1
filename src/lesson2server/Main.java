package lesson2server;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		TCPClient client = new TCPClient();
		client.connect();
		
	}

}

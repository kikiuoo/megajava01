package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		// localhost 내 자리
		System.out.println("TCP client-1 전화함.");
	}

}

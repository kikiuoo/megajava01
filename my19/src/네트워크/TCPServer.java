package 네트워크; 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//1. 승인만을 담당하는 소켓(전화기1)이 있어야 한다.
		//2. 연결요청이 들어오면 승인을 하게 된다.
		//3. 승인한 후, 데이터 전송용 소켓(전화기2)이 별도로 만들어진다.
		
	ServerSocket server = new ServerSocket(9100);
	//TCP서버는 승인용, 전달용 전화기가 있어야 한다. ServerSocket
	
	while (true) {
		System.out.println("전화오기를 기다리는중...");
		Socket soket= server. accept();
		System.out.println("전화승인 ok...");
		
	}
	}

}

package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		// UDP는 전송할 데이터+IP+port 믂어서 보내줘야 한다.
		String str = "I am a java grogrammer..!";
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		int port = 7000;
		byte[] data = str.getBytes(); // 스트링을 보낼 수 있는 크기나 형태로 바꿔준다. 바이트로 보내야한다.
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
		socket.send(packet);
		socket.close();
	}

}

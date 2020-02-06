package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//받을 준비가 되어있어야 실행된다. //receiver를 먼저 실행해야한다.
		
		DatagramSocket socket = new DatagramSocket(7000);	//UDP는 datagramsocket을 사용한다.
		System.out.println("받는 쪽 소켓 시작함.");
		System.out.println("받을 준비 끝.");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//받을 준비를 하고 있다가 받아주는 메소드
		socket.receive(packet);
		String str = new String(data);
		System.out.println("받은 데이터: " + str);
		socket.close();		

	}

}

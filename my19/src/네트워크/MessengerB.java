package 네트워크;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame {
	private JTextField input; // 요 아래서는 다 쓸수 있는것임.
	private JTextArea list;
	DatagramSocket socket; // 전화기만들기
	// 전역변수가 된다: 클래스 안에 전체 다 쓸 수 있는 변수
	// 변수가 생성되는 위치가 사용할 수 있는 범위다.
	// 변수를 선언할 때 변수가 생성된다.
	// 변수의 선언의 위치가 사용할 수 있는 범위이다.

	public MessengerB() throws Exception {
		socket = new DatagramSocket(6000); // 수신용 전화기로 쓰자 받을 때 번호는 필요없으니까??

		setTitle("메신저 B");
		
		list = new JTextArea();
		getContentPane().setLayout(new BorderLayout(0, 0));
		list.setEditable(false);
		list.setRows(10);
		list.setFont(new Font("Monospaced", Font.PLAIN, 30));
		list.setBackground(Color.ORANGE);
		getContentPane().add(list);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// actionPerformed는 인터페이스에서 만들어진거라 고칠수가 없음. - 에러처리할때 던질수 없음 그래서 try 처리...
				// 1. 입력한 값을 가지고 온다.
				String str = input.getText();
				// ** 전송용 전화기와
				// 수신용 전화기를 따로따로 만들어주어야 함.
				try {
					DatagramSocket socket = new DatagramSocket();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					int port = 5000; //상대방포트
					byte[] data = str.getBytes();
					DatagramPacket packet = new DatagramPacket(data, data.length);
					list.append("나>>" + str + "\n");
					input.setText("");
					socket.send(packet);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				// 2.패킷을 만들어서 전송
				// 2-1.byte 배열로 바꾸어 준다.
				// 2-2.패킷에 들어갈 IP와 포트를 지정
				// 2-3.소켓으로 패킷을 보낸다.
				// 3.소켓을 close.
			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 30));
		input.setBackground(Color.YELLOW);
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);
		pack(); // 내가 설정한 설정값대로 잡은 크기대로 자동으로 만들어 줘라!!!
		setVisible(true);

	}

	public void process() throws Exception {
		while (true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			String str = new String(data);
			list.append("너>> " + str + "\n");
		}
	}

	public static void main(String[] args) throws Exception { // 1.생성자 메인이 스테텍이면 별로 안좋아서
		MessengerB m = new MessengerB();
		m.process();
	}
}

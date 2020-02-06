package 스레드;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 스레드.멀티스레드.CountThread;

import java.awt.Font;

public class 연습 extends JFrame {
	JLabel count = new JLabel("카운트다운");
	JLabel img = new JLabel();
	JLabel img2 = new JLabel();
	private JTextField a;
	private JTextField b;
	
	public 연습() {
			setTitle("연습");
			setSize(300, 282);
			getContentPane().setLayout(null);
			
			a = new JTextField();
			a.setText("1");
			a.setFont(new Font("굴림", Font.PLAIN, 60));
			a.setBounds(73, 57, 71, 111);
			getContentPane().add(a);
			a.setColumns(10);
			
			b = new JTextField();
			b.setText("2");
			b.setFont(new Font("굴림", Font.PLAIN, 60));
			b.setColumns(10);
			b.setBounds(154, 57, 71, 111);
			getContentPane().add(b);
		
			
			
			
			setVisible(true);
			
		
	}
	public static void main(String[] args) {
		연습 t = new 연습();

	}
}

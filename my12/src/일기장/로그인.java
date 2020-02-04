package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my12\\일기장.jpg"));
		lblNewLabel.setBounds(12, 10, 460, 197);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("I D :");
		lblId.setFont(new Font("굴림", Font.BOLD, 50));
		lblId.setBounds(41, 217, 115, 36);
		f.getContentPane().add(lblId);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setBounds(178, 217, 227, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setFont(new Font("굴림", Font.BOLD, 50));
		lblPw.setBounds(41, 263, 123, 36);
		f.getContentPane().add(lblPw);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setBounds(178, 270, 227, 36);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText(); //값을 가져오는 메소드. String으로 리턴 된 것임
				String pw = t2.getText(); 
				if (id.equals("root") && pw.equals("1234")) {//.equals 똑같니? 비교면 무조건 boolean / && 두개다 맞아야할때
					//ture 맞으면 ->일기쓰러감-> 일기장 화면을 다시 만들어야 함. 일기장화면을 만들고 그걸 여기다가 끼워야 함. 코드를 변경해야함.메인고쳐주기 void로
					//=> diary() 필요하다
					//1. diary기능을 쓸수 있는 메소드를 복사해서 와야함.
					일기쓰기 today = new 일기쓰기();
					today.diary();
					// diary()메소드를 쓰고 싶으면,
					// 이 메소드를 쓸 수 있는 주소를 가진 변수만 있으면 된다.
					
				} else {
					//경고메세지
					JOptionPane.showMessageDialog(null, "id, pw입력이 잘못되었습니다.");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my12\\체크.png"));
		btnNewButton.setBounds(75, 332, 115, 106);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id, pw를 공백으로 초기화 하기
				t1.setText("");
				t2.setText("");
			}
		});
		button.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my12\\리셋.png"));
		button.setBounds(274, 332, 123, 106);
		f.getContentPane().add(button);
		f.setTitle("나의 일기장"); //생성자로 사용하는 방법이 있음. 객체가 만들어지면서 자동으로 생성하는것. 내일 할 예정임
		f.setSize(500, 520);
		f.setVisible(true);
		
		
	}
}

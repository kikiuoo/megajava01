package 일기장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	public void diary() {// 두번쨰로 실행되는 것을 main으로 해서 디자인을 만들고 ->void로 바꿔줘야 함. void일때는 디자인 못들어감.
	JFrame	f = new JFrame();
	f.getContentPane().setBackground(new Color(135, 206, 235));
	f.setTitle("일기쓰기 창");
	f.setSize(600, 600);
	f.getContentPane().setLayout(null);
	
	t1 = new JTextField();
	t1.setBackground(new Color(224, 255, 255));
	t1.setFont(new Font("굴림", Font.BOLD, 20));
	t1.setBounds(236, 64, 295, 43);
	f.getContentPane().add(t1);
	t1.setColumns(10);
	
	JTextArea t3 = new JTextArea();
	t3.setBackground(new Color(224, 255, 255));
	t3.setFont(new Font("Monospaced", Font.BOLD, 15));
	t3.setColumns(20);
	t3.setRows(5);
	t3.setBounds(236, 201, 295, 194);
	f.getContentPane().add(t3);
	
	t2 = new JTextField();
	t2.setFont(new Font("굴림", Font.BOLD, 20));
	t2.setColumns(10);
	t2.setBackground(new Color(224, 255, 255));
	t2.setBounds(236, 125, 295, 43);
	f.getContentPane().add(t2);
	
	JLabel lblNewLabel = new JLabel("오늘의 날짜");
	lblNewLabel.setFont(new Font("HY강M", Font.BOLD, 24));
	lblNewLabel.setBounds(23, 64, 170, 43);
	f.getContentPane().add(lblNewLabel);
	
	JLabel label = new JLabel("오늘의 제목");
	label.setFont(new Font("HY강M", Font.BOLD, 24));
	label.setBounds(23, 125, 170, 43);
	f.getContentPane().add(label);
	
	JLabel label_1 = new JLabel("오늘의 내용");
	label_1.setFont(new Font("HY강M", Font.BOLD, 24));
	label_1.setBounds(23, 191, 170, 43);
	f.getContentPane().add(label_1);
	
	JButton btnNewButton = new JButton("파일에 일기저장");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//1. 입력한값들 가지고 오기
			String day = t1.getText();
			String title = t2.getText();
			String content = t3.getText();
			//2. 파일에 저장하기
			try {// 아래꺼 시도하다가 오류나면 잡아 -> 그래서 ~하게 처리해
				FileWriter f = new FileWriter(day + ".txt"); //filewriter
				f.write(title +"\n");
				f.write(content +"\n");
				f.close(); // 내용 다 썼다
				JOptionPane.showMessageDialog(null, "저장완료!! 내일 또 만나요.");
			} catch (IOException e1) {
				System.out.println("파일저장 중 에러가 생김.");				
			}
			//3. 확인메시지 뿌리기			 
		}
	});
	btnNewButton.setBounds(152, 467, 190, 43);
	f.getContentPane().add(btnNewButton);
	f.setVisible(true);
	
	}
}

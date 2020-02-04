package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);// .(점)연산자라고 부른다 : 접근연산자(~에)
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(47, 74, 84, 66);
		f.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBounds(47, 191, 84, 66);
		f.getContentPane().add(label);

		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림", Font.BOLD, 40));
		label_1.setBounds(47, 306, 84, 66);
		f.getContentPane().add(label_1);

		name = new JTextField();
		name.setBackground(Color.ORANGE);
		name.setFont(new Font("굴림", Font.BOLD, 40));
		name.setBounds(162, 81, 153, 52);
		f.getContentPane().add(name);
		name.setColumns(10);

		age = new JTextField();
		age.setFont(new Font("굴림", Font.BOLD, 40));
		age.setColumns(10);
		age.setBackground(Color.ORANGE);
		age.setBounds(162, 198, 153, 52);
		f.getContentPane().add(age);

		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.BOLD, 40));
		shoe.setColumns(10);
		shoe.setBackground(Color.ORANGE);
		shoe.setBounds(162, 313, 153, 52);
		f.getContentPane().add(shoe);

		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText(); //name에서 text를 가져와서  n에다 넣는다.
				if(n.equals("") || n.equals("다시입력")) {
					// 대문자로 시작하는건 하나의 부품이다. 부품은 각각의 명령어르 가지고 있다. 그래서   
					name.setText("다시입력");
				} else {	
					System.out.println("이름 출력: " + n + "님");
				}
		
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(339, 78, 133, 59);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText(); 
				// 내년나이를 구해서, "나이출력" 아래다 넣어보세요.
				// 숫자로 변환을 해야 연산을 할 수 있어서 변환해주기
				int a2 = Integer.parseInt(a); 
				int nextYear = a2 + 1;
				System.out.println("나이 출력: "+ a + "세");
				System.out.println("나이 출력: "+ nextYear + "세");

			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 40));
		button.setBackground(Color.MAGENTA);
		button.setBounds(339, 198, 133, 59);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText(); 
				System.out.println("신발사이즈 출력: "+ s + "mm");
				System.out.println(" ");

			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 40));
		button_1.setBackground(Color.MAGENTA);
		button_1.setBounds(339, 306, 133, 59);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("모두출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText(); 
				String s = shoe.getText(); 
				System.out.println("모두출력 ");
				System.out.println("-----");
				System.out.println("이름 출력: " + n + "님");
				System.out.println("나이 출력: "+ a + "세");
				System.out.println("신발사이즈 출력: "+ s + "mm");

			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 40));
		button_2.setBackground(Color.MAGENTA);
		button_2.setBounds(115, 382, 271, 59);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("개인정보");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1.setBounds(135, 17, 212, 54);
		f.getContentPane().add(lblNewLabel_1);
		// ( =>입력값의 의미가 있다.

		f.setVisible(true);// 이건 무조건 맨 아래 있어야 함. 그래야 이 전까지 입력된 것이 보일 수 있음.

	}
}

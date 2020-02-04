package 계산기; // 곱하기, 나누기 다시하기

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(465, 436);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my07\\cal.png"));
		lblNewLabel.setBounds(116, 10, 139, 69);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1 :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 89, 83, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2 :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(22, 138, 83, 29);
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(96, 85, 199, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(96, 128, 199, 41);
		f.getContentPane().add(t2);
		
		JButton button = new JButton("더하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 숫자1 + 숫자2 해서 결과하면에 도출되게 하기
				//1. t1, t2의 입력값을 가지고 온다.
				//2. t1, t2의 타입을 계산해 주기 위해서 int나 다른거로 변환한다.
				//3. 두 수를 더한다.
				//4. 더한 결과를 result 에 넣어준다. 
				//  결과값 : "300" 이 찍히게 한다.
				// 숫자만 찍히게 하고 싶을 때는  String s = String.valueOf();
				//                    result.setText();
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11); // int로 바꿀지 double로 바꿀지는 내가 정하는 것임.
				int t222 = Integer.parseInt(t22);
				int t = t111 + t222;
				result.setText("결과값 : " + t);
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 18));
		button.setBounds(8, 202, 97, 50);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("빼기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				int t = t111 - t222;
				result.setText("결과값 : " + t);


			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 18));
		button_1.setBounds(115, 202, 97, 50);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("곱하기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t11 = t1.getText();
				String t22 = t2.getText();
				double t111 = Double.parseDouble(t11);
				double t222 = Double.parseDouble(t22);
				double t = t111 * t222;		
				String t2 = String.valueOf(t);
				result.setText(t2);
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 18));
		button_2.setBounds(222, 202, 97, 50);
		f.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("나누기");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				int t = t111 / t222;
				result.setText("결과값 : " + t);
			}
		});
		button_3.setFont(new Font("굴림", Font.BOLD, 18));
		button_3.setBounds(331, 202, 97, 50);
		f.getContentPane().add(button_3);
		
		JLabel lblNewLabel_2 = new JLabel("결과화면");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_2.setBounds(24, 311, 188, 34);
		f.getContentPane().add(lblNewLabel_2);
		
		result = new JTextField();
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setColumns(10);
		result.setBackground(Color.PINK);
		result.setBounds(211, 312, 199, 41);
		f.getContentPane().add(result);
		
		
		
		
		f.setVisible(true);

	}

}

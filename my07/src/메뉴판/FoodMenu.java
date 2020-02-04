package 메뉴판;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodMenu {
	static int 짜장 = 0; //주문수 카운트
	// 여기다가 해 놓은 이유 아무데서나 쓰려고 = 선언의 위치가 변수를 사용할 수 있는 범위가 된다. 자기를 포함하고 있는 {괄호를 찾으면 된다.
	// class 전체 영역에서 쓸 수 있는 변수 : 전역번수라고 부른다.
	static int 짬뽕 = 0; //주문수 카운트
	static int 우동 = 0; //주문수 카운트
	static int count = 0; //주문수 카운트
	static int sum = 0; //전체금액계산
	
	private static JTextField t2;
	private static JTextField t1;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 지역변수라고 부른다. main 안에서만 작용한다.
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500,500);	
		f.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("지불할 총 금액");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(27, 421, 154, 30);
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setBounds(193, 421, 239, 28);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setColumns(10);
		t1.setBounds(354, 20, 107, 30);
		f.getContentPane().add(t1);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my07\\1.jpg"));
		img.setBounds(23, 85, 438, 307);
		f.getContentPane().add(img);
		
		JLabel j = new JLabel(""); //JLabel j  이 부분이 중요하다. 선언한 부분  이 부분이 버튼 위에 있어야 한다.   
		JLabel ja = new JLabel("");
		JLabel w = new JLabel("");

		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++; //증감연산자  : 한번누르면 하나씩 크게
				t1.setText(count + "개"); // t1에 넣는다.
				sum = count * 6000; 
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("짜장.jpg");
				img.setIcon(icon);
				
				짜장++;
				j.setText(짜장 + "개");
				
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(12, 10, 97, 40);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("짬뽕");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("짬뽕.jpg"); 
				img.setIcon(icon);
				
				짬뽕++;
				ja.setText(짬뽕 + "개");
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 20));
		button.setBackground(Color.PINK);
		button.setBounds(121, 10, 97, 40);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("우동");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				//우동그림을 img라벨에  icon으로 집어 넣어야 함.
				//icon 부품을 만들어야 함. 
				ImageIcon icon = new ImageIcon("우동.jpg");
				// 우동아이콘을 만든거임.우동.jpg가 오면 이미지아이콘으로 인식하도록 각각 부품을 만들어 줘야 인식함.
				img.setIcon(icon);
				//부품을 써야하는건지   ==>>확인하기
				//개발자들에게는 순사가 매우 중요함.
				
				우동++;
				w.setText(우동 + "개");
				
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 20));
		button_1.setBackground(Color.PINK);
		button_1.setBounds(233, 10, 97, 40);
		f.getContentPane().add(button_1);
		
		j.setBounds(27, 60, 57, 15);
		f.getContentPane().add(j);
		
	
		ja.setBounds(131, 60, 57, 15);
		f.getContentPane().add(ja);
		
		w.setBounds(243, 60, 57, 15);
		f.getContentPane().add(w);
		f.setVisible(true);	
	
	}

}

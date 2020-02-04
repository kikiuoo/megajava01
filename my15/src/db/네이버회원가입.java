package db;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setFont(new Font("Constantia", Font.PLAIN, 35));
		f.getContentPane().setBackground(new Color(154, 205, 50));
		f.setSize(500, 560);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my15\\naver.png"));
		lblNewLabel.setBounds(131, 20, 222, 61);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(34, 113, 100, 38);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("Constantia", Font.PLAIN, 35));
		lblPw.setBounds(34, 195, 100, 31);
		f.getContentPane().add(lblPw);

		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Constantia", Font.PLAIN, 35));
		lblName.setBounds(34, 268, 122, 40);
		f.getContentPane().add(lblName);

		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("Constantia", Font.PLAIN, 35));
		lblTel.setBounds(34, 346, 100, 38);
		f.getContentPane().add(lblTel);

		t1 = new JTextField();
		t1.setFont(new Font("Constantia", Font.PLAIN, 35));
		t1.setBounds(199, 110, 215, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("Constantia", Font.PLAIN, 35));
		t2.setColumns(10);
		t2.setBounds(199, 183, 215, 44);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("Constantia", Font.PLAIN, 35));
		t3.setColumns(10);
		t3.setBounds(199, 266, 215, 44);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("Constantia", Font.PLAIN, 35));
		t4.setColumns(10);
		t4.setBounds(199, 343, 215, 44);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("회원가입완료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				// 입력한 값 가지고 와야함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				// db처리 4단계
				try {
					// 1. 커넥터설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터설정성공...");

					// 2. DB연결
					String url = "jdbc:mysql://localhost:3307/shoes";
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결성공...");

					// 3. SQL문을 만든다.
					String sql = "insert into member values(?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel);
					// 1번 물음표를 1번 자리에 맵핑해라
					System.out.println("3. SQL만들기성공...");

					// 4. SQL문을 mySQL프로그램에 전송.
					ps.executeUpdate();
					System.out.println("4. SQL문 전송성공...");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("한컴 솔잎 M", Font.BOLD, 37));
		btnNewButton.setBounds(73, 394, 323, 44);
		f.getContentPane().add(btnNewButton);
		
		JButton t5 = new JButton("회원탈퇴처리");
		t5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				try {
					// 1. 커넥터설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터설정성공...");

					// 2. DB연결
					String url = "jdbc:mysql://localhost:3307/shoes";
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결성공...");

					//3. SQL문을 만든다.
					String sql = "delete from member where id = ?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					//1번 물음표를 1번 자리에 맵핑해라
					System.out.println("3. SQL만들기성공...");

					// 4. SQL문을 mySQL프로그램에 전송.
					ps.executeUpdate();
					System.out.println("4. SQL문 전송성공...");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		t5.setFont(new Font("한컴 솔잎 M", Font.BOLD, 37));
		t5.setBounds(73, 450, 323, 44);
		f.getContentPane().add(t5);
		f.setVisible(true);

	}
}

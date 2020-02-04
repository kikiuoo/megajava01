package 크롤링;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링4 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(32, 178, 170));
		f.setSize(350, 458);
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(67, 178, 195, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JTextArea t2 = new JTextArea();
		t2.setBounds(60, 268, 216, 128);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("KT&G");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("033780");
			}
		});
		btnNewButton.setBounds(42, 10, 105, 41);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("현대차");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005380");
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 18));
		button.setBackground(Color.YELLOW);
		button.setBounds(42, 70, 109, 47);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("셀트리온");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("068270");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 18));
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(163, 70, 109, 47);
		f.getContentPane().add(button_1);

		JButton btnNewButton_1 = new JButton("크롤링시작");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // actionPerformed 이건 내맘대로 변경할수 없다.
				// 1.코드값을 가지고 온다.
				String code = t1.getText();
				// 2.그 코드값으로 크롤링한다.
				try {
					String site = "https://finance.naver.com/item/main.nhn?code=";
					Connection con = Jsoup.connect(site + code);
					Document doc = con.get();
					String date = doc.select("em.date").text();
					//장마감을 짤라보자!
					String date2 = date.substring(0, 10); 
					//0~9번까지의 인덱스를 말한다. //substring : string에서 부분적으로 가져오고 싶을 때
					String today = doc.select("span.blind").get(12).text();					
					String yesterday = doc.select("span.blind").get(15).text();					
					String high = doc.select("span.blind").get(16).text();
					t2.setText(""); //누르면 공백으로 지워주는것
					t2.append("날짜: " + date + "\n");
					t2.append("오늘: " + today + "\n");
					t2.append("어제: " + yesterday + "\n");
					t2.append("최고: " + high + "\n");
					//append 는 계속 이어서 붙여주는것
					
				} catch (Exception e2) {
					System.out.println("에러발생!!"); // 에러가 발생했을 떄 뭐라고 할건지 해도되고 안해도됨.
				}
				// 3.가져온 크롤링 값을 화면에 넣는다.

			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(67, 217, 195, 41);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("CODE :");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 33));
		lblNewLabel.setBounds(96, 127, 135, 41);
		f.getContentPane().add(lblNewLabel);

		JButton button_2 = new JButton("삼성전자");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005930");
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 18));
		button_2.setBackground(Color.YELLOW);
		button_2.setBounds(159, 10, 112, 41);
		f.getContentPane().add(button_2);
		f.setVisible(true);

	}
}

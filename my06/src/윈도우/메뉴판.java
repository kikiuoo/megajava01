package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	static int count = 10; // 도너츠의 갯수

	public static void main(String[] args) {
		// 큰 프레임을 만들어야 함.
		JFrame f = new JFrame();

		// 프레임의 크기를 결정해야함.
		f.setSize(375, 307);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\학생방\\leebbr\\my06\\do.png"));
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "도너츠더하기");

				count++;
				System.out.println("도너츠의 개수는 " + count + "개");
				f.setTitle("도너츠의 개수: " + count + "개");
			}
		});
		button.setFont(new Font("안상수2006굵은", Font.PLAIN, 60));
		button.setBackground(Color.GREEN);
		f.getContentPane().add(button, BorderLayout.EAST);

		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, "도너츠빼기");
				if (count != 0) {
					count--;
					System.out.println("도너츠의 개수는 " + count + "개");
					f.setTitle("도너츠의 개수: " + count + "개");

				} else {
					f.setTitle("더이상 뺄 수 없음");
				}
			}
		});
		button_1.setFont(new Font("안상수2006굵은", Font.PLAIN, 60));
		button_1.setBackground(Color.MAGENTA);
		f.getContentPane().add(button_1, BorderLayout.WEST);

		// 프레임을 보여지게 설정해야함.
		f.setVisible(true);

	}

}

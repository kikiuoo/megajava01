package 윈도우;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300); //프레임 만드는 것
		
		JButton btnNewButton = new JButton("가위");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//버튼을 더블 클릭했을 때 처리내용
				JOptionPane.showMessageDialog(null, "가위를 누르셨군요");
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("보");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "보를 누르셨군요");
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("바위");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "바위를 누르셨군요");
			}
		});
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton_2.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		
		
		
		
		
		
	
		
		f.setVisible(true); 
	}

}

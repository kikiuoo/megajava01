package 배열심화;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼500개만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setVisible(true);
		// 붙이는 순서대로 뒤에 붙여주는 class
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int j = 0; j < 500; j++) {
			JButton b1 = new JButton("자리" + j);
			f.add(b1);
		}
		f.setVisible(true);
	}

}

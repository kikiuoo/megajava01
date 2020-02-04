package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {
		// 그래픽 부품(class) 사용해서 화면을 띄워봅시다!
		JFrame f = new JFrame();
		f.setSize(800, 800); //-> f를 복사해 왔다 그리고  f에서 필요한 걸 쓰는것이. 이다
	
		JButton b = new JButton(); //JButton : 버튼을 만드는 부품
		b.setForeground(Color.PINK);
		b.setFont(new Font("HY동녘B", Font.BOLD | Font.ITALIC, 61));
		b.setBackground(Color.YELLOW);
		b.setText("나를 눌러요.");		
		f.getContentPane().add(b); //프레임에 b라는 버튼을 올려줘
		
		
		
		
		f.setVisible(true); // setvisible 은 맨 아래에 있어야 함.

	}

}

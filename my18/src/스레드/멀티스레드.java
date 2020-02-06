package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;

public class 멀티스레드 extends JFrame {
	JLabel count = new JLabel("카운트 시작");
	JLabel img = new JLabel("");
	JLabel now = new JLabel("3");

	public 멀티스레드() { //생성자 "멀티스레드"
		getContentPane().setBackground(new Color(107, 142, 35));
		setTitle("멀티스레드");
		setSize(800, 300);
		getContentPane().setLayout(null);

		count.setFont(new Font("굴림", Font.PLAIN, 31));
		count.setBounds(26, 31, 322, 47);
		getContentPane().add(count); //형변환 캐스팅이 들어간 부분임.

		img.setFont(new Font("굴림", Font.PLAIN, 24));
		img.setBounds(500, 25, 203, 116);
		getContentPane().add(img);//형변환 캐스팅이 들어간 부분임.

		now.setFont(new Font("굴림", Font.PLAIN, 24));
		now.setBounds(28, 180, 720, 52);
		getContentPane().add(now);//형변환 캐스팅이 들어간 부분임.

		CountThread c = new CountThread();
		c.start();
		ImgThread img = new ImgThread(); 
		img.start();
		NowThread n = new NowThread(); 
		n.start();

		setVisible(true);// 항상 setVisible은 맨 끝에 오게해야 된다.
	}

	// 내부클래스(inner class)
	// 전역변수를 공유해서 사용해야 하는경우
	// 이 클래스는 독립적으로 사용 안된다.
	// 멀티스레드 안에서만 쓸 수 있는 특별한 클래스이다.
	// 그렇게 좋은 건아니지만 공유해야하기 떄문에 어쩔 수 없다.
	class CountThread extends Thread {//동시에 동작을 실행시켜주고 싶으면 상속받아서 스레드를 실행한다.
		public void run() {
			for (int i = 500; i >= 0; i--) {
				try {//네트워크 연결을 할 때는 항상 오류체크해주어야 한다.
					Thread.sleep(1000);//천천히 돌아가게 하는것임. = 1초씩 재우는것임.
				} catch (Exception e) {
				}
				count.setText("카운트: " + i);
			}//for
		}//run
	}//inner class
	
	class ImgThread extends Thread {
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		public void run() {
			for (int i = 0; i < list.length; i++) {
				try {
					Thread.sleep(3000);//천천히 돌아가게 하는것임. = 1초씩 재우는것임.
				} catch (Exception e) {
				}
				ImageIcon icon = new ImageIcon(list[i]); // 이미지로 인식하게 하는거
				img.setIcon(icon); //이미지를 넣어주는거				
			}//for
		}//run
	}//inner class
	
	class NowThread extends Thread {
		public void run() {
			for (int i = 0; i < 500; i++) {
				try {
					Thread.sleep(1000);//천천히 돌아가게 하는것임. = 1초씩 재우는것임. 1초에 1000
				} catch (Exception e) {
				}
				Date date = new Date(); //date 현재 날짜와 시간을 구해준다.
				now.setText(date+"");
			}//for
		}//run
	}//inner class

	public static void main(String[] args) {
		멀티스레드 multi = new 멀티스레드();
	}
}

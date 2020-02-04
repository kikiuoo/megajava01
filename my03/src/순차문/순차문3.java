package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		 //입력
		 String data = JOptionPane.showInputDialog("현재 온도는");
		 
		 // 모든 외부 입력은 타입이 String!
		 // String을 그대로 쓸지 숫자로 변환해서 쓸지는 프로그래머가 결정하지만
		 // String --> int  : Integer.parseInt 분석해서 가능하면 int로 바꿔줘 볼게
		 
		 int now = Integer.parseInt(data);
		 
		 // 처리
		 int back = now - 1;
		 
		 // 출력
		 System.out.println("집에 갈 때의 온도는 " + back + "도");
				

	    
	    
	}

}

package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		
		//입력
		 String data1 = JOptionPane.showInputDialog("숫자입력1");
		 String data2 = JOptionPane.showInputDialog("숫자입력2");
		 
		 int n1 = Integer.parseInt(data1);
		 int n2 = Integer.parseInt(data2);
		 
		 //처리
		 int result = n1 + n2;
		 
		 //출력
		 System.out.println(n1 + " + " + n2 + " = " + result);
		   
	} // main end. - 항상 주석을 다는 습관을 들이자.
} // class end.w

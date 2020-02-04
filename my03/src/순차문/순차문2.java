package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		
	    String a = JOptionPane.showInputDialog("소속");
	    String b = JOptionPane.showInputDialog("이름");
	    
	    String c = b + "은 " + a + "입니다." ;

	    JOptionPane.showMessageDialog(null, c);

	}

}

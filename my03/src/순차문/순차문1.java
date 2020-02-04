package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 입력 --> 처리--> 출력
		
		// 1. 입력 : 오늘의 날씨는? 이걸 입력할 수 있는 콘솔을 나오게 하자
		// 무건가 저장할 때 잘 모르겠다면 무조건 String으로 저장해 주자
		// JOptionPane 은 부품이다		
	    String data = JOptionPane.showInputDialog("오늘의 날씨는? ");
	    
		// 2. 처리 : 비 => 비가 오는 날에는 우산을 챙겨요
	    String result = data + "가 오는 날에는 우산을 챙겨요";
	    
		// 3. 출력
	    // System.out.println(result);
	    // 모니터             .에 프린트 해주고 라인을 찍어줘 => 모니터에만 나오게 할때
	     JOptionPane.showMessageDialog(null, result);
	    //       보여주세요 메세지 찍을 다이얼로그 => 창으로 뜨게 해줄 떄

   
	}

}

package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {
	
		// 지금은 몇시인가요?
		// 몇시인지를 알려주는 부품(class)가 필요함.
		Date date = new Date();
		int day = date.getDay();
		// swihch 문은 간단하지만 수동으로  break해주어야 한다.
		// 그리고 실수가 올 수 없다.
		// 그리고 21억이상 홍이라는 것도 올 수 없다.
		
		switch(day) {
		case 0: System.out.println("일"); break;
		case 1: System.out.println("월"); break;
		case 2: System.out.println("화"); break;
		case 3: System.out.println("수"); break;
		case 4: System.out.println("목"); break;
		case 5: System.out.println("금"); break;
		case 6: System.out.println("토"); break;
		
		}

	}//main end

}//class end

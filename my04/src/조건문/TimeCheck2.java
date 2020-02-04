package 조건문;

import java.util.Date;

public class TimeCheck2 {

	public static void main(String[] args) {
		// 한줄삭제 : 컨트롤+d
		// 문제발생 시 : 마우스를 살포시 올려주면 해결책을 제시해줌.
		// 마우스 인식 못하면 f2
		Date date = new Date();
		
		int hour = date.getHours();
		System.out.println("현재시각은 " + hour + "시");
		
		int min = date.getMinutes();				
		int sec = date.getSeconds();
		System.out.println(min + "분" + sec + "초");

		int year = date.getYear();
		int year2 = year + 1900;
		// 년도는 1년이면  1900을 더해줘야 한다.

		System.out.println("올해는" + year + "년");
		
		int month = date.getMonth();
		System.out.println("이번달은" + month + "월");


		
		
		
		
		
		
	}

}

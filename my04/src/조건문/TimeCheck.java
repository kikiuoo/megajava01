package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {
		// 실행할 때 현재 시각을 구해서 얼마나 집에 갈 시간이 남았는지 체크하기
		
		Date date = new Date(); // Date : 날짜 요일과 관련된 부품
		int hour = date.getHours(); // getHours : 현재시간을 알려주는 부품
		if (hour < 20) {
			// 컨트롤+알트+화살표 아래: 한 줄 복사
			System.out.println("집에 갈 시간이 많이 남았어요.");
		} else {
			// 이동은 알트 + 화살표 방향 : 이동
			System.out.println("집에 갈 시간이 조금 남았어요.");

		}
		

	}

}

package 조건문;

import java.util.Date;

public class 인사처리 {

	public static void main(String[] args) {
	
		// 지금은 몇시인가요?
		// 몇시인지를 알려주는 부품(class)가 필요함.
		Date date = new Date();
		int hour = date.getHours();
		
		// 지금단계에서는 if~else if~else else는 가운데 혼자 쓸수 없다 하지만 쓰지 않아도 된다.
		// 복잡한 if~else문을 정리해서 만드는 걸 신경써야 한다.
		if (hour >= 6 && hour < 10) {
			// 논리연산자(조건이 너무 많아서 판단을 어떻게 해야할 지 몰라서 판단할 때 사용한다.)
			// 여러가지 조건을 다 만족해야하는 경우 //and연산이라고 부른다.(&&)			
			// 여러가지 조건을 중 하나만 만족해야하는 경우 //or연산이라고 부른다.(||)
			System.out.println("굿모닝");
		}else if (hour < 15) {
			System.out.println("굿 애프터눈");
		}else if (hour < 22) {
			System.out.println("굿 이브닝");
		}else {
			System.out.println("굿 나잇");
		}

	}//main end

}//class end

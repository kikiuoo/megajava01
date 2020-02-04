package 조건문;

public class CoffeeTest {
	// 부품(class)의 제목은 대문자로 시작하는게 정석이다. 그리고 새로운 단어가 연결될 때 대문자로(언더바도 쓰긴한다) 가독성 좋게 한다.
	// CoffeeTest 이것을 낙타표기 CAMEL표기 법을 권장한다. java는 camel 표기법을 권장한다.
	// Coffee_Test언더바는 파이썬에서 권장하는 표기법이다. 스네이크 표기법

	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		int sum = price * count;
		
		// 25000원이 넘으면 할인쿠폰 5000원짜리
		// 아니면 그냥 다 냄.
		
		if (sum >= 25000) {
			sum = sum - 5000;
			
		} else {
		//자바는 비워두어도 됨. 파이썬은 비워두면 안됨.
		}
		System.out.println("당신이 지불할 금액은 " + sum + "원");
	
		int hour = 21;
		if (hour < 22) {
			System.out.println("아직 집에갈 시간이 많이 남았어요.");
			} else { 
				System.out.println("집에 갈 시간이 얼마남지 않았어요. ");
		}
		
	}

}

package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 시간커피체크 {
	// 순차문연습하기
	// 현재 시각이 저녁 10시 이전이면 원래대로 다 내요
	// 10시 이후 이면 5000원을 깎아주세요.
	{		
	public static void main(String[] args){
		// 복사해 오기
		// 콘솔에서 입력받는 class
		// 시각알려주는 class
	
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		System.out.println("커피값  >> ");
		int price  = sc.nextInt();

		System.out.println("주문수  >> ");
		int count  = sc.nextInt();				
		
		int hour = date.getHours();				
		if ( hour < 10 ) {
		System.out.println("price * count");
		} else {
		//자바는 비워두어도 됨. 파이썬은 비워두면 안됨.
		}
		System.out.println("당신이 지불할 금액은 " + sum + "원");
	
		}
		
	}

}

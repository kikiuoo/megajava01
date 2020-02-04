package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 요일처리3 {

	public static void main(String[] args) {
	
		// 당신의 직급은?
		Scanner sc = new Scanner(System.in);	
		System.out.println("당신의 직급은? >> ");
		String data = sc.next();
		
		// 조건이 맟을 경우 판별을 해주어야 함. 
		
		switch(data) {
		case "사원": // strig이라서 "" 안에 넣어줌
			System.out.println("1000만원 보너스"); break; // 
		case "과장": 
			System.out.println("2000만원 보너스"); break;
		case "사장": 
			System.out.println("3000만원 보너스"); break;
		case "회장": 
			System.out.println("4000만원 보너스"); break;
		default : 
			// 위 조건이 아닐 때 
			// 생략가능
			 System.out.println("잘못입력하셨습니다."); break;

		}

	}//main end

}//class end

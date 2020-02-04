package 순차문;

import java.util.Scanner;

public class 여행정보 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				// << 여행정보 >>
				// -----------
				// - 여행지 : 제주도
				//- 경비 : 200000
				//- 할인율: 0.3
				//- 실제경비:

				System.out.println("<< 여행정보 >>");
				System.out.println("-----------");

				
				// - 여행지 : 제주도
				System.out.print("- 여행지 : ");
				//모든 입력되는 데이터의 유형(타입)은 String!
				//어떤 타입으로 사용할지는 프로그래머가 결정!
				String a = sc.next();
						
				//- 경비 : 200000
				System.out.print("- 경비 : ");
				int b = sc.nextInt();
				
				//- 할인율: 0.3
				System.out.print("- 할인율: ");
				double c = sc.nextDouble();
				
				//- 실제경비:
				System.out.print("- 실제경비: ");
				double result = b-b*c;
				// 자바에서는 연산할 때 하나라도 실수가 들어있으면 무조건 실수로 저장한다.
				// 무조건 결과가 실수이기 때문에!
				// 정수와 정수의 연산은 무조건 정수!
				
				System.out.println((int)result + "원");
				System.out.println("-----------");
				System.out.println("=> 12월 중순에 갔을때 경비");

	}

}

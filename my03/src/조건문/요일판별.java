package 조건문; //1번

import java.util.Scanner; //위치를 알려준다 2번

public class 요일판별 {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("요일입력: 주중 1) 주말2) >> ");
		 int data = sc.nextInt();
		 if (data == 1) { // 비교연산자
			 // 비교연산자의 결과는  boolean(true/false)
			System.out.println("열심히 공부합시다!!");
			System.out.println("운동을 열심히 합시다!!");
		} else {
			System.out.println("열심히 놀아봅시다!!");

		}

	}

}

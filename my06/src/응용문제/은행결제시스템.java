package 응용문제;

import java.util.Scanner;

public class 은행결제시스템 {

	public static void main(String[] args) {

		System.out.println("은행 결제 시스템");
		System.out.println("-------------");
		System.out.println("1)잔고확인 2)입금 3)출금 4)종료");

		Scanner sc = new Scanner(System.in);

		int money = 10000;
		while (true) {
			// 조건식에는 반드시 비교연산자를 써준다.
			// 비교연산자의 결과는 항상 논리형(ture/false)이거 두개만
			// 무한루프는 트루
			System.out.print("선택>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("당신의 잔고는? " + money);
				
			} else if (choice == 2) {
				System.out.print("당신의 입금액은>> ");
				int input = sc.nextInt();
				money = money + input; //잔고에다가 더해주기

			} else if (choice == 3) {
				System.out.print("당신의 출금액은? ");
				int output = sc.nextInt();
				money = money - output; //잔고에다가 빼주기

			} else {
				System.out.print("시스템을 종료합니다.");
				break;
				// 여기서 break를 써주는 이유는 while문을 종료하라는 이야기다. if문은 이거 안써줘도 멈춘다.
			}
		}

	}// main

}// class

package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나3 {

	public static void main(String[] args) {

		Random r = new Random();
		int computer = r.nextInt(3); // 0~2

		Scanner sc = new Scanner(System.in);
		System.out.println("0)가위, 1)바위, 2)보");
		int me = sc.nextInt(3);

		switch (me) {
		case 0: // 가위
			switch (computer) {
			case 0:
				System.out.println("cumputer는 가위를 냄.");
				System.out.println("비김");
				break;
			case 1:
				System.out.println("cumputer는 바위를 냄.");
				System.out.println("컴퓨터가 승 ");
				break;

			case 2:
				System.out.println("cumputer는 바위를 냄.");
				System.out.println("내가 승");
				break;

			}

			break;
		case 1: //바위
			switch (computer) {
			case 0:
				System.out.println("cumputer는 가위를 냄.");
				System.out.println("내가 승");
				break;
			case 1:
				System.out.println("cumputer는 바위를 냄.");
				System.out.println("비김");
				break;

			case 2:
				System.out.println("cumputer는 보를 냄.");
				System.out.println("컴퓨터가 승 ");
				break;

			}

			break;
		case 2:
			switch (computer) {
			case 0://보
				System.out.println("cumputer는 가위를 냄.");
				System.out.println("컴퓨터가 승 ");
				break;
			case 1:
				System.out.println("cumputer는 바위를 냄.");
				System.out.println("내가 승");
				break;

			case 2:
				System.out.println("cumputer는 보를 냄.");
				System.out.println("비김");
				break;

			}

			break;
		}

		System.out.println("computer : " + computer);

	}// main

}// class

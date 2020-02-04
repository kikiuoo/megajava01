package 조건문;

import java.util.Random;

public class 아무거나2 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤(Random)
		//0이면, cumputer는 가위를 냄.
		//1이면, cumputer는 바위를 냄.
		//2이면, cumputer는 보를 냄.
		
		Random r = new Random();
		int computer = r.nextInt(3); // 0~2
		System.out.println("computer : " + computer);
			
		switch (computer) {
		case 0 : System.out.println("cumputer는 가위를 냄."); break;
		case 1 : System.out.println("cumputer는 바위를 냄."); break;
		case 2 : System.out.println("cumputer는 보를 냄."); break;
		}
		
			
	}//main

}//class

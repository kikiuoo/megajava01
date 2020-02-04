package 순차문;

import java.util.Scanner;

public class Money연습 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		// -----나의 현금 잔고-----
		System.out.println("-----나의 현금 잔고-----");
		
		//현재 당신이 가지고 있는 돈은? 1000
		System.out.print("현재 당신이 가지고 있는 돈은? ");
		int now = sc.nextInt();
	
		//내일 당신이 가지게 될 돈은 ? 2000	
		System.out.print("내일 당신이 가지게 될 돈은 ? ");
		int tomorrwo = sc.nextInt();
		
		//-------------------
		System.out.println("-------------------");
		
		//오늘 내가 가지고 있는 돈의 총액은 3000원
		int sum = now + tomorrwo;
				
		//내일 내가 가지게 될 돈의 총액은 ? 3000원
		System.out.println("내일 내가 가지게 될 돈의 총액은 ?" + sum + "원");
		
		
		
	}

}

package 순차문;

import java.util.Scanner;

public class 음식점 {

	public static void main(String[] args) {
		// 음식점 계산 총 금액 : 446677
		// 함께 먹은 사람 인원수 : 7
		//------------------
		// 각자 내야할 돈 : 		
		// 타입을 바꾸는 것 => casting(캐스팅)	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("음식점 계산 총 금액 : ");
		int a = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원수 : ");
		int b = sc.nextInt();

		double result = a/(double)b;
		
		System.out.println("각자 내야할 돈은 " + (int)result + " 입니다.");

		
			
		
	}

}

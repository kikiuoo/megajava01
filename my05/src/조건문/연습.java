package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
	
		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("--------------------");

		int 가로 = 7;
		int 세로 = 8;
		
		int result = 가로 * 세로;
		
		System.out.println("면적은 " + result);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("저기요!!!");
		System.out.println("--------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("--------------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동 ");
		System.out.println("--------------------");
		System.out.print("당신의 선택은? ");
		
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("짜장면");
		} else if(a == 2){
			System.out.println("짬뽕");
		} else {
			System.out.println("우동");
		}
			
		

		


	
	}//main end

}//class end

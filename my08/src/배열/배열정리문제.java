package 배열;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1번문제
		int[] a = {10, 20, 30, 40, 50};
		int a1 = a[0] + a[4];
		System.out.println(a1);
		System.out.println(a[0] + a[4]);
		//위치값을 이용하자
		
		//2번문제
		Scanner sc = new Scanner(System.in);
		String [] sub = new String[3];
		for (int j = 0; j < sub.length; j++) {
			System.out.print("과목입력 : ");
			sub [j]= sc.next();
		}
		System.out.println("***" + sub[0] + "보다는" + sub[1] + "***");
	
		System.out.println(" ");
		//4번문제
		int[] num2 = new int[5];
		for (int i = 0; i < num2.length; i++) {
			System.out.println("숫자입력>> ");
			num2[i] = sc.nextInt();			
		}
		for (int s : num2) {
			System.out.println(num2 + " ");
		}
		
	}

}

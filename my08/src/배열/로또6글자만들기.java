package 배열;

import java.util.Random;

public class 로또6글자만들기 {

	public static void main(String[] args) {
		
		// 로또번호 6숫자 만들기
		//아무거나 발생하게 해주는 부품이 필요

		int[] lotto = new int[6];
		Random r = new Random(); //랜덤데이터 부품
		// int data = r.nextInt(46); //0-45번까지
		// System.out.println(data);
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(46); 
		}
		
		
		for (int j = 0; j < lotto.length; j++) {
			System.out.println(lotto[j] + " ");			
		}
		
	}//m
}//c

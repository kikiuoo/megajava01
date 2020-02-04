package 배열응용;

import java.util.Random;

public class 여러개중최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random(7);
		// 42를 넣는 것 => 씨앗(seed)값을 심는다.
		// 랜덤 값들을 동일하게 유지기능
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); //0~99
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		System.out.println("------------");
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("숫자 중 최대값은" + max);
	
	}

}

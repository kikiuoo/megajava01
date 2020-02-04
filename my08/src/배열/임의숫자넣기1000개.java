package 배열;

import java.util.Random;

public class 임의숫자넣기1000개 {

	public static void main(String[] args) {

		int[] lotto = new int[1000];
		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(100);

			System.out.println(lotto[i] + " ");
		}

	}
}

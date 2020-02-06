package 시험;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d x %d = %2d", j, i, (i * j));
			}
			System.out.println("\n");
		}

	}

}

package 배열;

public class 배열연습4 { // 2랑 3이랑 바뀜

	public static void main(String[] args) {
		int[] num = new int[1000];
		// 각int 변수 내에 0으로 초기값이 다 들어가 있
		// num[0] = 0;
		// num[1] = 1;
		// num[2] = 2;
		// 전제 개수를 구해보자

		System.out.println(num.length);
		// 이클립스에서는 for문을 자동완성 할 때
		// 바로 위에 있는 배열을 기준으로 만들어준다. 현재는 num 이라는 배열임.
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			// num[0] = 0
			// num[1] = 1
			// 값을 넣어주는 for문
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			// 값을 출력해주는 for문
		}

	}// main

}// class

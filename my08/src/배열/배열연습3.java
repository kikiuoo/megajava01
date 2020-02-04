package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
	int[] num	= new int[10];
	// int[] : int로 만들어진 배열타입(주소)
	// num[] : 배열의 주소가 들어있음. 참조형
	// int  : 복사
	// new int : int변수를 복사해라
	// new int[10] : int변수를 10 개 복사해
	
	// int배열 100개를 만들어서
	// 첫번째 위치값은 1을 넣고
	// 50번째 위치값은 11을 넣고
	// 77번째 위치값은 111을 넣고
	// 마지막 위치값은 1111을 넣어보세요.
	// 위의 값들을 출력하기
	
	int[] num2 = new int[100];
	
	num2[1] = 1;
	num2[49] = 111;
	num2[76] = 1111;
	num2[99] = 11111;
	System.out.println(num2[1]);
	System.out.println(num2[49]);
	System.out.println(num2[76]);
	System.out.println(num2[99]);
	
	}
}

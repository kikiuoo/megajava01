package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		// 컴퓨터가 인식하는 데이터는 무엇인가?
		// 기본 데이터 : 숫자(정수, 실수), 1글자(문자), 맞는지 여부(논리)
		// 이 네 개가 컴퓨터가 인식하는 기본데이터임.
		// 기본데이터를 ram에 저장하고 cpu에서 계산한다
		
		// 변수선언! => ram에 저장공간이 만들어진다.!
		int year;
		// 변수대입! => 변수에 값을 넣는다.!
		year = 2020;

		int age = 100; // "="(등호) : 저장공간(변수)에 값을 넣는 것을 등호라고 함.
		double eye = 0.7;
		// int eye2 = 4.5; // 정수만넣는건데 실수넣을 경우 오류
		char sn = '1'; // 문자1글자 ->이 숫자를 가지고 계산을 하게 되면 숫자, 계산을 하지 않으면 문자 취급을 해준다.
		boolean coffee = true; // false(거짓)
		// age, eye, sn, coffee = 변수명이라고 한다.
		System.out.println("내 나이는 " + age + "세");
		System.out.println("내 시력은 " + eye + "입니다. ");
		System.out.println("내 " + sn + "입니다. ");
		System.out.println("나는 커피를 마셨다. " + coffee);
		// RAM에 변수들을 저장해 놓고 껐다 켜면 지워진다.
		// CPU가 계산을 한다. (RAM에 있는 변수 데이터를 가져다가)

		// 모든 연산은 CPU가 한다.
		System.out.println(age + 1);
		int nextAge = age + 1;
		System.out.println("내 내년 나이는 " + nextAge);

	}

}

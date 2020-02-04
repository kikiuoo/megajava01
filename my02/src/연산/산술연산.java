package 연산;

public class 산술연산 {

	
	public static void main(String[] args) {
		int n1 = 200; // -21억 ~ 21억
		int n2 = 100;

		int n3 = n1 + n2; // 300
		System.out.println("두 수의 합은" + n3);

		n3 = n3 + 1; // n3 = 301 , 대입해 주기 전까지는 연산을 하지 않는다.
		// "+" 기호 : 연산자 라고 부른다.

		// n1에서 n2를 빼서 n4에 저장해 보세오.
		int n4 = n1 - n2;

		// n1, n2, n4를 확인해 보세요.
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		System.out.println("n4:" + n4);

		// n1, n2를 곱해서 출력
		System.out.println("n1 * n2:" + n1 * n2);

		// n1, n2를 나누어서 출력(몫, 나머지 각각)
		System.out.println("n1 / n2:" + n1 / n2); // 몫
		System.out.println("n1 % n2:" + n1 % n2); // 나머지

	}

}

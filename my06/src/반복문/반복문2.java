package 반복문;

public class 반복문2 {

	public static void main(String[] args) {
		
		// 반갑습니다를 6번 반복해 보세요.
		for (int i = 0; i < 6; i++) {
			// 초기값; 조건식; 증감식
			System.out.println(i + " : 반갑습니다.");
		}
		
		// while문으로 10부터 1까지 감소하는 것을 찍으시오.
		int count = 10;
		while (count > 0) {
			System.out.print(count + " ");
			count--; //

		}
		
		System.out.println();

		// for문으로 1부터 10까지 프린트 해보시오.
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
		}
	
	}
}

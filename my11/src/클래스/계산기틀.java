package 클래스;

//기능별로 계산기 만들어보기
public class 계산기틀 {
	// 없음 = void
	// return을 사용하겠다고 하면
	public int add(int coffee, int green) {
		// 변수를 만들어 준것임.
		return coffee + green;
	}

	public void minus(int money) {
		boolean vip = true;
		int result = money - 1000;
		System.out.println("당신의 최종 결제금액은: " + result);
	}

	public int multi(int money, int count) {
		return money * count;
	}

	public void div(int result, int count) {
		System.out.println(result / count + "원 씩 내면 됨.");
	}

}

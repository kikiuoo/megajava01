package 클래스;

public class 커피전문점 {

	public static void main(String[] args) {

		계산기틀 cal = new 계산기틀();
		// retrun이 아니라 void일 경우에는 변수에 저장할 수 없다.
		int result = cal.add(2000, 3800);
		cal.minus(result);

		// int result2 = multi(3000,4); => 곱한 값 반환받아와서 ressult2 변수에 저장하기
		int result2 = cal.multi(3000, 4);
		
		// cal.div(result2, 4); => 1명당 얼마를 내야하나 출력되게 처리하기
		cal.div(result2, 4);

	}

}

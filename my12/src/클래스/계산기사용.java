package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		int result = cal.add(200, 100);
		System.out.println(result);
		System.out.println(cal.add(200, 100));
		//System.out.println(cal.add());
		//void 타입의 메소드를 호출한 경우에는 반환값이 없으므로
		//변수에 값을 넣을 수도 없고, 프린트할 수도 없음.
		
		System.out.println(cal.add(3.35,700));
		System.out.println(cal.add(22.2, 52.1));
		System.out.println(cal.add("감자", "고구마"));
		String a = cal.add("감자", 356);
		System.out.println(a);
			
	}

}

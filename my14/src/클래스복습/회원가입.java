package 클래스복습;

public class 회원가입 {

	public static void main(String[] args) {

		Member m = new Member();
		m.id = "hera";
		m.pw = "1234";
		m.name = "lee";
		m.email = "lolou@naver.com";
		m.tel = "010-8882-8230";
		
		System.out.println(m);
	}

}

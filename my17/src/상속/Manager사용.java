package 상속;

public class Manager사용 {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";//public
		m.address = "여의도"; //default
		m.salary = 100;// protected
		//m.rrn = 80001; // private 접근불가
	
	}

}

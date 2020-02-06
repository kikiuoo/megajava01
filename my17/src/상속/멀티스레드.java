package 상속;

public class 멀티스레드 {

	public static void main(String[] args) {
		Plus p = new Plus();
		Minus m = new Minus();
		p.start(); //cpu 가 자기 스케줄에 따라서 실행시켜주는것임.
		m.start();
	}

}

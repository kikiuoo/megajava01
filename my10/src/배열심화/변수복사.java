package 배열심화;

public class 변수복사 {

	public static void main(String[] args) {
		//기본형 변수는 변수값을 넣으면 그 변수값을 복사하고 끝난다.
		int x = 100;
		int y = x; // x값을 복사하여 y에 넣는다.
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		System.out.println("-----------");
		
		x = 200; //x변수의 값을 200으로 변경		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}

package 생성자;

public class 마스크사용2 {

	public static void main(String[] args) {
		마스크 m1 = new 마스크("검정색", 1000);
		// new를 할 때 클래스이름과 똑같은 메소드를 만들어 놔줬을때 자동실행이 된다. 꼭 필요한걸 계속반복할 때
		// 변수를 또 만들지 않아도 클래스에 만들어 놓은거로 자동실행됨.
		// 마스크() 생성자가 자동실행
		// m1이라는 객체를 만들 때(생성될 때)자동실행된다.
		// 클래스와 똑같이 생긴 메소드를 생성자 메소드라고 부른다.
		System.out.println(m1); // toString()이 자동실행됨

		마스크 m2 = new 마스크("하얀색", 2000);
		System.out.println(m2);
	}

}

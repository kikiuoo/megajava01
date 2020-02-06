package 상속;

public class 초등학생 extends 학생 {

	@Override // 이메일에서의 @는 ~에라는 뜻 여기서는 "표시"라는 뜻
	//상속과 관련있는 용어 아래것을 학생에서 오버라이드 할것이다라는 것
	//재정의
	public void 배우다() {
		System.out.println("줄넘기를 배우다.");
	}

}

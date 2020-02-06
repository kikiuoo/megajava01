package 상속;

public class 수퍼우먼사용 {

	public static void main(String[] args) {
		우먼 수퍼2 = new 우먼(); // 문법적 의미를 가지고 있는 것은 변수명으로 사용할 수 없다.
		수퍼2.gender = "여";
		수퍼2.name = "수퍼우먼";
		수퍼2.age = 15;
		
		System.out.println(수퍼2);
		
		수퍼2.잠자다(); //사람
		수퍼2.먹다(); //사람
		수퍼2.섬세하다(); //우먼
		
		
		
	}

}

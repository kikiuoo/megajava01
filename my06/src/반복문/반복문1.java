package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		// 반갑습니다를 1일부터 6일까지 반복해보기
		// 반복을 해봅시다.!!
		// 어떨때(조건)??  몇번반복???
		// 반복문은 시작
		
		int day = 0; // 1.시작값 (카운트할 시작값)
		while(day < 6) { // 2.조건식 // 조건이 맞으면 반복처리할 내용을 써준다.
			System.out.println(day + " : 반갑습니다.");
			day = day + 1; //3.증감식
			// day++; day--; ++/-- : 증감연산자
			
			// 이코드를 제일 많이 사용한다.
		}

	}//main
  
}//class

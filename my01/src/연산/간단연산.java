package 연산;

public class 간단연산 {

	public static void main(String[] args) {
       System.out.println(100 + 200);
       
       int n1 = 200; // = 은 넣는 기호이다 n1이라는 방을 만들고 200을 넣어줌 램에 n1, n2를 만들어준 것임. 
       // cpu에 램에서 n1, n2에 있는 200과 100을 불러와서 더해준다
       int n2 = 100; // 
       int n3 = n1 + n2; //300은 램에 n3를 만들어서 넣어줄꺼다
       System.out.println("두 수의 합은 " + n3);
       int n4 = n3 + 100; // n3에 있는거 불러다가 100을 더하고 n4 만들어서 넣어둬
       System.out.println("세 수의 합은 " + n4);
       // 오늘은 변수와 연산을 한 것임. 다음에는 연산까지 한거를 제어에 붙여줄 것임.
       
	}

}

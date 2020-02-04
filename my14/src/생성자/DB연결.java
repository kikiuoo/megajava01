package 생성자;

public class DB연결 {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. 커넥터 설정 OK.. 이게 있어야지 만들어서 SQL로 보내줄수 있다.매우중요
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공...!!");
		
	}

}

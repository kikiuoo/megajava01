package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {

	public static void main(String[] args) throws Exception {

		// 1. 커넥터설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터설정성공...");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3307/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결성공...");

		//3. SQL문을 만든다.
		String sql = "insert into member values('summer','summer','summer','summer')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL 만들기성공...");

		// 4. SQL문을 mySQL프로그램에 전송.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송성공...");
		
		

	}

}

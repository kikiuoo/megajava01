package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버쇼핑크롤링 { // 네이버 쇼핑 코드 가져오기

	public static void main(String[] args) throws IOException {
		String site = "https://shopping.naver.com/";
		// 네트워크 프로그래밍 -> 무조건 에러처리해야 함.
		Connection con =  Jsoup.connect(site);
		
		System.out.println("1. 사이트 연결 성공.");
		
		Document doc = con.get();//통채로 가져와 문서로 문서에 해당하는 부품이  Document
		
		System.out.println("2. 연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3. 내용 =========================");
		System.out.println(doc);
	}

}

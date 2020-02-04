package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버뮤직크롤링 {

	public static void main(String[] args) throws IOException {

		String site = "https://music.naver.com/";
		// 네트워크 프로그래밍 -> 무조건 에러처리해줘야 함.
		Connection con = Jsoup.connect(site);//위에 해당하는 주소에 네트워트 연결해
		System.out.println("1. 사이트 연결 성공.");
		
		Document doc = con.get();// doc 문서로 통채로 가져와 문서로 문서에 해당하는 부품이 Document

		System.out.println("2. 연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3. 내용 =========================");
		System.out.println(doc);
		System.out.println("4. 전체 문서중에서 원하는 정보를 추출");
		System.out.println(doc.select("a._artist").text()); 
	}

}

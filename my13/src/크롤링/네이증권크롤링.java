package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이증권크롤링 {

	public static void main(String[] args) throws IOException {

		String site = "https://finance.naver.com/item/main.nhn?code=005930";
		// 네트워크 프로그래밍 -> 무조건 에러처리해줘야 함.
		Connection con = Jsoup.connect(site);//위에 해당하는 주소에 네트워트 연결해
		System.out.println("1. 사이트 연결 성공.");
		
		Document doc = con.get();// doc 문서로 통채로 가져와 문서로 문서에 해당하는 부품이 Document

		System.out.println("2. 연결된 사이트에서 문서를 다 가지고 오기 성공");
		System.out.println("3. 내용 =========================");
		System.out.println(doc);

		System.out.println("4. 전체 문서중에서 원하는 정보를 추출");
		// String no_today = doc.select("p.no_today");
		System.out.println(doc.select("p.no_today").text());
		// text만 가져와 
		//점을 찍어서 메소드를 계속 가져올 수 있다. pipe연산이라고 부른다.
		//doc에서 "p.no_today"이거에 해당하는 거 가져와서 거기에서 text만 가져와 
		//ex ) cal.add().mul().minus()
		System.out.println(doc.select("td.first").text()); // td.~~ 같은 형식이면 다 가져온다.

	}

}

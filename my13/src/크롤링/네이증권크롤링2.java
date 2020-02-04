package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이증권크롤링2 {

	public static void main(String[] args) throws IOException {
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] name = {"모나리자", "삼성전자","샐트리온", "현대차", "에이지엘비"};
		String[] company = {"012690", "005930","011000", "005380", "028300"};

		//배열반복
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]);			
			Document doc = con.get();
			System.out.println("회사명: " + name[i]);
			System.out.print("오늘가: ");
			System.out.println(doc.select("p.no_today").text());			
			System.out.println(doc.select("td.first").text());
			System.out.println("------------------------------");
			
		}
		

	}

}

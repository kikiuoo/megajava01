package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이증권크롤링3 {

	public static void main(String[] args) throws IOException {
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] name = {"모나리자", "삼성전자","샐트리온", "현대차", "에이지엘비"};
		String[] company = {"012690", "005930","011000", "005380", "028300"};

		//배열반복
		for (int i = 0; i < company.length; i++) {
			Connection con = Jsoup.connect(site + company[i]);	
			
			Document doc = con.get();
			String date = doc.select("em.date").text();
			//장마감을 짤라보자!
			String date2 = date.substring(0, 10); 
			//0~9번까지의 인덱스를 말한다. //substring : string에서 부분적으로 가져오고 싶을 때
			System.out.println(date2);
			System.out.println("회사명: " + name[i]);			
			String today = doc.select("span.blind").get(12).text();
			System.out.println("오늘가: " + today);			
			String yesterday = doc.select("span.blind").get(15).text();
			System.out.println("어제가: " + yesterday);	
			String high = doc.select("span.blind").get(16).text();
			System.out.println("고가: " + high);			
			System.out.println("----------------");
			
			FileWriter f = new FileWriter(date2 +"-" + name[i]);
			f.write("날짜: " + date2 + "\n" );	
			f.write("회사명: " + name[i] + "\n" );	
			f.write("어제: " + yesterday + "\n" );	
			f.write("오늘: " + today + "\n" );	
			f.write("고가: " + high + "\n" );	
			f.close();			
		}
	}
}

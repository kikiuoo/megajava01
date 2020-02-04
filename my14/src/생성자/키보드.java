package 생성자;

public class 키보드 {
	String company;
	int price;
	int count;
	
	public 키보드(int p, int c) {
		count =c;
		price = p;
	}
	public 키보드(int p, String c, int o){
		company = c;
		price = p;
		count = o;		
	}
	@Override
	public String toString() {
		return "키보드 [company=" + company + ", price=" + price + ", count=" + count + "]";
	}

	}


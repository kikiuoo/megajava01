package 스테틱;

public class House {
	String color;
	String company;
	int price;

	//입력을 한번에!
	public House(String color, String company, int price) {
		this.color = color;
		this.company = company;
		this.price = price;
	}
	//출력을 한번에!
	// to string
	@Override
	public String toString() {
		return "Mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
}

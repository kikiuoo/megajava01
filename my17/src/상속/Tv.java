package 상속;

public class Tv{
	String color;
	int size;
	
	public Tv(String color, int size) { //생성자 만들기
		this.color = color;
		this.size = size;
	}
	public void on() {
		System.out.println("TV를 켜다");
	}
	@Override
	public String toString() {
		return "Tv [color=" + color + ", size=" + size + "]";
	}
	
	

}

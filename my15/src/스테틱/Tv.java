package 스테틱;

public class Tv {
	//멤버변수는 new를 할 때마다 메모리에 객체마다 각각 복사된다.
	String color;
	int price;
	static int count;
	//얘는 변하지 말라고 붙여주는거
//	new를 할 때마다 멤버변수가 객체마다 따로따로 다이나믹하게 복사가 된다.
//	어떤 멤버변수는 누적시킬 필요가 있는 변수가 필요한 경우 
//	멤버변수 앞에 static이라고 붙여주면
//	객체마다 따로따로 생기지 않고, 하나의 변수만 가지면서 
//	객체마다 공유해서 사용할 수 있다.	
	
	//생성자
	//멤버 변수값 입력을 한번에!
	public Tv(String color, int price) {
		count++;
		this.color = color;
		this.price = price;
	}

	//멤버변수에 들어있는 값들 출력을 한번에!
	@Override
	public String toString() {
		return "스테틱 [color=" + color + ", price=" + price + "]";
	}

	
	
	}

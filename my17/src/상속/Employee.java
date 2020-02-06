package 상속;

public class Employee {
	//접근제어자 : +, #,  .
	//public->protected->default->private
	public String name; // 아무데서나 이 name이라는 변수를 사용가능하다는 것 +
	
	 // 기본제어자 => 같은패키지!
	String address; //같은 패키지 내에서만 사용가능
					// 상속이라는 패키지 내에서만 사용가능한 것. 아무것도 안붙은거
	
	protected int salary; // 같은 +다른 패키지(상속한 경우에만) #붙은거
	
	private int rrn; //이 클래스를 벗어날 수 없다. 이 클래스 내에서만 사용가능 .

}

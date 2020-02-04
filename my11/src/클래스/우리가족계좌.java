package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		
		Bank father = new Bank();
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		System.out.println(father);
		
		Bank gi = new Bank();
	 	gi.name = "박길동";
	 	gi.account = "튼튼예금";
	 	gi.money = 2000;
	 	System.out.println(gi);
	 	
		Bank mo = new Bank();
	 	mo.name = "홍기사";
	 	mo.account = "다음적금";
	 	mo.money = 3000;
	 	System.out.println(mo); 	
	 	
	}

	 

}

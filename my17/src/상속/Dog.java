package 상속;

public class Dog {

	public static void main(String[] args) {
		Animal 개 = new Animal();
		개.eat = "사료";
		개.weight = 25;
		
		System.out.println(개);
		
		개.먹이를먹다();
		개.소리를내다();

	}

}

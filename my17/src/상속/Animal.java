package 상속;

public class Animal {
	int weight;
	String eat;

	public void 먹이를먹다() {
		System.out.println("먹이를 먹다.");
	}
	public void 소리를내다() {
		System.out.println("소리를 내다.");
	}
	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", eat=" + eat + "]";
	}
	
}

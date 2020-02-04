package 배열;

public class 배열간단출력 {

	public static void main(String[] args) {
		
		int[] age = {10, 20, 30};
		
		for (int i = 0; i < age.length; i++) { // int i 인덱스의 i
			System.out.println(age[i]);
		}
		
		for (int i : age) { //for each 명령어로
			System.out.println(i);
		}
		
		double[] eyes = {0.7, 0.5, 0.9};
		
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);			
		}
		
		for (double i : eyes) {			
			System.out.println(i);
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}

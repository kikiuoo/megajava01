package 배열심화;

public class 차원2배열만들기 {
	//이름의 맨 앞에 숫자나 기호가 오는것은 안된다.
	//기호 중 _ , $만 앞에 올수 있다.

	public static void main(String[] args) {
		//코딩에서는 3차원은 잘 안만듬.
		//2차원 배열(행, 열을 지정해주어야 한다.)
		//   0  1  2  3  4
		//----------------
		//0: 0  0  0  0  0
		//1: 0  0  0  0  0
		//2: 0  0  0  0  0
		int[][] seat = new int[3][5];
		System.out.println("배열의 크기: " + seat.length);
		System.out.println("0번행의 크기: " + seat[0].length);
		System.out.println("1번행의 크기: " + seat[1].length);
		System.out.println("2번행의 크기: " + seat[2].length);
		
		for (int i = 0; i < seat.length; i++) {//행만큼(3)
			for (int j = 0; j < seat[i].length; j++) {
			System.out.print(seat[i][j] + " ");		
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}

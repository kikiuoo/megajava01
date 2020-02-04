package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장2 {

	public static void main(String[] args) throws IOException {
		// 파일을 인식하게 하고 파일에 저장도 하기
		// 이 두개를 따로해줘야 하는데 같이 해주는 부품이 있음. FileWriter
		FileWriter file = new FileWriter("20200121.txt");
		file.write("hi..." + "\n"); // \n 새 줄을 넣어
		file.write("hello.."+ "\n");
		file.close(); // 다 썼다는 뜻
		
	}

}

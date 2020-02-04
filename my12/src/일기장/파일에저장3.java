package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장3 {

	public static void main(String[] args) throws IOException {
		// 파일을 인식하게 하고 파일에 저장도 하기
		// 이 두개를 따로해줘야 하는데 같이 해주는 부품이 있음. FileWriter
		// 입력한 값을 넣어주고 싶을 때
		String name = JOptionPane.showInputDialog("이름 입력");
		String company = JOptionPane.showInputDialog("소속 입력");
		String day = JOptionPane.showInputDialog("날짜입력");
		FileWriter file = new FileWriter(day + ".txt");
		file.write(name + "\n"); // \n 새 줄을 넣어
		file.write(company + "\n");
		file.close(); // 다 썼다는 뜻
		
	}

}

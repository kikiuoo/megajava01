package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	// 두 개를 입력받아서
	public static void main(String[] args) throws IOException {
		String s1 = JOptionPane.showInputDialog("올해는? ");
		String s2 = JOptionPane.showInputDialog("목표는?");

		// 두 개를 결합시켜(처리하고)
		String s3 = s1 + s2;

		// 그 결합 결과를 출력
		// System.out.println(s3);
		// JOptionPane.showMessageDialog(null, s3);

		FileWriter file = new FileWriter("win.txt");
		file.write(s3);
		file.close();

	}

}

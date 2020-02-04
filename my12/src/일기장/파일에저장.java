package 일기장;

import java.io.File;

public class 파일에저장 {

	public static void main(String[] args) {
		// 날짜를 가지고 파일이름 만들기
		// 20200121.txt
		// 파일이라는 걸 나타내줄 수 있는 부품을 써야한다.
		File file = new File("c:/my/readme.txt");
		boolean ex = file.exists();
		System.out.println("존재여부: " + ex);
		System.out.println("폴더여부: " + file.isDirectory());
		System.out.println("파일여부: " + file.isFile());
		System.out.println("위치확인: " + file.getPath());

		System.out.println();
		File file2 = new File("c:/windows");
		// windows 아래 어떤 파일들이 있는 지 확인해 보기
		String[] list = file2.list();
		int folderCount = 0;
		int fileCount = 0;
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			// 파일의 개수와 폴더의 개수를 찾고 싶을 때
			
			File file3 = new File("c:/windows/" + list[i]);

			if (file3.isFile()){
				fileCount++;
			}else {
				folderCount++;
			}//else
		}//for
		System.out.println("폴더의 개수: " + folderCount + "개");
		System.out.println("파일의 개수: " + fileCount + "개");
	}

}

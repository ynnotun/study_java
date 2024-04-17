package study0415;

import java.io.IOException;

/*
 * FileWriter는 파일을 열고 데이터를 저장하는 클래스
 * 예외 발생 여부와 상관 없이 마지막에는 close() 메소드를 실행시켜 파일을 닫아주려 함
 * 왼쪽 코드는 try-catch-finally를 이용해서 작성한 코드
 * 리소스 자동 닫기를 이용하도록 수정하고 싶음
 * */

class FileWriter implements AutoCloseable {
	public FileWriter(String filePath) throws IOException {
		System.out.println(filePath + "파일을 엽니다.");
	}
	
	public void write(String data) throws IOException {
		System.out.println(data + "를 파일에 저장합니다.");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("파일을 닫습니다.");
	};
}


public class Exception_Q8 {
	public static void main(String[] args) {
		
		// 기존 코드
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("file.txt");
//			fw.write("Java");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fw.close();
//			} catch (IOException e2) {
//				
//			}
//		}
		
		// 리소스 자동 닫기
		try (FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

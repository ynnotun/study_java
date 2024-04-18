package study0418;

import java.io.IOException;

class FileWriter implements AutoCloseable
{
	public FileWriter(String filePath) throws IOException//예외 발생하면 예외를 여기서 처리 안하고 밖에서 처리
	{
		System.out.println(filePath + "파일을 엽니다.");
	}
	
	public void write(String data) throws IOException//예외 발생하면 예외를 여기서 처리 안하고 밖에서 처리
	{
		System.out.println(data + "를 파일에 저장합니다.");
	}

	@Override
	public void close() throws IOException //AutoCloseable 인터페이스의 close 메서드 서술
	{
		System.out.println("파일을 닫습니다.");
	}
}

public class page486_8//FileWriterExample 
{
	public static void main(String[] args) 
	{
		//기존코드
		FileWriter gw = null;
		try  
		{
			gw = new FileWriter("file.txt");
			gw.write("Java");
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try  
			{
				gw.close();
			} 
			catch (IOException e2) 
			{
				// TODO: handle exception
			}
		}
		
		//수정 코드
		/*page 473~477 11.4 리소스 자동닫기 참고*/
		/*try-catch-finally를 통해 파일을 안전하게 close하지만 더 편하게 하기 위해 try-with-resource 블록을 사용해 자동으로 닫는다.*/
		try(FileWriter fw = new FileWriter("file.txt"))//자동파일닫기
		{
			fw.write("Java");//fw 클래스의 write 메서드에 "Java"문자열 전달
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());//예외 발생하면 예외메시지 발송 
		}
	}
}

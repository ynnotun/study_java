package study0418;

import java.io.IOException;

class FileWriter implements AutoCloseable
{
	public FileWriter(String filePath) throws IOException
	{
		System.out.println(filePath + "파일을 엽니다.");
	}
	
	public void write(String data) throws IOException
	{
		System.out.println(data + "를 파일에 저장합니다.");
	}

	@Override
	public void close() throws IOException {
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
		/*try-catch-finally를 통해 파일을 안전하게 close하지만 더 현하게 하기 위해 try-with-resource 블록을 사용해 자동으로 닫는다.*/
		try(FileWriter fw = new FileWriter("file.txt"))
		{
			fw.write("Java");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

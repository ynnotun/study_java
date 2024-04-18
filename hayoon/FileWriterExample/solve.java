package day0418;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileWriter fw=new FileWriter("file.txt")){
			fw.write("Java");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

}

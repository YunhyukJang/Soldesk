package output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		//try 구문에 있는 경우 자동 close() 처리
		try(FileOutputStream fos=new FileOutputStream("resource.txt"); 
				FileInputStream fis=new FileInputStream("resource.txt")) {
			fos.write(68);
			fos.write(69);
			fos.write(70);
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

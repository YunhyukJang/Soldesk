package pk20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}
				
			}
			
			System.out.println("항상 수행되는 구문");
		}
		
		System.out.println("프로그램 종료");
	}
}

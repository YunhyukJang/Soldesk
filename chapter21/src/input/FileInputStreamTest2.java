package input;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		//byte 단위로 읽음
		//FileInputStream fis=null;
		
		//한글 깨짐 방지 -> 문자 단위로 읽어야 한다.
		FileReader fis=null;
		
		try {
			fis=new FileReader("input.txt");
			
			int i;
			
			//fis.read():끝까지 읽고 나면 -1을 반환
			while((i=fis.read()) != -1) {
				System.out.print((char)i+" ");
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("end");
	}
}

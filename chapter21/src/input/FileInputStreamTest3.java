package input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("input2.txt")) {
			byte[] bs=new byte[10];
			int i;
			
			while((i=fis.read(bs)) != -1) {
				//버퍼 읽기
				//10개씩 가비지값 출력
				for(byte b:bs) {
					System.out.print((char)b);
				}
				
				System.out.println(":"+i+"바이트 읽음");
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}
}

package input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("input2.txt")) {
			byte[] bs=new byte[10];
			int i;
			
			while((i=fis.read(bs)) != -1) {
				//읽은 만큼 출력
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				
				System.out.println(":"+i+"바이트 읽음");
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}
}

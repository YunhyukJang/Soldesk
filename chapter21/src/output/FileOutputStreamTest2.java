package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		//("파일 이름", true):byte 단위 출력, 덮어쓰기 안됨		
		try(FileOutputStream fos=new FileOutputStream("output2.txt", true)) {
			byte[] bs=new byte[26];
			byte data=65; //'A'
			
			for(int i=0; i<bs.length; i++) {
				bs[i]=data;
				
				data++;
			}
			
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("출력 완료");
	}
}

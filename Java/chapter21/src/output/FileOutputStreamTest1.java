package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		//("파일 이름", true):byte 단위 출력, 덮어쓰기 안됨
		try(FileOutputStream fos=new FileOutputStream("output1.txt", true)) {
			fos.write(71);
			fos.write(72);
			fos.write(73);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("출력 완료");
	}
}

package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		
		fos=new FileOutputStream("output4.txt", true);
		
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.flush(); //출력 버퍼 비울 경우
		fos.write(68);
		fos.flush(); //출력 버퍼 비울 경우
		fos.close();
		
		System.out.println("파일 생성 완료");
	}
}

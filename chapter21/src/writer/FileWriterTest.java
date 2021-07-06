package writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("Writer.txt")) {
			fw.write('A');
			char[] buf={'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf); //문자 배열 출력
			fw.write("안녕"); //String 출력
			fw.write(buf, 1, 2); //일부 저장
			fw.write("65"); //숫자 출력
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("출력 완료");
	}
}

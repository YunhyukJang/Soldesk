package decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		//Socket 통신
		Socket socket=new Socket();
		
		try {
			//byte 단위 -> 문자 단위
			InputStreamReader br=new InputStreamReader(socket.getInputStream());
			//문자를 한 줄 씩 읽어들이기
			//BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			br.read();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

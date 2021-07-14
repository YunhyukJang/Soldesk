package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		//DataOutputStream=자료 타입을 그대로 쓰기
		try(FileOutputStream fos=new FileOutputStream("data.txt"); 
				DataOutputStream dos=new DataOutputStream(fos)) {
			dos.writeByte(100); //1byte로 쓰기
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		//DataInputStream=자료 타입을 그대로 읽기
		try(FileInputStream fis=new FileInputStream("data.txt"); 
				DataInputStream dis=new DataInputStream(fis)) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("자료 읽기 성공");
	}
}

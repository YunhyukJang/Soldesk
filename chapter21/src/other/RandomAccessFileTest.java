package other;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf=new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); //int=4byte
		
		System.out.println("파일 포인터 위치:"+rf.getFilePointer());
		
		rf.writeDouble(3.14); //double=8byte
		
		System.out.println("파일 포인터 위치:"+rf.getFilePointer());
		
		rf.writeUTF("안녕하세요"); //한글은 한 글자당 3byte*5글자+(null값(2byte))
		
		System.out.println("파일 포인터 위치:"+rf.getFilePointer());
		
		rf.seek(0);
		
		System.out.println("파일 포인터 위치:"+rf.getFilePointer());
		
		int i=rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println("------------------------------");
		System.out.println("파일 포인터 위치:"+rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}

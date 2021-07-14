package other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Web Development\\Butter.txt");
		
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath()); //절대경로
		System.out.println(file.getPath()); //상대경로
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}
}

package decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {

	public static void main(String[] args) {
		long mSec=0;
		
		try(FileInputStream fis=new FileInputStream("bts.zip"); 
				FileOutputStream fos=new FileOutputStream("copy.zip");) {
			mSec=System.currentTimeMillis();
			
			int i;
			
			while((i=fis.read()) != -1) {
				fos.write(i);
			}
			
			mSec=System.currentTimeMillis()-mSec;
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("파일 복사 소모 시간:"+mSec+"milliseconds");
	}
}

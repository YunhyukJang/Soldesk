package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferedInputStream, BufferedOutputStream=컴파일 속도를 향상 시켜주는 보조 스트림
public class FileCopyTest2 {

	public static void main(String[] args) {
		long mSec=0;
		
		try(FileInputStream fis=new FileInputStream("bts.zip"); 
				FileOutputStream fos=new FileOutputStream("copy.zip"); 
				BufferedInputStream bis=new BufferedInputStream(fis); 
				BufferedOutputStream bos=new BufferedOutputStream(fos);) {
			mSec=System.currentTimeMillis();
			
			int i;
			
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			mSec=System.currentTimeMillis()-mSec;
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("파일 복사 소모 시간:"+mSec+"milliseconds");
	}
}

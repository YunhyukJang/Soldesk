package serializationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = 2463482573351339050L;
	String name;
	transient String job; //transient=직렬화에서 제외
	
	public Person() {
	}
	
	public Person(String name, String job) {
		this.name=name;
		this.job=job;
	}

	@Override
	public String toString() {
		return name+", "+job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person1=new Person("박지성", "MF");
		Person person2=new Person("손흥민", "FW");
		
		try(FileOutputStream fos=new FileOutputStream("serial.out"); 
				ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			oos.writeObject(person1);
			oos.writeObject(person2);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis=new FileInputStream("serial.out"); 
				ObjectInputStream ois=new ObjectInputStream(fis)) {
			Person p1=(Person)ois.readObject();
			Person p2=(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

/* 자바 직렬화란 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부의 자바 시스템에서도 
 * 사용할 수 있도록 byte 형태로 데이터 변환하는 기술과 byte로 변환된 데이터를 
 * 다시 객체로 변환하는 기술(역직렬화)을 아울러서 얘기합니다. 
 * 시스템적으로 얘기하자면 JVM(Java Virtual Machine)의 메모리에 상주되어 있는 객체 데이터를 
 * byte 형태로 변환하는 기술과 직렬화된 byte 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태를 같이 얘기합니다.*/

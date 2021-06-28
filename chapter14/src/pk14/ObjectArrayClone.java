package pk14;

import java.util.ArrayList;

class MyBook implements Cloneable{
	String title;
	
	public MyBook(String title) {
		this.title=title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return title;
	}
}

public class ObjectArrayClone {

	public static void main(String[] args) {
		ArrayList<MyBook> bookList=new ArrayList<MyBook>();
		
		MyBook book1=new MyBook("Java의 정석");
		MyBook book2=new MyBook("자바 프로그래밍 for Beginner");
		MyBook book3=new MyBook("파이썬 웹 프로그래밍");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList=(ArrayList)bookList.clone();
		
		copyList.add(new MyBook("데이터베이스 개론과 실습"));
		
		System.out.println(bookList);
		System.out.println("------------------------------");
		System.out.println(copyList);
		
		System.out.println("==============================");
		
		book3.setTitle("HTML5+CSS3 웹 표준의 정석");
		
		System.out.println(bookList);
		System.out.println("------------------------------");
		System.out.println(copyList);
	}
}

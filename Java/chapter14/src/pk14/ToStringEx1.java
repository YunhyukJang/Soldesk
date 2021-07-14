package pk14;

class Book{
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	
	//재정의
	@Override
	public String toString() {
		return bookNumber+", "+bookTitle;
	}
}

public class ToStringEx1 {

	public static void main(String[] args) {
		Book bk=new Book(200, "해리포터와 마법사의 돌");
		
		System.out.println(bk); //객체의 주소 값 반환
		System.out.println(bk.toString()); //heap memory data 문자열 처리
		
		String str=new String("Test");
		
		System.out.println(str);
	}
}

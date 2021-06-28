package pk14;

class Bk{
	String title;
	String author;
	
	public Bk(String title, String author) {
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() {
		return author+"작가의 "+title;
	}
}

public class ToStringEx2 {

	public static void main(String[] args) {
		Bk bk=new Bk("해리 포터 시리즈", "J.K. 롤링");
		
		System.out.println(bk.toString());
	}
}

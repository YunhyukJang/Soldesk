package pk6;

public class ArrayCopy03 {

	public static void main(String[] args) {
		//얕은 복사		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥", "조경래");
		bookArray1[1]=new Book("데미안", "헤르만 헤세");
		bookArray1[2]=new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		System.out.println("--변경 전--");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("--원본--");
		
		bookArray1[0].setBookName("나 목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("--복사본--");
		
		//원본의 영향을 받는다.
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}

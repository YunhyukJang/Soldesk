package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		//int a=65; //대문자 A
		int a=97; //소문자 a
		
		System.out.println(a);
		System.out.println((char)a); //형 변환(ASCII Code)
		
		//int와 char는 호환 가능하지만 음수는 호환되지 않는다
		int b=-66;
		
		System.out.println(b);
		System.out.println((char)b);
		
		char a2=65; //ASCII Code
		//char b2=-66; //Error 
		
		System.out.println(a2);
		System.out.println((int)a2);
	}
}

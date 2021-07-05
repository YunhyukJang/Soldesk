package pk19;

/*lambda expression 
 * 자바 8부터 지원 클래스를 생성하지 않고 함수의 호출만으로 기능을 수행
 * 입력받은 자료를 기반으로 수행되므로 외부에 영향을 미치지 않음
 * 그러므로 병렬처리 가능*/
public interface Add {
	public int add(int x, int y);
}

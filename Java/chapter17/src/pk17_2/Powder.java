package pk17_2;

public class Powder extends Material {
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder로 만듭니다.");
	}
}

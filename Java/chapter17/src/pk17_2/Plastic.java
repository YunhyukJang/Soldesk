package pk17_2;

public class Plastic extends Material {
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 만듭니다.");
	}
}

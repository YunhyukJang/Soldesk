package pk11;

public class Paprika extends Vegetable {
	private String color;
	private int price;
	private String name;
	
	public void Set3(String color, int price, String name) {
		this.color=color;
		this.price=price;
		this.name=name;
	}
	
	public void Disp3() {
		System.out.println("색깔:"+color);
		System.out.println("가격:"+price);
		System.out.println("이름:"+name);
	}
}

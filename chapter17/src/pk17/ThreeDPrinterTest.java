package pk17;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printPowder=new ThreeDPrinter();
		Powder p1=new Powder();
		
		printPowder.setMaterial(p1);
		
		//다운 캐스팅 *Powder가 Object 타입의 매개 변수를 갖고있는 메서드를 참조
		Powder p2=(Powder)printPowder.getMaterial();
		
		System.out.println(p2);
		
		System.out.println("--------------------");
		
		ThreeDPrinter printPlastic=new ThreeDPrinter();
		Plastic p3=new Plastic();
		
		printPlastic.setMaterial(p3);
		
		Plastic p4=(Plastic)printPlastic.getMaterial();
		
		System.out.println(p4);
	}
}

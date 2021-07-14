package pk17_2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		
		//형 변환이 필요없다.
		Powder powder=powderPrint.getMaterial();
		
		System.out.println(powder);
		
		powderPrint.printing();
		
		System.out.println("--------------------");
		
		GenericPrinter<Plastic> plasticPrint=new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		
		//형 변환이 필요없다.
		Plastic plastic=plasticPrint.getMaterial();
		
		System.out.println(plastic);
		
		plasticPrint.printing();
		
		System.out.println("--------------------");
		
		/*
		 * GenericPrinter<Water> waterPrint=new GenericPrinter<Water>();
		 * waterPrint.setMaterial(new Water());
		 * 
		 * 형 변환이 필요없다. 
		 * Water water=waterPrint.getMaterial();
		 * 
		 * System.out.println(water);
		 */
	}
}

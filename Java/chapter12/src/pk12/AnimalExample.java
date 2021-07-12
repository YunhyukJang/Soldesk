package pk12;

public class AnimalExample {

	public static void main(String[] args) {
		Bear bear=new Bear();
		
		System.out.println("---곰---");
		System.out.println("눈 : "+bear.getEye());
		System.out.println("다리 : "+bear.getLeg());
		
		Lion lion=new Lion();
		
		System.out.println("---사자---");
		System.out.println("눈 : "+lion.getEye());
		System.out.println("다리 : "+lion.getLeg());
		
		//부모 타입으로 형 변환
		Animal spider=new Spider();
		
		System.out.println("---거미---");
		System.out.println("눈 : "+spider.getEye());
		System.out.println("다리 : "+spider.getLeg());
	}
}

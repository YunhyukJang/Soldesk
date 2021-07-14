package pk11;

import java.util.ArrayList;

public class AnimalTest2 {
	ArrayList<Animal> aniList=new ArrayList<Animal>();
	
	public void addAnimal() {
		//Animal형으로 형 변환을 해서 추가
		aniList.add(new Human()); //Human a=new Human();
		aniList.add(new Tiger()); //Tiger a=new Tiger();
		aniList.add(new Eagle()); //Eagle a=new Eagle();
		
		//Animal ani1=new Human(); *자동 형 변환
		//배열의 요소들을 꺼내서 move 호출
		for(Animal ani:aniList) {
			ani.move(); //오버라이딩된 메서드만 호출
			
			//부모 타입이므로 자식의 메서드는 안 보임
		}
		
	}
	
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani=aniList.get(i);
			
			if(ani instanceof Human) {
				Human h=(Human)ani;
				
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e=(Eagle)ani;
				
				e.flying();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
			
		}
		
	}

	public static void main(String[] args) {
		AnimalTest2 aTest=new AnimalTest2();
		
		aTest.addAnimal();
		aTest.testCasting();
	}
}

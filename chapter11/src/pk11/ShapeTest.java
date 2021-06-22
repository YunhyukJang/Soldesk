package pk11;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 입니다.");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("삼각형 입니다.");
	}
}

public class ShapeTest {
	
	//<Shape>=Shape를 기준으로 Shape 클래스와 Shape를 상속받은 모든 클래스
	ArrayList<Shape> sList=new ArrayList<Shape>();
	
	public void addShape() {
		sList.add(new Circle()); //Circle s=new Circle();
		sList.add(new Rectangle()); //Rectangle s=new Rectangle();
		sList.add(new Triangle()); //Triangle s=new Triangle();
		
		//업 캐스팅
		//overriding 된 메서드이므로 자식 클래스의 draw로 컴파일됨
		for(Shape s:sList) {
			s.draw();
		}
		
	}
	
	public void testCasting() {
		for(int i=0; i<sList.size(); i++) {
			Shape s=sList.get(i); //일단 Shape 타입으로 가져옴
			
			if(s instanceof Circle) {
				Circle c=(Circle)s; //Circle로 형 변환 *다운 캐스팅
				
				c.circle();
			}else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle)s; //Rectangle로 형 변환 *다운 캐스팅
				
				r.rectangle();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s; //Triangle로 형 변환 *다운 캐스팅
				
				t.triangle();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
			
		}
		
	}

	public static void main(String[] args) {
		ShapeTest sTest=new ShapeTest();
		
		System.out.println("--- 업 캐스팅 ---");
		
		sTest.addShape();
		
		System.out.println("--- 다운 캐스팅 ---");
		
		sTest.testCasting();
	}
}

package pk17_2;

class MyArrayG<E> {
	private Object[] array=new Object[10];
	int i;
	
	public void add(E obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}
}

public class MyArrayTest2 {

	public static void main(String[] args) {
		MyArrayG<String> myArrayG1=new MyArrayG<String>();
		
		myArrayG1.add(new String("test"));
		
		String str=myArrayG1.get(0); //Generic이므로 형 변환 없음
		
		System.out.println(str);
		
		System.out.println("--------------------");
		
		MyArrayG<Integer> myArray2=new MyArrayG<Integer>();
		
		myArray2.add(new Integer(100)); //Generic이므로 형 변환 없음
		
		Integer num=myArray2.get(0);
		
		System.out.println(num);
	}
}

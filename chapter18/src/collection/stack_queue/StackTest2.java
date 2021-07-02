package collection.stack_queue;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		
		if(len == 0) {
			System.out.println("스택이 비어있습니다.");
			
			return null;
		}
		
		return arrayStack.remove(len-1);
	}
}

public class StackTest2 {

	public static void main(String[] args) {
		MyStack ms=new MyStack();
		
		ms.push("Butter");
		ms.push("Dynamite");
		ms.push("Idol");
		
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}

package collection.stack_queue;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		
		if(len == 0) {
			System.out.println("Queue가 비어있습니다.");
			
			return null;
		}
		
		return arrayQueue.remove(0);
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		
		mq.enQueue("Butter");
		mq.enQueue("Dynamite");
		mq.enQueue("Idol");
		
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
	}
}

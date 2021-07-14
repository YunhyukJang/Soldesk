package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		Queue<Message> qMessage=new LinkedList<Message>();
		
		qMessage.offer(new Message("Mail", "해리"));
		qMessage.offer(new Message("DM", "헤르미온느"));
		qMessage.offer(new Message("Kakaotalk", "론"));
		
		while(!qMessage.isEmpty()) {
			Message message=qMessage.poll();
			
			switch(message.command) {
				case "Mail":
					System.out.println(message.to+"님에게 메일을 발송했습니다.");
					
					break;
				case "DM":
					System.out.println(message.to+"님에게 DM을 전송했습니다.");
					
					break;
				case "Kakaotalk":
					System.out.println(message.to+"님에게 카카오톡을 전송했습니다.");
					
					break;
			}
			
		}
	}
}

package collection.stack_queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(1));
		coinBox.push(new Coin(2));
		coinBox.push(new Coin(3));
		coinBox.push(new Coin(4));
		coinBox.push(new Coin(5));
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			
			System.out.println("꺼낸 코인 -> "+coin.getValue());
		}
	}
}

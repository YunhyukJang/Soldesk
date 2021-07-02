package collection.vector;

import java.util.List;
import java.util.Vector;

public class BoardMain {

	public static void main(String[] args) {
		List<Board> list=new Vector<Board>();
		
		list.add(new Board("제목 1", "내용 1", "작가 1"));
		list.add(new Board("제목 2", "내용 2", "작가 2"));
		list.add(new Board("제목 3", "내용 3", "작가 3"));
		list.add(new Board("제목 4", "내용 4", "작가 4"));
		list.add(new Board("제목 5", "내용 5", "작가 5"));
		
		for(int i=0; i<list.size(); i++) {
			Board board=list.get(i);
			
			System.out.println(board.subject);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println("--------------------");
		}
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board=list.get(i);
			
			System.err.println(board.subject);
			System.err.println(board.content);
			System.err.println(board.writer);
			System.err.println("--------------------");
		}
	}
}

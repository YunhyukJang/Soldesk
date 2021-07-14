package pk13;

public class BookShelf extends Shelf implements Queue {
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //삭제와 동시에 삭제한 원소를 반환
	}

	@Override
	public int getSize() {
		return getCount();
	}
}

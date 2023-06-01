package shelf;

public class BookShelf extends Shelf implements Queue{

	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
	}

	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return shelf.size();
	}

}

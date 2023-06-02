package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.enQueue("반응형 웹");
		bookShelf.enQueue("혼공 Java");
		bookShelf.enQueue("스프링 부트");
		
		System.out.println(bookShelf.getSize() + "권");
		
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		
		
			
	}

}

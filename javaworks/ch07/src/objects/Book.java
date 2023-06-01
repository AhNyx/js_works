package objects;

public class Book {

	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	//메소드 재정의
	@Override
	public String toString() {
		return bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber) return true;
		}
		return false;
	}
	
	
}

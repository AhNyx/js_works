package objectarray;

public class Book {
	String bookName;
	String author;
	
	Book(){}
	
	Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	String getBookName() {
		return bookName;
	}
	
	String getAuthor() {
		return author;
	}
	
}

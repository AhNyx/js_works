package objects;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = new String("오상식");
		String name2 = new String("오상식");
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		System.out.println("======================");
		Book book1 = new Book(1, "혼공 자바");
		Book book2 = new Book(1, "혼공 자바");
		
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		System.out.println(name1.hashCode());
	}

}

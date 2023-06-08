package strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
				
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 주소값 " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android" );
		buffer.append(" programming is Fun!! ");
		
	}

}

package statics;

public class StudentTest2 {

	public static void main(String[] args) {
		//학번 자동 부여
		Student kim = new Student();
		Student kim2 = new Student();
		
		System.out.println(kim.getStudentId());
		System.out.println(kim2.getStudentId());
	}

}

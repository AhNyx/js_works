package statics;

public class StudentTest {

	public static void main(String[] args) {
	// 학생 객체 생성(lee - 힙 메모리 영역 위치
		Student lee = new Student();
		
	//lee.name = "이대한";
		lee.setName("이대한");
		lee.setStudentId(1001);
		System.out.println("이름 : " + lee.getName());
		System.out.println("학번 : " + lee .getStudentId());
		
	}

}

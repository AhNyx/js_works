package statics;

public class Student {
	private static int serialNum = 1000;
	private int studentId;
	private String name;
	
	Student(){
		serialNum++;
		studentId = serialNum;
	}
	
	//get(), set()
	String getName() {
		return name;
	}
	
	int getStudentId() {
		return studentId;		
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setStudentId(int n1) {
		this.studentId = n1;
	}
}	

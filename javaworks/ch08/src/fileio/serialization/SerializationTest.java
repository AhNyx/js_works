package fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String[] args) {
		//클래스의 직렬화(현재의 상태를 그대로 저장)
		Person son = new Person("손정의","대표이사");
		
		//보조 스트림 - ObjectOutputStream
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(son);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//역 직렬화 - 복원
		
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			System.out.println(ois.readObject().toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

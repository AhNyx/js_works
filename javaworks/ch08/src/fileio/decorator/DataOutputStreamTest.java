package fileio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("file1.txt");
			DataOutputStream dos = new DataOutputStream(fos);){
			
			dos.writeByte(65);
			dos.writeChar(65);
			dos.writeInt(65);
			dos.writeFloat(2.54f);
			dos.writeUTF("감사합니다");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
		
		// 기반 스트림 - FileInputStream
		// 보조 스트림 - DataInputStream
		try(FileInputStream fis = new FileInputStream("file1.txt");
			DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

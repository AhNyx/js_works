package fileio;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) throws IOException {
		System.out.println("여러개의 문자를 입력하고 [Enter]를 누르세요");
		
		int readByte;
		
		//구현 1
		/*while(true) {
			readByte = System.in.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);
		}*/
		//구현 2
		int data;
		while((data = System.in.read()) != -1);{
			System.out.print((char)data); // 데이터 출력
		}
		
		
		/*while(true) {
			try {
				readByte = System.in.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}  catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}
	
}

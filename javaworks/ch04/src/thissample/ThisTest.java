package thissample;

public class ThisTest {
	public static void main(String[] args) {
		Brithday bDay = new Brithday();
		bDay.setYear(2023);
		
		
		//객체 주소 비교(같음)
		System.out.println(bDay);
		bDay.printThis();
	}
}

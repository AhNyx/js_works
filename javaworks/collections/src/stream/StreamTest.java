package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> companyList = new ArrayList<>();
		companyList.add("현대");
		companyList.add("삼성");
		companyList.add("엘지");
		
		//Arrays 클래스 사용
		List<String> companyList2 = Arrays.asList("현대","삼성","LG");
		
		for(String company : companyList)
			System.out.println(company);
		//Stream 클래스 - 람다식
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
	}
}

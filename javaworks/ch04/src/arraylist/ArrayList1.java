package arraylist;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		//기본 10개의 저장 공간이 생성
		ArrayList<String> cartlist = new ArrayList<>();
		
		//자료 저장 - add() 함수
		cartlist.add("계란");
		cartlist.add("콩나물");
		cartlist.add("커피");
		
		System.out.println(cartlist.get(0));
		System.out.println(cartlist.get(1));
		
		//cartList의 크기
		System.out.println(cartlist.size());

		//전체 요소 출력
		for(int i=0;i<cartlist.size();i++) { // 리스트를 순회하면서
			String cart = cartlist.get(i); // 요소를 가져와서 cart 변수에 할당
			System.out.println(cart); // 출력함
		}
		
		// 요소 수정 - set()
		cartlist.set(0, "라면");
		
		// 요소 삭제 - remove()
		//cartlist.remove("1");
		//contains() - 객체를 포함하다. 인덱스가 없으면 예외 발생되므로 contains() 사용 권장
		if(cartlist.contains(cartlist.get(2)))
			cartlist.remove(2);
		
		
		for(String cart : cartlist) {
			System.out.println(cart);
		}
		
		
	}
}

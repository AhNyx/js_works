package arraylist;

import java.util.ArrayList;

public class Cart {

	public static void main(String[] args) {
		ArrayList<String> cartlist = new ArrayList<>();
		
		cartlist.add("커피");
		cartlist.add("계란");
		cartlist.add("생수");
		
		// 리스트 개수
		System.out.println(cartlist.size());
		
		//전체 조회
		for(int i=0; i<cartlist.size(); i++) {
			String cart = cartlist.get(i);
			System.out.println(cart);
		}
		
		// 요소 수정
		cartlist.set(0, "라면");
		
		// 요소 삭제
		cartlist.remove(2);
		
		for(String cart : cartlist)
			System.out.println(cart);
		
		
	}

}

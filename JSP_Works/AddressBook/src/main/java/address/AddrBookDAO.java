package address;

import java.util.ArrayList;

public class AddrBookDAO {
	
	private ArrayList<AddrBook> addrList = new ArrayList<>();
	
	//자료 삽입
	public void add(AddrBook addrBook) {
		addrList.add(addrBook);
	}
	
	// 자료 목록 조회(출력)
	public ArrayList<AddrBook> getList(){
		return addrList;
	}
	
	//주소 상세보기
	public AddrBook getAddrBook(String username) {
		
		AddrBook addrBook = null;
		
		for(int i=0;i<addrList.size();i++) { //전체를 순회하면서
			String dbUsername = addrList.get(i).getUsername();
			if(dbUsername.equals(username)) {
				addrBook = addrList.get(i); // 주소를 가져옴
				break;
			}
		}
		return addrBook;
	}
	
	//주소 삭제
	public void deleteAddrBook(String username) {
		AddrBook addrBook = null;
		
		for(int i=0;i<addrList.size();i++) { //전체를 순회하면서
			String dbUsername = addrList.get(i).getUsername();
			if(dbUsername.equals(username)) {
				addrBook = addrList.get(i); // 주소를 가져옴
				addrList.remove(addrBook);
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
}

package address;

import java.util.ArrayList;

public class AddrBookDAO {
	
	private ArrayList<AddrBook> addrList = new ArrayList<>();
	
	//�ڷ� ����
	public void add(AddrBook addrBook) {
		addrList.add(addrBook);
	}
	
	// �ڷ� ��� ��ȸ(���)
	public ArrayList<AddrBook> getList(){
		return addrList;
	}
	
	//�ּ� �󼼺���
	public AddrBook getAddrBook(String username) {
		
		AddrBook addrBook = null;
		
		for(int i=0;i<addrList.size();i++) { //��ü�� ��ȸ�ϸ鼭
			String dbUsername = addrList.get(i).getUsername();
			if(dbUsername.equals(username)) {
				addrBook = addrList.get(i); // �ּҸ� ������
				break;
			}
		}
		return addrBook;
	}
	
	//�ּ� ����
	public void deleteAddrBook(String username) {
		AddrBook addrBook = null;
		
		for(int i=0;i<addrList.size();i++) { //��ü�� ��ȸ�ϸ鼭
			String dbUsername = addrList.get(i).getUsername();
			if(dbUsername.equals(username)) {
				addrBook = addrList.get(i); // �ּҸ� ������
				addrList.remove(addrBook);
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
}

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
}

package beans;

import java.io.Serializable;

public class LoginBean implements Serializable{

	private static final long serialVersionUID = 2L;
	
	//�ʵ�
	private String userid;
	private String passwd;
	
	private final String _userid = "today";
	private final String _passwd = "1234";
	
	//������
	public LoginBean() {}
	
	//�α��� üũ
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}

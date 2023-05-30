package beans;

import java.io.Serializable;

public class MemberBean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private int id = 2923101;
	private String name = "Àå±×·¡";
	
	public MemberBean() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package sec14;

public class User 
{
	//Field
	private String uid;
	private String uname;
	private String upassword;
	private int uage;
	private boolean uadult;  // get �� �ƴ� is �� �޼������ ex)isAdult
	//Constructor
	
	
	
	//Method
	//�޴� Source - Generate Getter and Setter �� �ڵ� ���� ����
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public boolean isUadult() {
		return uadult;
	}
	public void setUadult(boolean uadult) {
		this.uadult = uadult;
	}
	
	
	
}

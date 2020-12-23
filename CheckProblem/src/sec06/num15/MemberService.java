package sec06.num15;

public class MemberService
{
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password)
	{
		boolean result;
		
		if(this.id == id && this.password == password)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result; 
	}
	
	void logout(String id)
	{
		if(this.id == id)
		{
			System.out.println("로그아웃 되었습니다");
		}
	}
}

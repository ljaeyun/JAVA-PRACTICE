package sec14;

public class Example 
{
	public static void main(String[] args)
	{
		User user = new User();
		
		//System.out.println(user.uid);  // private 라서 접근이 불가능하다
		System.out.println(user.getUid()); // 변수가 private지만 public 메서드를 통해 값을 불러올수 있다
		
		user.setUid("WEATHER");
		
		System.out.println(user.isUadult());
		user.setUadult(true);		//uadult true로 저장
		
	}
}

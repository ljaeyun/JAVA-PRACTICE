package sec14;

public class Example 
{
	public static void main(String[] args)
	{
		User user = new User();
		
		//System.out.println(user.uid);  // private �� ������ �Ұ����ϴ�
		System.out.println(user.getUid()); // ������ private���� public �޼��带 ���� ���� �ҷ��ü� �ִ�
		
		user.setUid("WEATHER");
		
		System.out.println(user.isUadult());
		user.setUadult(true);		//uadult true�� ����
		
	}
}

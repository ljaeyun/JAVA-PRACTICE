package sec11;

public class Example 
{

	public static void main(String[] args) 
	{
		// Korean.nation = "america";   // final�� ���� �ٸ� ������ ������ ���� ���� ���� �߻�  
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		System.out.println(k1.ssn);
		
		// k1.ssn = "987654-363579"; // final �� ���� ���� �Ұ���  
		//System.out.println(k1.ssn);
	}

}

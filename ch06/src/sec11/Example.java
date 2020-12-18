package sec11;

public class Example 
{

	public static void main(String[] args) 
	{
		// Korean.nation = "america";   // final로 인해 다른 값으로 변경할 수가 없어 에러 발생  
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		System.out.println(k1.ssn);
		
		// k1.ssn = "987654-363579"; // final 로 인해 수정 불가능  
		//System.out.println(k1.ssn);
	}

}

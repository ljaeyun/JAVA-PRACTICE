package sec09;

public class Example 
{

	public static void main(String[] args) 
	{
		//정적 필드 읽기
		System.out.println(Korean.nation);
		
		//정적 필드 수정 
		Korean.nation = "일본";
		System.out.println(Korean.nation);
		
		//객체를 만들어서 호출
		// Korean.getNation(); 에러
		
		Korean k1 = new Korean();
		//System.out.println(k1.getNation());
		System.out.println(Korean.getNation()); // 메서드 호출
		
		//System.out.println(Korean.getName());  //객체만들어야함
	}

}

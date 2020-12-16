package sec04;

public class Exam01 
{

	public static void main(String[] args) 
	{
		/* null의 의미 = 아직 번지를 가지고 있지 않다
		 * 
		 * 기본 타입 변수에는 null을 저장할 수 없다
		 * int var1 = null; double var2 =null; boolean var3 = null;
		 * 
		 */
		
		//참조 타입 변수에는 null을 저장할 수 있다
		String var4 = null; // 아직 참조할곳이 없다는 뜻
		int[] var5 = null;
		
		//null 비교
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 != null);
		System.out.println(var6 == null);
		
		System.out.println(var7 != null);
		System.out.println(var7 == null);

	}

}


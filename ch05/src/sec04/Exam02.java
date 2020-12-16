package sec04;

public class Exam02 
{

	public static void main(String[] args) 
	{
		String var1 = "123456-1234567";
		int num = var1.length();
		System.out.println(num);

		//String var2 = null;
		//if(var2 != null){   예외처리가 더 좋다 try catch
		//int num1 = var2.length();
		//System.out.println(num1);
		//}
		
		
		String n1 = "test";
		String n2 = "test";
		String n3 = new String("test");
		
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		System.out.println(n2 == n3); //객체가 참조하는 주소가 달라 false 출력 문자열만 비교하기 위해서는 .equals() 를 사용
	}

}
// String 불변객체
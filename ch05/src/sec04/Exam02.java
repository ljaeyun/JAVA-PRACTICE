package sec04;

public class Exam02 
{

	public static void main(String[] args) 
	{
		String var1 = "123456-1234567";
		int num = var1.length();
		System.out.println(num);

		//String var2 = null;
		//if(var2 != null){   ����ó���� �� ���� try catch
		//int num1 = var2.length();
		//System.out.println(num1);
		//}
		
		
		String n1 = "test";
		String n2 = "test";
		String n3 = new String("test");
		
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		System.out.println(n2 == n3); //��ü�� �����ϴ� �ּҰ� �޶� false ��� ���ڿ��� ���ϱ� ���ؼ��� .equals() �� ���
	}

}
// String �Һ���ü
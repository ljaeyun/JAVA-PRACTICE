package sec04;

public class Exam02 
{

	public static void main(String[] args) 
	{
		//�� ������
		
		//1.���� ��
		int var1 = 3;
		int var2 = 4;
		boolean var3 = var1 == var2; // !=
		System.out.println("var3 : " + var3);
		
		//2.���ڿ� ��
		String var4 = "java";
		String var5 = "Java";
		boolean var6 = var4.equals(var5);
		boolean var7 = !var4.equals(var5);
		
		
		//3.��Һ�
		int var8 = 3;
		int var9 = 2;
		
		boolean var10 = var8 >= var9;
		//���� boolean var10 = var8 <= var9; or boolean var10 = !(var8 >= var9);
		System.out.println("var10 : " + var10);

	}

}

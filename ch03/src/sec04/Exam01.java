package sec04;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//��� ����(+, -, *, /)�� ������ ��
		
		//long�� �ƴ� ������ ���� ������ ����� int ���̴�.
		byte var1 = 1;
		byte var2 = 2;
		// byte var3 = var1 + var2;    // int var4 = var1 + var2; �����ϸ� int ������ 
		byte var4 = 1 + 2;

		
		//long ������ ������ ����� long �̴�.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		
		
		//������ �������� ������
		int var8 = 10;
		int var9 = 4;
		double var10 = var8 / var9;
		System.out.println(var10);
		
		//�Ҽ��� ���ϸ� ��� ������ �Ǽ� ��������� ����
		//double var11 = 1.0 * var8 / var9;
		double var11 = (double)var8 / var9;
		System.out.println(var11);
		
		//�������� ���ϴ� ���
		int var12 = var8 % var9;
		System.out.println(var12);
	}

}

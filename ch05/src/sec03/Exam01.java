package sec03;

public class Exam01
{

	public static void main(String[] args) 
	{
		// ������ ���� ����
		
		int var1 = 10;
		int var2 = 100;
		int var3 = 100;
		
		
		System.out.println(var1 == var2);//false
		System.out.println(var1 == var3);//false
		System.out.println(var2 == var3);//true
		// ���� �񱳸� ���� ��
		int[] var4 = {10};
		
		int[] var5 = {100};
	
		int[] var6 = {100};
		//int[] var6 = var5;    ���� ��(����)�� �����ϹǷ� true
		
		int[] var7 = {100, 101};
		
		
		System.out.println(var4 == var5);//false
		System.out.println(var4 == var6);//false
		System.out.println(var5 == var6);//false
		//�����ǰ� �ִ� ���� ���� ��  var5 �� var6 �� �����ϴ� ��ü�� �� �ٸ��� ������ false�� ���´�
		
		System.out.println(var7[0] == var7[1]);

		
		
		//int x = null �Ұ��� �⺻ Ÿ�� �������� null�� ������������
		//String x = null ���� ���� ������ ������ ���� �ʴ�
		//int[] y = null ����  ����Ÿ�Կ��� null�� ������ �ִ�
	}

}

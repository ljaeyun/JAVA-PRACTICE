package sec04;

public class Exam01 
{

	public static void main(String[] args) 
	{
		/* null�� �ǹ� = ���� ������ ������ ���� �ʴ�
		 * 
		 * �⺻ Ÿ�� �������� null�� ������ �� ����
		 * int var1 = null; double var2 =null; boolean var3 = null;
		 * 
		 */
		
		//���� Ÿ�� �������� null�� ������ �� �ִ�
		String var4 = null; // ���� �����Ұ��� ���ٴ� ��
		int[] var5 = null;
		
		//null ��
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 != null);
		System.out.println(var6 == null);
		
		System.out.println(var7 != null);
		System.out.println(var7 == null);

	}

}


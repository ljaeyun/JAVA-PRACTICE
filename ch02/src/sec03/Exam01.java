package sec03;

public class Exam01
{

	public static void main(String[] args)
	{
		//Ÿ�� ��ȯ�� ���ؼ� �˾ƺ���
		
		//���� Ÿ���� ū Ÿ�Կ� ������ �����ϴ�
		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;

		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//ūŸ���� ���� Ÿ�Կ� ������ �Ұ����ϴ�
//		long var5 = 10;
//		int var6 = var5;
//		short var7 = var5;
//		byte var8 = var5;
		
		//���� Ÿ�� ��ȯ (Ÿ��) ������ ���� �����Ǵ� �����ȿ��� Ÿ�� ��ȯ ���ִ°��� ����
		long var5 = 200;
		int var6 = (int)var5;
		short var7 = (short)var5;
		byte var8 = (byte)var5;
		
		System.out.println("\n");
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		
		//���ڿ��� ���� �Ǵ� �Ǽ��� ��ȯ
		String var9 = "300";
		int var10 = Integer.parseInt(var9);
		System.out.println("\n");
		System.out.println(var10);
		
		String var11 = "300.4";
		double var12 = Double.parseDouble(var11);
		System.out.println(var12);
	}

}

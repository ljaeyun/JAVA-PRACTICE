package sec03;

public class num02 
{

	public static void main(String[] args) 
	{
		
		// z�� ����?
		int x = 10;
		int y = 20;
		
		int z = (++x) + (y--);
		System.out.println(z);
		
		
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result = byteValue + byteValue;  �ڵ����� int ������ ����ϱ� ������ ������ �Ұ��� -> byte �� ����ȯ �ʿ�
// 		System.out.println(result);
		int result1 = 5 + byteValue;
		System.out.println(result1);
		float result2 = 5 + floatValue;
		System.out.println(result2);
		double result3 = 5 + doubleValue;
		System.out.println(result3);
		
		// ���� �߻� char var3 = ''; char ���� �ּ� �ѹ��ڰ� �ʿ�
		
		int intValue = 10;
		char charValue = 'A';
		double doubleValue1 = 5.7;
		String strValue = "A";
		
		double var = (double)intValue;
		byte var1 = (byte)intValue;
		int var2 = (int)doubleValue;
//		char var3 = (char)strValue; string �� char �� ��ȯ �Ұ���
	}

}

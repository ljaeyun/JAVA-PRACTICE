package sec03;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//���� ������(++, --, +=, -=, *=, /=, !)
		
		// ���� �����ڿ� ���� �˾ƺ���
		int var1 = 1;
		// 1 �� ����
		
		var1++; // ���̽㿡�� ���������ڰ� ����
		
		++var1;
		
		System.out.println("var1 : " + var1);
		
		
		var1--;
		
		--var1;
		
		System.out.println("var1 : " + var1);
		
		//�ٸ� �����ڿ� ���� ����� ��� ����
		int var2 = 1;
		int var3 = var2++ + 5;
		
		System.out.println("var3 : " + var3);
		
		//���� ���� ������ ���� �����ϴ� �����
		int var4 = 1;
		var4 += 3; //var4 = var4 + 3;
		var4 -= 3;
		var4 *= 3;
		var4 /= 3;
		
		//������ �����ϴ� �����
		boolean var5 = false;
		boolean var6 = !var5; 
		
		
		
		
		System.out.println(var6);

	}

}

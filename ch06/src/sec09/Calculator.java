package sec09;

public class Calculator 
{
	//Field
	String company; // ȸ�縶�� �̸��� �ٸ��Ƿ� static x
	static double pi = 3.14159; // ������ ���� ������ �Ź� ��ü�� ����� �޸� ���� �̹Ƿ� static 
	double memory; // �Ź� ����� ������ ���� ���ϹǷ� static x
	
	
	//constructor
	
	
	//method
	static double circleArea(double r) // �ν���Ʈ �ʵ尡 ���� static pi �� ��� �Ǿ����Ƿ� static
	{
		double area = r * r * pi; //this.pi �Ұ��� this�� ��ü �ڽ��� ���ϴ� �������� static �� ��ü�� �����Ƿ� ��� �Ұ���
		return area;
	}
	
	static void setMemory(double r)
	{
		circleArea(r);
	}
	
	
	void setMemory2(double r) // �ν���Ʈ �ʵ� memory�� ��������Ƿ� static ��� �Ұ�
	{
		double result = circleArea(r);
		this.memory = result;
	}
	
	static void method1()
	{
		String company = "�Ｚ";  //�ʵ尡 �ƴ� �Ϲ� ���� �̹Ƿ� static ����
		String name = "hundai";
		int round = 3;
		System.out.println("������ �����");
	}
	
	void method2() // static �Ұ���
	{
		company = "�Ｚ";  // 100% �ν���Ʈ �ʵ� ���
		setMemory(10);  // �ν���Ʈ �޼���
		System.out.println("������ �����");
	}
}

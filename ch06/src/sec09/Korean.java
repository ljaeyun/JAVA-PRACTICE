package sec09;

public class Korean 
{
	//field
	static String nation = "�ѱ�"; // ����ǰ� �ٲ��� ���� �� ���� �ʵ� static�� ���� ������ �ִ´� ��ü ���̵� ��� ����
	//�ν���Ʈ �ʵ�
	String name; // �ݵ�� ��ü�� ���� ����Ѵ�
	
	
	
	//constructor
	
	
	//method
//	String getNation() // ��ü�� �־�� ��� ����
//	{
//		//���� �ʵ� �Ǵ� ���� �޼ҵ常���� ����
//		return nation;
//	}
	
	static String getNation() // ��ü ��� ��� ����
	{
		//���� �ʵ� �Ǵ� ���� �޼ҵ常���� ����
		return nation;
	}
	
	String changeNation()		//static ��� ���������� ���ο� ��ü�� �ʿ���ϴ°��� ���� �ȵȴ�  EX) age ���� 
	{
		Korean.nation = getNation();
		Korean.nation = "���ѹα�";
		
		return nation;
	}
	
	//static�� ���� �ʵ带 ���� �޼��嵵 static�� ���̸� �ȵȴ�
	
	String getName()
	{
		//�ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼��� ȣ���� ���ԵǾ� ������
		// �޼���� �ν��Ͻ� �޼��忩�� �Ѵ�.    (static ���Ұ�)
		Korean.nation = "�ѱ�";
		return name;
	}
}

package sec09;

public class Example 
{

	public static void main(String[] args) 
	{
		//���� �ʵ� �б�
		System.out.println(Korean.nation);
		
		//���� �ʵ� ���� 
		Korean.nation = "�Ϻ�";
		System.out.println(Korean.nation);
		
		//��ü�� ���� ȣ��
		// Korean.getNation(); ����
		
		Korean k1 = new Korean();
		//System.out.println(k1.getNation());
		System.out.println(Korean.getNation()); // �޼��� ȣ��
		
		//System.out.println(Korean.getName());  //��ü��������
	}

}

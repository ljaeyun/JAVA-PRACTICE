package sec06;

public class Exam01 
{

	public static void main(String[] args) 
	{
		int[] scores= {95, 80, 71, 90, 100};
		for(int i = 0 ; i < scores.length ; i++)
		{
			System.out.println(scores[i]);
		}
		
		int[] scores2 = null;
		if(scores2 == null)
		{
			scores2 = new int[] {51,87,65,94,21};    //null �� ������ �迭�� ���ؼ��� new �� ���ο� ��ü�� ������ �Ѵ�.
		}
		System.out.println(scores2[0]);
		
		// �޼ҵ带 �����ϱ� ���ؼ��� ȣ���� �ؾ��Ѵ�
		String[] names = {"�ڹ�" , "���̽�" , "�ڹٽ�ũ��Ʈ"};
		
		//printNames(new String[]{"�ڹ�" , "���̽�" , "�ڹٽ�ũ��Ʈ"});    // �޼ҵ忡�� �̸� �迭�� �����߱� ������ ���ο� ��ü �迭�� ����
		
		printNames(names); // �޼ҵ忡 �Ű����� ���� ->��������
	}

	//�޼ҵ� ����(����)
	public static void printNames(String[] names)   //names�� �迭���� 
	{
		for(int i = 0 ; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	
}

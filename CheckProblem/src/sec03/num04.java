package sec03;

public class num04 
{

	public static void main(String[] args) 
	{
		int pencils = 534;
		int students = 30;
		
		//�л� �Ѹ��� ������ ���� �� 
		int pencilsPerStudent = pencils / students;
		System.out.println("�л� �Ѹ��� ������ ���� �� : " + pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println("���� ���� �� : " + pencilsLeft);

	}

}

package sec05;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//����(����) ����Ŀ� ���� �˾ƺ��� (�����) ? A : B ; 
		
		int score = 95;
		char grade = (score >= 90) ? 'A' : 'B';
		
		
		char grade2 = 'A';
		
		String result = (grade2 == 'A') ? "100" : "30";
		
		System.out.println("grade : " + grade);
		
		System.out.println("result : " + result);

	}

}

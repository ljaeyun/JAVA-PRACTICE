package sec06;

public class Exam10 
{

	public static void main(String[] args) 
	{
		String[][] boards = new String[100][4];
		
		//���ο� �Խù� ����
		boards[0] = new String[] {"1", "����1", "����1", "�۾���1"};
		boards[1] = new String[] {"2", "����2", "����2", "�۾���2"};
		boards[2] = new String[] {"3", "����3", "����3", "�۾���3"};
		//boards[2] = {"3", "����3", "����3", "�۾���3"}; �̹� null ���� �ִ� ���¿��� �ش� �� ���� �ȵ�
		
		//2�� �Խù� ����
		/*boards[1][0] = null;
		boards[1][1] = null;
		boards[1][2] = null;
		boards[1][3] = null;*/
		
		boards[1] = new String[] {null, null, null, null};
		
		//�Խù� ����
		String newTitle = "����";
		String newContent = "�߿���";
		
		boards[0][1] = newTitle;
		boards[0][2] = newContent;
		
		//�Խù� ��� ����
		System.out.println("--------------------------");
		for(int i = 0 ; i < boards.length ; i++)
		{
			if(boards[i][0] !=null)
			{
				for(int j = 0 ; j < boards[i].length ; j++)
				{
					System.out.print(boards[i][j] + " | ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");

	}

}

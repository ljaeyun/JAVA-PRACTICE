package homework;

public class Practice 
{

	public static void main(String[] args) 
	{
		Board[] boards = new Board[100];
		
		//���ο� �Խù� ����
		Board board0 = new Board();  // board ��ü ����
		board0.setBno(1);
		board0.setBti("����1");
		board0.setBcont("����1");
		board0.setBwri("�۾���1");    // ���� board ��ü ����  ���� 0��° �ּҸ� board ��ü�� ���� �ּ� �����ϵ��� �Ѵ�
		
		Board board1 = new Board();  // board ��ü ����
		board1.setBno(2);
		board1.setBti("����2");
		board1.setBcont("����2");
		board1.setBwri("�۾���2");
		
		Board board2 = new Board();  // board ��ü ����
		board2.setBno(3);
		board2.setBti("����3");
		board2.setBcont("����3");
		board2.setBwri("�۾���3");
		
	
		boards[0] = board0;
		boards[1] = board1;
		boards[2] = board2;
	
		
		//�Խù� ����
		boards[0] = null;
		boards[1] = null;
		boards[2] = null;
		
		//�Խù� ��ȣ�� 2�� �Խù� ����
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // ���ο� ��ü ����
			if(board.getBno() == 2)
			{
				boards[i] = null;  // �޸� �ּҰ��� �����ϸ鼭 ������ ��ü�� �����
			}
		}
		
		
		//�Խù� ��ȣ�� 2�� �Խù� ����
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // ���ο� ��ü ����
			if(board.getBno() == 2)
			{
				board.setBti("������ ����");
				board.setBcont("�����ȳ���");
			}
		}
		
		
		//�Խù� ��� ����
		System.out.println("--------------------------");
		for(int i = 0 ; i < boards.length ; i++)
		{
			Board board = boards[i]; // ���ο� ��ü ����
			System.out.print(board.getBno() + "\t");
			System.out.print(board.getBti() + "\t");
			System.out.print(board.getBcont() + "\t");
			System.out.print(board.getBwri() + "\t");
			System.out.println();
		}
		System.out.println("--------------------------");

	}

}

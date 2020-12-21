package homework;

import java.util.Scanner;

public class HomeWork 
{

	public static void main(String[] args) 
	{
		int maxIndex = 10; // �Խù� ��
		
		Scanner sc = new Scanner(System.in);
		//�Խù��� ���� �����Ҷ����� 1�� ���� �Ǿ�� �Ѵ�.
		int nextBno = 1;
		
		//String[][] boards = new String[maxIndex][4];
		
		Board[] boards = new Board[maxIndex];
		
		//�ʱ�ȭ
		for(int i = 0 ; i < maxIndex ; i++)
		{
			boards[i] = new Board();
		}
		

		while(true)
		{
			System.out.println("---------------------------------------------");
			System.out.println("1.��� | 2.���� | 3.�󼼺��� | 4.���� | 5.���� | 6.����");
			System.out.println("---------------------------------------------");

			System.out.print("��ȣ �Է� : ");
			//int selNum = Integer.parseInt(sc.nextLine());
			String selNum = sc.nextLine();  // ���ڿ��� �Է¹޾� ��
			
			if(selNum.equals("1"))
			{
				// ��� ���
				
				System.out.println("��ȣ \t ���� \t ���� \t �۰�");
				System.out.println("------------------------------");
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // ���ο� ��ü ����
					System.out.print(board.getBno() + "\t");
					System.out.print(board.getBti() + "\t");
					System.out.print(board.getBcont() + "\t");
					System.out.print(board.getBwri() + "\t");
					System.out.println();
				}
					System.out.println();
				
			}
			else if(selNum.equals("2"))
			{
				// ���ο� �Խù� �Է¹޾� ���� �Խù� ��ȣ�� nextBno�� ������ ���� , �Խù��� ���� ��ġ�� �Խù� ��ȣ�� 0�� ���� ã�Ƽ� ����, ����, ����, �۾��� ����
				System.out.print("������ �Է��ϼ��� : ");
				String title = sc.nextLine(); // ����
				System.out.print("������ �Է��ϼ��� : ");
				String content = sc.nextLine(); // ����
				System.out.print("�۰��� �Է��ϼ��� : ");
				String writer = sc.nextLine(); // �۾���
				
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(boards[i].getBno()== 0)
					{
						Board board = new Board();
						board.setBno(nextBno);
						board.setBti(title);
						board.setBcont(content);
						board.setBwri(writer);
						boards[i] = board;
						nextBno++;
						break;
					}
					//System.out.println();
				}
			
			}
			else if(selNum.equals("3"))
			{
				// �ش� �ε����� �Խù��� ���
				System.out.print("���� �󼼺����� ��ȣ�� �Է��ϼ��� : ");
				String printNum = sc.nextLine();
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // ���ο� ��ü ����
					if(printNum.equals(Integer.toString(board.getBno())))
					{
						System.out.println("��ȣ \t ���� \t ���� \t �۰�");
						System.out.println("------------------------------");
						System.out.print(board.getBno() + "\t");
						System.out.print(board.getBti() + "\t");
						System.out.print(board.getBcont() + "\t");
						System.out.print(board.getBwri() + "\t");
					}
				}
				System.out.println();
			}
			else if(selNum.equals("4"))
			{
				// �ε��� ��ȣ�� �Է� �޾Ƽ� �ش� �ε���������� ������ �Է¹ް� ����
				System.out.print("������ �ε��� ��ȣ�� �Է��ϼ��� : ");
				String modiNum = sc.nextLine(); // ������ �ε��� ��ȣ
				
				System.out.print("������ ������ �Է��ϼ��� : ");
				String modiTi = sc.nextLine(); // ������ ����
				System.out.print("������ ������ �Է��ϼ��� : ");
				String modiCo = sc.nextLine(); // ������ ����
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i]; // ���ο� ��ü ����
					if(modiNum.equals(Integer.toString(board.getBno())))
					{
						board.setBti(modiTi);
						board.setBcont(modiCo);
					}
						//break;
				}
			}
			else if(selNum.equals("5"))
			{
				// �ش� �ε��� �Խù� ����
				System.out.print("������ �ε��� ��ȣ�� �Է��ϼ��� : ");
				String delNum = sc.nextLine();
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					Board board = boards[i];
					if(delNum.equals(Integer.toString(board.getBno())))
					{
						boards[i]= new Board(); 
						break;
					}
				}
			}
			else if(selNum.equals("6"))
			{
				break;
			}
			else
			{
				System.out.println("�߸� �Է��Ͽ����ϴ�");
			}
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}

}

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
		
		String[][] boards = new String[maxIndex][4];
		
		while(true)
		{
			System.out.println("---------------------------------------------");
			System.out.println("1.��� | 2.���� | 3.�󼼺��� | 4.���� | 5.���� | 6.����");
			System.out.println("---------------------------------------------");

			System.out.print("��ȣ �Է� : ");
			//int selNum = Integer.parseInt(sc.nextLine());
			String selNum = sc.nextLine();
			
			if(selNum.equals("1"))
			{
				// ��� ���
				for(int i = 0 ; i < boards.length ; i++)
				{
					for(int j = 0 ; j < boards[i].length ; j++)
					{
						System.out.print(boards[i][j] + " | ");
					}
					System.out.println();
				}
			}
			else if(selNum.equals("2"))
			{
				// ���ο� �Խù� �Է¹޾� ���� �Խù� ��ȣ�� nextBno�� ������ ���� , �Խù��� ���� ��ġ�� �Խù� ��ȣ�� null�� ���� ã�Ƽ� ����, ����, ����, �۾��� ����
				System.out.print("������ �Է��ϼ��� : ");
				String title = sc.nextLine(); // ����
				System.out.print("������ �Է��ϼ��� : ");
				String content = sc.nextLine(); // ����
				System.out.print("�۰��� �Է��ϼ��� : ");
				String writer = sc.nextLine(); // �۾���
				
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(boards[i][0] == null)
					{
						for(int j = 0 ; j < boards[i].length ; j++)
						{
							boards[i][0] = Integer.toString(nextBno);
							boards[i][1] = title;
							boards[i][2] = content;
							boards[i][3] = writer;
							//System.out.print(boards[i][j] + " | ");
						}
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
					if(printNum.equals(boards[i][0]))
					{
						for(int j = 0 ; j < boards[0].length ; j++)
						{
							System.out.print(boards[i][j] +" | ");
						}
						System.out.println();
						break;
					}					
				}
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
					if(modiNum.equals(boards[i][0]))
					{
						for(int j = 0 ; j < boards[0].length ; j++)
						{
							boards[i][1] = modiTi; // ������ ���� ���� 
							boards[i][2] = modiCo; // ������ ���� ����
						}
						System.out.println();
						break;
					}
				}
			}
			else if(selNum.equals("5"))
			{
				// �ش� �ε��� �Խù� ����
				System.out.print("������ �ε��� ��ȣ�� �Է��ϼ��� : ");
				String delNum = sc.nextLine();
				
				for(int i = 0 ; i < boards.length ; i++)
				{
					if(delNum.equals(boards[i][0]))
					{
						boards[i][0] = null; // �ε���
						boards[i][1] = null; // ����
						boards[i][2] = null; // ���� 
						boards[i][3] = null; // �۾���
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

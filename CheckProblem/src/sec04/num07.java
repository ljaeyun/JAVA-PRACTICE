package sec04;
import java.util.Scanner;

public class num07 
{
	public static void main(String[] args) 
	{
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		while(run)
		{
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			int inputNum = scanner.nextInt();
			
			if(inputNum == 1)
			{
				System.out.print("���ݾ�>");
				balance += scanner.nextInt();
				scanner.nextLine();
			}
			else if(inputNum == 2)
			{
				int tempNum;
				System.out.print("��ݾ�>");
				tempNum = scanner.nextInt();
				scanner.nextLine();
				if(balance > 0 && tempNum < balance)
				{
					balance -= tempNum;
				}
				else
				{
					System.out.println("�ܾ��� ���ڸ��ϴ�");
				}
			}
			else if(inputNum == 3)
			{
				System.out.println("�ܰ�>" + balance);
			}
			else if(inputNum == 4)
			{
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}

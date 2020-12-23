package sec06.num20;

import java.util.Scanner;

public class BankApplication
{
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		boolean run = true;
		while(run)
		{
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();   //nextInt() ���� ����
			if(selectNo == 1)
			{
				createAccount();
			}
			else if(selectNo == 2)
			{
				accountList();
			}
			else if(selectNo == 3)
			{
				deposit();
			}
			else if(selectNo == 4)
			{
				withdraw();
			}
			else if(selectNo == 5)
			{
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� ����
	private static void createAccount()
	{
		
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String tempAno = sc.nextLine();
		
		System.out.print("������ : ");
        String tempOwner = sc.nextLine();
		
		System.out.print("�ʱ��Աݾ� : ");
		int tempBalance = sc.nextInt();
		
		System.out.println();
		for(int i = 0 ; i < accountArray.length ; i++)
		{
			if(accountArray[i] == null)
			{
				Account ac=  new Account(tempAno, tempOwner,tempBalance);
				ac.setAno(tempAno);
				ac.setOwner(tempOwner);
				ac.setBalance(tempBalance);
				accountArray[i] = ac;
				break;
			}
		}
		
	}
	
	//���� ���
	private static void accountList()
	{
		
			System.out.println("-------");
			System.out.println("���¸��");
			System.out.println("-------");
			
			for(int i = 0 ; i < accountArray.length ; i++)
			{
				if(accountArray[i] != null)
				{
					Account ac = accountArray[i];
					System.out.println(ac.getAno() + "\t"+ ac.getOwner() + "\t" + ac.getBalance());
				}
			}
	}
	
	//�����ϱ�
	private static void deposit()
	{
		boolean result = false;
		String result2;
		
		System.out.println("-------");
		System.out.println("����");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String tempAno = sc.nextLine();
		
		System.out.print("���ݾ� : ");
		int tempBalance = sc.nextInt();

		if(tempBalance > 0 && findAccount(tempAno)!=null)
		{
			findAccount(tempAno).setBalance(findAccount(tempAno).getBalance()+ tempBalance);
			result = true;
		}
		else
		{
			result = false;
		}
		
		
		if(result == true)
		{
			result2 = "�����Ͽ����ϴ�";
		}
		else
		{
			result2 = "�����߽��ϴ�";
		}
		
		System.out.println("��� : " + result2);
	}
	
	//����ϱ�
	private static void withdraw()
	{
		boolean result = false;
		String result2;
		
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String tempAno = sc.nextLine();
		
		System.out.print("��ݾ� : ");
		int tempBalance = sc.nextInt();
		
		
		if(tempBalance <= findAccount(tempAno).getBalance() && findAccount(tempAno)!=null)
		{
			findAccount(tempAno).setBalance(findAccount(tempAno).getBalance() - tempBalance);
			result = true;
		}
		else //if(findAccount(tempAno).getBalance() < 0)
		{
			
			result = false;
		}
		
		
		if(result == true)
		{
			result2 = "�����Ͽ����ϴ�";
		}
		else
		{
			result2 = "�����߽��ϴ�";
		}
		
		System.out.println("��� : " + result2);
	}
	
	//account �迭���� ano�� ������ account ��ü ã��
	private static Account findAccount(String ano)
	{
		//int temp = 0;
		Account ac = null;
		for(int i = 0 ; i < accountArray.length ; i++)
		{
			if(accountArray[i] != null)
			{
				if(accountArray[i].getAno().equals(ano))
				{
					ac = accountArray[i];
					break;
				}
			}
		}
		return ac;
	}
}

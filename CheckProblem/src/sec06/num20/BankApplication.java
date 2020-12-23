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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();   //nextInt() 에러 방지
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
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성
	private static void createAccount()
	{
		
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String tempAno = sc.nextLine();
		
		System.out.print("계좌주 : ");
        String tempOwner = sc.nextLine();
		
		System.out.print("초기입금액 : ");
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
	
	//계좌 목록
	private static void accountList()
	{
		
			System.out.println("-------");
			System.out.println("계좌목록");
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
	
	//예금하기
	private static void deposit()
	{
		boolean result = false;
		String result2;
		
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String tempAno = sc.nextLine();
		
		System.out.print("예금액 : ");
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
			result2 = "성공하였습니다";
		}
		else
		{
			result2 = "실패했습니다";
		}
		
		System.out.println("결과 : " + result2);
	}
	
	//출금하기
	private static void withdraw()
	{
		boolean result = false;
		String result2;
		
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String tempAno = sc.nextLine();
		
		System.out.print("출금액 : ");
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
			result2 = "성공하였습니다";
		}
		else
		{
			result2 = "실패했습니다";
		}
		
		System.out.println("결과 : " + result2);
	}
	
	//account 배열에서 ano와 동일한 account 객체 찾기
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

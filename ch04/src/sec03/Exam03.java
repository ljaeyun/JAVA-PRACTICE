package sec03;

import java.util.Scanner;

public class Exam03 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		
		while(!stop)
		{
			String data = scanner.nextLine(); // ���ڿ��� ���������
			
			if(data.equals("q"))
			{
				stop = true;
			}
			else
			{
				System.out.println(data);
			}
		}
		
		System.out.println("���α׷��� ���� �մϴ�");
		

	}

}

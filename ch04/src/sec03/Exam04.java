package sec03;

import java.util.Scanner;

public class Exam04 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = false;
		
		do
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
		}while(!stop);
		
		System.out.println("���α׷��� ���� �մϴ�");
		

	}

}

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
			String data = scanner.nextLine(); // 문자열이 만들어진다
			
			if(data.equals("q"))
			{
				stop = true;
			}
			else
			{
				System.out.println(data);
			}
		}while(!stop);
		
		System.out.println("프로그램을 종료 합니다");
		

	}

}

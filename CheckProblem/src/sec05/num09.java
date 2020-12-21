package sec05;

import java.util.Scanner;

public class num09
{

	public static void main(String[] args)
	{
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1)
			{
				System.out.print("학생수 : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];  // 입력받은 수만큼 배열의 길이 정의
			}
			else if(selectNo == 2)
			{
				for(int i = 0 ; i < scores.length ; i++)
				{
					System.out.print("scores[" + i + "]" + ">" );
					scores[i] = sc.nextInt();
				}
			}
			else if(selectNo == 3)
			{
				for(int i = 0 ; i < scores.length ; i++)
				{
					System.out.println("scores[" + i + "]" + ":" +scores[i]);
				}
			}
			else if(selectNo == 4)
			{
				int max = 0;   // 최고점수
				int sum = 0;   // 점수합
				double avg = 0;   //평균
				
				for(int i = 0 ; i < scores.length ; i++)
				{
					if(max < scores[i])
					{
						max = scores[i];
					}
					sum += scores[i];   //합
				}
				avg = sum / scores.length;   //평균
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			}
			else if(selectNo == 5)
			{
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}

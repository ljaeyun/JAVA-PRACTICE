package sec06;

import java.util.Scanner;

public class Exam04 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * arr[0] = 90; arr[1] = 91; arr[2] = 92; arr[3] = 93; arr[4] = 96;
		 */
		System.out.print("학생 수 : ");
		String strStudentNum = sc.nextLine();
		int stuNum = Integer.parseInt(strStudentNum);
		
		int[] arr = new int[stuNum];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print("점수 입력 : ");
			String data = sc.nextLine();
			arr[i] = Integer.parseInt(data);
		}
		
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum += arr[i];
			//System.out.print(arr[i] + ", ");
		}
		
		double avg = (double)sum / arr.length;
		
		System.out.print("평균 : " + avg);
		
		System.out.println();
		
		
		

	}

}

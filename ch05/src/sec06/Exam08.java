package sec06;

import java.util.Scanner;

public class Exam08 
{

	public static void main(String[] args) 
	{
		int[][] scores = new int[2][3];
		
		scores[0][0] = 90;
		scores[1][1] = 80;
		
		
		
		for(int i = 0 ; i < scores.length ; i++)
		{
			for(int j = 0 ; j < scores[i].length; j++)
			{
				System.out.println("scores[" + i + "][" + j + "] : "+scores[i][j]);
			}
		}
		

	}

}

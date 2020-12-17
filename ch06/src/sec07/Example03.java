package sec07;

import java.util.Scanner;

public class Example03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String s = sc.nextLine();
		
		
		
		//Korean k1 = new Korean();
		Korean k1 = new Korean(n, s);
		
		k1.nation = "ew";
	}

}

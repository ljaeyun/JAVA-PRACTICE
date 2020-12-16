package sec03;

public class num03 
{
	public static void main(String[] args)
	{
		// result 의 값은?
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		
		System.out.println(result);
	}
}

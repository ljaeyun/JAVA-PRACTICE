package sec02;

public class Exam02 
{

	public static void main(String[] args) 
	{
		//switch case 문
		int value = 4;
		
		switch(value)
		{
			case 1:
				System.out.println("1");
				// break 가 없을 시 항상 출력
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("4");
		}

	}

}

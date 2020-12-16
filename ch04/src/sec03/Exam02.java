package sec03;

public class Exam02 
{

	public static void main(String[] args) 
	{
		//while 문 24시간 작동해야하는 서버 프로그램의 경우 많이 사용함
		
		int speed = 60;
		
		while(speed > 0)
		{
			System.out.println("1씩 감소시킵니다" + speed);
			speed--;
		}
		
		

	}

}

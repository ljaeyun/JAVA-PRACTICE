package sec06;

public class Exam01 
{

	public static void main(String[] args) 
	{
		int[] scores= {95, 80, 71, 90, 100};
		for(int i = 0 ; i < scores.length ; i++)
		{
			System.out.println(scores[i]);
		}
		
		int[] scores2 = null;
		if(scores2 == null)
		{
			scores2 = new int[] {51,87,65,94,21};    //null 로 선언한 배열에 관해서는 new 로 새로운 객체를 만들어야 한다.
		}
		System.out.println(scores2[0]);
		
		// 메소드를 실행하기 위해서는 호출을 해야한다
		String[] names = {"자바" , "파이썬" , "자바스크립트"};
		
		//printNames(new String[]{"자바" , "파이썬" , "자바스크립트"});    // 메소드에서 미리 배열을 선언했기 때문에 새로운 객체 배열을 전달
		
		printNames(names); // 메소드에 매개변수 전달 ->번지복사
	}

	//메소드 선언(정의)
	public static void printNames(String[] names)   //names인 배열변수 
	{
		for(int i = 0 ; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	
}

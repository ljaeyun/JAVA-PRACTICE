package sec05.exam02;

public class Example
{

	public static void main(String[] args)
	{
		//////////////////
		RemoteControl rc1 = new Tv();  //리모트 컨트롤로 tv를 사용하겠다
		rc1.turnOn();
		//////////////////
		RemoteControl rc2 = new RemoteControl() 
		{

			@Override
			public void turnOn()
			{
				System.out.println("audio가 켜집니다");
				
			}
		};
		rc2.turnOn();
		//////////////////
		//method(rc1);
		//method(rc2);
		method(new RemoteControl()  // 컨트롤 + 스페이스로 자동 생성 가능
		{
			
			@Override
			public void turnOn()
			{
				System.out.println("난방기가 켜집니다");
				
			}
		});
	}
	
	public static void method(RemoteControl rc)  //리모트콘트롤의 객체나 자식객체들
	{
		rc.turnOn();
	}

}

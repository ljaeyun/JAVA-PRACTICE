package sec04;

public class SportsCar extends Car
{
	//field
	
	//constructor
		
	//method  메서드 오버라이딩 
//	@Override      // 메서드 오버라이딩이 제대로 되었는지 확인해준다. 이 표시 가 있을때 메서드가 부모에도 똑같은게 있는지 확인 
//	public void run()
//	{
//		super.run();  // 부모가 가지고 있는 run을 실행하겠다
//		System.out.println("SportsCar 의 run() 실행");
//		
//		super.run();  // 어디다 붙여도 상관이 없다
//	}
	@Override   //ctrl + space 를 눌러서 메서드를 선택해주면 자동 오버라이딩 가능하다  부모보다 더 강한 접근 제한을 할 수 없다
	public void run()
	{
		
		System.out.println("SportsCar 의 run() 실행");
		super.run();
	}
}

package sec07.exam02;

public class Example
{

	public static void main(String[] args)
	{
		Car myCar = new Car();
		myCar.tire.roll();
		
		myCar.tire = new HankookTire();  //자식이 대입되어 재정의된 것이 출력
		myCar.tire.roll();  // 코드가똑같은데 실행결과가 다르다 다형성
		
		myCar.tire = new KumhoTire();
		myCar.tire.roll();
		
		//매개변수의 다형성   매개변수를 다른 자식객체를 주는 것에 따라 실행결과는 달라진다
		System.out.println();
		
		myCar.run(new Tire());
		myCar.run(new HankookTire());
		myCar.run(new KumhoTire());
	} 

}

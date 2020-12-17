package sec07;


public class Car 
{

	//Field
	String company = "kia";
	int speed;
	double speed2;
	Tire tire = new Tire();
	boolean navi = true;
	
	
	//생성자 오버로딩  매개변수의 타입이 달라야한다, 인자의 개수도 달라야한다
	//Constructor  객체를 만들때
	public Car()
	{
		System.out.println("Car() 실행됨");
	}
	
	public Car(String company) // 매개변수
	{
		System.out.println("Car(String company) 실행됨");
		this.company = company;  // this 현재 객체의 필드에 저장할려고할때 사용
	}
	
	public Car(int speed)
	{
		System.out.println("Car(int speed) 실행됨");
		this.speed = speed;
	}
	
	public Car(String company, int speed)
	{
		System.out.println("Car(String company, int speed) 실행됨");
		this.speed = speed;
		this.company = company;
	}
	
	public Car(int speed, String company)
	{
		System.out.println("Car(int speed, String company) 실행됨"); 
		this.speed = speed;
		this.company = company;
	}
	
	public Car(double speed)
	{
		System.out.println("Car(int speed) 실행됨");
		this.speed2 = speed;
	}
	//

}


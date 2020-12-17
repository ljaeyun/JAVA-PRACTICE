package sec07;


public class Car2 
{

	//Field
	String company;
	int speed;
	Tire tire;
	boolean navi;
	
	
	//생성자 오버로딩  매개변수의 타입이 달라야한다, 인자의 개수도 달라야한다
	//Constructor  객체를 만들때
	public Car2()
	{
		this(0, "현대"); //public Car2(int speed, String company) 가 실행됨 (참조)
	}
	
	public Car2(String company) // 매개변수
	{
		this(0, company); //public Car2(int speed, String company) 가 실행됨 (참조)
	}
	
	public Car2(int speed)
	{
		this(speed, "현대"); //public Car2(int speed, String company) 가 실행됨 (참조)
	}
	
	public Car2(String company, int speed)
	{
		this(speed, company); //현재 객체가 참조하고 있는 생성자 호출 //public Car2(int speed, String company) 가 실행됨 (참조)
	}
	
	public Car2(int speed, String company)
	{
		this.company = company;
		this.speed = speed;
		tire = new Tire();
		navi = true;
	}
	
}


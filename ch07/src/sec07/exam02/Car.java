package sec07.exam02;

public class Car
{
	//field
	public Tire tire = new Tire();  //부모인 타이어
	
	//method
	public void run(Tire tire)   // 자동타입변환 run(new Tire()); run(new HankookTire()); run(new KumhoTire());
	{
		this.tire = tire;
		tire.roll();    // tire 클래스라면 tire클래스의 roll , hankooktire클래스라면 hankooktire의 roll, kumhotire클래스라면 kumhotire의 roll
	}
	
}

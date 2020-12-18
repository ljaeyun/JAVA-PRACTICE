package sec08;

public class Car 
{
	//field
	
	private int speed; // private 객체 안에서만
	
	//constructor
	Car()
	{
		setSpeed(0); // 같은 클래스 내부에서는 메서드를 호출할때 이름만 써도 호출가능
	}
	
	
	//method
	
	public void setSpeed(int speed) // public 외부에 공개
	{
		if(speed < 0)
		{
			this.speed = 0;
		}
		else
		{
			this.speed = speed;
		}
	}
	
	public void run(int value)
	{
		//speed++;
		// speed = value; // 음수가 들어갈 수 있으니 메서드로 처리
		setSpeed(value);
		
	}
}

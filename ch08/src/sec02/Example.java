package sec02;

public class Example
{

	public static void main(String[] args)
	{
		RemoteControl rc = new Radio();   //implements 가 붙어있는것이라면 사용 가능 객체를 선택해서 넣을 수 있다 . Tv 객체 또는 Radio  (사용방법은 같지만 결과가 다르다) -> 다형성
		rc.turnOn();    // 
		rc.turnOff();
		rc.setVolume(5);

	}

}

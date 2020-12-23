package sec02;

public interface RemoteControl
{
	//상수
	int MAX_VOLUM = 10; // public static final 생략  인터페이스는 접근제한자가 없다 다 public
	int MIN_VOLUM = 0;
	
	//추상 메서드
	void turnOn(); // 구현 리턴은 할필요가 없다  객체에서 내용 작성 필요
	void turnOff(); // public이 생략되었있지만 기본적으로 public이다
	
	void setVolume(int volume); // 매개값으로 줄 수 있다
	
	//인터페이스는 실제 객체와 통신을 한다
}

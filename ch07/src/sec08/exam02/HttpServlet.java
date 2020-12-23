package sec08.exam02;

public abstract class HttpServlet
{
	public void info()
	{
		System.out.println("서버에서 사용하는 서비스");
	}
	
	public abstract void service();   // 추상 메서드가 있다면 클래스도 abstract를 붙여야한다
}

package sec08.exam02;

public class LoginServlet extends HttpServlet
{

	@Override
	public void service()   // 오버라이드 하지 않을 경우 에러 발생 -> 상속할때 자동으로 생성 가능
	{
		System.out.println("로그인서비스를 제공");
		
	}

}

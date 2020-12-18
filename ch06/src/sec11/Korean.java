package sec11;

public class Korean 
{
	//Field
	static final String NATION = "korea"; // 외부에서 값을 바꾸지 못하도록 final 넣는다 static 이면서 final 이면 이름을 변수를 대문자로 입력한다. -> 상수(불변의 값) // 
	final String ssn; //static을 부여하지 않고 final 부여 가능 이때 한번 들어간 값은 바뀌지 않는다. (생성자를 통해 객체 생성하여 부여하며 한번 저장된 값은 변경 안됨 ) 객체마다 다른값을 가지면서 한번 저장하면 바뀌지 않을 때
	
	//Constructor
	Korean(String ssn)
	{
		this.ssn = ssn;
	}
	
	//Method
	
}

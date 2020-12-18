package sec09;

public class Korean 
{
	//field
	static String nation = "한국"; // 공통되고 바뀌지 않을 값 정적 필드 static은 값을 가지고 있는다 객체 없이도 사용 가능
	//인스턴트 필드
	String name; // 반드시 객체를 만들어서 써야한다
	
	
	
	//constructor
	
	
	//method
//	String getNation() // 객체가 있어야 사용 가능
//	{
//		//정적 필드 또는 정적 메소드만으로 구성
//		return nation;
//	}
	
	static String getNation() // 객체 없어도 사용 가능
	{
		//정적 필드 또는 정적 메소드만으로 구성
		return nation;
	}
	
	String changeNation()		//static 사용 가능하지만 내부에 객체가 필요로하는것이 오면 안된다  EX) age 변수 
	{
		Korean.nation = getNation();
		Korean.nation = "대한민국";
		
		return nation;
	}
	
	//static이 없는 필드를 쓰면 메서드도 static을 붙이면 안된다
	
	String getName()
	{
		//인스턴스 필드 또는 인스턴스 메서드 호출이 포함되어 있으면
		// 메서드는 인스턴스 메서드여야 한다.    (static 사용불가)
		Korean.nation = "한국";
		return name;
	}
}

package sec09;

public class Calculator 
{
	//Field
	String company; // 회사마다 이름이 다르므로 static x
	static double pi = 3.14159; // 변하지 않은 값으로 매번 객체를 만들면 메모리 낭비 이므로 static 
	double memory; // 매번 계산할 때마다 값이 변하므로 static x
	
	
	//constructor
	
	
	//method
	static double circleArea(double r) // 인스턴트 필드가 없다 static pi 가 사용 되었으므로 static
	{
		double area = r * r * pi; //this.pi 불가능 this는 객체 자신을 말하는 것이지만 static 은 객체가 없으므로 사용 불가능
		return area;
	}
	
	static void setMemory(double r)
	{
		circleArea(r);
	}
	
	
	void setMemory2(double r) // 인스턴트 필드 memory를 사용했으므로 static 사용 불가
	{
		double result = circleArea(r);
		this.memory = result;
	}
	
	static void method1()
	{
		String company = "삼성";  //필드가 아닌 일반 변수 이므로 static 가능
		String name = "hundai";
		int round = 3;
		System.out.println("날씨가 춥워요");
	}
	
	void method2() // static 불가능
	{
		company = "삼성";  // 100% 인스턴트 필드 사용
		setMemory(10);  // 인스턴트 메서드
		System.out.println("날씨가 춥워요");
	}
}

package sec04;


// 실행을 위한 클래스
public class Example 
{

	public static void main(String[] args) 
	{
		//Car 변수 선언
		Car myCar = null;
		//Car 객체 생성
		myCar = new Car();
		//Car 변수 선언과 동시에 Car 객체 생성
		Car yourCar = new Car();
		
		Car mySonCar = myCar; // 같은 주소 복사 저장 -> 같은 객체 
		
		//Student 변수 선언과 동시에 student 객체 생성
		Student s1 = new Student();   //s1 에 번지 저장
		Student s2 = new Student();
		
		//객체 비교
		System.out.println(myCar == yourCar);
		System.out.println(s1 == s2);
		System.out.println(mySonCar == myCar);
		
		
	}

}

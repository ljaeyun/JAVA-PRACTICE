package sec12.com;  // 단순한 물리적인 위치뿐만 아니라 패키지의 일부이다 패키지는 전부다 소문자로 하는것이 관례


//import sec12.com.mycompany.*; // 해당 패키지 안에 있는 모든 파일 사용
import sec12.com.mycompany.Car;
import sec12.com.mycompany.SportsCar;
import sec12.com.yourcompany.Computer;

public class Example {

	public static void main(String[] args) {
		System.out.println("hello"); // 콘솔창으로 실행할때 패키지도 클래스의 일부분이다 책 251 참고
									 // 실행할때 java sec12.com.mycompany.Example 해야 실행가능 단순히 Example파일로는 실행 불가능
		
		
		Car myCar = new Car();    // 같은 패키지에 있는 것은 그냥 쓸 수 있지만 다른 패키지에 있는 것은 import 해야한다
		
		SportsCar sc = new SportsCar();
		
		Computer myCom = new Computer();
		
		sec12.com.yourcompany.Car yourCar = new sec12.com.yourcompany.Car();  //mycompany가 아닌 yourcompany의 car.java를 사용하고 싶을때   이름이 똑같으므로 풀패키지로 명시 
	}

}

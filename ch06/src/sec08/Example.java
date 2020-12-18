package sec08;

public class Example 
{

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		// 메소드 호출
		cal.print();
		cal.print("hello");
		cal.print("hello", 18);

		byte b1 = 3;  // cal.plus에 매개변수로 전달 가능
		long var3 = 20 ; // cal.plus 에 매개변수로 전달 불가능 
		//int result = cal.plus((int)var3, y); // 강제 형변환으로 전달 가능하지만 값 손실 가능성 있다
		int result = cal.plus(3, 5);
		System.out.println("result : " + result);
		
		String result2 = cal.join("010", "123456");
		System.out.println("result2 : " + result2);
		
		
		int[] arr = {1,2,4,5};
		int result3 = cal.sum(arr);
		System.out.println(result3);
		
		
		int[] arr2 = {1,2,4,5};
//		int result4 = cal.sum2(arr2);
		
		int result4 = cal.sum2(90, 80, 80 );  //배열이 아니지만 배열이 만들어져서 매개변수로 전달
		System.out.println(result4);
		
		
		Car car= new Car();
		//car.speed = 10; // private로 인해 접근 불가능
		car.setSpeed(-10);
		car.run(10);
	}

}

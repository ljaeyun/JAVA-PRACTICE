package sec12.com;  // �ܼ��� �������� ��ġ�Ӹ� �ƴ϶� ��Ű���� �Ϻ��̴� ��Ű���� ���δ� �ҹ��ڷ� �ϴ°��� ����


//import sec12.com.mycompany.*; // �ش� ��Ű�� �ȿ� �ִ� ��� ���� ���
import sec12.com.mycompany.Car;
import sec12.com.mycompany.SportsCar;
import sec12.com.yourcompany.Computer;

public class Example {

	public static void main(String[] args) {
		System.out.println("hello"); // �ܼ�â���� �����Ҷ� ��Ű���� Ŭ������ �Ϻκ��̴� å 251 ����
									 // �����Ҷ� java sec12.com.mycompany.Example �ؾ� ���డ�� �ܼ��� Example���Ϸδ� ���� �Ұ���
		
		
		Car myCar = new Car();    // ���� ��Ű���� �ִ� ���� �׳� �� �� ������ �ٸ� ��Ű���� �ִ� ���� import �ؾ��Ѵ�
		
		SportsCar sc = new SportsCar();
		
		Computer myCom = new Computer();
		
		sec12.com.yourcompany.Car yourCar = new sec12.com.yourcompany.Car();  //mycompany�� �ƴ� yourcompany�� car.java�� ����ϰ� ������   �̸��� �Ȱ����Ƿ� Ǯ��Ű���� ��� 
	}

}

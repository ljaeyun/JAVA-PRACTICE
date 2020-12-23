package sec05.exam01;

public class Example
{

	public static void main(String[] args)
	{
		Animal a1 = new Dog();
		a1.sound();
		a1.eat();
		
		Animal a2 = new Animal()     //익명 객체  cat 클래스를 만들지 않고 객체를 만들어서 사용  animal 객체가 아닌 자식 객체를 만드는것
				{
					public void sound()
					{
						System.out.println("야옹");
						
					}
				};
		a2.sound();
		System.out.println("");
		
		method(a1);
		method(a2);
		
		method(new Animal() {  // 익명객체

			@Override
			public void sound()
			{
				System.out.println("응애 나애기");
				
			}
			
		});
		

	}
	
	public static void method(Animal a)  // <- animal은 추상객체이므로 자식객체만 올 수 있다 
	{
		a.eat();
		a.sound();
	}

}

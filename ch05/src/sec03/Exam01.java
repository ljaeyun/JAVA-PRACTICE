package sec03;

public class Exam01
{

	public static void main(String[] args) 
	{
		// 변수를 비교해 보자
		
		int var1 = 10;
		int var2 = 100;
		int var3 = 100;
		
		
		System.out.println(var1 == var2);//false
		System.out.println(var1 == var3);//false
		System.out.println(var2 == var3);//true
		// 값의 비교를 따라 비교
		int[] var4 = {10};
		
		int[] var5 = {100};
	
		int[] var6 = {100};
		//int[] var6 = var5;    같은 곳(번지)을 참조하므로 true
		
		int[] var7 = {100, 101};
		
		
		System.out.println(var4 == var5);//false
		System.out.println(var4 == var6);//false
		System.out.println(var5 == var6);//false
		//참조되고 있는 곳에 따라 비교  var5 와 var6 은 참조하는 객체가 다 다르기 때문에 false가 나온다
		
		System.out.println(var7[0] == var7[1]);

		
		
		//int x = null 불가능 기본 타입 변수에는 null을 가질수가없다
		//String x = null 가능 아직 번지를 가지고 있지 않다
		//int[] y = null 가능  참조타입에는 null을 가질수 있다
	}

}

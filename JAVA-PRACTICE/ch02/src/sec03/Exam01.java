package sec03;

public class Exam01
{

	public static void main(String[] args)
	{
		//타입 변환에 대해서 알아보자
		
		//작은 타입을 큰 타입에 저장이 가능하다
		//자동 타입 변환
		byte var1 = 10;
		short var2 = var1;
		int var3 = var1;
		long var4 = var1;

		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//큰타입을 작은 타입에 저장이 불가능하다
//		long var5 = 10;
//		int var6 = var5;
//		short var7 = var5;
//		byte var8 = var5;
		
		//강제 타입 변환 (타입) 원래의 값이 보존되는 범위안에서 타입 변환 해주는것이 좋다
		long var5 = 200;
		int var6 = (int)var5;
		short var7 = (short)var5;
		byte var8 = (byte)var5;
		
		System.out.println("\n");
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		
		//문자열을 정수 또는 실수로 변환
		String var9 = "300";
		int var10 = Integer.parseInt(var9);
		System.out.println("\n");
		System.out.println(var10);
		
		String var11 = "300.4";
		double var12 = Double.parseDouble(var11);
		System.out.println(var12);
	}

}

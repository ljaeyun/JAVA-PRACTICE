package sec03.exam03;



public class Example
{

	public static void main(String[] args)
	{


		DmbCellP dmb = new DmbCellP("ㅅㅅㅅ");   // DmbCellP 의 매개변수로 전달 -> super()로 전달 -> CellP 의 매개변수로 전달 -> CellP의 필드변수 ower에 저장
		
		DmbCellP dmb2 = new DmbCellP("ㄹㄹㄹ");
		
		
		
		System.out.println(dmb.owner);
		
		System.out.println(dmb2.owner);
		
	}

}

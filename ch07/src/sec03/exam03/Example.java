package sec03.exam03;



public class Example
{

	public static void main(String[] args)
	{


		DmbCellP dmb = new DmbCellP("������");   // DmbCellP �� �Ű������� ���� -> super()�� ���� -> CellP �� �Ű������� ���� -> CellP�� �ʵ庯�� ower�� ����
		
		DmbCellP dmb2 = new DmbCellP("������");
		
		
		
		System.out.println(dmb.owner);
		
		System.out.println(dmb2.owner);
		
	}

}

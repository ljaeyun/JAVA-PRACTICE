package sec03;

public class Example
{

	//field
	
	//constructor
	
	//method
	
	//main method
	
	public static void main(String[] args)
	{
		Button btnCopy = new Button();
		class FileCopy implements Button.OnClickListener  // 
		{
			@Override
			public void onClick()  // onclick ������
			{
				System.out.println("������ �����մϴ�");
			}
		}
		btnCopy.setListener(new FileCopy());
		btnCopy.click();
		btnCopy.click();
		btnCopy.click();
		

		
		
		
		
		
		Button btnPlay = new Button();  // �پ��� ����� ��ư��������
		
		class MusicPlay implements Button.OnClickListener
		{
			@Override
			public void onClick()  // onclick ������
			{
				System.out.println("������ �����մϴ�");
			}
		}
		btnPlay.setListener(new MusicPlay());
		btnPlay.click();

	}

}

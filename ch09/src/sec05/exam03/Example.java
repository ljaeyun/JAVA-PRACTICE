package sec05.exam03;

import sec05.exam03.Button.OnClickListener;

public class Example
{

	//field
	
	//constructor
	
	//method
	
	//main method
	
	public static void main(String[] args)
	{
		Button btnCopy = new Button();
		btnCopy.setListener(new OnClickListener()
		{
			
			@Override
			public void onClick()
			{
				System.out.println("������ �����մϴ�");
				
			}
		});
		btnCopy.click();
		btnCopy.click();
		btnCopy.click();
		

		
		
		
		
		
		Button btnPlay = new Button();  // �پ��� ����� ��ư��������
		btnPlay.setListener(new OnClickListener()
		{
			
			@Override
			public void onClick()
			{
				System.out.println("������ �����մϴ�");
				
			}
		});
		btnPlay.click();

	}

}

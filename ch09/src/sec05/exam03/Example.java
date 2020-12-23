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
				System.out.println("파일을 복사합니다");
				
			}
		});
		btnCopy.click();
		btnCopy.click();
		btnCopy.click();
		

		
		
		
		
		
		Button btnPlay = new Button();  // 다양한 기능의 버튼생성가능
		btnPlay.setListener(new OnClickListener()
		{
			
			@Override
			public void onClick()
			{
				System.out.println("음악을 실행합니다");
				
			}
		});
		btnPlay.click();

	}

}

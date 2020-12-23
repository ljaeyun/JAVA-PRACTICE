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
			public void onClick()  // onclick 재정의
			{
				System.out.println("파일을 복사합니다");
			}
		}
		btnCopy.setListener(new FileCopy());
		btnCopy.click();
		btnCopy.click();
		btnCopy.click();
		

		
		
		
		
		
		Button btnPlay = new Button();  // 다양한 기능의 버튼생성가능
		
		class MusicPlay implements Button.OnClickListener
		{
			@Override
			public void onClick()  // onclick 재정의
			{
				System.out.println("음악을 연주합니다");
			}
		}
		btnPlay.setListener(new MusicPlay());
		btnPlay.click();

	}

}

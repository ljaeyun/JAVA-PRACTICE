package sec05.exam03;

public class Button
{
	//field
	private OnClickListener listener;  // 버튼의 기능이 다 다르다 = 다형성 
	//constructor
	public void setListener(OnClickListener listener) // -< 인터페이스로 구현한 객체가 올 수 있다 
	{
		this.listener = listener;
	}
	
	
	//method
	public void click()
	{
		listener.onClick();
	}
	
	//nested
	
	static interface OnClickListener
	{
		void onClick();
	}
	
}

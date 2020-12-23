package sec05.exam03;

public class Button
{
	//field
	private OnClickListener listener;  // ��ư�� ����� �� �ٸ��� = ������ 
	//constructor
	public void setListener(OnClickListener listener) // -< �������̽��� ������ ��ü�� �� �� �ִ� 
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

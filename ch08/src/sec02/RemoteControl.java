package sec02;

public interface RemoteControl
{
	//���
	int MAX_VOLUM = 10; // public static final ����  �������̽��� ���������ڰ� ���� �� public
	int MIN_VOLUM = 0;
	
	//�߻� �޼���
	void turnOn(); // ���� ������ ���ʿ䰡 ����  ��ü���� ���� �ۼ� �ʿ�
	void turnOff(); // public�� �����Ǿ������� �⺻������ public�̴�
	
	void setVolume(int volume); // �Ű������� �� �� �ִ�
	
	//�������̽��� ���� ��ü�� ����� �Ѵ�
}

package sec07;

public class Exam02 
{

	public static void main(String[] args) 
	{
		String str1 = "ABC";
		
		String str2 = new String("ABC");
		
		byte[] arr1 = {65, 66, 67};
		String str3 = new String(arr1);
		
		System.out.println(str3);
		
		
		char[] arr2 = {'A', 'B', 'C'};
		String str4 = new String(arr2);
		
		int[] arr3 = {65, 66, 67}; // string에서 int 배열을 매개변수로 받을 수 없다
		
		
	}

}

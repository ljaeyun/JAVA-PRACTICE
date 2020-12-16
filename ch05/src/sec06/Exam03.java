package sec06;

public class Exam03 
{

	public static void main(String[] args) 
	{
		
		int[] arr = new int[5];
		
		arr[0] = 90;
		arr[1] = 91;
		arr[2] = 92;
		arr[3] = 93;
		arr[4] = 96;
		// arr[5] = 95; outofboundsexception
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum += arr[i];
			//System.out.print(arr[i] + ", ");
		}
		
		double avg = (double)sum / arr.length;
		
		System.out.print(avg);
		
		System.out.println();
		
		
		

	}

}

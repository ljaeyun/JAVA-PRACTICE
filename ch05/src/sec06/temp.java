package sec06;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oldA = {1,2,3};
		
		int[] newA = new int[3];
		
		for(int i = 0 ; i < oldA.length ; i++)
		{
			newA[i] = oldA[i];
		}
		
		for(int i = 0 ; i < newA.length ; i++)
		{
			System.out.println(newA[i]);
		}
		
		
		String[] oldStrArray = {"java", "python", "c++"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		
		
		for(int i = 0 ; i < newStrArray.length ; i++)
		{
			System.out.println(newStrArray[i]);
		}
		
		//향상된 for문
		
		int[] scores = {87,56,87,21,56};
		
		int sum = 0;
		for(int score : scores)
		{
			sum += score;
		}
		
		System.out.println(sum);

	}

}

package javaPractise;

public class DiigtSumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(142885));
	}

	public static int sumDigits(int number)
	{
		int units=0,sumOfAllDigits=0;
		
		if(number<10)
				return -1;
			
		while (number >0)
		{
			units = number%10;
			number = number/10;
			sumOfAllDigits =sumOfAllDigits+ units; 	
		}
		
		
		return sumOfAllDigits;
	}
}

package javaPractise;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(28));
	}

	public static boolean isPerfectNumber(int number)
	{ if (number <1 )
		 return false;
	 int temp, sum=0 ;
	for (int i=1; i<=number;i++)
	{
		temp = number/i;
		if (number %i==0 && temp< number)
			sum+= temp;
	}	
		 return(sum==number) ? true: false;
	
		}
}

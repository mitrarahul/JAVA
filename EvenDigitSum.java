package javaPractise;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(123456));

		
	}
public static int getEvenDigitSum(int number) {

	int sum=0, last;
	
	if(number<0)
		return -1;
	while(number>0)
	{
		last = number%10;
		number /= 10;
		
		if (last%2==0)
			sum += last; 
	}
		return sum;
}
}

package javaPractise;

public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(isValid(-25));
		System.out.println(hasSameLastDigit (23, 32, 42));
		System.out.println(hasSameLastDigit (3, 2, 42));
	}

	
	public static boolean isValid(int number)
	{
		return (number>9 && number<1001)? true: false;
	}
	
	public static boolean hasSameLastDigit(int number1, int number2, int number3)
	{
		if ( isValid(number1) && (isValid(number2)) && (isValid(number3)))
		{
		int last1 = number1%10;
		int last2 = number2%10;
		int last3 = number3%10;
		
		return(last1==last2 || last1==last3 || last2==last3)? true:false; 
		}
		else
			return false;
	}
}

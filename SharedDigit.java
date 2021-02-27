package javaPractise;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(91,90));

	}

	public static boolean hasSharedDigit(int number1, int number2) {
		int last1,last2;
		if ((number1<10 || number1>99 ) || (number2<10 || number2>99 ))
			return false;
		
			last1 = number1 % 10;
			last2 = number2%10;
		int	first1 = number1/10;
		int	first2 = number2/10;
		return	((last1==last2)|| (last1==first2) ||(last2==first1)|| (first1==first2) ) ? true:false;
	
		
		}
}

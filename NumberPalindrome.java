package javaPractise;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-15351));
	}

/*	public static boolean isPalindrome(int number) {
		int reverse = 0;
		number = Math.abs(number);
		int original = number;
		while (number > 0) {
			int units = number % 10;
			number = number / 10;
			reverse *= 10;
			reverse += units;
		}
		return (original == reverse) ? true : false;
	}
*/
	public static boolean isPalindrome(int number){
	       int reverse = 0;
	       int num = number;
	       
	        while(number != 0){
	        int lastDigit = number % 10;
	        reverse = reverse * 10 + lastDigit;
	        number /= 10;
	        }
	        
	        return num == reverse;
	    }
}

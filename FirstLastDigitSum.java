package javaPractise;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(354));
	}

	public static int sumFirstAndLastDigit(int number) {
		int last, sumOfAllDigits = 0;
		if (number < 0)
			return -1;
		if (number < 10)
			return 2*number;

		last = number % 10;

		while (number > 0) {
			number = number / 10;

			if (number < 10) {
				break;
			}

		}
		sumOfAllDigits = number + last;

		return sumOfAllDigits;
	}
}
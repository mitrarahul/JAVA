package javaPractise;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(47));
	}
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;

	//	int last = 1;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}
}

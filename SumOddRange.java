package javaPractise;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(1, -100));
		System.out.println(sumOdd(100, 1000));
		System.out.println(sumOdd(11, 11));
	}

	public static boolean isOdd(int number) {
		if (number < 0)
			return false;
		else if (number % 2 == 0)
			return false;
		else
			return true;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start < 0 || end < 0 || start > end)
			return sum= -1;
		else {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
		}
		return sum;
	}
}

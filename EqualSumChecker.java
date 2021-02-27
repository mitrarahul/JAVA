package javaPractise;

public class EqualSumChecker {

	public static void main(String[] args) {

		System.out.println(hasEqualSum(1, -1, 0));
		System.out.println(hasEqualSum(1, 1, 3));
		System.out.println(hasEqualSum(1, 1, 2));
	}

	public static boolean hasEqualSum(int input1, int input2, int checksum)
	{
		return (input1+input2==checksum)? true:false;
		
	}
}

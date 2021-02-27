package javaPractise;

public class TeenNumberChecker {

	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 13, 42));
		System.out.println(hasTeen(22, 23, 34));

	}

	public static boolean hasTeen(int valueA, int valueB, int valueC) 
	{
		
		return (valueA>12 && valueA<20 ) || (valueB>12 && valueB<20 ) || (valueC>12 && valueC<20 )? true:false;
	}

	public static boolean isTeen(int value) 
	{
		
		return (value>12 && value<20 ) ? true:false;
	}
}

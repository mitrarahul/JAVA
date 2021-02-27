package javaPractise;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(1604));
		System.out.println(isLeapYear(1700));
		System.out.println(isLeapYear(1800));
		System.out.println(isLeapYear(-1));
		System.out.println(isLeapYear(1601));
		System.out.println(isLeapYear(10000));

	}

	public static boolean isLeapYear(int year) {
		boolean yearReturn = false;
		if (year > 0 && year < 9999)
		{
			if ((year % 4 == 0) && (year % 100 != 0))
				yearReturn = true;

			else if ((year % 100 == 0) && (year % 400 == 0)) {
				yearReturn = true;
			}
		}

		else
		yearReturn = false;

		return yearReturn;
	}

}
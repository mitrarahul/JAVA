package javaPractise;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		 printYearsAndDays(-561600);

	}

	public static void printYearsAndDays(long minutes)
	{long YY,ZZ, XX = minutes;
		if(minutes <0)
			System.out.println("Invalid Value");
		else {
		ZZ = minutes/(60*24);
		YY = ZZ/365;
		ZZ = ZZ%365;
		System.out.println(XX+ " min = "+YY+" y and "+ZZ+" d");
		}	
	}
}

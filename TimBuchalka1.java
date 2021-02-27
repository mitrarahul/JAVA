package javaPractise;

public class TimBuchalka1 {

	public static void main(String[] args) {
	
	}

	public static long toMilesPerHour(double KilometersPerHour) {
		if (KilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(KilometersPerHour / 1.60934);
			/*
			 * long MilesPerHour = Math.round(KilometersPerHour/1.60934); return
			 * MilesPerHour;
			 * this is one way of doing it
			 */
		}
	}

	public static void printCVonversion(double KilometersPerHour) 
	{
		if (KilometersPerHour < 0)
			System.out.println("Value incorrect");

		else {
			System.out.println(KilometersPerHour + " km/h = " + toMilesPerHour(KilometersPerHour) + " mi/h");
		}
	}
}